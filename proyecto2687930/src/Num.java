import java.util.Scanner;
public class Num {
    
       public static void main(String[] args) {

        int num; 
        Scanner lectura= new Scanner(System.in);
        System.out.println("ingrese un numero");
        num= lectura.nextInt();
        if(num>0) {
            System.out.println("el numero es poritivo");
        }
        else if(num==0) 
        {
            System.out.println("El numero es neutro");
        }
        else 
        {
            System.out.println("el numero es negativo");
        }
       }
    }