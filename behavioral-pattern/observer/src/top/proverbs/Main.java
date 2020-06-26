package top.proverbs;

import top.proverbs.editor.Editor;
import top.proverbs.listeners.EmailNotificationListener;
import top.proverbs.listeners.LogOpenListener;

/**
 * Listener is the subscriber.
 * The editor and EventManager together are the publisher.
 * */
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
