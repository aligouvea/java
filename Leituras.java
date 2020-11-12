import java.util.Scanner;  //Declaro a importção de biblioteca
public class Leituras{
    public static void main(String args[]){

//preciso criar o componente 
Scanner teclado;
teclado = new Scanner(System.in); // Crio o componente apontando-o para o dispositivo de entrada padrão(teclado)


int valorInteiro;
float valorReal;

System.out.println("Por favor, digite um numero inteiro:" );
valorInteiro = teclado.nextInt();
System.out.println("Valor que o usuario digitou : " + valorInteiro);

System.out.println("Por favor, digite um numero Real:" );
valorReal = teclado.nextFloat();
System.out.println("Valor real que o usuario digitou" + valorReal); 

System.out.printf(" o Valor com 2  caas decimais: %2f\n" ,valorReal);

    }
}