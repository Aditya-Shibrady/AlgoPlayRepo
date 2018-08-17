package OOP;

public class StaticKeyword {
    //Static Variable - can be referred in other class
    static int var1 = 3;
    static int var2 = 4;

    //Static block - used to have some static variable operations
    static {
        int var3 = var1 * var2;
    }

    final static int var4 = 55;
}
