import java.util.Scanner;  
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

    float numero;
    int somatoria = 0;
    int media;
    int qtepositivos;
    

    for (int cont=1; cont <=6; cont++){
        numero = teclado.nextFloat();
        if (numero > 0){
            qtepositivos++; 
            somatoria = somatoria + numero;
        }
        media = somatoria / qtepositivos;

        system.out.println(qtepositivos+"valores positivos");
        system.out.printf("%.1f/n" ,media);
    }

}