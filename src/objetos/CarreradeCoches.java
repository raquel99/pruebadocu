package objetos;
import java.util.Random;
/**
 * 
 * @author Alumno
 *
 */
public class CarreradeCoches {
	public static void main(String[] args) {
		
		Random valor = new Random();  // Variable que me genera números aleatorios
		final int META = 500;         // 500 kilómetros		
		Coche parrilla [] = new Coche [5]; // Parrilla de salida con 5 coches
	
		// Creo 3 coches
		parrilla [0] = new Coche ("Ferrari",300);
		parrilla [1] = new Coche ("600",100);
		parrilla [2] = new Coche ("BMW",220);
		parrilla [3] = new Coche ("Seat",150);
		parrilla [4] = new Coche ("La Cabra",10);
		
		// Test de pruebas todos deben generar errores
	
		Coche c1 = parrilla[0];
		Coche c2 = parrilla[1];
		c1.acelera(10);
		c2.frena(20);
		c1.parar();
		c2.recorre();
	
		
		// Arranquen los motores
		for(int i=0; i< parrilla.length; i++){
			parrilla[i].arrancar();
		}
		
		// Comienza la carrera !!!!
		do {
			for (int i = 0; i < parrilla.length; i++) {
				parrilla[i].acelera(valor.nextInt(40));
				parrilla[i].recorre();
				parrilla[i].frena(valor.nextInt(10));
				System.out.println(parrilla[i].info());
			}
				
		} while ( ! alcanzarMeta ( parrilla, META) );

		
	}

	// MÉTODO AUXILIAR
	// Devuelve verdadero si hay algún coche que haya recorrido la distancia indicada.
	
	static public boolean alcanzarMeta (Coche tcoches[], int distancia){
		boolean fin = false;
		for (int t = 0; t < tcoches.length; t++) {
		     if ( tcoches[t].getKilometros() >= distancia ){
		    	 fin = true; 
                   System.out.println("El ganador es "+ tcoches[t].info());
		    	 break;
		     }
		}
		return fin;
	}
}
