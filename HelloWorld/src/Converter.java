public class Converter {
    public static String toString(int num) {

        int[]   numbers = {  100,   90, 50,   40,   10,    9,    5,    4,    1 };

        String[] letters = { "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
        String roman = "";
        int N = num;

        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman; //Получаем Int -> Возвращаем String
    }

    public static int toInt(String input) {
        int s = 0;
        while (input.equals("IX")) {
            s += 9;
        }
        while (input.equals("V")) {
            s += 5;
        }
        while (input.equals("IV")) {
            s += 4;
        }
        while (input.equals("I")) {
            s += 1;
        }
        return s; //Получаем String -> Возвращаем Int
    }
}
