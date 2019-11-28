/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

/**
 *
 * @author CicloM
 */
public final class App {
    
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE"; 
    
    public static final int DNI_NUM = 73100957;
    public static final char DNI_CTR = 'B';
    
    public final void launchApp() {
        
        //CABECERA
        System.out.println("VALIDACIÓN DE DNI ");
        System.out.println("================= ");
        
        //MUESTRA DNI
        System.out.printf("DNI ......: %d%c%n", DNI_NUM, DNI_CTR);
        
        //SEPARADOR
        System.out.println("---");

        //Analisis
        boolean dniOK = validar(DNI_NUM,DNI_CTR);
        
        //MUESTRA
        System.out.printf("Valides ..: %s%n", dniOK ?"Correcto":"incorrecto");
    }
    
    public static final char calcular(int num){
    return LETRAS.charAt(num %23);
        
}
    
    public static final boolean validar(int num, char ctr){
    return ctr == calcular (num);
}
}
