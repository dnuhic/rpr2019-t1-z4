package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Supermarket s = new Supermarket();

    @BeforeEach
    void popuniSupermarket() {
        s.dodajArtikl(new Artikl("ime", 30, "1"));
        s.dodajArtikl(new Artikl("ime", 30, "2"));
        s.dodajArtikl(new Artikl("ime", 30, "3"));
        s.dodajArtikl(new Artikl("ime", 30, "4"));
    }

    @Test
    void testdodajArtikl() {
        assertEquals(4, s.getBrArtikala());
    }

    @Test
    void testizbaciArtiklSaKodom() {
        s.izbaciArtiklSaKodom("3");
        assertEquals(3, s.getBrArtikala());
    }
}