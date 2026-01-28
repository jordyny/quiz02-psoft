public class CoffeeCounter {
    //initializing cups variable
    private int cupsDrunk;

    \\counter
    public CoffeeCounter() {
        this.cupsDrunk = 0;
    }

    public void drinkCup() {
        cupsDrunk++;
        System.out.println("You drank a cup of coffee ☕ Total: " + cupsDrunk);
    }

    public int getCupsDrunk() {
        return cupsDrunk;
    }

    public static void main(String[] args) {
        CoffeeCounter counter = new CoffeeCounter();

        counter.drinkCup();
        counter.drinkCup();
//print output statement with final count
        System.out.println("Final count: " + counter.getCupsDrunk());
    }
}
