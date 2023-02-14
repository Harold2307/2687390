import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner(System.in);
    int number1,number2,resultado;
        System.out.println("Ingrese un numero");
        number1=lectura.nextInt();
        System.out.println("ingrese otro numero");
        number2=lectura.nextInt();
        resultado= number1+number2;
        System.out.println("la suma de"+number1+"y"+number2+"el resultado es"+resultado);
        String name;
        lectura.nextLine();//limpeza de BUFFER
        System.out.print("dijite su nombre"); 
        name=lectura.nextLine();
        System.out.println("el nombre ingresado fue:"+name);

    



        lectura.close();

    }
}
