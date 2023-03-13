/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependenciaimpresora;
/**
 * @author CLAUDIA GOMEZ
 */
public class DependenciaImpresora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Papel p = new Papel("A4","esto es dependencia");
        Impresora i =new Impresora("Xerox",p);
        
        String salida= i.imprimir();
        System.out.println(salida);
        
                        
    }
    
}
