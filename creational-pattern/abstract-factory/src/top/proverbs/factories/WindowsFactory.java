package top.proverbs.factories;

import top.proverbs.buttons.Button;
import top.proverbs.buttons.WindowsButton;
import top.proverbs.checkboxes.Checkbox;
import top.proverbs.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single variety.
 * */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
