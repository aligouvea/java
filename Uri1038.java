import java.util.Scanner;  
public class Uri1035{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int cod, qtd;
double total;

cod = teclado.nextInt();
qtd = teclado.nextInt();

if (cod == 1){
    total = qtd * 4.0;
    }
else {
        if (cod == 2) {
            total = qtd * 4.50;
                }
        else if (cod == 3){
                       total = qtd * 5.0;
                   }

            }
}