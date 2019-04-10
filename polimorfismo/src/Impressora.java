public class Impressora {
    protected int autonomiaTotal;
    protected int autonomiaNominal;

    public Impressora(int autonomiaTotal) {
        this.autonomiaTotal = autonomiaTotal;
        this.autonomiaNominal = this.autonomiaTotal;
    }

    public void imprimirDocumento(Documento documento){
        if(documento.getNumeroDePaginas() <= getAutonomiaNominal()){
            efetuarImpressao(documento.getTexto());
            atualizaAutonomiaRestante(documento.getNumeroDePaginas());
        }
        else {
            System.out.println("tinta insuficiente para impressão dessa qtds de pagina");
        }
    }

    public int getToralDePaginasImpressas(){
        return 0;
    }

    // indica o percentual restante de "tinta"
    public String getAutonomiaRestante(){
        return String.valueOf(autonomiaTotal- autonomiaNominal /autonomiaTotal);
    }

    // indica quantas páginas podem ser impressas
    public int getAutonomiaNominal(){
        return this.autonomiaNominal;
    }

    protected void efetuarImpressao(String string){
        System.out.println("Classe impressora.efetuarImpressao: ERRO");
    }

    //***
    protected void atualizaAutonomiaRestante(int paginasImpressas){
        this.autonomiaNominal -=paginasImpressas;

    }


}
