import java.util.Scanner;
public class P2p13_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int f,c;
		System.out.println("Ingrese el numero de filas");
		f = teclado.nextInt();
		System.out.println("Ingrese el numero de colunas");
		c = teclado.nextInt();

		int[][] MA = new int [f][c];
		int[][] MB = new int [f][c];
		int[][] MC = new int [f][c];
		int ff,fc;
		for(ff=0; ff<f; ff++){
			for (fc=0; fc<c; fc++){
			System.out.println("Ingrese el valor para la pocision ["+ff+"]["+fc+"]");
			MA[ff][fc] = teclado.nextInt();
		}

	}
	for (ff=0 ;ff<f ;ff++){
		for (fc=0 ;fc<c ;fc++){
			System.out.println("Ingrese el valor para la pocision ["+ff+"]["+fc+"]");
			MB[ff][fc] = teclado.nextInt();
			
		}

	}
	for (ff=0; ff<f; ff++){
		for (fc=0; fc<c; fc++){
			MC[ff][fc] = MA[ff][fc] + MB[ff][fc];
			
		}

	}
	for (ff=0 ;ff<f ;ff++){
		for (fc=0 ;fc<c ;fc++){
			System.out.println("El resultado  de la suma de la matriz en su pocision["+ff+"]["+fc+"] es" + MC[ff][fc]);
			
		}
		
	}
}
}

