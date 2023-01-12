public class Main {
    public static void main(String[] args) {

        Encapsulation s = new Encapsulation();

        s.setI(50);
        s.setU(220);
        s.setR(10);

        System.out.println("Сила струму: " + s.getI());
        System.out.println("Опір: " + s.getR());
        System.out.println("Напруга: " + s.getU());
    }
}