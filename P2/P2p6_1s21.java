import java.util.Scanner;

public class P2p6_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opc;
		int a=1;
		do{
			System.out.println("aqui nos repetimos");
			a++;

		}while(a<10);

	    a=10;
		do{
			System.out.println("acaso se ejecutara esta linea ");

		}while(a<10);

		do{
			System.out.println("Presiona s para sañir:");
			opc = teclado.next().chartAt(0);
		}while (opc != 's'); 
			
	}
}