import java.util.Scanner;

public class Rendimento {
    Scanner scanner = new Scanner(System.in);

    private int valor;
    private int quantMeses;
    private double taxaSelic;
    private double taxaRef;

    public Rendimento(double taxaSelic, double taxaRef) {
        this.taxaSelic = taxaSelic;
        this.taxaRef = taxaRef;
    }

    public void interacaoUsuario() {

        System.out.println("Digite o valor que você deseja investir:");
         this.valor = scanner.nextInt();

        System.out.println("Digite a quantidade de meses do rendimento:");
        this.quantMeses = scanner.nextInt();
    }

    public int getValor() {
        return valor;
    }

    public int getQuantMeses() {
        return quantMeses;
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
        double rendMensal;
        rendMensal = (calculaRendimento() - valor) /quantMeses;
        return rendMensal;
    }

    public void Resumo() {
        System.out.println("Valor inicial: " + valor);
        System.out.println("Valor após o rendimento: " + calculaRendimento());
         System.out.println("Valor do rendimento mês a mês: " + calculaMensal());
    }
}
