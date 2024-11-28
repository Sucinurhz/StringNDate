import java.util.Random;

public class Captcha {
    private int number1;
    private int number2;

    public Captcha() {
        Random random = new Random();
        this.number1 = random.nextInt(10) + 1; // Angka 1-10
        this.number2 = random.nextInt(10) + 1; // Angka 1-10
    }

    public String getQuestion() {
        return "Berapa hasil dari " + number1 + " + " + number2 + "?";
    }

    public boolean validateAnswer(int answer) {
        return answer == (number1 + number2);
    }
}
