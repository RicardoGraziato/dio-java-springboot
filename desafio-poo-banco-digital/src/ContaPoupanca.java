public class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca(String titular, int numeroConta, double taxaJuros) {
        super(titular, numeroConta);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaJuros / 100;
        depositar(juros);
        System.out.println("Juros de R$" + juros + " aplicados com sucesso.");
    }
}
