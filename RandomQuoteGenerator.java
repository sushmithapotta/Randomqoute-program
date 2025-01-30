import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        
        String[] quotes = {
            "The best way to predict the future is to create it. – Peter Drucker",
            "Do what you can, with what you have, where you are. – Theodore Roosevelt",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
            "Believe you can and you're halfway there. – Theodore Roosevelt",
            "Hardships often prepare ordinary people for an extraordinary destiny. – C.S. Lewis",
            "Act as if what you do makes a difference. It does. – William James",
            "Your time is limited, so don’t waste it living someone else’s life. – Steve Jobs",
            "You only live once, but if you do it right, once is enough. – Mae West",
            "Happiness is not something ready-made. It comes from your own actions. – Dalai Lama",
            "The purpose of our lives is to be happy. – Dalai Lama"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);

        System.out.println("Here’s your random quote:");
        System.out.println(quotes[randomIndex]);
    }
}

