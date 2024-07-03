public class Main {


    public static void main(String[] args) {
        String[] myString = {"abc", "cb", "a"};
        String result = longest(3, myString);
        System.out.println(result);
    }

    public static String longest(int n, String[] names) {
        String longestName = names[0];

        for (int i = 1; i < n; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }

        return longestName;
    }
}