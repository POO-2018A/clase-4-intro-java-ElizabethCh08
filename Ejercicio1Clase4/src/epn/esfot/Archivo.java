package epn.esfot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Archivo {
    String nombre;
    String tipo;
    String fecha;
    String propietario;

    public Archivo(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Archivo(String nombre, String tipo, String fecha, String propietario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.propietario = propietario;
    }

    public void cambiarNombre(String nombreNuevo){
        setNombre(nombreNuevo);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Archivo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("\tMenú Archivos\n" +
                "1.Crear archivo con nombre,fecha\n" +
                "2.Crear archivo con nombre, fecha, tipo y propietario" +
                "3.Cambiar nombre\n");

        String fec= "2018/05/07";
        Archivo archivo1;
        Archivo archivo2;

            System.out.println("1. Ingrese el nombre");
            String nombre= scanner.nextLine();

            archivo1= new Archivo(nombre, fec);
            System.out.println(archivo1);

            System.out.println("2. Ingrese el nombre");
            nombre= scanner.nextLine();
            System.out.println("Ingrese el tipo de arcivo");
            String arc= scanner.nextLine();
            System.out.println("Ingrese el propietario");
            String propietario= scanner.nextLine();

            archivo2= new Archivo(nombre, arc,fec,propietario);
            System.out.println(archivo2);


            System.out.println("3. Ingrese el nuevo nombre para Arc1");
            nombre= scanner.nextLine();

            archivo1.cambiarNombre(nombre);
            System.out.println(archivo1);



    }
}
