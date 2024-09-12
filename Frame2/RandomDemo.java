package Frame2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(Math.abs(random.nextLong()%9000 + 1000));
    }
}
