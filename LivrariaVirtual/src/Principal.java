public class Principal {
    public static void main(String[] args){

        Livro livro1 = new Livro("Jadeson BInbolo",2020);
        Livro livro2 = new Livro("Jadeson BInbolo",2021);
        Livro livro3 = new Livro("Jadeson BInbolo",2042);

        Livro livro1Copy = new Livro("Jadeson BInbolo",2020);

        LivrariaVirtual Livraria_JobiclaiTON = new LivrariaVirtualViaBoleto();

        Livraria_JobiclaiTON.incluirLivroNoAcervo(livro1);
        Livraria_JobiclaiTON.incluirLivroNoAcervo(livro2);
        Livraria_JobiclaiTON.incluirLivroNoAcervo(livro3);


        try{

            System.out.println(Livraria_JobiclaiTON.efetuarVenda(livro3,2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{

            System.out.println(Livraria_JobiclaiTON.efetuarVenda(livro1Copy,3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
