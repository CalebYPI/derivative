package org.example;

public class HumanImpl implements Human {
    @Override
    public String gender(String type) {
        return type;
    }

    @Override
    public void living(boolean alive) {
        alive = true;
    }
}
