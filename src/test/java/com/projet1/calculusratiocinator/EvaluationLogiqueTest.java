package com.projet1.calculusratiocinator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluationLogiqueTest {
    @Test
    void testLogique(){
          EvaluationLogique evaluation = new EvaluationLogique();
          evaluation.ajoutAffirmation("Lou est beau",Statut.Vérité);
          assertEquals("Vrai", evaluation.logiqueEvaluer("Lou est beau"));
      }
      @Test
      void testConjonctionEt(){
        EvaluationLogique evaluation = new EvaluationLogique();
        evaluation.ajoutAffirmation("Lou est pauvre",Statut.Mensonge);
        evaluation.ajoutAffirmation("Lou est généreux", Statut.Affirmation);

        assertEquals("jenesaispas", evaluation.conjonctionEt("Lou est pauvre","Lou est généreux"));
      }
    @Test
    void testConjonctionOu(){
        EvaluationLogique evaluation = new EvaluationLogique();
        evaluation.ajoutAffirmation("Lou est beau",Statut.Vérité);
        evaluation.ajoutAffirmation("Lou est pauvre", Statut.Mensonge);

        assertEquals("Vrai", evaluation.conjonctionOu("Lou est beau","Lou est pauvre"));
    }
    @Test
    void testConjonctionDonc(){
        EvaluationLogique evaluation = new EvaluationLogique();
        evaluation.ajoutAffirmation("Lou est beau",Statut.Vérité);
        evaluation.ajoutAffirmation("Lou est pauvre", Statut.Mensonge);

        assertEquals("Faux", evaluation.conjonctionDonc("Lou est beau","Lou est pauvre"));
    }


}
