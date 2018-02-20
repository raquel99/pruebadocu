package objetos;

public class Coche {
	// Definir los atributos
	
			private String modelo;
			private int distanciaTotal;
			private int distanciaParcial;
			private boolean motor;
			private int velocidad;
			private int velocidadMax;
			
	
		// Definir los métodos
		
		Coche ( String modelo, int velocidadMax){
			this.modelo=modelo;
			this.velocidadMax=velocidadMax;
		}
		
		public boolean arrancar(){
			if(motor==false) {
				motor=true;
				return true;
			}
			else{
				infoError("El motor no se puede arrancar porque ya está arrancado");
				 return false;	
			}
		 
		}

		public boolean parar(){
			if(motor==true){
				motor=false;
				velocidad=0;
				distanciaParcial=0;
				return false;
			}
			else {
				infoError("El motor no se puede parar porque ya está parado");
				return true;
			}
				
		}

		public boolean acelera( int cantidad){
			if(motor==true) {
				velocidad=velocidad+cantidad;
					if(velocidad>velocidadMax){
						velocidad=velocidadMax;
					}
				return true;
			}
			else {
				infoError("El motor esta parado, no se puede acelerar");
				return false;
			}
			
				
		}
		
	      public boolean frena ( int cantidad){
	    	  if(motor==true) {
					velocidad=velocidad-cantidad;
					if(velocidad<0) {
						velocidad=0;
					}
					return true;
				}
				else {
					infoError("No se puede frenar porque el coche está parado");
					return false;
				}
	    	 
		}
		
	     public boolean recorre (){
	    	 if(motor==true) {
	    		 distanciaParcial= distanciaParcial+ velocidad;
		    	 distanciaTotal= distanciaTotal+velocidad; 
		    	 return true;	
	    	 }
	    	 else {
	    		 infoError("El motor esta parado, no se puede recorrer km");
	    		 return false;
	    	 }
	    
	  
	     }
		
	     public String info(){
		   return "El modelo es: "+modelo+" , la velocidad actual es: "+velocidad+" , los kilometros parciales recorridos son: "+distanciaParcial+" y los km totales son: "+ distanciaTotal;
	     }
		
	     public int getKilometros(){
	    	 
	    	 distanciaTotal=distanciaTotal+distanciaParcial;
	    	  return distanciaTotal;
	   }
	   
	    private void infoError( String mensaje){
	    	System.err.println(mensaje);
		   
	   }	
	

}
