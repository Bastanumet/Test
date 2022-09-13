import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("What is Bitcoin price today?");
                float btcPrice = scanner.nextFloat();

                System.out.println("How much $ do you have?");
                float usdAmount = scanner.nextFloat();

                float canBuy = usdAmount / btcPrice; // result

                System.out.println("You can buy " + canBuy + " BTC");
                scanner.close();
                break;
            }

            catch (Exception e) {
                System.err.println("Please write number, not text");
            }

        }
    }
}