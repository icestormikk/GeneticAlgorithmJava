package org.icestormikk.geneticalgorithmjava.core.domain;

import javafx.collections.ObservableList;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractPopulation;
import org.icestormikk.geneticalgorithmjava.core.domain.annotations.FixedLength;

import java.util.List;

@FixedLength(10)
public class Population<T, C extends AbstractChromosome<T>> extends AbstractPopulation<T, C> {
    public Population(List<C> entities) {
        super(entities);
    }
    public Population(ObservableList<C> entities) {
        super(entities);
    }
}
