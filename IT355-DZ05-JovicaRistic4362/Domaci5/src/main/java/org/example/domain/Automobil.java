package org.example.domain;

public class Automobil {

    private String id;
    private String marka;
    private String model;
    private int godiste;
    private String vrstaGoriva;
    private double cena;

    public Automobil() {
    }

    public Automobil(String id, String marka, String model, int godiste, String vrstaGoriva, double cena) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
        this.vrstaGoriva = vrstaGoriva;
        this.cena = cena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String getVrstaGoriva() {
        return vrstaGoriva;
    }

    public void setVrstaGoriva(String vrstaGoriva) {
        this.vrstaGoriva = vrstaGoriva;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "id='" + id + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godiste=" + godiste +
                ", vrstaGoriva='" + vrstaGoriva + '\'' +
                ", cena=" + cena +
                '}';
    }
}
