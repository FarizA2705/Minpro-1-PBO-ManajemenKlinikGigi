package model;

import java.util.ArrayList;

public class Manager {
    private ArrayList<PasienGigi> daftarPasien;

    public Manager() {
        daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(PasienGigi pasien) {
        daftarPasien.add(pasien);
        System.out.println("--> Data pasien dan rekam medis berhasil ditambahkan!");
    }

    public void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("--> Belum ada data pasien terdaftar.");
            return;
        }
        System.out.println("\n==================== DAFTAR PASIEN & REKAM MEDIS ====================");
        for (int i = 0; i < daftarPasien.size(); i++) {
            PasienGigi p = daftarPasien.get(i);
            DokterGigi d = p.getDokter();
            RekamMedis rm = p.getRekamMedis();

            System.out.println((i + 1) + ". ID Pasien     : " + p.getIdPasien());
            System.out.println("   Nama Pasien   : " + p.getNamaPasien());
            System.out.println("   Dokter        : " + d.getNamaDokter() + " (" + d.getSpesialisasi() + ")");
            System.out.println("   ID Rekam Medis: " + rm.getIdRekamMedis());
            System.out.println("   Diagnosa      : " + rm.getDiagnosa());
            System.out.println("   Tindakan      : " + rm.getCatatanTindakan());
            System.out.println("---------------------------------------------------------------------");
        }
    }

    public void updatePasien(String id, String namaBaru, String diagnosaBaru, String tindakanBaru) {
        for (PasienGigi p : daftarPasien) {
            if (p.getIdPasien().equalsIgnoreCase(id)) {
                p.setNamaPasien(namaBaru);
                p.getRekamMedis().setDiagnosa(diagnosaBaru);
                p.getRekamMedis().setCatatanTindakan(tindakanBaru);
                System.out.println("--> Data pasien dan rekam medis berhasil diperbarui!");
                return;
            }
        }
        System.out.println("--> ID Pasien tidak ditemukan!");
    }

    public void hapusPasien(String id) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getIdPasien().equalsIgnoreCase(id)) {
                daftarPasien.remove(i);
                System.out.println("--> Data pasien berhasil dihapus!");
                return;
            }
        }
        System.out.println("--> ID Pasien tidak ditemukan!");
    }
}