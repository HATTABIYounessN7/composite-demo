package composite;

public abstract class Component {
    protected int level;
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public String getTab() {
        return "----".repeat(level);
    }

    public abstract void print();
}