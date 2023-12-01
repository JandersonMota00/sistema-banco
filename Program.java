class Program {
    public static void main(String[] args) {

        // TestaContas
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        // TestaAtualizadorDeContas
        Conta c01 = new Conta();
        Conta cc01 = new ContaCorrente();
        Conta cp01 = new ContaPoupanca();
        c01.deposita(1000);
        cc01.deposita(1000);
        cp01.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c01);
        adc.roda(cc01);
        adc.roda(cp01);
        System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
    }
}