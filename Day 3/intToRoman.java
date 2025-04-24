class IntToRomanntToRoman {
    public String intToRoman(int num) {
        String output = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        return output;
    }

}

public static void main(String[] args) {
    IntToRomanntToRoman converter = new IntToRomanntToRoman();
    int number = 1994; // Example input
    String romanNumeral = converter.intToRoman(number);
    System.out.println("The Roman numeral for " + number + " is: " + romanNumeral);
}