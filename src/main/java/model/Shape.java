package model;

public abstract class Shape implements Cloneable {

    private String id;
    protected String name;

    abstract void shape();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Object clone() {
        Object clone;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
