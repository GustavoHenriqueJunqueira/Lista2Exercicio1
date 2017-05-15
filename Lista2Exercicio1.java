
package lista2exercicio1;

import java.util.Scanner;

public class Lista2Exercicio1 {

    public static void main(String[] args) {
        
        System.out.println("Sistema para verificar se houve gasto a mais na conta de luz");
        
        float   CL;
        
        System.out.println("Digite o valor de sua conta de luz usando a , para separar decimal Ex: 100,00");
        Scanner teclado = new Scanner(System.in);
        CL = teclado.nextFloat();
        
        if (CL>=50){
            System.out.println("Você está gastando muito");
       
        }else{
        
        
        }
        
    }
    
}
