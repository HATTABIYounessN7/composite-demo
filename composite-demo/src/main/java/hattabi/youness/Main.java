package hattabi.youness;

import composite.*;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder src = new Folder("src");
        Folder test = new Folder("test");

        root.addChild(src);
        root.addChild(test);
        root.addChild(new File("pom.xml"));

        src.addChild(new File("Main.java"));
        src.addChild(new File("Util.java"));
        test.addChild(new File("MainTest.java"));

        root.print();
    }
}