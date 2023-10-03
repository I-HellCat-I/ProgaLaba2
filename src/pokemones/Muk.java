package pokemones;

import AttackMoves.Confusion;
import AttackMoves.Endeavor;
import AttackMoves.Guilliotine;
import AttackMoves.ShadowPunch;
import ru.ifmo.se.pokemon.Type;

public class Muk extends Grimer{
    public Muk(java.lang.String s, int i){
        super(s, i);
        this.addMove(new Endeavor());
        this.setStats(105, 105, 75, 65, 100, 50);
    }

    public Muk(){
        super();
        this.addMove(new Endeavor());
        this.setStats(105, 105, 75, 65, 100, 50);
    }
}
