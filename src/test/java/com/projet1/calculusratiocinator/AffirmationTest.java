package com.projet1.calculusratiocinator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffirmationTest {
    @Test
    void affirmation_a_une_status(){
        Affirmation affirmation = new Affirmation("Lou est beau","vérité");
        assertEquals("vérité",affirmation.getStatut());
    }
}
