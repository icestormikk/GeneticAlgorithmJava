package org.icestormikk.geneticalgorithmjava.core.domain.operators.mutations;

import lombok.Data;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.MutationStrategy;

@Data
public class Mutator<T, C extends AbstractChromosome<T>> {
    private MutationStrategy<T, C> strategy;

    public void apply(C chromosome) {
        strategy.apply(chromosome);
    }
}
