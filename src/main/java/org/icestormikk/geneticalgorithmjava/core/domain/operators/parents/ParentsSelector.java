package org.icestormikk.geneticalgorithmjava.core.domain.operators.parents;

import lombok.Data;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractPopulation;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.ParentsSelectionStrategy;

import java.util.List;

@Data
public class ParentsSelector<T, C extends AbstractChromosome<T>, P extends AbstractPopulation<T, C>> {
    private ParentsSelectionStrategy<T, C, P> strategy;

    public List<C> apply(P population) {
        return this.strategy.apply(population);
    }
}
