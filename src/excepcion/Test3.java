/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Test3 {
    Scanner sc = new Scanner(System.in);
    public Test3(){
        
    }
    double divideByZero(int d) throws luisException
    {
        double result = 0;     
        if(d ==0){
            //throw new IllegalArgumentException();
            throw new luisException();
        }
            result = 25/d;
        return result;   
    }
}
