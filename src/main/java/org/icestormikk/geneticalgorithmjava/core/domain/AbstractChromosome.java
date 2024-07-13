package org.icestormikk.geneticalgorithmjava.core.domain;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import lombok.Data;

import java.util.List;

/**
 * Абстрактный класс, который является базовым классом для всех видов хромосом в программе.
 * @param <T> Тип гена хромосомы
 */
@Data
public abstract class AbstractChromosome<T> {
    private ObservableList<T> genes;
    private Double fitness;

    public AbstractChromosome(List<T> genes) {
        this.genes = FXCollections.observableArrayList(genes);
        setListener();
    }
    public AbstractChromosome(ObservableList<T> genes) {
        this.genes = genes;
        setListener();
    }

    public void setGenes(ObservableList<T> genes) {
        this.genes = genes;
        this.fitness = null;
    }

    private void setListener() {
        this.genes.addListener(
            (ListChangeListener<T>) change -> fitness = null
        );
    }
}
