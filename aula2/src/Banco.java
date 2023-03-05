import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {

        int op;
        float saldo = 0, valorSaque, valorDeposito;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\n----- Menu principal -----\n1 - Consultar saldo\n2 - Saque\n3 - Depósito\n4 - Sair");
            System.out.print("Por favor, digite a opçaõ desejada: ");
            op = scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("\n-> Consultar Saldo");
                    System.out.println("Saldo disponível: " + saldo);
                    break;
                case 2:
                    System.out.println("\n-> Saque");
                    System.out.print("Valor desejado para saque: ");
                    valorSaque = scan.nextFloat();
                    while(valorSaque < 0){
                        System.out.print("Por favor, digite um valor Positivo: ");
                        valorSaque = scan.nextFloat();
                    }
                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente!\nSaldo Atual: " + saldo);
                    }else{
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!\nSaldo Atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("\n-> Depósito");
                    System.out.print("Valor desejado para o depósito: ");
                    valorDeposito = scan.nextFloat();
                    while(valorDeposito < 0){
                        System.out.print("Por favor, digite um valor Positivo: ");
                        valorDeposito = scan.nextFloat();
                    }
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!\nSaldo Atual: " + saldo);
                    break;
                case 4:
                    System.out.println("Poxa, até a próxima!");
                    break;
                default:
                    System.out.println("Opção não encontrada, tente novamente.");
                    break;
            }
        }while(op != 4);
    }
}
