package com.university.staff;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages CRUD operations for staff members.
 */
public class StaffManager {
    private List<Staff> staffList = new ArrayList<>();

    public void createStaff(Staff staff) {
        staffList.add(staff);
    }

    public Staff readStaff(int id) {
        return staffList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public boolean updateStaff(int id, String name, String email) {
        Staff staff = readStaff(id);
        if (staff != null) {
            staff.setName(name);
            staff.setEmail(email);
            return true;
        }
        return false;
    }

    public boolean deleteStaff(int id) {
        return staffList.removeIf(s -> s.getId() == id);
    }

    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffList);
    }
}
