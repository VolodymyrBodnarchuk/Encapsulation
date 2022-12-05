public class Main {
    public static void main(String[] args) {

        Encapsulation rezult = new Encapsulation(110, 40, 220);



        System.out.println("Знайдено по формулам");
        System.out.println("Сила струму: " + rezult.current());
        System.out.println("Опір: " + rezult.resistance());
        System.out.println("Напруга: " + rezult.voltage());
    }
}