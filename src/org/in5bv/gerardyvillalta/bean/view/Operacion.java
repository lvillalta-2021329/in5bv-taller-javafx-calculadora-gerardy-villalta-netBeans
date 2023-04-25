
 
package org.in5bv.gerardyvillalta.bean.view;

/**
 *
 * @author Gerardy Villalta
 */
public abstract class Operacion {
    // atributos o valores de instancia
    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;
    
    
    // contructores
    // contructor nulo o sin parametros
    public Operacion() { 
        
    }
    
    // contructor con parametros
    public Operacion(float numero1, float numero2) { 
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Geter´s and seter
   
     public float getNumero1() { 
       return numero1;
    }
     
     
     public void setNumero1(float numero1) {
         this.numero1 = numero1;  
        
     }
     
     // Geter´s and seter
   
     public float getNumero2() { 
       return numero2;
    }
     
      public void setNumero2(float numero2) {
         this.numero2 = numero2;  
     }
      
       // Geter´s and seter
   
     public float getResultado() { 
       return resultado;
    }
     
      public void setResultado(float resultado) {
         this.resultado = resultado;  
     }
      
         // Geter´s and seter
   
     public char getOperador() { 
       return operador;
    }
     
      public void setOperador(char operador) {
         this.operador = operador; 
     }
      
     public abstract float operar();
     
     public abstract float operar(float numero1, float numero2);
         
         
     
}
