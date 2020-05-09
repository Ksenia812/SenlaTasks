package Task6;

public class Item {
    private int id;
    private int weight;
    private int cost;

    public Item(int id, int weight, int cost) {
        this.id = id;
        this.weight = weight;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
