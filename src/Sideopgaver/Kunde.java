package Sideopgaver;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String adresse;
    private ArrayList<Konto> kontos = new ArrayList<Konto>();

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
