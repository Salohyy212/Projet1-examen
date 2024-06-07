package com.projet1.calculusratiocinator;

import java.util.HashMap;
import java.util.Map;

public class EvaluationLogique {
    private final Map<String, Affirmation> affirmations;

    public EvaluationLogique(){
        affirmations = new HashMap<>();
    }
    public void ajoutAffirmation(String text, Statut statut){
        affirmations.put(text, new Affirmation(text, statut));
    }
    public String logiqueEvaluer( String text){
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
    public String conjonctionEt(String affirmation1, String affirmation2){
        String eval1 = logiqueEvaluer(affirmation1);
        String eval2 = logiqueEvaluer(affirmation2);
        if(eval1.equals("Vrai") && eval2.equals("Vrai")){
            return "Vrai";
        }else if(eval1.equals("Faux") && eval2.equals("Vrai")){
            return "Faux";
        }return "jenesaispas";
    }
    public String conjonctionOu(String affirmation1, String affirmation2){
        String eval3 = logiqueEvaluer(affirmation1);
        String eval4 = logiqueEvaluer(affirmation2);
        if(eval3.equals("Vrai") || eval4.equals("Faux")){
            return "Vrai";
        }return "Faux";
    }
    public String conjonctionDonc(String affirmation1, String affirmation2){
        String eval5 = logiqueEvaluer(affirmation1);
        String eval6 = logiqueEvaluer(affirmation2);
        if(eval5.equals("Vrai") && eval6.equals("Faux")){
            return "Faux";
        }return "Vrai";
    }







}
