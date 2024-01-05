public class Journey {

    private final double INITIAL_DISTANCE;
    private final double MOTHER_ADVANCE_PER_DAY = 80;
    private double remainingDistance;
    private int days;
    private boolean onJourney;

    Mother mother;
    Weather weather;
    Amedio amedio;
    Marco marco;

    public Journey(int initialDistance) {
        INITIAL_DISTANCE = initialDistance;
        onJourney = this.INITIAL_DISTANCE > 0;
        remainingDistance = INITIAL_DISTANCE;
        days = 0;
        mother = new Mother(MOTHER_ADVANCE_PER_DAY);
        weather = new Weather();
        amedio = new Amedio();
        marco = new Marco();
    }

    public void start() {
        while (onJourney) {
            days++;
            amedio.update();
            weather.update();
            marco.update(weather, amedio);
            remainingDistance = remainingDistance - marco.advance() + mother.advance();
            onJourney = remainingDistance > 0;
            displayDaySumary();
        }
    }

    private void displayDaySumary() {
        System.out.println("Dia " + days);
        System.out.println(weather.tellState());
        System.out.println("El mono " + amedio.tellState());
        System.out.println("Marco avanzo " + marco.advance());
        System.out.println("Mamá avanzo " + mother.advance());
        System.out.println("Queda " + remainingDistance);
    }
}
