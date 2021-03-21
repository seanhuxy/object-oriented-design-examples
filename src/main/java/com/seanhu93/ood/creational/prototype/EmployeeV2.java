package com.seanhu93.ood.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  In the following implementation, Department is deeply copied.
 */
@Data
@AllArgsConstructor
public class EmployeeV2 implements Cloneable {

    @Data
    @AllArgsConstructor
    public static class Department implements Cloneable {

        private String name;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public int age;
    public String name;
    public Department department;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmployeeV2 cloned = (EmployeeV2) super.clone();

        // Deep copy 'Department' object
        cloned.setDepartment((Department) this.getDepartment().clone());
        return cloned;
    }
}

