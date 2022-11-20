package com.company;

import java.util.ArrayList;
class Mahasiswa {
    private Integer id;
    private String name;
    private String kelas;
    private Integer tglMasuk;

    public Mahasiswa(Integer id, String name, String kelas, Integer tglMasuk) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
        this.tglMasuk = tglMasuk;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameNew) {
        this.name = nameNew;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelasNew) {
        this.kelas = kelasNew;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNew) {
        this.id = idNew;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kelas='" + kelas + '\'' +
                ", tanggal masuk='" + tglMasuk + '\'' + '}';
    }
}
public class Main3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(new Mahasiswa(25, "Ahmad Solehudin", "Informatika", 140622));
        mahasiswa.add(new Mahasiswa(23, "Yudi mahdapika", "Informatika", 140622));
        mahasiswa.add(new Mahasiswa(32, "Masimo", "Informatika", 140622));
        mahasiswa.add(new Mahasiswa(17, "Artari", "Informatika", 140622));
        mahasiswa.add(new Mahasiswa(15, "Nizar Maulana Nazahal", "Informatika", 140622));

        System.out.println("-----------{ Print All }-------------");
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n-----------{ Remove }-------------");
        mahasiswa.remove(1);
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n-----------{ Add }-------------");
        mahasiswa.add(1, new Mahasiswa(29, "Dina fitria ", "Informatika", 140622));
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("-----------{ Size }-------------");
        System.out.println("Total Mahasiswa : " + mahasiswa.size());
    }
}
