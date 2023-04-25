
package org.in5bv.gerardyvillalta.bean.view;

/**
 *
 * @author Gerardy Villalta
 */
public class Suma extends Operacion {
    
    @Override
     public  float operar() {
         setOperador('+');
        setResultado(getNumero1() + getNumero2());
        return getResultado();
     }
     
    @Override 
    public  float operar(float numero1, float numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('+');
        setResultado(getNumero1() + getNumero2());
        return getResultado();
    }
}
