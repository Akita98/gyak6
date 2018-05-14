package masik;

public class Szamproba {
	public static void main(String[] args){
		final sajat.elso.Szam FS = new sajat.elso.Szam(0.55);
		
		int N=0;
		double RndNum;
		do {
			RndNum = Math.random();
			System.out.println(RndNum);
			N++;
			} while (!FS.EgyezikE(RndNum));
			System.out.println("Lépésszám: "+N);
	}

}
