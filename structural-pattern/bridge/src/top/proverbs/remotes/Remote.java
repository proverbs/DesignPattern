package top.proverbs.remotes;

/**
 * Abstraction: provide high-level control logic.
 * */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
