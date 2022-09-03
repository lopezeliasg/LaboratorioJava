import java.util.Scanner;

public class tp_8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        float numero = sc.nextFloat();
        System.out.println("Raiz de "+numero+" es: "+Math.sqrt(numero));
    }
}