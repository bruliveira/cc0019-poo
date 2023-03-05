import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Testando ser é um número primo");

        int numero;

        System.out.print("Por favor, digite um número: ");
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt(); 
        scan.close();

        //Calculando se é um número primo
        int numerosDivisores = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                numerosDivisores += 1;
            }
        }

        if(numerosDivisores > 2){
            System.out.println(numero + ", não é um número primo");
        }else{
            System.out.println(numero + ", é um número primo");
        }

        

        /*
        --- RESOLUÇÂO DA PROFESSORA

        int divisor = 2;
        boolean achouDivisor = false;

        while(!achouDivisor && divisor < numero){
            if(numero % divisor == 0) {
                achouDivisor = true;
            }else {
                divisor++;
            }
        }

        //Resultado
        if(achouDivisor) {
            System.out.println(numero + " não é um número primo");
        }else {
            System.out.println(numero + " é um número primo");
        }

        */

    }
}