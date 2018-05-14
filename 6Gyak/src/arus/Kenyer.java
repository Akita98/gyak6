package arus;
public class Kenyer extends Aru {
private double mennyiseg;
public Kenyer(String nev, int nettoAr, int afaKulcs, double mennyiseg) {
super(nev, nettoAr, afaKulcs);
this.mennyiseg = mennyiseg;
}
@Override
public String toString() {
return super.toString() + ", egységár: " + egysegAr();
}
public double getMennyiseg() {
return mennyiseg;
}
public static boolean elsoNagyobbE(Kenyer a, Kenyer b) {
return a.egysegAr() > b.egysegAr();
}
private double egysegAr() {
return this.bruttoAr()/mennyiseg;
}
}