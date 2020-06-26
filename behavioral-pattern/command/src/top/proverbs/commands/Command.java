package top.proverbs.commands;

import top.proverbs.editor.Editor;

/**
 * Command as an object.
 *
 * Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions.
 * It’s also used for queueing tasks, tracking operations history.
 * */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
