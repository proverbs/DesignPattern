package top.proverbs.factory;

import top.proverbs.buttons.Button;
import top.proverbs.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 * */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
