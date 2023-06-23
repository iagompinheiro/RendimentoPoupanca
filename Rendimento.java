package iagomp;

import java.util.Scanner;

public class Rendimento {
    Scanner scanner = new Scanner(System.in);

    private int valor;
    private int quantMeses;
    private double taxaSelic;
    private double taxaRef;


    public void interacaoUsuario() {

        System.out.println("Digite o valor que você deseja investir:");
        this.valor = scanner.nextInt();

        System.out.println("Digite a quantidade de meses do rendimento:");
        this.quantMeses = scanner.nextInt();

        System.out.println("Digite o valor da taxa Selic atual:");
        this.taxaSelic = scanner.nextDouble();

        System.out.println("Digite o valor da taxa referêncial atual:");
        this.taxaRef = scanner.nextDouble();
    }

    public double calculaRendimento() {
        double rendimento;
        if (taxaSelic < 8.5) {
            rendimento = valor * (0.7 * taxaSelic + taxaRef) * quantMeses;
        } else {
            rendimento = valor * (0.005 + taxaRef) * quantMeses;
        }
        return rendimento;
    }

    public double calculaMensal() {
        double rendimentoMensal;
        rendimentoMensal = (calculaRendimento() - valor) / quantMeses;
        return rendimentoMensal;
    }

    public void Resumo() {
        interacaoUsuario();
        System.out.println("Valor inicial: " + valor);
        System.out.println("Valor após o rendimento: " + calculaRendimento());
        System.out.println("Valor do rendimento mês a mês: " + calculaMensal());
    }
}
