package DSAList;

public class TowerOfHanoi {
    public static void move (int numberOfRings, String from, String to, String using){

        if (numberOfRings == 1){
            System.out.println("moving disc "+numberOfRings+" from "+from+" to "+to);
            return;
        }
        move(numberOfRings-1, from, using, to);
        System.out.println("moving discs" + (numberOfRings) + "from "+ from+ " to " + to);
        move(numberOfRings-1, using, to, from);

    }

    public static void main(String[] args){
        move(3,"A","C","B");
    }

}
