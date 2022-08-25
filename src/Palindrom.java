import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        String originalText = originalText();
    }
    private static String originalText() {
        String[] palindrom = {"T", "e", "n", "e", "t"};
        System.out.println(Arrays.toString(palindrom));
        for (int i = 0; i < 1; i++) {
            for (int j = palindrom.length - 1; j >= 0; j--) {
                System.out.print(palindrom[j]);
            }
            System.out.println();
        }
        return null;
    }
}
