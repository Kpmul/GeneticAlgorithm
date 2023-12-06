import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Melody implements GAController {

    Random random = new Random();
    static final char[] notes = {'A', 'a', 'B', 'C', 'c', 'D', 'd', 'E', 'F', 'f', 'G', 'g'};
    private Set<Character> sequence = new HashSet<>(); // Changed to Set<Character>

    public Melody() {
        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(notes.length);
            sequence.add(notes[rand]); // Use add to ensure uniqueness
        }
    }

    public Melody(String characters) {
        sequence = new HashSet<>();
        for (char note : characters.toCharArray()) {
            sequence.add(note); // Use add to ensure uniqueness
        }
    }

    Melody(int melodyLength) {
        sequence = new HashSet<>();
        for (int i = 0; i < melodyLength; i++) {
            int rand = random.nextInt(notes.length);
            sequence.add(notes[rand]);
        }
    }

    public Melody(Set<Character> notes) {
        this.sequence = new HashSet<>(notes);
    }

    public Set<Character> getMelody() {
        return sequence;
    }

    public void setMelody(String characters) {

        sequence = new HashSet<>();
        for (char note : characters.toCharArray()) {
            sequence.add(note); // Use add to ensure uniqueness
        }
    }

    public void setMelody(Set<Character> notes) {
        sequence = new HashSet<>(notes);
    }

    public void run() {
        // Implementation of run method
    }

    @Override
    public String toString() {
        return sequence.toString(); // Print the set directly
    }
}
