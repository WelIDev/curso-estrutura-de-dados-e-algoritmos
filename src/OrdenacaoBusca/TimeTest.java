package OrdenacaoBusca;

import java.time.Duration;
import java.time.Instant;

public class TimeTest {
    public static void main(String[] args) {

        Instant start = Instant.now();
        test();
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.printf("Duration: %dms\n", time);
    }

    public static void test() {
        double x = 10;
        for (long i = 0; i < 100000000L; i++) {
            x = -x;
        }
    }
}
