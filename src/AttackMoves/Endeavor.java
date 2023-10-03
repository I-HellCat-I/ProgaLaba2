package AttackMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Endeavor extends PhysicalMove {
    public Endeavor() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "использует Endeavor";
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        def.setMod(Stat.HP, (int)(att.getHP() < def.getHP() ? def.getHP() - att.getHP() : 0));
        return att.getHP() < def.getHP() ? (def.getHP() - att.getHP()) / (att.getStat(Stat.ATTACK) / def.getStat(Stat.DEFENSE)) - 2.0 : 0;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        return;
    }
}
