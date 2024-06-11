// Classe TreasuryBond
class TreasuryBond {
    private int term;
    private double interestRate;
    private double value;

    // Construtor
    public TreasuryBond(int term) {
        this.term = term;
        setInterestRate(term);
        this.value = calculateValue();
    }

    // Método para definir a taxa de juros com base no prazo
    private void setInterestRate(int term) {
        if (term >= 0 && term <= 11) {
            this.interestRate = 0.005;
        } else if (term >= 12 && term <= 23) {
            this.interestRate = 0.01;
        } else if (term >= 24 && term <= 35) {
            this.interestRate = 0.015;
        } else if (term >= 36 && term <= 47) {
            this.interestRate = 0.02;
        } else if (term >= 48 && term <= 60) {
            this.interestRate = 0.025;
        } else {
            System.out.println("Prazo inválido. O prazo deve estar entre 1 e 60 meses.");
        }
    }

    // Método para calcular o valor do título
    private double calculateValue() {
        return value = value * (1 + interestRate);
    }

    // Método para comprar o título
    public void buyBond(double initialValue) {
        this.value = initialValue;
        System.out.println("Título do Tesouro comprado com sucesso com um valor inicial de $" + initialValue);
    }

    // Método para imprimir informações do título
    public void printInfo() {
        System.out.println("Informações do Título do Tesouro:");
        System.out.println("Prazo: " + term + " meses");
        System.out.println("Taxa de juros: " + (interestRate * 100) + "% ao mês");
        System.out.println("Valor atual: $" + value);
    }
}

// Classe AccountTest (para testar a classe TreasuryBond)
public class AccountTest {
    public static void main(String[] args) {
        // Instanciando um título do tesouro com prazo de 36 meses
        TreasuryBond bond = new TreasuryBond(36);

        // Comprando o título com um valor inicial de $1000
        bond.buyBond(1000.0);

        // Imprimindo informações do título
        bond.printInfo();
    }
}
