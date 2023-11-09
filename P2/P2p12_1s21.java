public class P2p12_1s21{
	public static void main(String[] args) {
		 for (String cadena : args) {
            if (cadena.length() > 1) {
                char opc = cadena.charAt(1);
                if (opc == 'a') {
                    System.out.println("analisis de los parametros");
                } else if (opc == 'b') {
                    System.out.println("instalacion avanzada");
                } else if (opc == 'h') {
                    System.out.println("toda instalacion de parametros");
                } else if (opc == 'e') {
                    System.out.println();
                }
            }
        }
    }
}