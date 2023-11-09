public class P2p11_1s21{
	public static void main(String[] args) {
		for (String cadena : args){
			char opc = cadena.charAt(1);
			switch(opc){
			case 'a':System.out.println("analisis de los parametros"); break;
			case 'b':System.out.println("instalacion avanzada"); break;
			case 'h':System.out.println("toda instalacionde parametros"); break;
			case 'e':System.out.println(); break;
			}
		}
	}
}