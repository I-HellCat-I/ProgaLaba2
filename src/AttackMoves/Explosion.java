package AttackMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Explosion extends PhysicalMove {
    public Explosion() {
        super(Type.NORMAL, 250, 1);
    }

    @Override
    protected String describe() {
        return "использует Explosion";
    }


    @Override
    protected void applySelfDamage(Pokemon att, double dmg) {
        att.setMod(Stat.HP, (int)att.getHP()+10);
    }
}
