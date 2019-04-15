public class Livro {
    String  autor;
    int anoDePublicacao;

    public Livro(String autor, int anoDePublicacao) {
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }


    public boolean equals(Livro livro){
        if ( this.autor == livro.autor ){
            return true;
        }
        return false;
    }
}
