import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.*;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner scn = new Scanner(System.in);
         double a = scn.nextDouble();
         double b = scn.nextDouble();
         double c = scn.nextDouble();
         double d = scn.nextDouble();
         
         double r = (a+b+c+d)/4.0;
         if(r>=7.0){
             System.out.printf("Media: %.1f\n",r);
             System.out.printf("Aluno aprovado.");
         }
         else if(r<5.0){
            System.out.printf("Media: %.1f\n",r);
            System.out.printf("Aluno reprovado.");
         }
         else{
             System.out.printf("Media: %.1f\n",r);
             System.out.printf("Aluno em exame.\n");
             double x = scn.nextDouble();
             System.out.printf("Nota do exame: %.1f\n",x);
             if((r+x)/2.0>=5.0){
                 System.out.printf("Aluno aprovado.");
             }
             else{
                System.out.printf("Aluno reprovado.");
             }
             
         }
         
         scn.close();
 
    }
 
}