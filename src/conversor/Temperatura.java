/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author ander
 */
public class Temperatura {
    
    private float temp;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    
    public float convertir_F_a_C(){
        //Fórmula de conversión de °F a °C
        return 5.0F / 9.0F * (temp - 32);
    }
    
    public float convertir_C_a_F(){
        //Fórmula de conversión de °C a °F
        return 9.0F / 5.0F * temp + 32;
    }
}

        