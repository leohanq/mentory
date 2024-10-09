package strategy.antivirus;

public abstract class AnalisisAvanzado implements IStrategy {

    public void analizar() {
        iniciar();
        analizarMemoria();
        analizarKeyLoggers();
        analizarRootKits();
        descomprimirZips();
        detener();
    }

    abstract void iniciar();
    abstract void analizarMemoria();
    abstract void analizarKeyLoggers();
    abstract void analizarRootKits();
    abstract void descomprimirZips();
    abstract void detener();
}