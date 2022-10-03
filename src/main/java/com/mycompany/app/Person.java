package com.mycompany.app;

class Person {
    private String firstName;
    private String lastName;

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}