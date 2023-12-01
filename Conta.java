public class Conta {
    private double saldo;                                                                                                                                                                                   
    //private double deposito;
    //private double sacar;
    
/* 
    public Conta(double saldo) {
        this.saldo = saldo;
    }
*/
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double deposito) {
        this.setSaldo(getSaldo() + deposito);
    }

    public void Sacar(double sacar) {
        if((this.getSaldo() > 0) && (sacar >= this.saldo)) {
            this.setSaldo(getSaldo() - sacar);
            // "Saque efetuado!"
        } else {
            // "Operação invalida!"
        }
    }

    public void atualiza(double taxa) {
        this.setSaldo(getSaldo() + (getSaldo() * taxa));
    }
}
