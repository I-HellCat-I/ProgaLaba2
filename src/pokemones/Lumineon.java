package pokemones;

import AttackMoves.Explosion;
import AttackMoves.HydroPump;
import AttackMoves.Magnitude;
import StatusMoves.SandAttack;
import ru.ifmo.se.pokemon.Type;

public class Lumineon extends Finneon{
    public Lumineon(java.lang.String s, int i){
        super(s, i);
        this.addMove(new Explosion());
        this.setStats(69, 69, 76, 69, 86, 91);
    }

    public Lumineon(){
        super();
        this.addMove(new Explosion());
        this.setStats(69, 69, 76, 69, 86, 91);
    }
}
