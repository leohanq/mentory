package strategy.antivirus;

public class Contexto {

    private IStrategy strategy;

    public Contexto(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void ejecutar() {
        this.strategy.analizar();
    }
}
