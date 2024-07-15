package org.icestormikk.geneticalgorithmjava.core.domain.interfaces;

import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractPopulation;

import java.util.List;

public interface ParentsSelectionStrategy<T, C extends AbstractChromosome<T>, P extends AbstractPopulation<T, C>> {
    List<C> apply(P population);
}
