package top.proverbs;

public final class Singleton {
    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile Singleton instance;

    public String value;

    // Private constructor.
    private Singleton(String value) {
        this.value = value;
    }

    // Static function works for creation.
    // Using DCL(double-checked locking) for lazy-initialization (create at the first call) of Singleton.
    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
