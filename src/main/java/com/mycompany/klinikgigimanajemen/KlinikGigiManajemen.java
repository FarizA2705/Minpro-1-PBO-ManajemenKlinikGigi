package com.mycompany.klinikgigimanajemen;

import model.DokterGigi;
import model.PasienGigi;
import model.RekamMedis;
import model.Manager;
import java.util.Scanner;

public class KlinikGigiManajemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=====================================");
            System.out.println("    SISTEM MANAJEMEN KLINIK GIGI  ");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Pasien Baru");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Ubah Data Pasien");
            System.out.println("4. Hapus Data Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Pasien           : ");
                    String idPasien = scanner.nextLine();
                    System.out.print("Masukkan Nama Pasien         : ");
                    String namaPasien = scanner.nextLine();
                    
                    System.out.print("Masukkan ID Dokter           : ");
                    String idDokter = scanner.nextLine();
                    System.out.print("Masukkan Nama Dokter         : ");
                    String namaDokter = scanner.nextLine();
                    System.out.print("Masukkan Spesialisasi Dokter : ");
                    String spesialisasi = scanner.nextLine();

                    System.out.print("Masukkan ID Rekam Medis      : ");
                    String idRM = scanner.nextLine();
                    System.out.print("Masukkan Diagnosa            : ");
                    String diagnosa = scanner.nextLine();
                    System.out.print("Masukkan Catatan Tindakan    : ");
                    String tindakan = scanner.nextLine();

                    DokterGigi dokter = new DokterGigi(idDokter, namaDokter, spesialisasi);
                    RekamMedis rm = new RekamMedis(idRM, diagnosa, tindakan);
                    PasienGigi pasienBaru = new PasienGigi(idPasien, namaPasien, dokter, rm);

                    manager.tambahPasien(pasienBaru);
                    break;

                case 2:
                    manager.tampilkanPasien();
                    break;

                case 3:
                    System.out.print("Masukkan ID Pasien yang ingin diubah : ");
                    String idUpdate = scanner.nextLine();
                    System.out.print("Masukkan Nama Pasien Baru            : ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Diagnosa Baru               : ");
                    String diagnosaBaru = scanner.nextLine();
                    System.out.print("Masukkan Catatan Tindakan Baru       : ");
                    String tindakanBaru = scanner.nextLine();

                    manager.updatePasien(idUpdate, namaBaru, diagnosaBaru, tindakanBaru);
                    break;

                case 4:
                    System.out.print("Masukkan ID Pasien yang akan dihapus : ");
                    String idHapus = scanner.nextLine();
                    manager.hapusPasien(idHapus);
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("--> Terima kasih telah menggunakan Sistem Manajemen Klinik Gigi.");
                    break;

                default:
                    System.out.println("--> Pilihan menu tidak valid, silakan coba lagi.");
            }
        }
        scanner.close();
    }
}