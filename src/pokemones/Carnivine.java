package pokemones;

import AttackMoves.HydroPump;
import AttackMoves.Magnitude;
import AttackMoves.RazorLeaf;
import ru.ifmo.se.pokemon.*;

public class Carnivine extends Pokemon {
    public Carnivine(java.lang.String s, int i){
        super(s, i);
        this.addType(Type.GRASS);
        this.addMove(new Magnitude());
        this.addMove(new HydroPump());
        this.setStats(74, 100, 72, 90, 72, 46);
    }

    public Carnivine(){
        super();
        this.addType(Type.GRASS);
        this.addMove(new HydroPump());
        this.addMove(new Magnitude());
        this.setStats(74, 100, 72, 90, 72, 46);
    }
}
