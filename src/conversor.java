import java.util.Scanner;

public class conversor {

    public void a(){

        int x = 0;
        int contador = 0;
        

        System.out.println("Ingrese un numero binario: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int temporal = x;

        while(temporal!=0){

            temporal = temporal/10;
            contador++;
        }

        int digitos [] = new int[contador];
        
        for(int i = contador -1; i>=0; i-- ){
            digitos[i] = x%10;
            x = x / 10; 
        }


        int respuesta = 0;

        for (int i = 0; i < digitos.length; i++) {

            int lugar = digitos.length - i;
         
            if (digitos[i] == 1) {
                double suma  = Math.pow(2, lugar-1);
                respuesta += suma;
                
            }
        }
        System.out.println("Su numero en decimal es: " +respuesta);

      

        
    
    }

   
}
