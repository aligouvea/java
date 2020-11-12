import java.util.Scanner;  
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

float sal,reaj,res;
float resultado;

sal = teclado.nextFloat();

if (sal >= 0 && sal <= 400 ){
            reaj = (sal* 15) /100;
            res = sal + reaj;
            System.out.printf("Novo salario: %.2f\n" ,res);
            System.out.printf("Reajuste ganho: %.2f\n" ,reaj);
            System.out.printf("Em percentual: 15 %%\n ");
        }
else if (sal >= 400.01 && sal <= 800.00 ){
            reaj = (sal* 12) /100;
            res = sal + reaj;
            System.out.printf("Novo salario: %.2f\n" ,res);
            System.out.printf("Reajuste ganho: %.2f\n" ,reaj);
            System.out.printf("Em percentual: 12 %%\n");
             }
else if (sal >= 800.01 && sal <= 1200.00 ){
            reaj = (sal* 10) /100;
            res = sal + reaj;
            System.out.printf("Novo salario: %.2f\n" ,res);
            System.out.printf("Reajuste ganho: %.2f\n" ,reaj);
            System.out.printf("Em percentual: 10 %%\n");
             }
else if (sal >= 1200.01 && sal <= 2000.00 ){
            reaj = (sal* 7) /100;
            res = sal + reaj;
            System.out.printf("Novo salario: %.2f\n" ,res);
            System.out.printf("Reajuste ganho: %.2f\n" ,reaj);
            System.out.printf("Em percentual: 7 %%\n");
            }
else  if (sal > 2000.00 ){
            reaj = (sal* 4) /100;
            res = sal + reaj;
            System.out.printf("Novo salario: %.2f\n" ,res);
            System.out.printf("Reajuste ganho: %.2f\n" ,reaj);
            System.out.printf("Em percentual: 4 %%\n");
            }
    }    
           
}          