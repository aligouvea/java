import java.util.Scanner;  
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int valor;
int q100,q50,q20,q10,q5,q2,q1;
int resto;

valor = teclado.nextInt();

System.out.println(valor);

q100 = valor /100;
resto = valor % 100; 

System.out.println(q100 + " nota(s) de R$ 100,00 ");

q50 = resto /50;
resto = resto % 50; 

System.out.println(q50 + " nota(s) de R$ 50,00 ");


q20 = resto /20;
resto = resto % 20; 

System.out.println(q20 + " nota(s) de R$ 20,00 ");

q10 = resto /10;
resto = resto % 10; 

System.out.println(q10 + " nota(s) de R$ 10,00 ");


q5 = resto /5;
resto = resto % 5; 

System.out.println(q5 + " nota(s) de R$ 5,00 ");

q2 = resto /2;
resto = resto % 2; 

System.out.println(q2 + " nota(s) de R$ 2,00 ");

q1 = resto /1;
resto = resto % 1; 

System.out.println(q1 + " nota(s) de R$ 1,00 ");


    }

}