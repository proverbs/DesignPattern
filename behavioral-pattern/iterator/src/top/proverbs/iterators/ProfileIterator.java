package top.proverbs.iterators;

import top.proverbs.profile.Profile;

public interface ProfileIterator {
    /**
     * basic interfaces for an interator.
     * */
    boolean hasNext();
    Profile getNext();
    void reset();
}
