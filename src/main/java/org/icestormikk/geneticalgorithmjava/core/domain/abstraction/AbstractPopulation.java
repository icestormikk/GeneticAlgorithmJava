package org.icestormikk.geneticalgorithmjava.core.domain.abstraction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Data;
import org.icestormikk.geneticalgorithmjava.core.domain.annotations.FixedLength;

import java.util.List;

@Data
public class AbstractPopulation<T, C extends AbstractChromosome<T>> {
    private ObservableList<C> entities;

    public AbstractPopulation(List<C> entities) {
        this.entities = FXCollections.observableArrayList(entities);
        checkAnnotations();
    }
    public AbstractPopulation(ObservableList<C> entities) {
        this.entities = entities;
        checkAnnotations();
    }

    private void checkAnnotations() {
        var clazz = this.getClass();

        FixedLength fixedLength = clazz.getAnnotation(FixedLength.class);
        if (fixedLength != null) {
            int length = fixedLength.value();
            entities.forEach((e) -> {
                if (e.getGenes().size() != length) {
                    throw new IllegalStateException();
                }
            });
        }
    }
}
