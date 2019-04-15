public class LivrariaVirtualViaBoleto extends LivrariaVirtual {


    @Override
    protected void receberPagamento(float valor) {
        System.out.println("Pagamento encaminhado via boleto "+valor);

    }
}
