public class P2p1_1s21{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("Si ingreso por que es verdadero");	
		}
		if (a>10){
			System.out.println("este segmento si se ejecuta por que se cumple la condicion");
		}
		if (true){
			System.out.println("aqui se ejecuta por qu es verdadero");

		}
		if (false){
			System.out.println("esto no se ejecuta por que es falso");
		}
		if ((a>10) ==true){
			System.out.println("se ejecutara?");
		}
		System.out.println("continuemos con el codigo");

		System.out.println("");

		a= 18;

		if(a>17){
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		a=2;
		if(a==6){
			System.out.println("se evaluo a 6");
		}else if (a==7);{
			System.out.println("se evaluo a 7");

		}else if (a==8);{
			System.out.println("se evaluo a 8");
		}else{
			System.out.println("se evaluaron los demas digitos");
		}

		//como valido que no puedo realizar una divion entre 0
		int divisor=0;
		int dividendo=0;
		if (divisor == 0){
			System.out.println("no es posible hace la divicion");
		}else{
			System.out.println("si puedo realizar la divicion");
		}
		
	}
}