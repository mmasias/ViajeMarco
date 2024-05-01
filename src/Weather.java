
public class Weather {

    private boolean rain;
    private boolean hardRain;
    final private double HARD_RAIN_PROBABILITY = 0.1;
    final private double SOFT_RAIN_PROBABILITY = 0.4;

    public void update() {

        double probability = Math.random();

        resetRain();
        hardRain = probability <= HARD_RAIN_PROBABILITY;
        rain = probability <= SOFT_RAIN_PROBABILITY;        
    }

    private void resetRain() {
        rain = false;
        hardRain = false;
    }

    public String tellState() {
        return "Hoy tocó una " + (rain ? "lluvia " : "mañana soleada.") + (hardRain ? " fuerte." : ".");
    }

    public boolean isRaining() {
        return rain;
    }

    public boolean isRainingHard() {
        return hardRain;
    }
}
