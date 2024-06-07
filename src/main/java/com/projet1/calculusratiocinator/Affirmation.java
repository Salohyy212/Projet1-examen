package com.projet1.calculusratiocinator;

import lombok.Getter;

@Getter
public class Affirmation {
    private final String text;
    private final String statut;

    public Affirmation(String text, String statut){
        this.text=text;
        this.statut=statut;
    }
}
