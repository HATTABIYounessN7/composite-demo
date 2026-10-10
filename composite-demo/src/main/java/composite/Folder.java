package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Component addChild(Component child) {
        child.level = this.level + 1;
        components.add(child);
        return child;
    }

    @Override
    public void print() {
        System.out.println(getTab() + "Folder: " + name);
        for (Component c : components) {
            c.print();
        }
    }
}