package com.projet1.calculusratiocinator;

import lombok.Getter;

@Getter
public class Affirmation {
    private final String text;
    private final Statut statut;

    public Affirmation(String text, Statut statut){
        this.text=text;
        this.statut=statut;
    }
}
