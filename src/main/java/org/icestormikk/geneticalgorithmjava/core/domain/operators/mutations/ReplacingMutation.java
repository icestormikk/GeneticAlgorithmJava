package org.icestormikk.geneticalgorithmjava.core.domain.operators.mutations;

import lombok.AllArgsConstructor;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.MutationStrategy;

import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class ReplacingMutation<T, C extends AbstractChromosome<T>> implements MutationStrategy<T, C> {
    private Integer replacingGeneIndex;
    private List<T> possibleValues;

    @Override
    public void apply(C chromosome) {
        if (replacingGeneIndex == null) {
            this.replacingGeneIndex = new Random().nextInt(0, chromosome.getGenes().size());
        }

        chromosome.getGenes().set(replacingGeneIndex, possibleValues.get(0));
    }
}
