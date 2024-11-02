package strategy.antivirus;

import java.util.HashMap;
import java.util.Map;

public class FactoryAntivirus {
    private static final Map<String, IStrategy> map = new HashMap<>();

    static {
        map.put("simple", new AntivirusSimple());
        map.put("avanzado", new AntivirusAvanzado());
    }

    public static IStrategy getAntivirus(String type) {
        IStrategy strategy = map.get(type);
        if (strategy != null) {
            return strategy;
        } else {
            throw new IllegalArgumentException("Tipo de antivirus no soportado: " + type);
        }
    }
}
