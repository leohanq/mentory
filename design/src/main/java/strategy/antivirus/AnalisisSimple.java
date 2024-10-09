package strategy.antivirus;

public abstract class AnalisisSimple implements IStrategy {

    public void analizar() {
        iniciar();
        saltarZIP();
        detener();
    }

    abstract void iniciar();
    abstract void saltarZIP();
    abstract void detener();
}