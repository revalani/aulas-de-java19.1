public class Principal {
    public static void main(String[] args) {

        Impressora impressoraLazer = new ImpressoraLaser();

        Grafica LurdesGrafica = new Grafica(impressoraLazer, (float)(2));

        Documento doc = new Documento("hola mundo",200);

        System.out.println(LurdesGrafica.imprimir(doc));

        System.out.println(impressoraLazer.getAutonomiaNominal());

    }
}
