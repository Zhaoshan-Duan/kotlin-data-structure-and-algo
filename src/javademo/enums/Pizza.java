package javastuff.enums;

public class Pizza {
    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public boolean isDeliverable() {
        //if (getStatus() == PizzaStatus.READY) return true;
        return false;
    }
}
