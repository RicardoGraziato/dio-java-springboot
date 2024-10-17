public class App {
    public void iniciar(){
        ContaCorrente cc = new ContaCorrente("Pedro", 12345, 1000.0);
        ContaPoupanca cp = new ContaPoupanca("Julia", 54321, 0.5);

        cc.depositar(200.0);
        cc.sacar(50.0);
        cc.transferir(cp, 100.0);

        cp.renderJuros();
        cp.sacar(30.0);
    }
}