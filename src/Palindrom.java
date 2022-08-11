public class Palindrom {
    public static void main(String[] args) {
        String originalText = originalText();
    }
    private static String originalText() {
        String[] palindrom = {"T", "e", "n", "e", "t"};
        for (int i = 0; i <= palindrom.length - 1; i++) {
            System.out.print(palindrom[i]);
        }

        System.out.println();

        for (int j = palindrom.length - 1; j >= 0; j--) {
            System.out.print(palindrom[j]);
        }

        return null;
    }
}
