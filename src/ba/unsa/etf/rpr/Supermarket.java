package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brArtikala >= 1000) return false;
        artikli[brArtikala] = a;
        brArtikala++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
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
}
