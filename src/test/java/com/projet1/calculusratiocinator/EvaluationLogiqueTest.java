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


}
