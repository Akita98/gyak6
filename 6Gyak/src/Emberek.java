import java.util.Scanner;

public class Emberek {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Emberek száma: ");
String s1 = sc.nextLine();
int N = Integer.parseInt(s1);
Ember[] E = new Ember[N];
String nev, s2;
int suly, magassag;
for (int i=0; i<N; i++) {
System.out.println(i+". ember neve: ");
nev= sc.nextLine();
System.out.println(i+". ember magassága: ");
s1 = sc.nextLine();
System.out.println(i+". ember súlya: ");
s2 = sc.nextLine();
magassag= Integer.parseInt(s1);
suly= Integer.parseInt(s2);
E[i] = new Ember(nev, magassag, suly);
}
Ember legmagasabb = E[0];
for (int i = 1; i < N; i++)
legmagasabb = Ember.Magasabb(E[i],legmagasabb );
System.out.println("A legmagasabb: " +
legmagasabb.toString());
Ember legnehezebb = E[0];
for (int i = 1; i < N; i++)
if(!Ember.Konnyebb(E[i].getSuly(),legnehezebb.getSuly()))
legnehezebb = E[i];
System.out.println("A legnehezebb: " +
legnehezebb.toString());
}
}