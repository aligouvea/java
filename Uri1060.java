import java.util.Scanner;  
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

    float numero;
    int qtepositivos = 0;
    

    for (int cont=1; cont <=6; cont++){
        numero = teclado.nextFloat();
        if (numero > 0){
            qtepositivos++;
        }
        system.out.println(qtepositivos+"valores positivos");
    }

}