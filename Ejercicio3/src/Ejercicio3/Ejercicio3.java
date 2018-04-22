package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad=scan.nextInt();
        if(edad<18){
            System.out.println("Usted es menor de edad");
        }else {
            System.out.println("Usted es mayor de edad");
        }
    }

}
