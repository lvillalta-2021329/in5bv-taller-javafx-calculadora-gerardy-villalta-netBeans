
package org.in5bv.gerardyvillalta.bean.view;

/**
 *
 * @author Gerardy Villalta
 */
public class Raiz extends Operacion{
   
    
    
     public void Raiz() {
        
    }
    
    @Override
    public float operar() {
        setResultado( (float) Math.sqrt(getNumero2()));
        return getResultado();
    }
    
    @Override
    public float operar(float base, float exponente) {
        setNumero1(base);
        setNumero2(exponente);
        setResultado( (float) Math.sqrt(getNumero2()));
        return getResultado();
    }
    
    public float operar(float base) {
        setNumero1 (base);
        setNumero2 (2);
        setResultado((float) Math.sqrt(getNumero2()));
        return getResultado();
    } 
    
    
}
