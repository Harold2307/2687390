import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        
        int num1, num2, resultado;
        Scanner lectura= new Scanner(System.in); 
        System.out.println("ingrese el primer numero");
        num1 = lectura.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = lectura.nextInt();
        resultado= num1+num2;
        if (num1>num2) {
            System.out.println("la suma de"+num1+"y"+num2+"es:"+resultado);
        } 
        else {
            resultado= num2-num1;
            System.out.println("la resta de"+num2+"y"+num1+"es:"+resultado);
        }
        lectura.close();
    }
    
}
