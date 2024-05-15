package code.first.program.string;

public class CountStrings {
    public static int countStrings(String[] strings) {
        int count = 0;
        for (String str : strings) {
            if (isAdjacentDifferenceOne(str)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isAdjacentDifferenceOne(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (Math.abs(str.charAt(i) - str.charAt(i + 1)) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"abc", "xyz", "def", "pqr", "ab", "bcd"};
        System.out.println("Number of strings with adjacent characters differing by one: " + countStrings(strings));
    }
}
