package top.proverbs.factories;

import top.proverbs.buttons.Button;
import top.proverbs.buttons.MacOSButton;
import top.proverbs.checkboxes.Checkbox;
import top.proverbs.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single variety.
 * */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
