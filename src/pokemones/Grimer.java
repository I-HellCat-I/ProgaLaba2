package pokemones;

import AttackMoves.*;
import StatusMoves.BellyDrum;
import StatusMoves.HealBell;
import ru.ifmo.se.pokemon.*;

public class Grimer extends Pokemon {
    public Grimer(java.lang.String s, int i){
        super(s, i);
        this.addType(Type.POISON);
        this.addMove(new Confusion());
        this.addMove(new Guilliotine());
        this.addMove(new ShadowPunch());
        this.setStats(80, 80, 50, 40, 50, 20);
    }

    public Grimer(){
        super();
        this.addType(Type.POISON);
        this.addMove(new Confusion());
        this.addMove(new Guilliotine());
        this.addMove(new ShadowPunch());
        this.setStats(80, 80, 50, 40, 50, 20);
    }
}
