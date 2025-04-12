package com.university.staff;

/**
 * Represents a staff member.
 */
public class Staff {
    private int id;
    private String name;
    private String email;

    public Staff(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
