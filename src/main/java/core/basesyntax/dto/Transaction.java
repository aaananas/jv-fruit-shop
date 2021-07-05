package core.basesyntax.dto;

import core.basesyntax.model.Fruit;

public class Transaction {
    private String operation;
    private Fruit fruit;
    private int quantity;

    public Transaction(String operation, Fruit fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public String getOperation() {
        return operation;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }
}