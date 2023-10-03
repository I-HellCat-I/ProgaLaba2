package StatusMoves;

import ru.ifmo.se.pokemon.*;

public class HealBell extends StatusMove {
    public HealBell(){
        super(Type.NORMAL,0, 999);
    }
    protected void applySelfEffects(Pokemon p) {
        Effect buff = new Effect().condition(Status.NORMAL);
        p.setCondition(buff);
    }

    @Override
    protected String describe() {
        return "использует Heal Bell";
    }
}
