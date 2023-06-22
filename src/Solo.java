public class Solo {
    //Atributos
    boolean tipoSolo;
    double fertil;
    String cor;

    //Método
    public Planta gerarPlanta(Semente semente) {
        return new Planta (semente);
    }
}
