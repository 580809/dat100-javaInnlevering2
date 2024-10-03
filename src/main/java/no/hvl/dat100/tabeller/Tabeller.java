package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			System.out.print(tabell[i] + " ");
			
		}

		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tabUt = ("[");
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			int v = tabell[i];
			
			tabUt += v;
			
			if (i < (tabell.length - 1)) {
				tabUt += ",";
			}
		}
		
		tabUt += ("]");
		return(tabUt);
	}

	// c)
	public static int summer(int[] tabell) {

		int tabSum = 0;
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			int v = tabell[i];
			
			tabSum += v;
		}
		
		return tabSum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnTall = false;
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			int v = tabell[i];
			if (v == tall) {
				finnTall = true;
			}
		}
		
		return finnTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int tallPos = (-1);
		
		for (int i = 0; i < tabell.length; i++ ) {
		
			int v = tabell[i];
			if (v == tall) {
			
				tallPos = i;
			}	
		}
		
		return tallPos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revTab = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			int v = tabell[i];
			int revPos = revTab.length - (1 + i);
			
			revTab[revPos] = v;
		}
		
		return revTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortTall = true;
		int v = 0;
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			if (v > tabell[i]) {
				sortTall = false;
			}
			v = tabell[i];
		}
		
		return sortTall;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int tabLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[tabLengde];
		
		for (int i = 0; i < tabell1.length; i++ ) {
			
			nyTab[i] = tabell1[i];
			
		}
		
		for (int j = 0; j < tabell2.length; j++ ) {
			
			nyTab[tabell1.length + j] = tabell2[j];
			
		}
		
		return nyTab;
	}
}
