package yuhyeon.ch06.enummap;

import java.util.HashMap;

public class Plant {

    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant (String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        HashMap<String, String> map = new HashMap<>();
        return "Plant{" +
                "name='" + name + '\'' +
                ", lifeCycle=" + lifeCycle +
                '}';
    }
}
