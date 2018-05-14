public class Ember {
private String nev;
private int magassag;
private int suly;
public Ember(String nev, int magassag, int suly){
this.nev= nev;
this.magassag= magassag;
this.suly= suly;
}
public String toString() {
return nev+ "-" + magassag+ "-" + suly;
}
public int getSuly(){
return  suly;
}
public static Ember Magasabb(Ember a, Ember b){
if (a.magassag> b.magassag) return a;
else return b;
}
public static boolean Konnyebb(int a, int b){
return a < b;
}
}