package strategy.antivirus;

public class App {

    public static void main(String[] args) {
        IStrategy strategy = FactoryAntivirus.getAntivirus("avanzado");
        Contexto contexto = new Contexto(strategy);
        contexto.ejecutar();
    }
}
