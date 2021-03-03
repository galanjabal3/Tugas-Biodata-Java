package JAVA;

public class Main {

    public static void main(String[] args) {
        // membuat objek dari class biodata
        Biodata jabal = new Biodata();

        // menggunakan method setter
        jabal.setNama("Galan Jabal Nur Al Markun");
        jabal.setKelas("10");
        jabal.setAlamat("Jl.Jatikusuman 07 Mranggen,Demak");
        jabal.setTtl("Demak, 16-09-2005");
        jabal.setSekolah("SMK Bina Nusantara Mranggen");
        jabal.setUmur("15 Thn");
        jabal.setNo("085842917951");

        // menggunakan method getter
        System.out.println("~~~~~~~~Biodata~~~~~~~~");
        System.out.println("> Nama: " + jabal.getNama());
        System.out.println("> kelas: " + jabal.getKelas());
        System.out.println("> Alamat: " + jabal.getAlamat());
        System.out.println("> Ttl: " + jabal.getTtl());
        System.out.println("> Sekolah: " + jabal.getSekolah());
        System.out.println("> Umur: " + jabal.getUmur());
        System.out.println("> No Telpon: " + jabal.getNo());
     }
}
