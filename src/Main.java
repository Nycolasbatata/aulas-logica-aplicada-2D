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
        System.out.println(qualquer.falar(" alto "));

        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        int y = 0;
        Animal roedor = new Animal();
            roedor = new Animal();
            Animal x;
            x = new Animal();

         //  Consultar dados do objeto cao
        cao.nome = "Pluto"; // Atribuição
        System.out.println(cao.nome); // Consulta
        cao.comer(); // chamada de método
        Pessoa nova = new Pessoa();
        nova.nome = "Tina";
        nova.comer();



        }
    }
