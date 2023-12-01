class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa) {
        // 2 * Taxa
        this.setSaldo(getSaldo() + (2 * getSaldo() * taxa));
    }

    @Override
    public void deposita(double deposito) {
        // Retirar uma taxa bancária de dez centavos de cada depósito.
        // R$ = conta - 0.10
        this.setSaldo(getSaldo() + deposito - 0.1);
    }
}
