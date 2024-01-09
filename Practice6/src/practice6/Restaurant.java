package practice6;

public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        if (eater instanceof Person) {
            eater.payForPizza();
        }
        eater.eatPizza();
        return true;
    }
}
