public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double bodyMass = 50;
        double height = 170;
        double index = service.calculate(bodyMass, height);
        System.out.println("Индекс массы тела равен: " + index);
    }
}