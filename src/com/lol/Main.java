package com.lol;


public class Main {

    int a,b;
    long c;
    // Function/Method.
    public long Addition(){
        a = 1;
        b = 2;
        c = a + b;
        System.out.printf("%d is the sum of %d and %d ",c,a,b);
        return c;
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.Addition();

        /*
        Address a1 = new Address("2","Boudha",5);
        Address a2 = new Address("6","Ratnapark",7);

        List<Address> l_A = new ArrayList<>();
        l_A.add(a1);
        l_A.add(a2);

        Student s1 = new Student("Dawa",17,1,l_A);
        Student s2 = new Student("Jangbu" ,19,2,l_A);

        List<Student> l_S = new ArrayList<>();
        l_S.add(s1);
        l_S.add(s2);

        Department d1 = new Department(101,l_S);
        Department d2 = new Department(201,l_S);

        List<Department> l_D = new ArrayList<>();
        l_D.add(d1);
        l_D.add(d2);


        College c1 = new College("Softwarica",l_D);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student id to know their detail: ");
        int s_id = sc.nextInt();

        System.out.println("Id no.: " + d1.getStudents().get(s_id).getId() +
                " College " + c1.getName() +
                " Department no. =  " + d1.getDepartment_no() +
                " Student name = " + s1.getName() +
                " Province no. =  " + s1.getAddress().get(s_id).getProvince_no() +
                " Age = " + s1.getAge());
         */
    }
}
