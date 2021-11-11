package com.lol;

import java.util.List;

public class Department {
    private int department_no;
    List<Student> students;

    public Department(int department_no, List<Student> students) {
        this.department_no = department_no;
        this.students = students;
    }

    public void setDepartment_no(int department_no) {
        this.department_no = department_no;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getDepartment_no() {
        return department_no;
    }

    public List<Student> getStudents() {
        return students;
    }
}
