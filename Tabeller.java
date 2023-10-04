package no.hvl.dat100.lab5;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		for(int i = 0; i <= (tabell.length - 1); i++) {
			System.out.print(" " + tabell[i]);
		}
		

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		String tabellTxt = "[]";
		
		for(int i = 0; i <= (tabell.length - 1); i++) {
			
			if(i == 0) {
				tabellTxt = "[" + tabell[i];
				if(tabell.length == 1) {
					tabellTxt = tabellTxt + "]";
				}
			} else if(i == (tabell.length - 1)) {
				tabellTxt = tabellTxt + "," + tabell[i] + "]";
			} else {
				tabellTxt = tabellTxt + "," + tabell[i];
			}
			
		}
		return tabellTxt;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
		int sum = 0;
		
		for(int i = 0; i <= (tabell.length - 1); i++) {
			sum = sum + tabell[i];
		}
		
		return sum;
		
	}
	
	public static int summerWhile(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
		int sum = 0;
		int i = 0;
		
		while (i <= (tabell.length - 1)) {
			sum = sum + tabell[i];
			
			i++;
		}
		
		
		
		return sum;
	}
	public static int summerUtvidetFor(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
		int sum = 0;
		
		for(int t:tabell) {
			sum = sum + t;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
		boolean tallTest = false;
		
		for(int t:tabell) {
			if (t == tall) {
				tallTest = true;
			} 
		}
		
		return tallTest;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");
		int i = 0;
		
		try {
			
			while (tabell[i] != tall) {
				i++;
			}
		
		} catch (Exception e) {
			i = -1;
		}
		
		return i;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
		int[] tabellRevers = new int [tabell.length];
		int t = 0;
		
			for (int i = tabell.length-1; i >= 0; i--) {
				tabellRevers[i] = tabell[t];
				t++;
			
		}
		return tabellRevers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
		boolean sortertTest = true;
		for(int i = 0; i <= (tabell.length - 1); i++) {
			if(i > 0) {
				if((tabell[i] < tabell[i-1])) {
					sortertTest = false;
				}
			}
		}
		return sortertTest;
	}
 
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
		int[] tabellSattSammen = new int[tabell1.length + tabell2.length];
		for(int i = 0; i <= (tabell1.length - 1); i++) {
			tabellSattSammen[i] = tabell1[i];
		}
		for(int i = 0; i <= (tabell2.length - 1); i++) {
			tabellSattSammen[(tabell1.length)+i] = tabell2[i];
		}
		return tabellSattSammen;
	}
}
