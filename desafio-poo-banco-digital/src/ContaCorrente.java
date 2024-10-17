public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numeroConta, double limiteChequeEspecial) {
        super(titular, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente e limite de cheque especial excedido.");
        }
    }
}