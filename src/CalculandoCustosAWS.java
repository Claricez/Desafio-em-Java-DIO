import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {


        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int quantidadeServidores = scanner.nextInt();

        int quantidadeBancosDados = scanner.nextInt();

        //TODO: Calcule os custos
        double custoTotal = calculaCustoTotal(quantidadeServidores, quantidadeBancosDados);

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }
    public static double calculaCustoTotal(int quantidadeServidores, int quantidadeBancosDados){
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        double custo = (quantidadeServidores * custoPorHoraServidor) + (quantidadeBancosDados * custoPorHoraBancoDados);
        return custo;
    };
}