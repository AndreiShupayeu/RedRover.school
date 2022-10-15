package home_work6;

/*Create a function that returns the name of the winner in a fight between two fighters.
Each fighter takes turns attacking the other and whoever kills the other first is victorious.
Death is defined as having health <= 0.
Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
You can mutate the Fighter objects.
Your function also receives a third argument, a string, with the name of the fighter that attacks first.
 Example:
declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
Lew attacks Harry; Harry now has 3 health.
Harry attacks Lew; Lew now has 6 health.
Lew attacks Harry; Harry now has 1 health.
Harry attacks Lew; Lew now has 2 health.
Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.*/
public class Codewars3 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        System.out.println(Fighter.declareWinner(fighter1, fighter2, "Lew"));
    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter first;
        Fighter second;
        if (fighter1.name.equals(firstAttacker)) {
            first = fighter1;
            second = fighter2;
        } else {
            first = fighter2;
            second = fighter1;
        }
        while (first.health > 0 && second.health > 0) {
            second.health -= first.damagePerAttack;
            if(second.health<=0)
                break;
            System.out.println("second health " + second.health);
            first.health -= second.damagePerAttack;
            System.out.println("first health " + first.health);
        }
        if (first.health > second.health) {
            return first.name;
        } else {
            return second.name;
        }
    }
}