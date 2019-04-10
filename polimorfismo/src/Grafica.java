public class Grafica {
    Impressora impressora;
    float precoPorPagina;


    public Grafica(Impressora impressora, float precoPorPagina) {
        this.impressora = impressora;
        this.precoPorPagina = precoPorPagina;
    }

    public float orcarImpressao(Documento doc){
        return doc.getNumeroDePaginas()*this.precoPorPagina;
    }

    public String imprimir(Documento doc){
        this.impressora.imprimirDocumento(doc);
        return "Impressão concluida no valor total de "
                +String.valueOf(this.orcarImpressao(doc));
    }


}
