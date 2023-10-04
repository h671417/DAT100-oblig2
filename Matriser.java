package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		int antallRader = matrise.length;
        int antallKolonner = matrise[0].length;

        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++)
            	System.out.print(matrise[i][j] + " ");{
            }
           
            }
	}


	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		StringBuilder strengBuilder = new StringBuilder();

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                strengBuilder.append(matrise[i][j]);
                if (j < matrise[i].length - 1) {
                    strengBuilder.append(" ");
                }
            }
            strengBuilder.append("\n");
        }

        return strengBuilder.toString();
    }

    public static void main(String[] args) {
        int[][] eksempelMatrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        String matriseStreng = tilStreng(eksempelMatrise);
        System.out.println(matriseStreng);
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
		int antallRader = matrise.length;
        int antallKolonner = matrise[0].length;

        int[][] resultatMatrise = new int[antallRader][antallKolonner];

        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                resultatMatrise[i][j] = matrise[i][j] * tall;
            }
        }

        return resultatMatrise;
    }

    public static void main1(String[] args) {
        int[][] opprinneligMatrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int tall = 2;

        int[][] skalertMatrise = skaler(tall, opprinneligMatrise);

       
        for (int i = 0; i < skalertMatrise.length; i++) {
            for (int j = 0; j < skalertMatrise[i].length; j++) {
                System.out.print(skalertMatrise[i][j] + " ");
            }
            System.out.println();
        }
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != a.length || a[0].length != a[0].length) {
           
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    
                    return false;
                }
            }
        }

       
        return true;
    }
		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
		
         

       
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("speile ikke implementert");
		
		    
		        int[][] originalMatrise = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] speiletMatrise = speile(originalMatrise);

		        // Skriv ut den originale matrisen
		        System.out.println("Original matrise:");
		        skrivUtMatrise(originalMatrise);

		        // Skriv ut den speilede matrisen
		        System.out.println("\nSpeilet matrise:");
		        skrivUtMatrise(speiletMatrise);
		    }

	public static void[][] speile(int[][] matrise) {
		        int n = matrise.length; // Antall rader i matrisen
		        int m = matrise[0].length; // Antall kolonner i matrisen

		        // Opprett en ny matrise med samme størrelse som den opprinnelige
		        int[][] speiletMatrise = new int[n][m];

		        // Kopier elementene fra den opprinnelige matrisen til den speilede matrisen ved å speile dem
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                speiletMatrise[i][j] = matrise[j][i]; // Speil elementene
		            }
		        }

		        return speiletMatrise;
		    }

		    public static void skrivUtMatrise(int[][] matrise) {
		        int n = matrise.length; // Antall rader i matrisen
		        int m = matrise[0].length; // Antall kolonner i matrisen

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                System.out.print(matrise[i][j] + " ");
		            }
		            System.out.println(); // Ny rad for hver rad i matrisen
		        }
		    }
		    

	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
