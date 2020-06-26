package top.proverbs;

import top.proverbs.components.*;
import top.proverbs.mediator.Editor;
import top.proverbs.mediator.Mediator;

import javax.swing.*;

/**
 * Components don't communicate with each other directly. Instead, they communicate via Mediator.
 * */
public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
