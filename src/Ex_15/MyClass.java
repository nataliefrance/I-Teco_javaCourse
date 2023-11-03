package Ex_15;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    private String text;
    private final List<String> bigWords = new ArrayList<>();

    public String getText() {
        return text;
    }

    public List<String> getBigWords() {
        return bigWords;
    }

    public void setText(String text) {
        this.text = text;
    }
}
