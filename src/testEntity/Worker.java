package testEntity;

public class Worker {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "testEntity.Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
