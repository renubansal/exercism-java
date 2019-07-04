import java.util.Arrays;

/**
 *
 * @author RENU BANSAL
 */
public class DnDCharacter {
    
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;
    
    public DnDCharacter(){
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = 10+ modifier(this.constitution);
    }
   
     
    int ability() {
        int i;
        int[] values = new int[4];
        for(i = 0 ; i < 4 ; i++){
            values[i] = (int)Math.floor(Math.random() * 6 + 1);
        }
        Arrays.sort(values);
        return values[1]+values[2]+values[3];
    }

    int modifier(int input) {
        float x = (float)(input - 10)/2;
        //rounding down 
        if(x<1)
            return (int)(x-0.5);
        else
            return (int)(x);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
