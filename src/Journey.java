import java.util.Scanner;

public class Journey {

    private final double INITIAL_DISTANCE;
    private final double MOTHER_ADVANCE_PER_DAY = 80;
    private double remainingDistance;
    private int days;
    private boolean onJourney;

    private Mother mother;
    private Weather weather;
    private Boy marco;

    public Journey(int initialDistance) {
        INITIAL_DISTANCE = initialDistance;
        onJourney = this.INITIAL_DISTANCE > 0;
        remainingDistance = INITIAL_DISTANCE;
        days = 0;
        mother = new Mother(MOTHER_ADVANCE_PER_DAY);
        weather = new Weather();
        marco = new Boy();
    }

    public void start() {
        while (onJourney) {
            days++;
            weather.update();
            marco.update(weather);
            remainingDistance = remainingDistance - marco.advance() + mother.advance();
            if (remainingDistance <= 0) {
                onJourney = !onJourney;
                remainingDistance = 0;
            }
            displayDaySumary();
        }
    }

    private void displayDaySumary() {
        System.out.println("Dia " + days + " y Marco " + (onJourney ? "sigue buscando a su madre" : "ha encontrado a su madre!"));
        System.out.println("> " + weather.tellState());
        System.out.println("> Marco: " + marco.tellState());
        System.out.println("> Mamá: " + mother.tellState());
        System.out.println("> Quedan " + (int) remainingDistance + " Km");
        System.out.println("=".repeat(30));
        new Scanner(System.in).nextLine();
    }
}
