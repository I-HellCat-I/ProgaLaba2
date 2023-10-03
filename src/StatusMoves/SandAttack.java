package StatusMoves;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND, 0, 1);
    }

    @Override
    protected String describe() {
        return "использует Sand Attack";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.addEffect(new Effect().stat(Stat.ACCURACY, -1));
    }
}
