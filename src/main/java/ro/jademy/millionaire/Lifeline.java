package ro.jademy.millionaire;

public class Lifeline {

    private String name;

    public Lifeline(String name, boolean used) {
        this.name = name;
        this.used = used;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    private boolean used;
}
