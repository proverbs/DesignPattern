package top.proverbs.factories;

import top.proverbs.buttons.Button;
import top.proverbs.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 * */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
