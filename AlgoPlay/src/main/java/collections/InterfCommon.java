package collections;

import java.util.List;

public interface InterfCommon {
    void m1(List<Integer> list);

    default void m2() {};
}
