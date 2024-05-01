public class Mother {

    private double motherAdvancePerDay;

    public Mother(double advance) {
        motherAdvancePerDay = advance;
    }

    public double advance() {
        return motherAdvancePerDay;
    }

    public String tellState() {
        return "Hoy avancé " + String.format("%.2f",advance()) + " Km";
    }
}
