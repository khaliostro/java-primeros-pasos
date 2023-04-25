
public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("hola putos");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("lo que dice la condicion es: " + esPareja);
		
		if (puedeEntrar) {
			System.out.println("awebo! ya puedo beber >:D");
		} else {
			System.out.println("tmr! estoy chato causa" + " :c");

		}

	}

}
