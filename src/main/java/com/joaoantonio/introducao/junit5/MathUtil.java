package com.joaoantonio.introducao.junit5;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaoantoniodahora
 */
public class MathUtil {
    
    public static int mdc(int a, int b){
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade1
        if(b > 0 && a % b == 0){
            
            return b;
            
        }
        
        //Propriedade3
        if(b == 0) {
            return Math.abs(a);
        }
         
        
        
        return mdc(a-b,b);
        
    }
    
    public static int mdc(int ...valores){
        
        Objects.requireNonNull(valores, "O parametro não pode ser nulo para calcular o MDC");
        
        if (valores.length == 0) {
            throw new IllegalArgumentException("É preciso indicar ao menos um valor pra calcular o MDC");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
    
}
