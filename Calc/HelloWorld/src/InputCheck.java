public class InputCheck {
     static Number CheckNums(String symbol) throws Exception{

         int value;
         TypeNumber type;

         try {
            value = Integer.parseInt(symbol);
            type = TypeNumber.ARABIC;
             }
         catch (NumberFormatException e) {
            value = Converter.toArabic(symbol);
            type = TypeNumber.ROMAN;
         }


         if (value < 1 || value > 10) {
             throw new Exception("Неподходящее значение числа(ел), используйте числа от 1 до 10 включительно");
         }

         return new Number(value, type);

     }

    static Number CheckNums(String symbol, TypeNumber type) throws Exception {

        Number number = CheckNums(symbol);
        if (number.getType() != type) {
            throw new Exception("Values have different types");

        }

        return number;
    }
}
