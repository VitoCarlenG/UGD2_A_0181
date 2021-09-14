package com.example.ugd2_a_0181.entity;

public class Dosen {
    //  Attribute Entity Dosen
    private String name, nip;
    private int tahunBergabung;

    //  Constructor Mahasiswa
    Dosen(String name, String nip, int tahunBergabung){
        this.name = name;
        this.nip = nip;
        this.tahunBergabung = tahunBergabung;
    }

    //  Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIP() {
        return nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public int getTahunBergabung() {
        return tahunBergabung;
    }

    public void setTahunBergabung(int tahunBergabung) {
        this.tahunBergabung = tahunBergabung;
    }

    //  Static Class Data Dummy
    public static Dosen[] listOfDosen = {
            new Dosen("Dosen 1", "100002302",3),
            new Dosen("Dosen 2", "100004502",4),
            new Dosen("Dosen 3", "100002502",5),
            new Dosen("Dosen 4", "100008502",2),
            new Dosen("Dosen 5", "100008503",3),
            new Dosen("Dosen 6", "100008504",2),
            new Dosen("Dosen 7", "100008505",1),
            new Dosen("Dosen 8", "100008506",4),
            new Dosen("Dosen 9", "100008507",3),
            new Dosen("Dosen 10", "100008508",2),
    };
}