public class Encapsulation {

    private double I,R,U;

    public Encapsulation(double i, double r, double u) {
        this.I = i;
        this.R = r;
        this.U = u;
    }

    public double resistance()
    {
        return U/I;
    }

    public double current(){
        return U/R;
    }
    public double voltage() {
        return I*R;
    }
}
