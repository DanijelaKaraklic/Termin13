package rs.aleph.android.example12.model;

import java.util.ArrayList;

/**
 * Created by androiddevelopment on 11.10.17..
 */

public class Jela {

    private String naziv;
    private String opisJela;
    private String kategorija;
    private ArrayList<String> sastojci;
    private float kalorijskaVrednost;
    private float cena;

    public Jela() {
    }

    public Jela(String naziv, String opisJela, String kategorija, float kalorijskaVrednost, float cena) {
        this.naziv = naziv;
        this.opisJela = opisJela;
        this.kategorija = kategorija;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        sastojci = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpisJela() {
        return opisJela;
    }

    public void setOpisJela(String opisJela) {
        this.opisJela = opisJela;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public ArrayList<String> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<String> sastojci) {
        this.sastojci = sastojci;
    }

    public float getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(float kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Jela{" +
                "naziv='" + naziv + '\'' +
                ", opisJela='" + opisJela + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", kalorijskaVrednost=" + kalorijskaVrednost +
                ", cena=" + cena +
                '}';
    }
}
