import java.util.Scanner;  
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

double sal,fax1,fax1r;

sal = teclado.nextDouble();

    if (sal <= 2000.0f ){
            System.out.printf("Isento");
        }
    else if (sal >= 2000.00f && sal <= 3000.00f ){
            fax1 = (sal - 2000.00f);
            fax1r = (fax1 * 8 )/100;
            System.out.println("R$ "+fax1r);
            System.out.println("" +fax1);
        }
    } 
}
     