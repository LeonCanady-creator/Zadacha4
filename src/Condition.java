public class Condition {
    int troom;
    int tcond;
    int thour;
    int hour = 60;
    double constT = 0.16;
    String mode;
    private java.lang.String String;

    public Condition(int troom, int tcond) {
        this.troom = troom;
        this.tcond = tcond;

    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int work() {
        String freeze = "freeze";
        String heat = "heat";
        String auto = "auto";
        String fan = "fan";

        if (freeze.equals(mode)) {
            return freeze();
        } else if (heat.equals(mode)) {
            return heat();
        } else if (auto.equals(mode)) {
            return auto();
        } else
            return fan();
        }

    public int freeze() {

        if (troom < tcond) {
            return troom;
        } else {
            return tcond;

        }
    }

    public int heat() {
        if (troom > tcond) {
            return troom;
        } else
            return tcond;
    }

    public int auto() {

            return tcond;
    }

    public int fan() {
        return troom;
    }
}


