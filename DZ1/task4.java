package DZ1;

public class task4 {public static void main(String[] args) {
    for (int q = 0; q <= 9; q++) {
        for (int w = 0; w <= 9; w++) {
            int e = q + w;
            if (e <= 9) {
                int num = Integer.parseInt("" + q + w);
                if (num + Integer.parseInt("" + w + 5) == 69) {
                    System.out.println(num + " + " + (w * 10 + 5) + " = 69");
                }
            }
        }
    }
}
}
    
    

