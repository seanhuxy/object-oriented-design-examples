package com.seanhu93.ood.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void testCloneV1() throws CloneNotSupportedException {

        EmployeeV1.Department department = new EmployeeV1.Department("Research");
        EmployeeV1 john = new EmployeeV1(25, "John", department);

        EmployeeV1 john2 = (EmployeeV1) john.clone();

        Assertions.assertFalse(john == john2);
        Assertions.assertEquals(john, john2);
        Assertions.assertTrue(john.getClass() == john2.getClass());

        john.age = 26;
        Assertions.assertEquals(john.getAge(), 26);
        Assertions.assertEquals(john2.getAge(), 25);

        john.name = "JohnV2";
        Assertions.assertEquals(john.getName(), "JohnV2");
        Assertions.assertEquals(john2.getName(), "John");

        // member of class types are shallow copied.
        john.getDepartment().setName("ResearchV2");
        Assertions.assertEquals(john.getDepartment().getName(), "ResearchV2");
        Assertions.assertEquals(john2.getDepartment().getName(), "ResearchV2");
    }

    @Test
    public void testCloneV2() throws CloneNotSupportedException {

        EmployeeV2.Department department = new EmployeeV2.Department("Research");
        EmployeeV2 john = new EmployeeV2(25, "John", department);

        EmployeeV2 john2 = (EmployeeV2) john.clone();

        Assertions.assertFalse(john == john2);
        Assertions.assertEquals(john, john2);
        Assertions.assertTrue(john.getClass() == john2.getClass());

        john.age = 26;
        Assertions.assertEquals(john.getAge(), 26);
        Assertions.assertEquals(john2.getAge(), 25);

        john.name = "JohnV2";
        Assertions.assertEquals(john.getName(), "JohnV2");
        Assertions.assertEquals(john2.getName(), "John");

        john.getDepartment().setName("ResearchV2");
        Assertions.assertEquals(john.getDepartment().getName(), "ResearchV2");
        Assertions.assertEquals(john2.getDepartment().getName(), "Research");
    }
}
