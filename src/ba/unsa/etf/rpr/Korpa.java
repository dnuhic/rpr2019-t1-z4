package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brAtrikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brAtrikala >= 50) return false;
        artikli[brAtrikala] = a;
        brAtrikala++;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i < brAtrikala; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i]);
                for(int j = i; j < brAtrikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brAtrikala--;
                i--;
                return temp;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(Artikl x : artikli) suma = suma + x.getCijena();
        return suma;
    }
}
