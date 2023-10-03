package pokemones;

import AttackMoves.*;
import StatusMoves.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Finneon extends Pokemon {
    public Finneon(java.lang.String s, int i){
        super(s, i);
        this.addType(Type.WATER);
        this.addMove(new HydroPump());
        this.addMove(new Magnitude());
        this.addMove(new SandAttack());
        this.setStats(49, 49, 56, 49, 61, 66);
    }

    public Finneon(){
        super();
        this.addType(Type.WATER);
        this.addMove(new HydroPump());
        this.addMove(new Magnitude());
        this.addMove(new SandAttack());
        this.setStats(49, 49, 56, 49, 61, 66);
    }
}
