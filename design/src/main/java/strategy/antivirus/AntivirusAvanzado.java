package strategy.antivirus;

public class AntivirusAvanzado extends AnalisisAvanzado {
    @Override
    void iniciar() {
        System.out.println("Analisis simple iniciado");
    }

    @Override
    void analizarMemoria() {
        try {
            System.out.println("Analizando Memoria");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    void analizarKeyLoggers() {
        try {
            System.out.println("Analizando key loggers");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    void analizarRootKits() {
        try {
            System.out.println("Analizando root keys");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    void descomprimirZips() {
        try {
            System.out.println("Analizando archivos zip");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Analisis avanzado finalizado");
    }
}
