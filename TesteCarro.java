public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Ferrari";
        carro1.ano = 1988;
        carro1.nome = "Testarossa";

        
        carro2.marca = "Honda";
        carro2.ano = 2020;
        carro2.nome = "Civic";
       
        System.out.println("Dados do Veiculo 1: ");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Nome: " + carro1.nome);

        System.out.println("\n Dados do Veiculo 2: ");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Nome: " + carro2.nome);

    }
}
