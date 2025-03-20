public class TesteHerois {
    public static void main(String[] args) {
        
    Heroi heroi1 = new Heroi();
    Heroi heroi2 = new Heroi();

    heroi1.nome = "Batman";
    heroi1.indentidade_secreta = "Bruce Wayne";
    heroi1.poderes = "Intelecto avançado";

    heroi2.nome = "Flash";
    heroi2.indentidade_secreta = "Barry Allen";
    heroi2.poderes = "Super Velocidade";
   
   
    System.out.println("Dados do Heroi 1: ");
    System.out.println("Nome: " + heroi1.nome);
    System.out.println("Indentidade secreta: " + heroi1.indentidade_secreta);
    System.out.println("Poderes: " + heroi1.poderes);

    System.out.println("\nDados do Heroi 2: ");
    System.out.println("Nome: " + heroi2.nome);
    System.out.println("Indentidade secreta: " + heroi2.indentidade_secreta);
    System.out.println("Poderes: " + heroi2.poderes);

    }
}
