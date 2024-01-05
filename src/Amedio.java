
public class Amedio {

    private String amedioDescription;
    private boolean hasEscaped;
    private boolean isTired;
    private final double AMEDIO_HAS_ESCAPED = 0.15;
    private final double AMEDIO_TIRED = 0.25;

    public void update() {
        resetAmedio();

        isTired = Math.random() <= AMEDIO_TIRED;
        hasEscaped = Math.random() <= AMEDIO_HAS_ESCAPED;

        amedioDescription = (isTired ? " Cansado " : "") + (hasEscaped ? " Ha escapado" : "");

    }

    private void resetAmedio() {
        amedioDescription = "";
        hasEscaped = false;
        isTired = false;
    }

    public String tellState() {
        return amedioDescription;
    }

    public boolean hasEscaped() {
        return hasEscaped;
    }

    public boolean isTired() {
        return isTired;
    }

}
