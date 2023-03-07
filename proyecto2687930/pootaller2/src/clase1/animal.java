package clase1;
import java.util.Scanner;
public class animal {
    //atributos
    private String nombre;
    public int edad;

    Scanner lectura=new Scanner(System.in);

    //metodos u operaciones
    public void resgitaranimal(String nom,int ed){
        //cuerpo del metodo
        nombre=nom;
        edad=ed;

    }

    public void mostraranimal(){
        System.out.println("El nombre del animal ingresado es"+nombre+"y tiene"+edad+"años");
    }
    public int duplicaredad(int edad){

        int duplicado=edad*2;
        return duplicado; 
    }
}
