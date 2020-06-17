package top.proverbs.factory;

import top.proverbs.buttons.Button;
import top.proverbs.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 * */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
