package AttackMoves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1) opp.setCondition(new Effect().condition(Status.FREEZE));
    }

    @Override
    protected String describe() {
        return "использует Blizzard";
    }
}
