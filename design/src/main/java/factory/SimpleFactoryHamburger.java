package factory;

public class SimpleFactoryHamburger {


    public Hamburguer createHamburguer(String type) {
            if (type.equals("cheese")) {
                return new CheeseBurger();
            } else if (type.equals("veggie")) {
                return new VeggieBurger();
            } else {
                throw new RuntimeException("");
            }
    }
}
