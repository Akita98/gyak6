package arus;
public class Aru {
private String nev;
private int nettoAr;
private int afaKulcs;
public Aru(String nev, int nettoAr, int afaKulcs) {
this.nev = nev;
this.nettoAr = nettoAr;
this.afaKulcs = afaKulcs;
}
@Override
public String toString() {
return nev + ", bruttó ár: " + bruttoAr();
}
public void aratEmel(int szazalek) {
this.nettoAr += Math.round(this.nettoAr * szazalek/100.0);
}
public int hasonlit(Aru masik) {
int ar = this.bruttoAr();
int masikar = masik.bruttoAr();
if (ar > masikar) return 1;
if (masikar > ar) return -1;
return 0;
}
public int bruttoAr() {
return (int)Math.round(this.nettoAr * (1 + this.afaKulcs/100.0));
}
}