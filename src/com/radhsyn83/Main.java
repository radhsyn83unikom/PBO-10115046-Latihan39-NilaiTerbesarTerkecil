package com.radhsyn83;/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();

        System.out.println("=========== PROGRAM NILAI TERBERSAR DAN TERKECIL MAHASISWA ===========");
        System.out.print("Masukkan banyak mahasiswa : ");
        m.setJumlahMahasiswa(s.nextInt());
        m.hasil();
    }
}
