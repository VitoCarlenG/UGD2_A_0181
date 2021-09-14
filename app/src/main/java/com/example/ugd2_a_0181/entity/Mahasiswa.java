package com.example.ugd2_a_0181.entity;

public class Mahasiswa {
    //  Attribute Entity Mahasiswa
    private String name;
    private double IPK;
    private int tahunMasuk;

    //  Constructor Mahasiswa
    Mahasiswa(String name, double IPK, int tahunMasuk){
        this.name = name;
        this.IPK = IPK;
        this.tahunMasuk = tahunMasuk;
    }

    //  Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    //  Static Class Data Dummy
    public static Mahasiswa[] listOfMahasiswa = {
            new Mahasiswa("Wendy Winata",3.5,2018),
            new Mahasiswa("Eras Timothy",3.7,2018),
            new Mahasiswa("Jonathan",3.8,2018),
            new Mahasiswa("Yosia",3.9,2018),
            new Mahasiswa("Yotam",4,2019),
    };
}