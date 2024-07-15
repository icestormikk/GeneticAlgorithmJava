package org.icestormikk.geneticalgorithmjava.core.domain.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Тестовая аннотация для ограничения длины хромососом в популяции
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface FixedLength {
    int value();
}
