public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double Bmi = service.calculate(84,1.97);

        System.out.println(Bmi);
    }
}
