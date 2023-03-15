import java.util.Scanner;


public class Pilha {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cont =0;

        Fila<Integer> fila = new Fila <Integer>();
        Fila<Integer> preferencial = new Fila<>();
        

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        preferencial.enfileira(1);
        preferencial.enfileira(2);
        
        System.out.println("SOLICITAR SENHA: ");
        System.out.println("1 - Preferencial");
        System.out.println("2 - Não Preferencial");
 
        int escolha = sc.nextInt();
 
        switch(escolha){
         
      case 1:
        System.out.println("Senha Preferencial: ");
            senha(preferencial);
            System.out.println(preferencial);
            break;
        
 
         case 2:
         System.out.println("Senha: ");
           senha(fila);
            System.out.println(fila);
            break;

        }
       
 
       }


 

    private static void senha(Fila<Integer> preferencial) {
    
    }
}


