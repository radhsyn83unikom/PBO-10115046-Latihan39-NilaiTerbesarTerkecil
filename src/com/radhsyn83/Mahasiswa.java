package com.radhsyn83;

import java.util.Scanner;

public class Mahasiswa {
    private int jumlahMahasiswa;

    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public void hasil() {

        Scanner s = new Scanner(System.in);

        int mahasiswa[] = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+" : ");
            mahasiswa[i] = s.nextInt();
        }

        int max = mahasiswa[0];
        for(int i = 1; i < mahasiswa.length;i++)
        {
            if(mahasiswa[i] > max)
            {
                max = mahasiswa[i];
            }
        }

        int min = mahasiswa[0];
        for(int i = 1; i < mahasiswa.length;i++)
        {
            if(mahasiswa[i] < min)
            {
                min = mahasiswa[i];
            }
        }

        System.out.println("Nilai Terbesar adalah : "+max);
        System.out.println("Nilai Terkecil adalah adalah : "+min);
    }


}
