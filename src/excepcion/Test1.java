/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Test1 {
    Scanner sc = new Scanner(System.in);
    public Test1(){
        
    }
    void divideByZero(){
        double result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Que entre que numero dividir? ");
            int a = sc.nextInt();
                try{
                    result = 25/a;
                }catch(ArithmeticException e){
                    System.out.println("error aritmetico, no hes posible dividir por cero");
                    i--;
                    //imprimir el error 
                    //e.printStackTrace();
                }
            System.out.println(result);
        }
           
        
    }
}
