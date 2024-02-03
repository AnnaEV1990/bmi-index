public class BmiService {
    public double calculate(int weightKg, double heightM) {
        double index = weightKg / (heightM * heightM);
        return (int) index;
    }


}
