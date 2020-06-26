package top.proverbs.history;

import top.proverbs.editor.Editor;

/**
 * Memento can be perceived as Snapshot.
 * */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
