
package af;

import java.util.Scanner;


public class AF {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int x = 1;
       double saldo = 1000;
       String cpf;
       do{
        System.out.println("Seja bem vindo ao banco BICO'Sss'");
        
                System.out.print("Digite o CPF: ");
                cpf = sc.nextLine();
                if("12345678900".equals(cpf)){
                   for(int i = 2; i >=0; i--){
                   System.out.print("Digite a senha: ");
                   String senha = sc.nextLine();
                    if("01020304".equals(senha)){
                       do{
                       System.out.println("Digite a operação: ");
                       System.out.print("1 - Saldo, 2 - Depósito, 3 - Saque, 4 - Transferência, 0 - Sair: ");
                       x = sc.nextInt();
                       switch(x){
                           case 1:
                               System.out.printf("Saldo atual: %.2f%n",saldo);
                               break;
                           case 2:
                               System.out.print("Valor do depósito: ");
                               double dep = sc.nextDouble();
                               saldo+=dep;
                               System.out.printf("Saldo atual: %.2f%n",saldo);
                               break;
                           case 3:
                               System.out.print("Valor do saque: ");
                               double saque = sc.nextDouble();
                               saldo-=saque;
                               System.out.printf("Saldo atual: %.2f%n",saldo);
                               sc.nextLine();
                               break;
                           case 4:
                               System.out.print("Valor da transferência: ");
                               double trans = sc.nextDouble();
                               System.out.print("Conta:  ");
                               sc.nextLine();
                               sc.nextLine();
                               System.out.print("Agência:  ");
                               sc.nextLine();
                               System.out.print("Banco:  ");
                               sc.nextLine();
                               saldo-=trans;
                               System.out.printf("Saldo atual: %.2f%n",saldo);
                               break;
                           default:
                               
                       }        
                       }while(x!=0);
                       break;
                   }
                   System.out.printf("Senha incorreta! %d tentativas restantes%n",i);
                   }
                   if(x!=0)
                   System.out.println("Conta bloqueada! Aperte enter para continuar");
                   sc.nextLine();
                }
                else{
                    System.out.println("Acesso não permitido");
                }  
                cpf = null;
       }while(!"12345678900".equals(cpf));
       }
    
}
