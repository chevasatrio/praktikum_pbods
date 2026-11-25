# Modul 11 – Web Frontend (HTML, CSS, Bootstrap, JavaScript)

Panduan setup NetBeans 29 dari nol + cara menjalankan project web.
Server: **Apache Tomcat 8.5 bawaan XAMPP** (`C:\xampp\tomcat`), atau **Tomcat 9** untuk pengguna Laragon / tanpa XAMPP.

---

## 0. Yang harus sudah ada

| Kebutuhan | Cek |
|---|---|
| JDK (17 ke atas) | CMD → `java -version` |
| NetBeans 29 | Sudah terpasang |
| Tomcat | XAMPP: cek folder `C:\xampp\tomcat`. Laragon / tanpa XAMPP: lihat langkah 0a |
| Internet | Untuk Bootstrap via CDN |

> Penting: **jangan klik Start Tomcat di XAMPP Control Panel.** NetBeans yang akan menyalakan Tomcat. Kalau dua-duanya jalan, port 8080 bentrok.

---

## 0a. Pengguna Laragon / tidak punya XAMPP: download Tomcat 9

Laragon tidak membawa Tomcat. Begitu juga XAMPP yang diinstal tanpa komponen Tomcat.

1. Buka `tomcat.apache.org` → **Download** → **Tomcat 9**.
2. Bagian **Binary Distributions → Core** → pilih **64-bit Windows zip** (macOS: **tar.gz**).
3. Extract ke `C:\tomcat9`. Folder yang benar adalah folder yang berisi `bin`, `conf`, dan `lib`. Hindari path yang mengandung spasi.

> **Jangan pakai Tomcat 10/11.** Versi itu memakai `jakarta.*`, sedangkan project kita Java EE 7 (`javax.*`), sehingga Modul 12–15 (JSP/Servlet) akan error.

---

## 1. Daftarkan Tomcat ke NetBeans (sekali saja per laptop)

1. Menu **Tools → Servers → Add Server...**
2. Pilih **Apache Tomcat or TomEE** → Next.
3. **Server Location**: `C:\xampp\tomcat` atau `C:\tomcat9` (klik Browse).
4. Isi **Username** dan **Password** bebas (mis. `praktikan` / `praktikan`), lalu centang **Create user if it does not exist**.
5. Finish. Server akan muncul di tab **Services → Servers**.

---

## 2. Buat project Maven Web Application

1. **File → New Project...**
2. Categories: **Java with Maven** → Projects: **Web Application** → Next.
3. Name and Location:
   - Project Name: `praktikum_pbods_web` (atau `Modul11_NIM`)
   - Group Id: `com.mycompany` → Next.
4. Settings:
   - Server: **Apache Tomcat or TomEE**
   - Java EE Version: **Java EE 7 Web**
     (jangan pilih Jakarta EE 9/10/11, karena Tomcat 8.5/9 belum mendukungnya)
5. Finish.
6. **Perbaiki `pom.xml` (wajib!)**: di tab Projects buka **Project Files → pom.xml**. Hapus semua bagian dari `<build>` sampai `</build>`, ganti dengan kode di bawah, lalu **Ctrl+S**.

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.13.0</version>
            <configuration>
                <release>17</release>
            </configuration>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-war-plugin</artifactId>
            <version>3.4.0</version>
            <configuration>
                <failOnMissingWebXml>false</failOnMissingWebXml>
            </configuration>
        </plugin>
    </plugins>
</build>
```

> **Kenapa?** Template bawaan NetBeans untuk Java EE 7 memakai `maven-war-plugin 2.3` dan Java 1.7. Plugin itu tidak jalan di JDK 17 ke atas, sehingga Run akan `BUILD FAILURE` dengan error `InaccessibleObjectException ... does not "opens java.util"`. Pengaturan Java 1.7 juga akan membuat Modul 12 (Servlet) gagal compile di JDK baru.
> Properti `endorsed.dir` di bagian `<properties>` boleh dibiarkan atau dihapus; tidak dipakai lagi.

Struktur penting di tab **Projects**:

```
praktikum_pbods_web
└── Web Pages              ← (src/main/webapp) semua file HTML/CSS/JS di sini
    ├── META-INF/context.xml
    └── index.html         ← dibuat otomatis
```

---

## 3. Buat file materi

Klik kanan **Web Pages** lalu:

| Mau buat | Menu |
|---|---|
| Folder `css`, `js`, `img` | New → **Folder** |
| File HTML | New → **HTML File** (kalau tidak ada: New → Other → HTML5/JavaScript → HTML File) |
| File CSS (di folder `css`) | New → **Cascading Style Sheet** |
| File JS (di folder `js`) | New → **JavaScript File** |

> Saat membuat file, **jangan tulis ekstensi** di nama file. NetBeans menambahkannya sendiri (`style` → `style.css`).

Urutan file yang dibuat di praktikum:

| No | File | Materi modul |
|---|---|---|
| 1 | `index.html` | Menu ke semua materi |
| 2 | `html-dasar.html` | 11.1 HTML: heading, link, tabel, gambar, form |
| 3 | `css-dasar.html` + `css/style.css` | 11.2 CSS: inline/internal/external, font, list, warna, span & div |
| 4 | `bootstrap.html` | 11.3 Bootstrap: container, grid, tabel, gambar, tombol, form |
| 5 | `javascript.html` + `js/script.js` | 11.4 JS: variabel, object, function, class + DOM |
| – | `img/logo.svg` | Gambar contoh (boleh diganti .png/.jpg apa saja) |

---

## 4. Menjalankan project

1. Klik kanan project → **Run** (atau tekan **F6**).
2. Tunggu. Tab **Output** akan menampilkan:
   - `Apache Tomcat or TomEE` → Tomcat menyala
   - `BUILD SUCCESS` → project berhasil di-build dan di-deploy
3. Browser terbuka otomatis ke:
   **http://localhost:8080/praktikum_pbods_web/**
4. Klik link di menu untuk membuka tiap materi.

Setelah mengubah file:
- **Ctrl+S** (save) → refresh browser dengan **Ctrl+F5**.
- Kalau perubahan tidak muncul → klik kanan project → **Run** lagi.

Melihat hasil `console.log` (halaman JavaScript): di browser tekan **F12** → tab **Console**.

Mematikan Tomcat: tab **Services → Servers → Apache Tomcat or TomEE** → klik kanan → **Stop**.

---

## 5. Kalau error

| Gejala | Solusi |
|---|---|
| `BUILD FAILURE` dengan `maven-war-plugin:2.3` / `InaccessibleObjectException` | `pom.xml` belum diperbaiki. Ikuti langkah 2 nomor 6, lalu Run lagi. |
| `port 8080 is already in use` | Stop Tomcat di XAMPP Control Panel. Cek di CMD: `netstat -ano \| findstr :8080`. |
| Minta username/password terus / deploy gagal | Tools → Servers → Tomcat → tab Connection → isi ulang username/password, centang *Create user*. |
| Tampilan Bootstrap polos (tidak ada styling) | Tidak ada internet; Bootstrap dipanggil lewat CDN. |
| Gambar tidak muncul | Cek path `src="img/..."` dan nama file (huruf besar/kecil berpengaruh). |
| Di Output ada `SEVERE ... JSP-W12 / gudangg ... is not a directory` | Sisa project lama di `C:\xampp\tomcat\conf\Catalina\localhost`. Tidak mengganggu; boleh dihapus file `.xml` project lama itu. |
| HTML berubah tapi browser tidak | Ctrl+F5 (hard refresh) atau Run ulang. |

---

## 6. Membuka project contoh asisten

**File → Open Project...** → buka folder `praktikum_pbods_1` → pilih **`praktikum_pbods_web`** (ikon Maven) → Open Project → **Run**.
