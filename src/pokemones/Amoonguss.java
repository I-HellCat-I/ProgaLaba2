package pokemones;

import AttackMoves.Blizzard;
import AttackMoves.RazorLeaf;
import StatusMoves.BellyDrum;
import StatusMoves.HealBell;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Amoonguss extends Pokemon {

    public Amoonguss(java.lang.String s, int i){
        //this();
        super(s, i);
        this.addType(Type.POISON);
        this.addType(Type.GRASS);
        this.addMove(new RazorLeaf());
        this.addMove(new BellyDrum());
        this.addMove(new HealBell());
        this.addMove(new Blizzard());
        this.setStats(114, 85, 70, 85, 80, 30);
    }

    public Amoonguss(){
        super();
        this.addType(Type.POISON);
        this.addType(Type.GRASS);
        this.addMove(new RazorLeaf());
        this.addMove(new BellyDrum());
        this.addMove(new HealBell());
        this.addMove(new Blizzard());
        this.setStats(338, 157, 130, 157, 148, 58);
    }



}
