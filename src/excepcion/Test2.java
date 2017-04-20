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
public class Test2 {
    Scanner sc = new Scanner(System.in);
    public Test2(){
        
    }
    double divideByZero(int d) throws ArithmeticException
    {
        double result = 0;     
        result = 25/d;
        return result;   
    }
}
