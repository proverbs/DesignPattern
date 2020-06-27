package top.proverbs;

import top.proverbs.ui.Player;
import top.proverbs.ui.UI;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
