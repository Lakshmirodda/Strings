public class RevStm {
    public static void main(String[] args) {
        String s = "Welcome to bitlabs";
        String[] words = s.split(" ");
        StringBuilder reversedStatement = new StringBuilder();
        for (String a : words) {
            StringBuilder reversedWord = new StringBuilder(a);
            reversedWord.reverse();
    reversedStatement.append(reversedWord).append(" ");
        }
        System.out.println("Original Statement: " +s);
        System.out.println("Reversed Statement: " + reversedStatement.toString().trim());
    }
}