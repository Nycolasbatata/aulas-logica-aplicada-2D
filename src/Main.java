public class Main {
    public static void main(String[] args) {
        // Aula inicial de Orientações objetos

        Pessoa adao = new Pessoa();

        // declaração
        Pessoa qualquer;
        // isntaciação
        qualquer = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));


    }
}

