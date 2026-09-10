package model;

public class DokterGigi {
    private String idDokter;
    private String namaDokter;
    private String spesialisasi;

    public DokterGigi(String idDokter, String namaDokter, String spesialisasi) {
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.spesialisasi = spesialisasi;
    }

    public String getIdDokter() { return idDokter; }
    public void setIdDokter(String idDokter) { this.idDokter = idDokter; }

    public String getNamaDokter() { return namaDokter; }
    public void setNamaDokter(String namaDokter) { this.namaDokter = namaDokter; }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
}