import java.util.Scanner;  
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int valor;
int n1,n2,n3;


n1 = 1;
n2 = 2;
n3 = 3;

valor = teclado.nextInt();

        for (int cont=1 ; cont <= valor; cont++){
            System.out.println(+n1 +" "+n2 +" "+n3 + " PUM");
            n1+=4;
            n2+=4;
            n3+=4;
            
        }

    }

}
