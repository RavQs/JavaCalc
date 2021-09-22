import java.util.Scanner;

public class HelloWorld {
   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


            String line = scan.nextLine();

            try {
                String[] symbols = line.split(" ");

                if(symbols.length != 3)
                    throw new Exception("Try again, please");

                Number Num1 = InputCheck.CheckNums(symbols[0]);
                Number Num2 = InputCheck.CheckNums(symbols[2], Num1.getType());
                String result = Calculation.doMath(Num1,Num2,symbols[1]);
                System.out.println(result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }



}
//    String romanResult = (IntToRoman.IntegerToRomanNumeral(result)); //Результат в римских цифрах
//    System.out.printf("%s %s = %s", romanX,romanY, romanResult);

//21.09.21 - start

 /* public static int dataTypeChecker() { //наименование TypeChecker изменить на что-то другое
        int number;
        String romanNum;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        }
        else {
            System.out.println("Допущена ошибка при вводе числа!");
            scan.next();
            number = dataTypeChecker();
        }
        return number;
    }*/