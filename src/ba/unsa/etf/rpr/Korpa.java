package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brArtikala >= 50) return false;
        artikli[brArtikala] = a;
        brArtikala++;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i < brArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j = i; j < brArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brArtikala--;
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
        for(int i=0; i < brArtikala; i++) suma = suma + artikli[i].getCijena();
        return suma;
    }
}
