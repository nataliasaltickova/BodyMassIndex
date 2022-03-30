public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 62;
        double height = 1.78;
        double bmi = service.calculate(mass, height);
        System.out.println(Math.round(bmi));
    }
}
