import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println((int) service.calculate(63, 1.62));

    }
}
