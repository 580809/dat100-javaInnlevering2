package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] i : matrise) {
			
			System.out.println();
			
			for (int j : i) {
				
				System.out.print(j + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String outStr = ("");
		
		for (int[] i : matrise) {
			
			for (int j : i) {
				
				int v = j;
				
				outStr += (v + " ");
			}
			
			outStr += "\n";
		}
		
		return outStr;
		
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int lengde1 = matrise.length;
		int lengde2 = matrise[0].length;
		
		int[][] nyMatrise = new int[lengde1][lengde2];
		nyMatrise = matrise;
		
		for (int i = 0; i < lengde1; i++) {
			
			for (int j = 0; j < lengde2; j++) {
				
				nyMatrise[i][j] = matrise[i][j] * tall;
				
			}
			
		}
		
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
