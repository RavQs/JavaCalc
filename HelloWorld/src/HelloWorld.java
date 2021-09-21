import java.util.Scanner;

public class HelloWorld {
   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        JavaCalc();
    }


    public static void JavaCalc(){
        int x = getInt();
        char math = scan.next().charAt(0);
        int y = getInt();
//        System.out.println(isString(x,y));

        InputCheck.CheckNums(x,y,math);
    }



    public static int getInt() {
        int number;
        String romanNum;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        }
        else if(scan.hasNextLine()){
            romanNum = scan.nextLine();
            number = Converter.toInt(romanNum);
        }
        else {
            System.out.println("Допущена ошибка при вводе числа!");
            scan.next();
            number = getInt();
        }
        return number;
    }


}
//    String romanResult = (IntToRoman.IntegerToRomanNumeral(result)); //Результат в римских цифрах
//    System.out.printf("%s %s = %s", romanX,romanY, romanResult);
