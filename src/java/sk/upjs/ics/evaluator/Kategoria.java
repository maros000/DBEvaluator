package sk.upjs.ics.evaluator;

public class Kategoria {

    public static final int MAXIMALNA_DLZKA_NAZVU_KATEGORIE = 30;
    public static final int MAXIMALNA_DLZKA_POPISU = 200;

    private long id;
    private String nazov;
    private String popis;
    private String vlastnik;

    public String getVlastnik() {
        return vlastnik;
    }

    public void setVlastnik(String vlastnik) {
        this.vlastnik = vlastnik;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
}
