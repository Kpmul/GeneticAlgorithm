// Purpose: Runs the genetic algorithm
public class Runner {
    
    public static void main(String[] args) {      
    
        int populationSize = 50;
        int compositionSize = 8; // Number of melodies in a composition
        Composition targetComposition = new Composition(compositionSize);
        Composition[] population = GeneticAlgorithm.initializePopulation(populationSize, compositionSize);

        Fitness.calculatePopulationFitness(population, targetComposition);

        for(Composition c: population){

            System.out.println(c.getFitness());
        }
    }
}
