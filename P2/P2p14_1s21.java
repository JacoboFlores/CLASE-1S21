import java.util.Scanner;

public class P2p14_1s21{
	public static void main(String[] args) {
		Scanner teclado = new  Scanner(System.in);
		int[][]Ma,Mb,Mc;
		int fa,ca,fb,cb,f,c,r=0,h;
		System.out.println("Ingresa el numero de filas para la Matriz A");
		fa = teclado.nextInt();
		System.out.println("Ingresa el numero de colunas para la Matriz A");
		ca = teclado.nextInt();
		System.out.println("Ingresa el numero de filas para la Matriz B");
		fb = teclado.nextInt();
		System.out.println("Ingresa el numero de colunas para la Matriz B");
		cb = teclado.nextInt();
		if (ca == fb){
			Ma = new int[fa][fa];
			Mb = new int[fb][cb];
			Mc = new int[fa][cb];
			for(f=0;f<fa;f++){
				for (c=0;c<ca ;c++ ){
				System.out.println("Ingresa el valor para Ma["+f+"]["+c+"]: ");
				Ma[f][c]=teclado.nextInt();
			}
		}
		for(f=0;f<fa;f++){
			for(c=0;c<ca;c++){
				System.out.println("Ingresa el valor para Mb["+f+"]["+c+"]: ");
				Mb[f][c]=teclado.nextInt();

			}
		}
        //aqui empesamos la multiplicacion
        for (f=0;f<fb;f++){
        	for (c=0;c<cb;c++){
        		for (h=0;h<cb;h++){
        			r=Ma[f][h]*Mb[c][h];
        			
        		}
        		Mc[f][c]=r;
        	}
        	
        }

		}else{
			System.out.println("No se puede ralizar el proceso de multiplicacion");
		}
	}
}