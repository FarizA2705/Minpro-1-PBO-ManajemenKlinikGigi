package model;

public class PasienGigi {
    private String idPasien;
    private String namaPasien;
    private DokterGigi dokter;
    private RekamMedis rekamMedis;

    public PasienGigi(String idPasien, String namaPasien, DokterGigi dokter, RekamMedis rekamMedis) {
        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.dokter = dokter;
        this.rekamMedis = rekamMedis;
    }

    public String getIdPasien() { return idPasien; }
    public void setIdPasien(String idPasien) { this.idPasien = idPasien; }

    public String getNamaPasien() { return namaPasien; }
    public void setNamaPasien(String namaPasien) { this.namaPasien = namaPasien; }

    public DokterGigi getDokter() { return dokter; }
    public void setDokter(DokterGigi dokter) { this.dokter = dokter; }

    public RekamMedis getRekamMedis() { return rekamMedis; }
    public void setRekamMedis(RekamMedis rekamMedis) { this.rekamMedis = rekamMedis; }
}