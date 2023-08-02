package org.lessons.java;

public class Person {

    //  ATTRIBUTI
    private String nome;
    private int eta;

    //  COSTRUTTORI

    public Person(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    //  SETTERS & GETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }


    //  METODI

}
