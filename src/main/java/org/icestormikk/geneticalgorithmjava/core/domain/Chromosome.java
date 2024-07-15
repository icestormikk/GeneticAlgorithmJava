package org.icestormikk.geneticalgorithmjava.core.domain;

import javafx.collections.ObservableList;
import org.icestormikk.geneticalgorithmjava.core.domain.abstraction.AbstractChromosome;

import java.util.List;

/**
 * Стандартная хромосома генетического алгоритма
 * @param <T>
 */
public class Chromosome<T> extends AbstractChromosome<T> {
    public Chromosome(List<T> genes) {
        super(genes);
    }
    public Chromosome(ObservableList<T> genes) {
        super(genes);
    }
}
