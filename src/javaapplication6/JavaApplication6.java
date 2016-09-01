/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number1, number2, sum;
        String znak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        number1=scanner.nextInt();
        System.out.println("Введите второе число");
        number2=scanner.nextInt();
        
        System.out.println("Введите действие (+ или -)");
        
        znak = scanner.next();
        sum = 0;
        switch (znak) {
            case "+":
                sum=number1+number2;
                break;
             case "-":
                sum=number1-number2;
                break;
            default:
                System.out.println("Неправильно введены числа");
                sum=null;
        }
        if(sum !=null)
        System.out.println("Результат" +sum );
    }
    
}
