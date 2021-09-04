public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mauris");
        System.out.println(lista);
        lista.adicionaNoComeco("Rafaela");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);

        lista.adiciona("Marcela");
        System.out.println(lista);

    }
}
