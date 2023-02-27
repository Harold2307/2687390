import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        double gradosf;
        double cen;
        System.out.println("ingrese los grados que desea precalentar el horno");
gradosf=lectura.nextInt();
cen= (gradosf-32)/1.8;
System.out.println("Cuantos grados se convierten"+cen);
lectura.close();
    }
}
