package org.icestormikk.geneticalgorithmjava.core.domain.operators.recombinations;

import javafx.util.Pair;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.RecombinationStrategy;

import java.util.Random;

public class SinglePointRecombination<T, C extends AbstractChromosome<T>> implements RecombinationStrategy<T, C> {
    private Integer recombinationPoint;

    public SinglePointRecombination(Integer recombinationPoint) {
        this.recombinationPoint = recombinationPoint;
    }

    @Override
    public Pair<C, C> apply(C parent1, C parent2) {
        if (recombinationPoint == null) {
            this.recombinationPoint = new Random().nextInt(0, parent1.getGenes().size());
        }

        return null;
    }
}
