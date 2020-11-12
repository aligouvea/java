import java.util.Scanner;  
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int A,B;
double C;
int D,E;
double F;
double VALOR1;
double VALOR2;
double RESULTADO;

A = teclado.nextInt();
B = teclado.nextInt(); 
C = teclado.nextDouble();
D = teclado.nextInt(); 
E = teclado.nextInt(); 
F = teclado.nextDouble();

VALOR1 =  B*C;
VALOR2 =  E*F;

RESULTADO = VALOR1 + VALOR2;

System.out.printf("VALOR A PAGAR : R$ %.2f\n" ,RESULTADO);


    }

}