package strategy.antivirus;

public class AntivirusSimple extends AnalisisSimple {
    @Override
    void iniciar() {
        System.out.println("Analisis simple iniciado");
    }

    @Override
    void saltarZIP() {
        try {
            System.out.println("Analizando");
            Thread.sleep(2500);
            System.out.println("No pudo analizar archivos .zip");
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Analisis simple finalizado");
    }
}
