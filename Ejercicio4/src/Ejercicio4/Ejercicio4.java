package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero= scann.nextInt();
        if(numero%2==0){
            System.out.println("Su numero es par ");
        }else{
            System.out.println("Su numero es impar ");
        }
    }
}
