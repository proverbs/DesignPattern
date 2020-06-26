package top.proverbs.components;

import top.proverbs.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
