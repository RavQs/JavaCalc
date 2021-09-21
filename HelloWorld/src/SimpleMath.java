public class SimpleMath {
    public static int math(int x, char math, int y){

        int result = 0;

        switch (math){
            case '+':
                result = x+y;
                break;
            case '-':
                result = x-y;
                break;
            case '*':
                result = x*y;
                break;
            case '/':
                result = x/y;
                break;
        }
        return result;
    }
}
