import pokemones.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p2 = new Carnivine("Кусачий цветок", 10);
        Pokemon p3 = new Amoonguss("Abobus", 10);
        Pokemon p1 = new Muk("Muka", 10);
        Pokemon p4 = new Grimer("Zhizha", 10);
        Pokemon p5 = new Finneon("Ribka", 10);
        Pokemon p6 = new Lumineon("Ribka poluchhe", 10);
        b.addAlly(p3);
        b.addAlly(p1);
        b.addAlly(p5);
        b.addFoe(p6);
        b.addFoe(p4);
        b.addFoe(p2);
        b.go();
    }
}