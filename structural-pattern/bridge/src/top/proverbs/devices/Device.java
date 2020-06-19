package top.proverbs.devices;

/**
 * Implementation: An abstraction can only communicate with an implementation object
 * via methods that are declared here.
 * */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
