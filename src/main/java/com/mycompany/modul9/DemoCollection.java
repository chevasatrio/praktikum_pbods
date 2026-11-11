package com.mycompany.modul9;

import java.util.*;

/**
 * Demo Collection: ArrayList + Sorting (Comparable & Comparator) + Filtering.
 *
 * COLLECTION   : wadah untuk menyimpan banyak object bertipe apapun.
 *                ArrayList adalah implementasi List yang paling umum dipakai.
 *
 * COMPARABLE   : sorting satu property — implement di dalam kelas itu sendiri.
 * COMPARATOR   : sorting multi-property — kelas terpisah, lebih fleksibel.
 *
 * FILTERING    : cara konvensional (for-loop + if) vs lambda stream.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class DemoCollection {

    public static void main(String[] args) {

        // === Buat list Employee ===
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey",   2500));
        listEmp.add(new Employee("anna",  3500));

        // === Sorting by name (Comparable) ===
        Collections.sort(listEmp);
        System.out.println("--- Sorted by name (Comparable) ---");
        listEmp.forEach(System.out::println);

        // === Sorting by salary (Comparator) ===
        listEmp.sort(new SalaryComparator());
        System.out.println("--- Sorted by salary (Comparator) ---");
        listEmp.forEach(System.out::println);

        // === Filtering: gaji >= 3000 (konvensional) ===
        System.out.println("--- Filter gaji >= 3000 (for-loop) ---");
        for (Employee e : listEmp) {
            if (e.getSalary() >= 3000) {
                System.out.println(e);
            }
        }

        // === Filtering: gaji >= 3000 (lambda stream) ===
        System.out.println("--- Filter gaji >= 3000 (stream lambda) ---");
        listEmp.stream()
               .filter(e -> e.getSalary() >= 3000)
               .forEach(System.out::println);
    }
}
