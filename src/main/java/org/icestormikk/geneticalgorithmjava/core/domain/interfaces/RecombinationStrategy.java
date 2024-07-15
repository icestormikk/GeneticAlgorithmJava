package org.icestormikk.geneticalgorithmjava.core.domain.interfaces;

import javafx.util.Pair;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;

public interface RecombinationStrategy<T, C extends AbstractChromosome<T>> {
    Pair<C, C> apply(C parent1, C parent2);
}
