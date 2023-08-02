package org.lessons.java;

public class Allenatore extends Person{

    //  ATTRIBUTI
    private String strategia;

    //  COSTRUTTORI
    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }

    //  SETTERS & GETTERS
    public String getStrategia() {
        return strategia;
    }

    public void setStrategia(String strategia) {
        this.strategia = strategia;
    }

    //METODI


}
