package ordenamiento;
import java.util.Scanner;
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        int NO1,NO2,NO4,NO3, AUX1;
        String CA1,CA2,CA3,CA4;
        int [] n= new int[4];
        String [] c= new String[4];
        
        for(int i=0;i<4;i++){
         System.out.println("Ingrese Nota"+(i+1)+": ");
        NO1=var.nextInt();
        System.out.println("Ingrese Numero de Carnet"+(i+1)+": ");
        var.nextLine();
        CA1=var.nextLine();
   n[i]=NO1;
   c[i]=CA1;
   }

     
        
        for(int i=0; i<(3);i++){
     for (int j=0; j<(3);j++){       
         if(n[j]>n[j+1]){
              AUX1=n[j];
              n[j]=n[j+1];
              n[j+1]= AUX1;
        }
     }
 }
        
 for(int i=0;i<4;i++){
    System.out.print("Nota: "+n[i]+"\n");
     System.out.println("Carnet: "+c[i]);
   }
        
      }
    
}
