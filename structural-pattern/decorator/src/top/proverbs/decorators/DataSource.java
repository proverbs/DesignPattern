package top.proverbs.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
