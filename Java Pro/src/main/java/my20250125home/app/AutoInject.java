package my20250125home.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотация применяется только к полям
@Target(ElementType.FIELD)

// Аннотация должна быть доступна во время выполнения
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInject { }
