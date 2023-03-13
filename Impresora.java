/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependenciaimpresora;
/**
 * @author CLAUDIA GOMEZ
 */
public class Impresora {
    private String modelo;
    private  Papel papel;

    public Impresora(String modelo, Papel papel) {
        this.modelo = modelo;
        this.papel = papel;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String imprimir ()
    {  String info=papel.getTexto();
        return info;
       }
}
