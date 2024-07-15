package org.icestormikk.geneticalgorithmjava.core.domain.operators.recombinations;

import javafx.util.Pair;
import lombok.Setter;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.RecombinationStrategy;

@Setter
public class Recombinator<T, C extends AbstractChromosome<T>> {
    private RecombinationStrategy<T, C> strategy;

    public Pair<C, C> apply(C parent1, C parent2) {
        return this.strategy.apply(parent1, parent2);
    }
}
