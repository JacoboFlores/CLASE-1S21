public class P2p4_1s21{
	public static void main(String[] args) {
        int a = 100;

        System.out.println("Mostra los números primos hasta " + a + ":");

        for (int numero = 2; numero <= a; numero++) {
            int divisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.print(numero + " ");
            }
        }
    }
}
