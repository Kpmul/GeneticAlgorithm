// Purpose: Contains the GeneticAlgorithm class, which contains the methods for initializing the 
// population and calculating the fitness of the population.

public class GeneticAlgorithm {
    
    public static Composition[] initializePopulation(int populationSize, int compositionSize) {

        Composition[] population = new Composition[populationSize];

        for (int i = 0; i < populationSize; i++) {
            Melody[] melodies = new Melody[compositionSize];
            for (int j = 0; j < compositionSize; j++) {
                melodies[j] = new Melody(8);
            }
            population[i] = new Composition(melodies);
        }

        return population;
    }

    
}
