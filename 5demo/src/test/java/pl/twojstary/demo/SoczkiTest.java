package pl.twojstary.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class SoczkiTest {

    @Test
    void sprawdzCzyDaSieUstawicNazweSoku() {
        Soczek soczek = new Soczek(1, "Tymbark", 100);

        Assertions.assertEquals("Tymbark", soczek.getNazwa());
    }
}
