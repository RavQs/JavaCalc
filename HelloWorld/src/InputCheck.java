import java.util.*;

public class InputCheck {
    public static void CheckNums(int x, int y, char math){
        if (x > 0 && x < 10 && y > 0 && y < 10) { //Проверка чисел на условие 1-10
            int result = SimpleMath.math(x, math, y);
            String romResult = Converter.toString(result);
            int intResult = Converter.toInt(romResult);
            System.out.println(result);
            System.out.println(Converter.toString(result)); //Перевод в рим.числа
            System.out.println((intResult));
        }
        else {
            System.out.println("Неверно введены числа!(n<=0 или n>=10)");
        }
    }
}
