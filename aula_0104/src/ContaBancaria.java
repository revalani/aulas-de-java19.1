public class ContaBancaria {
    private final long numero;
    private String dono;
    private float saldo;
    private int senha;

    public static final int Cheque_Especia= 200;

    public ContaBancaria(long numero, String dono, float saldo, int senha) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void depositar(float valor)  {
        if(valor<=0){
            throw new IllegalArgumentException("Valor sacado dever ser positivo");
        }

        this.saldo += valor;
        System.out.println(this.numero+" recebeu: R$"+valor+"\t saldo atual: R$"+this.saldo);
    }

    public void sacar(float valor,int senha){
        if(valor<=0){
            throw new IllegalArgumentException("Valor sacado dever ser positivo");
        }

        if(senha != this.senha){
//            throw bancoInternalException.SenhaInvalodaException("Senha vinvalida");
        }

        if(valor > saldo + Cheque_Especia){
//            throw SaldoInsuficienteException("SaldoInsuficienteException");
        }

        this.saldo-=valor;

        System.out.println(this.numero+" sacou: R$"+valor+"\t saldo atual: R$"+this.saldo);
    }

    public void transferir(float valor, ContaBancaria contaDestino, int senha){
        sacar(valor,senha);
        contaDestino.depositar(valor);

//        System.out.println(this.numero+" transferiu: R$"+valor+"\t saldo atual: R$"+this.saldo);
//        System.out.println(contaDestino.getNumero()+" recebeu: R$"+valor+"\t saldo atual: R$"+contaDestino.saldo);
    }
}
