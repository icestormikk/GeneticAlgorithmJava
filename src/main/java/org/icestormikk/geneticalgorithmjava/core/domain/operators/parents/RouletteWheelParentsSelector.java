package org.icestormikk.geneticalgorithmjava.core.domain.operators.parents;

import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractPopulation;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.ParentsSelectionStrategy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RouletteWheelParentsSelector<
    T, C extends AbstractChromosome<T>, P extends AbstractPopulation<T, C>
> implements ParentsSelectionStrategy<T, C, P> {
    private static final int DEFAULT_TOURNAMENT_SIZE = 2;
    private static final Random random = new Random();

    private Integer tournamentSize;

    public RouletteWheelParentsSelector(Integer tournamentSize) {
        this.tournamentSize = tournamentSize;
    }

    @Override
    public List<C> apply(P population) {
        List<C> possibleParents = new LinkedList<>();

        if (this.tournamentSize == null) {
            this.tournamentSize = DEFAULT_TOURNAMENT_SIZE;
        }

        while (possibleParents.size() < population.getEntities().size()) {
            var entity = IntStream.range(0, this.tournamentSize)
                .mapToObj((i) -> chooseChromosome(population))
                .max(Comparator.comparingDouble(AbstractChromosome::getFitness))
                .orElseThrow(IllegalStateException::new);
            possibleParents.add(entity);
        }

        return possibleParents;
    }

    private C chooseChromosome(P population) {
        int randomIndex = random.nextInt(population.getEntities().size());
        return population.getEntities().get(randomIndex);
    }
}
