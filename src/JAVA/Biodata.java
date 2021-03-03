package JAVA;

public class Biodata {
    private String nama;
    private String kelas;
    private String alamat;
    private String ttl;
    private String umur;
    private String sekolah;
    private String no;


    // ini method setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    public void setUmur(String umur){
        this.umur = umur;
    }
    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }
    public void setNo(String no){
        this.no = no;
    }

    // ini method getter
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getKelas() {
        return this.kelas;
    }
    public String getTtl() {
        return this.ttl;
    }
    public String getUmur() {
        return this.umur;
    }
    public String getSekolah() {
        return this.sekolah;
    }
    public String getNo() {
        return this.no;
    }
}
