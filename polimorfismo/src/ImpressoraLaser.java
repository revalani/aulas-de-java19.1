public class ImpressoraLaser extends Impressora{

    public ImpressoraLaser() {
        super(10_000);
    }

    protected void fetuarImpressao(String string){
        System.out.println("Imprimindo com impressora Laiser");
    }
}
