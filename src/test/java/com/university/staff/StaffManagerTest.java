package com.university.staff;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StaffManagerTest {

    @Test
    void testCreateAndReadStaff() {
        StaffManager manager = new StaffManager();
        Staff s = new Staff(1, "Alice", "alice@example.com");
        manager.createStaff(s);
        Staff result = manager.readStaff(1);
        assertNotNull(result);
        assertEquals("Alice", result.getName());
    }

    @Test
    void testUpdateStaff() {
        StaffManager manager = new StaffManager();
        Staff s = new Staff(2, "Bob", "bob@example.com");
        manager.createStaff(s);
        boolean updated = manager.updateStaff(2, "Bobby", "bobby@example.com");
        assertTrue(updated);
        Staff result = manager.readStaff(2);
        assertEquals("Bobby", result.getName());
    }

    @Test
    void testDeleteStaff() {
        StaffManager manager = new StaffManager();
        Staff s = new Staff(3, "Charlie", "charlie@example.com");
        manager.createStaff(s);
        boolean deleted = manager.deleteStaff(3);
        assertTrue(deleted);
        assertNull(manager.readStaff(3));
    }

    @Test
    void testGetAllStaff() {
        StaffManager manager = new StaffManager();
        manager.createStaff(new Staff(4, "Dana", "dana@example.com"));
        List<Staff> staffList = manager.getAllStaff();
        assertEquals(1, staffList.size());
    }
}
