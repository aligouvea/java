import java.util.Scanner;  
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

    int numero;
    int qtepar = 0;
    int qteimp = 0;
    int zero = 0;
    int posi = 0;
    int neg = 0;
    

    for (int cont=1; cont <=5; cont++){
        numero = teclado.nextInt();
              
            if (numero % 2 == 0){
            qtepar++; 
            }
            else if (numero % 2 != 0){
            qteimp++; 
            }
           
            if (numero > 0){
            posi++;
            }
            else if (numero < 0){
            neg++;
            }

    }    
        System.out.println(qtepar+" valor(es) par(es)");
        System.out.println(qteimp+" valor(es) impar(es)");
        System.out.println(posi+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativos(s)");   
           }

}