package pl.training.integration.lab05.model;

public class Coffee {

    private CoffeeType type;
    private boolean iced;

    public Coffee() {
    }

    public Coffee(CoffeeType type, boolean iced) {
        this.type = type;
        this.iced = iced;
    }

    public CoffeeType getType() {
        return type;
    }

    public boolean isIced() {
        return iced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        if (iced != coffee.iced) return false;
        return type == coffee.type;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (iced ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", iced=" + iced +
                '}';
    }

}
