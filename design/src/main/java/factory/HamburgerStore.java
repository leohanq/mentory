package factory;

public class HamburgerStore {

    private SimpleFactoryHamburger factoryHamburger;
    HamburgerStore (SimpleFactoryHamburger factoryHamburger) {
        this.factoryHamburger = factoryHamburger;
    }
    void orderHamburger(String type) {
        Hamburguer hamburger = factoryHamburger.createHamburguer(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

    }
}
