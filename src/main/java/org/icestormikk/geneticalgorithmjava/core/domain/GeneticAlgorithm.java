package org.icestormikk.geneticalgorithmjava.core.domain;

import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractPopulation;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.MutationStrategy;
import org.icestormikk.geneticalgorithmjava.core.domain.interfaces.ParentsSelectionStrategy;
import org.icestormikk.geneticalgorithmjava.core.domain.operators.mutations.Mutator;
import org.icestormikk.geneticalgorithmjava.core.domain.operators.parents.ParentsSelector;

import java.util.List;

public class GeneticAlgorithm<T, C extends AbstractChromosome<T>, P extends AbstractPopulation<T, C>> {
    private final ParentsSelector<T, C, P> parentsSelector;
    private final Mutator<T, C> mutator;

    public GeneticAlgorithm() {
        this.parentsSelector = new ParentsSelector<>();
        this.mutator = new Mutator<>();
    }

    public List<C> applyParentsSelection(P population) {
        return this.parentsSelector.apply(population);
    }

    public void applyMutation(C chromosome) {
        this.mutator.apply(chromosome);
    }
    public void applyMutation(List<C> chromosomes) {
        for (C chromosome : chromosomes) {
            applyMutation(chromosome);
        }
    }
    public void applyMutation(P population) {
        for (C chromosome : population.getEntities()) {
            applyMutation(chromosome);
        }
    }

    public void setParentsSelector(ParentsSelectionStrategy<T, C, P> strategy) {
        this.parentsSelector.setStrategy(strategy);
    }

    public void setMutationStrategy(MutationStrategy<T, C> strategy) {
        this.mutator.setStrategy(strategy);
    }
}
