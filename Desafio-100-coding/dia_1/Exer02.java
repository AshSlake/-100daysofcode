package dia_1;


import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		conta.numeroConta= 0001;
		conta.saldoConta = 0;
		conta.contaEspecial = true;
		conta.limiteCredito = 12000;
		
		 Scanner menu = new Scanner (System.in);
		 
         while (true) {            

         System.out.print("##--Menu Conta Bancaria--##\n\n");
         System.out.print("|-----------------------------|\n");
         System.out.print("| Opção 1 - Fazer Saque     |\n");
         System.out.print("| Opção 2 - Depositar Dinheiro          |\n");
         System.out.print("| Opção 3 - Consultar Saldo          |\n");
         System.out.print("| Opção 4 - VerificarChequeEspecial              |\n");
         System.out.print("| Opção 5 - sair              |\n");
         System.out.print("|-----------------------------|\n");
         System.out.print("Digite uma opção: ");

         int opcao = menu.nextInt();
         menu.nextLine();

         if (opcao == 5) {
             System.out.print("\nAté logo!");
             menu.close(); 
             break;
         }

         switch (opcao) {
         case 1:
             System.out.print("\nOpção fazer saque selecionado\n");
             System.out.print("Digite o valor do saque\n");
             double valorSaque = menu.nextDouble();
             conta.FazerSaque(valorSaque);
             double saldoAtual = conta.consultarSaldo();
             System.out.print("\n ---------------------------------------------- \n");
             System.out.print("\nSaldo atual : R$" + saldoAtual);
             break;

         case 2:
             System.out.print("\nOpção de depositar dinheiro selecionado:\n");
             System.out.println("digite o valor a ser depositado");
             Double valorDeposito = menu.nextDouble();
             conta.depositarDinheiro(valorDeposito);
             System.out.println("valor depositado com sucesso");
             System.out.println("R$" + conta.saldoConta);
             break;

         case 3:
             System.out.print("\nOpção Consultar Saldo Selecionado\n");
             System.out.print("\nSaldo atual: R$" +conta.consultarSaldo());
             break;
             
         case 4:
             System.out.print("\nOpção VerificarChequeEspecial Selecionado\n");
             double cheque = conta.verificarChequeEspecial();
             System.out.print("\nvalor do cheque: R$\n" + cheque);
             break;

         default:
             System.out.print("\nOpção Inválida!");
             break;
     }
         
         System.out.print("\nPressione Enter para continuar..."); 
         menu.nextLine();
         

         
 }
         
}

}
