import java.util.Scanner;
public class Budget {

    public static void main(String[] args) {
    int valor, productos, cambio;
        System.out.println("cantidad de productos");
        Scanner lectura=new Scanner(System.in);
        productos= lectura.nextInt();
        valor= 10000*productos;
        System.out.println("valor a pagar"+ valor);
        cambio= lectura.nextInt();
        System.out.println("El cambio a dar"+(cambio - valor));
        lectura.close();
}
}