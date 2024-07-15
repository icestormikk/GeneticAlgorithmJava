package org.icestormikk.geneticalgorithmjava.core.domain.interfaces;

import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;

public interface MutationStrategy<T, C extends AbstractChromosome<T>> {
    void apply(C chromosome);
}
