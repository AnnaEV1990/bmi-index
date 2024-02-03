public class BmiService {
    public double calculate(int weight_kg, double height_m) {
        double index = weight_kg / (height_m * height_m);
        return (int) index;
    }


}
