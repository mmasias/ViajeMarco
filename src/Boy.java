
public class Boy {

    private double speed;
    private double time;

    private final double MIN_DAILY_SPEED = 10;
    private final double MAX_DAILY_SPEED = 15;

    private final double MIN_DAILY_TIME = 8;
    private final double MAX_DAILY_TIME = 10;

    private Monkey amedio;

    public Boy() {
        amedio = new Monkey();
    }

    public void update(Weather weather) {
        amedio.update();

        double speedFactor = weather.isRainingHard() ? 0.25 : weather.isRaining() ? 0.75 : 1;
        speedFactor = speedFactor * (amedio.isTired() ? 0.9 : 1);
        double timeFactor = amedio.hasEscaped() ? 2 : 0;
        speed = (Math.random() * (MAX_DAILY_SPEED - MIN_DAILY_SPEED) + MIN_DAILY_SPEED) * speedFactor;
        time = (Math.random() * (MAX_DAILY_TIME - MIN_DAILY_TIME) + MIN_DAILY_TIME) - timeFactor;
    }

    public double advance() {
        return speed * time;
    }

    public String tellState() {
        return "Hoy avancé " + String.format("%.2f", advance()) + " Km porque Amedio " + amedio.tellState();
    }
}
