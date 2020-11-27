public class BmiService {
    public double calculate(double weight, double high) {

        double Bmi = weight / (high * high);
        return Bmi;
    }
}
