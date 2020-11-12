import java.util.Scanner;  
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int valor;
int n1,n2,n3;


n1 = 1;
n2 = 1;
n3 = 1;

valor = teclado.nextInt();

        for (int cont=1 ; cont <= valor; cont++){
            System.out.println(+n1 +" "+n2 +" "+n3);
            n1++;
            n2 = n1 * n1  ;
            n3 = n1 * n2  ;           
        }

    }

}
