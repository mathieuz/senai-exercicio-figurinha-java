public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Matheus", 7);
        Pessoa p2 = new Pessoa("Júlia", 15);

        System.out.printf("Nome: %s | Número de Figurinhas: %s\n", p1.getNome(), p1.getNumFigurinhas());
        System.out.printf("Nome: %s | Número de Figurinhas: %s\n", p2.getNome(), p2.getNumFigurinhas());

        p2.darFigurinhas(p1, 3);

        System.out.println("\n");

        System.out.printf("Nome: %s | Número de Figurinhas: %s\n", p1.getNome(), p1.getNumFigurinhas());
        System.out.printf("Nome: %s | Número de Figurinhas: %s\n", p2.getNome(), p2.getNumFigurinhas());
    }
}
