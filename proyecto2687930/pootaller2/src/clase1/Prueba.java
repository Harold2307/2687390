package clase1;

import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        animal guacamayo = new animal();
        movie titanic=new movie();
        animal panda=new animal();

    System.out.println("ingrese el nombre del animal");
    String nombre= lectura.nextLine();
    System.out.println("Ingrese la edad del animal");
    int edad= lectura.nextInt();
        guacamayo.resgitaranimal(nombre, edad);//invocar o llamar metodo
        guacamayo.mostraranimal();

        int duplicado=guacamayo.duplicaredad(edad);
        System.out.println("la edad duplicada del animal es"+duplicado);
    }
}
