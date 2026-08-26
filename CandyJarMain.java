public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar jar = new CandyJar();
        CandyJar jar1 = new CandyJar();
      
        jar.eat(5);
        System.out.println("Jar 1:");
        jar.printState();
        jar.add(50);
        jar.printState();
        System.out.println("Jar 2:");
        jar1.printState();
        jar1.add(20);
        jar1.printState();


    }


}
