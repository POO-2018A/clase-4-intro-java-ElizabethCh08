package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args){
        boolean EstaNevando=false;
        boolean EstaLloviendo=true;
        double Temperatura=60.0;
        if(EstaNevando==true || EstaLloviendo==true || Temperatura<=10){
            System.out.println("Nos quedamos en casa");
        }else{
            System.out.println("Vamos afuera!");
        }
    }
}
