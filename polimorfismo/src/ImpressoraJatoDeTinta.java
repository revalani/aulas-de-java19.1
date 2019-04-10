public class ImpressoraJatoDeTinta extends Impressora {

    public ImpressoraJatoDeTinta(int autonomiaTotalImpressoraTinta) {
        super(autonomiaTotalImpressoraTinta);
    }

    protected void fetuarImpressao(String string){
        System.out.println("Imprimindo com impressora Jato de tinta");
    }
}
