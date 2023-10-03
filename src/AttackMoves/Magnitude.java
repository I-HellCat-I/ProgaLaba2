package AttackMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magnitude extends PhysicalMove {
    public Magnitude(){
        super(Type.GROUND, 0, 1);
    }

    @Override
    protected String describe() {
        return "использует Magnitude";
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double r = Math.random();
        int power;
        if (r < 0.05) power = 10;
        else if (r < 0.15) power = 30;
        else if (r < 0.4) power = 50;
        else if (r < 0.7) power = 70;
        else if (r < 0.9) power = 90;
        else if (r < 0.95) power = 110;
        else power = 150;
        return (0.4 * (double)att.getLevel() + 2.0) * power / 150.0;
    }
}
