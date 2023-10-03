package AttackMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Guilliotine extends PhysicalMove {
    public Guilliotine() {
        super(Type.NORMAL, 0, 0.3);
    }

    @Override
    protected String describe() {
        return "использует Guilliotine";
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return (this.accuracy + (double) (att.getLevel() - def.getLevel()) / 100) * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION) > Math.random();
    }

    @Override
    protected void applyOppDamage(Pokemon opp, double dmg) {
        super.applyOppDamage(opp, opp.getHP()+10);
    }
}
