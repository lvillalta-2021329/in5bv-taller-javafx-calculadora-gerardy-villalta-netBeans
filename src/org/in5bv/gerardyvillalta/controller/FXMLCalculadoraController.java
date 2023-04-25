
package org.in5bv.gerardyvillalta.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.in5bv.gerardyvillalta.bean.view.*;


/**
 * FXML Controller class
 *
 * @author Gerardy Villalta
 */
public class FXMLCalculadoraController implements Initializable {
    
    private float Resultado;
    private float numero;
    private int contadoresOperadores;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;

     @FXML
    private Label lblPantalla;
    
    @FXML
    private Button btnUno;
    
    @FXML
    private Button btnDos;
    
    @FXML
    private Button btnTres;
    
    @FXML
    private Button btnCuatro;
    
    @FXML
    private Button btnCinco;
    
    @FXML
    private Button btnSeis;
    
    @FXML
    private Button btnSiete;
    
    @FXML
    private Button btnOcho;
    
    @FXML
    private Button btnNueve;
    
    @FXML
    private Button btnCero;
    
    @FXML
    private Button btnSuma;
    
    @FXML
    private Button btnResta;
    
    @FXML
    private Button btnMultiplicacion;
    
    @FXML
    private Button btnDivicion;
   
    
    @FXML
    private Button btnIgual;
    
    @FXML
    private Button btnPunto;
    
    @FXML
    private Button btnLimpiar;
    
    @FXML
    private Button btnPotencia;
    
    @FXML
    private Button btnReciproco;
    
    @FXML
    private Button btnPorcentaje;
    
    @FXML
    private Button btnMasmenos;
    
    @FXML
    private Button btnRaiz;
    
    @FXML
    private Button btnEliminar;
    
    
     /****************************************************************************************************        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void clicUno(ActionEvent evet){
      actualizarPantalla ("1"); 
    }
    
    @FXML
    private void clicDos(ActionEvent evet){
      actualizarPantalla ("2"); 
    }
    
    @FXML
    private void clicTres(ActionEvent evet){
      actualizarPantalla ("3"); 
    }
    
    @FXML
    private void clicCuatro(ActionEvent evet){
      actualizarPantalla ("4"); 
    }
    
    @FXML
    private void clicCinco(ActionEvent evet){
      actualizarPantalla ("5"); 
    }
    
    @FXML
    private void clicSeis(ActionEvent evet){
      actualizarPantalla ("6"); 
    }
    
    @FXML
    private void clicSiete(ActionEvent evet){
      actualizarPantalla ("7"); 
    }
    
    @FXML
    private void clicOcho(ActionEvent evet){
      actualizarPantalla ("8"); 
    }
    
    @FXML
    private void clicNueve(ActionEvent evet){
      actualizarPantalla ("9"); 
    }

    @FXML
    private void clicCero(ActionEvent evet){
      actualizarPantalla ("0"); 
    } 
    
    @FXML
    private void clicEliminar(ActionEvent evet){
      String Eliminar;
      Eliminar=lblPantalla.getText();
      if (Eliminar.length()>0) {
          Eliminar=Eliminar.substring(0, Eliminar.length()-1);
          lblPantalla.setText(Eliminar);
      }
    } 
    
    
   
    
    
    
    
    @FXML
    private void clicPunto(ActionEvent evet){
      agregarPunto(); 
    } 
    
    public void agregarPunto() {
       if (ingresoNuevo) {
           lblPantalla.setText("");
       } 
       String cadena = lblPantalla.getText();
       
       if (cadena.length() <= 0) {
           lblPantalla.setText("0.");
           ingresoNuevo = false;
       } else if (!(lblPantalla.getText().contains(".")))
           actualizarPantalla(".");
    }
    
    
   
    
    
    private void actualizarPantalla(String digito) {
        
        if (ingresoNuevo) {
            lblPantalla.setText("");
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
    }
    
    private void LimpiarPantalla() {
        lblPantalla.setText("");
    }
    
 
    
    @FXML
    private void clicSuma(ActionEvent evet){
        calcular("+");
    
    } 
    
    
    @FXML
    private void clicResta(ActionEvent evet){
       calcular("-");
    } 
    
    @FXML
    private void clicMultiplicacion(ActionEvent evet){
       calcular("*");
    }
    
     @FXML
    private void clicDivicion(ActionEvent evet){
       calcular("÷");
    } 
    
     @FXML
    private void clicPorcentaje(ActionEvent evet){
       calcular("%");
    } 
    
    @FXML
    private void clicIgual(ActionEvent evet){
       calcular(this.operadorAnterior);
       lblPantalla.setText(String.valueOf(this.Resultado));
    } 
    
      @FXML
    private void clicPotencia(ActionEvent evet){
       contadoresOperadores++;
       operadorAnterior = "^";
       calcular("^");
    } 
    
      @FXML
    private void clicReciproco(ActionEvent evet){
       contadoresOperadores++;
       operadorAnterior = "1/x";
       calcular("1/x");
    }
    
    @FXML
    private void clicMasmenos(ActionEvent evet){
       contadoresOperadores++;
        operadorAnterior = "±";
        calcular("±");
    }
    
    @FXML
    private void clicRaiz(ActionEvent evet) {
        contadoresOperadores++;
        operadorAnterior = "√x";
        calcular("√x");
    }
     /****************************************************************************************************/  
    
    
    
    private void calcular(String operador) { 
        System.out.println("Dentro del metodo calcular");
        System.out.println("Operador: " + operador);
        contadoresOperadores = contadoresOperadores + 1;
        System.out.println("\nContador: " + contadoresOperadores);
        
        if (contadoresOperadores == 1) {
            
            this.Resultado = Float.parseFloat(lblPantalla.getText());
        } else if (contadoresOperadores >= 2) {
                
            this.numero = Float.parseFloat(lblPantalla.getText());
            System.out.println("numero1: " + Resultado);
            System.out.println("numero2: " + numero);
          
            Operacion calc = null;
            System.out.println("Operador Anterior: " + operadorAnterior);
          
            switch (operadorAnterior) {
              case "+":
                  calc = new Suma();         
                  Resultado = calc.operar(Resultado, numero);           
                  break;
              case "-":         
                  calc = new Resta();                            
                  Resultado = calc.operar(Resultado, numero);
                  break;             
              case "*":                        
                  calc = new Multiplicacion();                                
                  Resultado = calc.operar(Resultado, numero);                         
                  break;
              case "÷":                        
                  calc = new Divicion();                          
                  Resultado = calc.operar(Resultado, numero);                        
                  break;           
              case "%":                                               
                  calc = new Porcentaje();                       
                  Resultado = calc.operar(Resultado, numero);                        
                  break;  
                  
              case "±":                                               
                    calc = new Masmenos();
                    Resultado = calc.operar(-1, numero);
                    break;
                  
              case "^":                     
                  calc = new Potencia();                                            
                  Resultado = calc.operar(numero, 2);                                             
                  break;                
              case "1/x":                                           
                  calc = new Reciproco();                                            
                  Resultado = calc.operar(1, numero);                                        
                  break;
                  
              case "√x":                                           
                  calc = new Raiz();                                            
                  Resultado = calc.operar(2, numero);                                        
                  break;
   
            }
            System.out.println("Resultado: " + Resultado);
            lblPantalla.setText(String.valueOf(Resultado));
            
            
            
        }
        this.operadorAnterior = operador;
       // LimpiarPantalla();
        ingresoNuevo = true;
    }
    
    @FXML
    private void clicLimpiar(){
        LimpiarPantalla();
        Resultado = 0;
        numero = 0;
        operadorAnterior = "";
        contadoresOperadores = 0;
        
        
       
    } 

    
    
}
