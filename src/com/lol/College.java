package com.lol;

import java.util.List;

public class College {
    private String name;
    List<Department> departments;

    public College(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
