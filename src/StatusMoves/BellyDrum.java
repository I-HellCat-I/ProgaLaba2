package StatusMoves;

import ru.ifmo.se.pokemon.*;

public class BellyDrum extends StatusMove {
    public BellyDrum(){
        super(Type.NORMAL, 0, 999);
    }

    @Override
    protected String describe() {
        return "использует Belly Drum";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect buff = new Effect();
        buff.stat(Stat.ATTACK, 6);
        p.addEffect(buff);
        p.setMod(Stat.HP, (int)(p.getStat(Stat.HP)/2));
    }
}
