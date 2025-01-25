package com.Day05Inheritance.level3MultilevelInheritance;
// Base class Order
abstract class Order {
    protected int orderId;
    protected String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public abstract String getOrderStatus();
}

// ShippedOrder extends Order
class ShippedOrder extends Order {
    protected String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

// Test class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-23", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-22", "TRK789012", "2025-01-24");
        System.out.println("Details of Orders: ");
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}

