import java.util.Scanner;  
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

int A,B;
double C;
int Number;
double Salary;

A = teclado.nextInt();
B = teclado.nextInt();
C = teclado.nextDouble();

Number = A;

Salary = B*C;


System.out.println("NUMBER = " +Number);
System.out.printf("SALARY = U$ %.2f\n" ,Salary);


    }

}