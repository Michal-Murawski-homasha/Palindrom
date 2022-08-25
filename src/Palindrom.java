public class Palindrom {
    public static void main(String[] args) {
        String originalText = originalText();
    }
    private static String originalText() {
        String[] palindrom = {"T", "e", "n", "e", "t"};
        for (int i = 0; i < palindrom.length; i++) {
            System.out.print(palindrom[i] + " | ");
            for (int j = palindrom.length - 1; j >= 0; j--) {
                System.out.print(palindrom[j]);
            }
            System.out.println();
        }
        return null;
    }
}
