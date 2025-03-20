public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "brigadeiro";
        cachorro1.idade = 4;
        cachorro1.altura = 0.90;

        cachorro2.nome = "Beijinho";
        cachorro2.idade = 11;
        cachorro2.altura = 0.6;

        System.out.println("Dados do Cachorro 1: ");
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println("altura: " + cachorro1.altura);

        System.out.println ("\n Dados da Pessoa 2:");
        System.out.println("Nome: " + cachorro2.nome);
        System.out.println("Idade: " + cachorro2.idade);
        System.out.println("Altura: " + cachorro2.altura);

    }
}

