
package org.in5bv.gerardyvillalta.bean.view;

/**
 *
 * @author Gerardy Villalta
 */
public class Porcentaje extends Operacion{
    
       @Override 
    public float operar(){
        setOperador('%');
        setResultado(getNumero1() * getNumero2() / 100);
        return getResultado();
    }
    
    @Override
    public float operar(float numero1, float numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('%');
        setResultado(getNumero1() * getNumero2() /100);
        return getResultado();
    }
    
    
}
