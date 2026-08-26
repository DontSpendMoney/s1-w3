public class CandyJar {
    private int candyCount;
    
    public CandyJar(){
        candyCount = 10;
    }

    public CandyJar(int a){
        candyCount = a;
    }

    public void eat(int amt){
        candyCount -= amt;
    }

    public void add(int amt){
        candyCount += amt;
    }

    public void printState(){
        System.out.println("There are " + candyCount + " candies in the jar");
    }
}