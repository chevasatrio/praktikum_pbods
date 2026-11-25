// 11.4.2 Variabel: const = tidak bisa diubah, let = bisa diubah
// (modul memakai var; sekarang disarankan let/const)
const kampus = "Telkom University";
let semester = 3;
console.log(kampus, "semester", semester);

// 11.4.3 Object literal (termasuk nested object)
const jadwal = {
    platform: 34,
    telah_berangkat: false,
    asal: { kode_kota: "MDN", nama_kota: "Medan" },
    tujuan: "Jakarta"
};
console.log("Asal kereta:", jadwal.asal.nama_kota);

// 11.4.4 Function declaration
function tambah(a, b) {
    return a + b;
}
console.log("tambah(2, 3) =", tambah(2, 3));

// OOP: class di JS mirip class di Java (constructor, atribut, method)
class Mahasiswa {
    constructor(nim, nama) {
        this.nim = nim;
        this.nama = nama;
    }

    info() {
        return `${this.nama} (${this.nim})`;
    }
}

// DOM: ambil data dari form, buat objek, tampilkan di tabel
const daftarMhs = [];
const form = document.getElementById("formMhs");

form.addEventListener("submit", function (event) {
    event.preventDefault(); // cegah halaman reload

    const nim = document.getElementById("nim").value;
    const nama = document.getElementById("nama").value;
    const mhs = new Mahasiswa(nim, nama);
    daftarMhs.push(mhs);

    const baris = document.createElement("tr");
    // textContent lebih aman daripada innerHTML untuk data dari user
    [mhs.nim, mhs.nama, mhs.info()].forEach(function (isi) {
        const kolom = document.createElement("td");
        kolom.textContent = isi;
        baris.appendChild(kolom);
    });
    document.getElementById("tabelMhs").appendChild(baris);
    document.getElementById("jumlah").textContent = daftarMhs.length;

    console.log("Objek baru:", mhs);
    form.reset();
});
