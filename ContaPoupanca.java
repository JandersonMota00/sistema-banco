public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        // 3 * Taxa
        this.setSaldo(getSaldo() + (3 * getSaldo() * taxa));
    }
}
