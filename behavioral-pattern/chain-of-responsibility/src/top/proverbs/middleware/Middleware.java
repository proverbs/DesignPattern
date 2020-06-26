package top.proverbs.middleware;

/**
 * Base middleware class.
 * */
public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Chain should share the same interface.
     * */
    public abstract boolean check(String email, String password);

    /**
     * Make it easy for chaining.
     * */
    protected boolean checkNext(String email, String password) {
        if (next == null) return true;
        return next.check(email, password);
    }
}
