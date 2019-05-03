public class Album {

    private int tamanhoAlbum;  // total de figurinhas do álbum completo
    private int itensColados[];

    public Album(String nome, int tamanhoAlbum) {
        this.tamanhoAlbum = tamanhoAlbum;
        this.itensColados = new int[tamanhoAlbum+1];
    }

    public boolean possuiFigurinha(int posicao) {
        if (!(posicao < this.tamanhoAlbum && posicao > 0)){
            return false;
        }
        else{
            return this.itensColados[posicao] > 0;
        }
    }

    public boolean possuiRepetida(int posicao) {
        if (!(posicao < this.tamanhoAlbum && posicao > 0)){
            return false;
        }
        else{
            return this.itensColados[posicao] >1;
        }
    }

    public void colarFigura(Figurinha figura){
        this.itensColados[figura.numeroDaFigurinha] +=1;
    }

    public void abrirPacote(Figurinha[] pacote) {
        for (int i = 0; i < pacote.length; i++) {
            colarFigura(pacote[i]);
        }
    }

    public int getTamanhoAlbum() {
        return this.tamanhoAlbum;
    }

    /**
     * responde a qtds de figurinhas coladas no album
     * @return quantidade de figurinhas que estão coladas no album
     */
    public int getContFigurinhas() {
        int cont =0;

        for (int i = 0; i < this.itensColados.length; i++) {
            if( this.itensColados[i] != 0 ) {
                cont++;
            }
        }

        return cont;
    }


    public int getQuantasFaltam() {
        return this.tamanhoAlbum-this.getContFigurinhas();
    }
}
