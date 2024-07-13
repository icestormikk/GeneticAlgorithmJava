package org.icestormikk.geneticalgorithmjava.core.domain;

import java.util.List;

/**
 * Стандартная хромосома генетического алгоритма
 * @param <T>
 */
public class Chromosome<T> extends AbstractChromosome<T> {
    public Chromosome(List<T> genes) {
        super(genes);
    }
}
