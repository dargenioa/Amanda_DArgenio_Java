package com.company;

public class CustomerApplication {
    public static void main(String[] args) {

        Customer customer = new Customer("Amanda", "D'Argenio", "user@gmail.com", "123-456-7891");
        Address shippingAddress = new Address("123 new road", "Apt 1", "Parsippany", "New Jersey", "07054");
        Address billingAddress = new Address("45678 old road", "Apt 2", "Wayne", "New Jersey", "07457");

        customer.setShippingAddress(shippingAddress);
        customer.setBillingAddress(billingAddress);
        System.out.println(customer.getFirstName() + "'s" + " shipping address is: " + shippingAddress);
        System.out.println(customer.getFirstName() + "'s" + " billing address is: " + billingAddress);
        customer.setRewardsMember(false);
        System.out.println("Rewards member: " + customer.isRewardsMember());
        customer.setRewardsMember(true);
        System.out.println("Rewards member: " + customer.isRewardsMember());

    }
}
