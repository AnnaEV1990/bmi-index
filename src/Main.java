import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("63, 1.62");
        System.out.println(service.calculate( 63, (int) 1.62));

    }
}
