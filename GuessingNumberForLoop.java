import java.util.Random;

public class GuessingNumberForLoop {

    public static final int MAX_ALLOWED_TRIED = 5;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        System.out.println("Random Number is : "+randomNum);
        String inpNumTxt = null;
        int count = 1;
//        do {
        for (;count<=MAX_ALLOWED_TRIED;count++) {
            if (count == MAX_ALLOWED_TRIED) {
                System.out.println("You loose Maximum chance the Secret Number is : "+randomNum);
                return;
            } else {
                inpNumTxt = System.console().readLine("Enter any Number 1 to 10 : ");
                if (inpNumTxt.matches("-?\\d{1,2}")) {
                    int inpNum = Integer.parseInt(inpNumTxt);
                    if (inpNum == randomNum) {
                        String tryTxt = count == 1 ? "try" : "tries";
                        System.out.printf("The Secret Number is : %d You got it in %d %s.%n", inpNum,count,tryTxt);
                        return;
                    } else {
                        System.out.printf("You don't get it try Again...%n");
                    }
                } else {
                    System.out.println("Thank You");
                    return;
                }
            }
        }
//        count += 1;
//        } while (!"q".equals(randomNum));
    }
}
