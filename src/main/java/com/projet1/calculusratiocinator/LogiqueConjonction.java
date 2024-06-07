package com.projet1.calculusratiocinator;

import java.util.HashMap;
import java.util.Map;

public class LogiqueConjonction {
    private final Map<String, Affirmation> affirmations;

    public LogiqueConjonction(){
        affirmations = new HashMap<>();
    }

    public String logique( String text){
        Affirmation affirmation = affirmations.get(text);
        if(affirmation == null){
            return "jenesaispas";
        }
        Statut statut = affirmation.getStatut();
        return switch (statut) {
            case Vérité -> "Vrai";
            case Mensonge -> "Faux";
            case Affirmation -> "jenesaispas";
        };
    }


}
