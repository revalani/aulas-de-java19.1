public class ImpressoraLaser extends Impressora{

    public ImpressoraLaser() {
        super(10_000);
    }

    @Override
    protected void efetuarImpressao(String string){
        System.out.println("Imprimindo com impressora Laiser");
    }
}
