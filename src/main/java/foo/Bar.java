package foo;

import org.immutables.value.Value;

@Value.Immutable
public interface Bar {
    String getName();
    int getValue();
}
