import java.util.Scanner;  //Declaro a importção de biblioteca
public class Uri1001{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int A,B,X;


A = teclado.nextInt();
B = teclado.nextInt();

X = A + B;

System.out.println ("X = " +X);

    }

}