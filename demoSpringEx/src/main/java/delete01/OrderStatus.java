package delete01;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    OrderStatus nextStatus() {
        int nextOrdinal = this.ordinal() + 1;
        return nextOrdinal < OrderStatus.values().length ? OrderStatus.values()[nextOrdinal] : this;
    }
}
