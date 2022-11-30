public class Dice
{
    Dice die1;
    Dice die2;
    public Dice() {
        die1 = new Dice();
        die2 = new Dice();
    }  

    public int getValue() { 
        return die1.getValue() + die2.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int rollAndGetValue() {
        this.roll();
        return this.getValue();
    }
}