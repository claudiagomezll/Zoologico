/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependenciaimpresora;

/**
 *
 * @author CLAUDIA GOMEZ
 */
public class Papel {
    
    private String medida;
    private String texto;

    public Papel(String medida, String texto) {
        this.medida = medida;
        this.texto = texto;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
}
