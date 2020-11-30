public class Coverage {
    public static int discount(int numBooks, double sum){
        int num = 0;
        if(numBooks < 5 && sum < 100){
            num = 15;
        }else if(numBooks > 5 && sum > 200){
            num = 25;
        }
        return num;
    }
}
