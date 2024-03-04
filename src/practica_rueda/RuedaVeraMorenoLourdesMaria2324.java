
package practica_rueda;
/**
 * Clase Rueda del programa
 * @author Lourdes María Vera Moreno
 */

public class RuedaVeraMorenoLourdesMaria2324 {
    
    private int combustible_queda;  
    private double centimos_litro;
    private int capacidad;//capacidad depósito .Se supone que es litros.
    private int consumoVeraMorenoLourdes = 6;//litros a los cien
  
    
    public RuedaVeraMorenoLourdesMaria2324() {
    }

   /** Método que realiza rellenado del depósito de conbustible.
    * 
    * @param combustible_queda se introduce el combustible queda en el depósito.
    * @param centimos_litro se introduce los centimos por litro.
    * @param capacidad se introduce la capacidad del depósito de combutible.
    */     
    public RuedaVeraMorenoLourdesMaria2324(int combustible_queda, int centimos_litro, int capacidad) {
        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;
        
    }
    /**
     * Método que indica cuantos litros de combustible quedan en el depósito.
     * @return devuelve los litros de combustible que hay en el depósito.
     */
    public int getcombustible()
    {
        return(getCombustible_queda());
    }
    /**
     * Método que realiza el viaje
     * @param km  se introducen los kilómetros a recorrer en el viaje
     * @throws Exception Se muestra la exepción si la distancia a recorrer es negativa o el combustible es insuficiente para realizar el viaje.
     */
    public void viaje(int km) throws Exception {
        
        if (km * this.getConsumoVeraMorenoLourdes()/100 > this.getCombustible_queda()) {
                throw new Exception("No hay suficiente combustible para esa distancia");
        }
        if (km <= 0) {
            throw new Exception("No tiene sentido recorrer una distancia que no sea positiva");
        }
        this.setCombustible_queda(this.getCombustible_queda() - (km * this.getConsumoVeraMorenoLourdes() / 100)); 
        
    }
     

    /**
     * Método para rellenar el depósito
     * @param litros Se introducen los litros 
     * @param dinero Se introduce el dinero
     * @throws Exception Muesta la excepción "no se puede rellenar el depósito", ¨·no se puede rellenar, porque se supera la capacidad del depósito o
     * "no tiene dinero suficiente para rellenar el depósito", si el dinero o los litros son menores o igual a 0.  
     * 
     */
      public void rellenar(int litros, double dinero) throws Exception {
            
        if ((dinero <= 0)  || (litros <= 0)){
            throw new Exception("No se puede rellenar el depósito.");
        }
       
        if (this.getCombustible_queda() + litros > getCapacidad()) {
            throw new Exception("No se puede rellenar, porque se supera la capacidad del depósito");
        }
        if (dinero < litros * getCentimos_litro()) {
            throw new Exception("No tiene dinero suficiente para rellenar el depósito.");
        }
        this.setCombustible_queda(this.getCombustible_queda() + litros);
        
    }

    /**
     * Método que indica el combustible.
     * @return the combustible_queda devuelve el combustible que queda.
     */
    public int getCombustible_queda() {
        return combustible_queda;
    }

 /**
  * Método para cambiar el valor del combustible que queda.
  * @param combustible_queda se introduce el combustible que queda.
  */
    public void setCombustible_queda(int combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    /**
     * Método que devuelve el dinero en litros
     * @return the centimos_litro devuelve los céntimos de litros que quedan.
     */
    public double getCentimos_litro() {
        return centimos_litro;
    }

    /**
     * Método para cambiar los centimos de litros.
     * @param centimos_litro se introduce el nuevo valor par el centimo de litro
     */
    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }

    /**
     * Método que devuelve la capacidad del depósito.
     * @return the capacidad devuelve el valor de la capacidad del depósito
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     *Método para cambiar la capacidad del depósito
     * @param capacidad se introduce el nuevo valor para la capacidad del depósito
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Método que indica el consumo al realizar el viaje
     * @return the consumoVeraMorenoLourdes devuelve el consumo que se ha realizado en el viaje
     */
    public int getConsumoVeraMorenoLourdes() {
        return consumoVeraMorenoLourdes;
    }

    /**
     * Método para cambiar el valor del consumo realizado.
     * @param consumoVeraMorenoLourdes se introduce el nuevo valor para el consumo.
     */
    public void setConsumoVeraMorenoLourdes(int consumoVeraMorenoLourdes) {
        this.consumoVeraMorenoLourdes = consumoVeraMorenoLourdes;
    }

}


    
    
    

