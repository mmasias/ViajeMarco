
public class Journey {

    private final double INITIAL_DISTANCE;
    private final double MOTHER_ADVANCE_PER_DAY = 80;
    private double remainingDistance;
    private int days;

    public Journey(int initialDistance) {
        this.INITIAL_DISTANCE = initialDistance;
        this.remainingDistance = INITIAL_DISTANCE;
        this.days = 0;
        Marco marco = new Marco();
        Mother mother = new Mother(MOTHER_ADVANCE_PER_DAY);
        Weather weather = new Weather();
        Amedio amedio = new Amedio();
    }

    public void start() {
    }
}
