package org.lessons.java;

public class Giocatore extends Person{

    //  ATTRIBUTI
    private String ruolo;

    //COSTRUTTORI
    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }

    //  SETTERS & GETTERS
    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    //  METODI

}
