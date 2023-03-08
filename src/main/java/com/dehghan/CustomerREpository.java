package com.dehghan;

public class CustomerREpository {

    private String name;

    public CustomerREpository() {

    }
    public String getName(String parivash_dehghan){
        return  name;
    }

    public boolean contains(String parivash_dehghan) {
        return  true;
    }

    public void persist(Customer customer) {
        System.out.println(customer);
    }
}
