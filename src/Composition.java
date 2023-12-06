import java.util.Arrays;

public class Composition implements GAController {

    private Melody[] melodies;
    private static final int MELODY_LENGTH = 8; // Adjust as needed
    double fitness;

    Composition(int numOfMels) {
        melodies = new Melody[numOfMels];
        createComp();
    }

    Composition() {
        this(8);
    }

    Composition(Melody[] melodies) {
        this.melodies = melodies;
    }

    public void createComp() {
        for (int i = 0; i < melodies.length; i++) {
            melodies[i] = new Melody(MELODY_LENGTH);
        }
    }

    public Melody[] getMelodies() {
        return melodies;
    }

    public void run() {
        // Perform GA operations on the composition, e.g., selection, crossover, mutation
        // Update melodies array accordingly
    }

    @Override
    public String toString() {
        return Arrays.toString(melodies);
    }

    public double getFitness(){
        return fitness;
    }

    public void setFitness(double fitness){
        this.fitness = fitness;
    }

}
