
public class Alkalmazott {

		private String nev;
		private int kor;
		private int fizetes;
		
		private static int Nyugdij=60;
		
		public Alkalmazott(String nev, int kor, int fizetes){
			this.nev = nev;
			this.kor = kor;
			this.fizetes = fizetes;


	}
		public int HatraVan(){
			return Nyugdij - kor;
		}
		
		public String Adatok(){
			return "N�v: "+ nev +" Kor: "+ kor+" fizetes: "+fizetes+" nyugd�jig m�g "+HatraVan()+" �v van h�tra";	
		}
		public static void SetNyugdij(int NyugdijBe){
		Nyugdij = NyugdijBe;
}
		public static boolean NagyobbFizetes (Alkalmazott A1, Alkalmazott A2){
			return A1.fizetes > A2.fizetes;
	}
}
