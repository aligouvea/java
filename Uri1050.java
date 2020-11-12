import java.util.Scanner;  
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int cod;
int ddd61,ddd72,ddd11,ddd21,ddd32,ddd19,ddd27,ddd31;

cod = teclado.nextInt();

        if (cod == 61){
            System.out.println("Brasilia");
        }
        else if (cod == 71){
            System.out.println("Salvador");
        }
        else if (cod == 11){
            System.out.println("Sao Paulo");
        }
         else if (cod == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (cod == 32){
            System.out.println("Juiz de Fora");
        }
         else if (cod == 19){
            System.out.println("Campinas");
        }
        else if (cod == 27){
            System.out.println("Vitoria");
        }
        else if (cod == 31){
            System.out.println("Belo Horizonte");
        }
         else {
        System.out.println("DDD nao cadastrado");
        }
           
    }

}