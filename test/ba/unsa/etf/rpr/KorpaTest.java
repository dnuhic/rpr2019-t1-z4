package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k = new Korpa();

    @BeforeEach
    void PopuniKlasu() {
        k.dodajArtikl(new Artikl("biciklo", 15, "1"));
        k.dodajArtikl(new Artikl("biciklo", 15, "2"));
        k.dodajArtikl(new Artikl("biciklo", 15, "3"));
        k.dodajArtikl(new Artikl("biciklo", 15, "4"));
    }
    @Test
    void testdodajArtikl() {
        assertEquals(60, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void testizbaciArtiklSaKodom() {
        k.izbaciArtiklSaKodom("1");
        assertEquals(45, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void testdajUkupnuCijenuArtikala() {
        assertEquals(60, k.dajUkupnuCijenuArtikala());

    }
}