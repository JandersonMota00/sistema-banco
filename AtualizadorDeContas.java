public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        // aqui você imprime o saldo anterior, atualiza a conta,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal

        double saldoAnterior = 0;
        double saldoPosterior = 0;

        saldoAnterior += c.getSaldo();
        System.out.println("\nSALDO ANTERIOR: R$ " + saldoAnterior);

        saldoPosterior = saldoAnterior + (saldoAnterior * getSelic());
        System.out.println("SALDO ATUAL: R$ " + saldoPosterior);

        this.saldoTotal = saldoPosterior + getSaldoTotal();
    }
    // outros métodos, colocar o getter para saldoTotal!
}
