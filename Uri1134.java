import java.util.Scanner;  
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado;
teclado = new Scanner(System.in);

  
int gasolina;
int diesel;
int alcool;
int prod;

gasolina = 0;
diesel = 0;
alcool = 0;
   
   do {
       
    prod = teclado.nextInt();
       
        
         
        if ( prod == 1 ){
            alcool++;
          
        }
        else if ( prod == 2 ){
            gasolina++;
             
        }
        else if ( prod == 3){
            diesel++;
            
        } 
         
                 
    }    while ( prod != 4 );  
          
          System.out.println("MUITO OBRIGADO");    
          System.out.println("Alcool: " +alcool); 
          System.out.println("Gasolina: " +gasolina);
          System.out.println("Diesel: " +diesel);       
       
    }

   
}