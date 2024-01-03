public class Main{
    public static void main(String[] args) {
        
        Suv fortuner = new Suv("Fortuner", false);

        fortuner.move(40, 0);

        fortuner.accelarate(20);

        fortuner.accelarate(-60);

        System.out.println("Current Gear : "+ fortuner.getCurrentGear());
        System.out.println("Current Speed : "+ fortuner.getCurrentSpeed());
    }
}