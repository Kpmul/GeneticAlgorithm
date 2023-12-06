// Purpose: Contains methods to calculate the fitness of a population and a composition
import java.util.Set;

public class Fitness {

    // Assuming Composition class has a method to get the target composition
    public static void calculatePopulationFitness(Composition[] population, Composition targetComposition) {
        for (Composition composition : population) {
            double compositionFitness = calculateCompositionFitness(composition, targetComposition);
            composition.setFitness(compositionFitness);
        }
    }

    private static double calculateCompositionFitness(Composition composition, Composition targetComposition) {
        // Customize this method based on your specific criteria
        // Example: Calculate fitness based on the similarity of melodies to the target composition

        double totalMelodySimilarity = 0.0;
        Melody[] melodies = composition.getMelodies();
        Melody[] targetMelodies = targetComposition.getMelodies();

        for (int i = 0; i < melodies.length; i++) {
            double melodySimilarity = calculateMelodySimilarity(melodies[i], targetMelodies[i]);
            totalMelodySimilarity += melodySimilarity;
        }

        // Normalize the total similarity based on the number of melodies
        return totalMelodySimilarity / melodies.length;
    }

    private static double calculateMelodySimilarity(Melody melody, Melody targetMelody) {
        // Customize this method based on your specific criteria
        // Example: Calculate similarity based on the number of matching notes

        Set<Character> melodyNotes = melody.getMelody();
        Set<Character> targetNotes = targetMelody.getMelody();

        int matchingNotes = 0;
        for (Character note : melodyNotes) {
            if (targetNotes.contains(note)) {
                matchingNotes++;
            }
        }

        // Normalize the matching notes based on the total number of notes
        return (double) matchingNotes / melodyNotes.size();
    }

}
