public abstract class LivrariaVirtual {
    Livro[] acervo;
    int tamanhoAcervo;
    float precoPorLivroEmReais;

    int TAMANHO_MAX_ACERVO = 1000;

    public LivrariaVirtual() {
        this.acervo = new Livro[TAMANHO_MAX_ACERVO];
        this.tamanhoAcervo = 0;
        this.precoPorLivroEmReais = 3.141592654f;
    }

    public LivrariaVirtual(Livro[] acervo, int tamanhoAcervo, float precoPorLivroEmReais) {
        this.acervo = acervo;
        this.tamanhoAcervo = tamanhoAcervo;
        this.precoPorLivroEmReais = precoPorLivroEmReais;
    }

    private boolean possuirLivros(Livro livro){
        for (int i = 0; i <this.tamanhoAcervo; i++) {

//            '==' compara endereço de memoria dos objetos, não o conteudo dentro dos objetos
//            if (itemAcervo == livro) {
//                return true;
//            }

            if ( this.acervo[i].equals(livro)){
                return true;
            }
        }
        return false;
    }

    public void incluirLivroNoAcervo(Livro livro){
        if (this.tamanhoAcervo <TAMANHO_MAX_ACERVO) {
            this.acervo[this.tamanhoAcervo] = livro;
            this.tamanhoAcervo +=1;
        }

        else{}

    }

    public String efetuarVenda(Livro livro, int quantidade) throws Exception{
        if(!possuirLivros(livro)){
            throw new Exception("livro nao consta nessa livraria");
        }

        float valor = this.precoPorLivroEmReais*quantidade;

        receberPagamento(valor);

        return "Compra efetuada: \n\t livro "+livro.autor
                +" no valor "
                + valor+"\n";
    }

    protected abstract void receberPagamento(float valor);


}
