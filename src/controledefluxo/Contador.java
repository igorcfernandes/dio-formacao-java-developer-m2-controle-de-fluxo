package controledefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número (início da contagem): ");
        int valorInicial = scanner.nextInt();

        System.out.println("Digite o segundo número (fim da contagem): ");
        int valorFinal = scanner.nextInt();

        try {
            contar(valorInicial, valorFinal);
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção personalizada e exibe a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Método que realiza a contagem entre dois valores
     * @param valorInicial número inicial
     * @param valorFinal número final
     * @throws ParametrosInvalidosException caso o valorFinal seja menor que valorInicial
     */
    public static void contar(int valorInicial, int valorFinal) throws ParametrosInvalidosException {
        if (valorFinal < valorInicial) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        // Laço de repetição para imprimir a sequência
        for (int i = 1; i <= valorFinal - valorInicial; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}