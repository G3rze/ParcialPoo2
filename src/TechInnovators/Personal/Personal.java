package TechInnovators.Personal;

public abstract class Personal {
    private String name;

     public abstract void work();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
