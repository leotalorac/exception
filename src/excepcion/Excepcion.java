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
public class Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Test1 t = new Test1();
        //t.divideByZero();
        
        //parte 2
        /*Test2 t2 = new Test2();
        for (int i = 0; i < 5; i++) {
            int denominador = sc.nextInt();
                System.out.println("ingresa el numero");
            try{
                
                System.out.println(t2.divideByZero(denominador));
            }
            catch(ArithmeticException e){
                System.out.println("error aritmetico, no hes posible dividir por cero");
                i--;
            }
        }*/
        Test3 t2 = new Test3();
        for (int i = 0; i < 5; i++) {
            int denominador = sc.nextInt();
                System.out.println("ingresa el numero");
            try{
                
                System.out.println(t2.divideByZero(denominador));
            }
            catch(ArithmeticException e){
                System.out.println("error aritmetico, no hes posible dividir por cero");
                i--;
            }
            catch(luisException e){
                e.printStackTrace();
                

            }
        }
    
    }
}
