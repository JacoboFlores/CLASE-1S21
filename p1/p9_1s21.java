 import java.util.Scanner;

 public class p9_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		System.out.println("Que tipo de operacion desea realizar");
		System.out.println("escriba: Suma, Resta, Multiplicacion, Division");
		operacion = teclado.nextLine();
		
		if (operacion.equals("Suma")){
		System.out.println("Haremos una Suma");
        Scanner	input = new Scanner(System.in);
		int a,b,c;
		System.out.println("ingresa 2 numeros ");
		a = input.nextInt();
		b = input.nextInt();
		c = a + b;
		System.out.println("Suma de 2 numeros es: "+c);
		input.close();

		} else if (operacion.equals("Resta")){
			System.out.println("Haremos una Resta");
	    Scanner	input = new Scanner(System.in);
		int a,b,c;
		System.out.println("ingresa 2 numeros ");
		a = input.nextInt();
		b = input.nextInt();
		c = a - b;
		System.out.println("Resta de 2 numeros es: "+c);
		input.close();

		} else if (operacion.equals("Multiplicacion")){
			System.out.println("Haremos una Multiplicacion");
		Scanner	input = new Scanner(System.in);
		int a,b,c;
		System.out.println("ingresa 2 numeros ");
		a = input.nextInt();
		b = input.nextInt();
		c = a * b;
		System.out.println(" de 2 numeros es: "+c);
		input.close();
		} else if (operacion.equals("Division")){
			System.out.println("Haremos una Division");
		Scanner	input = new Scanner(System.in);
		int a,b,c;
		System.out.println("ingresa 2 numeros ");
		a = input.nextInt();
		b = input.nextInt();
		c = a / b;
		System.out.println("Division de 2 numeros es: "+c);
		input.close();

		} 
	    }
		}
	