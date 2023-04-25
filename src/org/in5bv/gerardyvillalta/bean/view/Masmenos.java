
package org.in5bv.gerardyvillalta.bean.view;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos
 */
public class Masmenos extends Operacion {
    
    @Override
    public float operar(){
        setResultado(getNumero1()* getNumero2());
        return getResultado();
    }
    
    @Override
    public float operar(float numero1, float numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero1() * getNumero2());
        return getResultado();
    }
    
}
