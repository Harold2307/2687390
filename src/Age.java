import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        
        int age;
        Scanner lectura= new Scanner(System.in); 
        System.out.println("ingrese la edad");
        age = lectura.nextInt();
        if (age>=18) {
            System.out.println("Bienvenidio");
        } 
        else {
            System.out.println("Ingreso no permitido");
        }
        lectura.close();
    }
    
}
