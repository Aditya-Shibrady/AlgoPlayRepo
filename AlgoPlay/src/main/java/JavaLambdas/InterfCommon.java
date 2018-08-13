package JavaLambdas;

import java.util.List;

public interface InterfCommon {
    void m1 (List<String> list);

    default void m2 () {};
}
