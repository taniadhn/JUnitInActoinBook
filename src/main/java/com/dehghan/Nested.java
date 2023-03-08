package com.dehghan;

public class Nested {

    static class Customer{

        private String firstName;
        private String lastName;
        private String middleName;

        public String getBecomeCustomer() {
            return becomeCustomer;
        }

        private String becomeCustomer;

       // Customer(String becomeCustomer) {
         //   this.becomeCustomer = becomeCustomer;
       // }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        void Builder(){

        }

        public static class Builder extends Customer {

            public Builder(String firstName, String lastName) {
              //  super(becomeCustomer);
            }

            public Object withMiddleName(String middleName) {
                return middleName;
            }
        }
    }
}
