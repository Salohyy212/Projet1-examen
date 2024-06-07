package com.projet1.calculusratiocinator;

import org.junit.jupiter.api.Test;

import static com.projet1.calculusratiocinator.Statut.Vérité;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffirmationTest {
    @Test
    void affirmation_a_une_status(){
        Affirmation affirmation = new Affirmation("Lou est beau", Vérité);
        assertEquals(Vérité,affirmation.getStatut());
    }
}
