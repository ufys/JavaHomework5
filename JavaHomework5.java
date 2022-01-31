/**
 * Java 1. Homework 5
 * @author Oleg
 * @version 31.01.21
 */


class JavaHomework5 { //class1
    public static void main(String[] args) {
        Person[] person = {
            new Person("Dave Moss", "General manager", "General_manager@mail.com", "892312312", 150000, 50); 
            new Person("Dennis Daniels", "Manager 1", "Manager_1s@mail.com", "892312412", 80000, 42);
            new Person("Carole Atkins", "Manager 2", "Manager_2@mail.com", "892312311", 70000, 36);
            new Person("Mary Allen", "Manager 3", "Manager_3@mail.com", "892312317", 70000, 37);
            new Person("Gladys Taylor", "Manager 4", "Manager_4@mail.com", "892312319", 70000, 35);
        }
        for (Person person : person) {
            if (person.getAge > 40) {
                System.out.println(person) //output of information about persons
            }
        }
    }
}

class Person { //class2
    private String fullname;
    private String position;
    private String e-mail;
    private int phone;
    private int salary;
    private int age;

    Person(String fullname, String position, String e-mail, int phone, int salary, int age) { //constructor
        this.fullname = fullname;
        this.position = position;
        this.e-mail = e-mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        }
    public String getFullName (String fullname) { // protection fullname
        return fullname;
    }
    public void setFullName (String fullname) {
        if (fullname != null) {
            this.fullname = fullname;
        }
    }
    public String getPosition (String position) { // protection position
        return position;
    }
    public void setPosition (String position) {
        if (position != null) {
            this.position = position;
        }
    }
    public String getE-mail (String e-mail) { // protection e-mail
        return e-mail;
    }
    public void setE-mail (String e-mail) {
        if (e-mail != null) {
            this.e-mail = e-mail;
        }
    }
    public String getPhone (String phone) { // protection phone
        return phone;
    }
    public void setPhone (String phone) {
        if (phone > 0) {
            this.phone = phone;
        }
    }
    public String getSalary (String salary) { // protection salary
        return salary;
    }
    public void setSalary (String salary) {
        if (salary != null) {
            this.phone = salary;
        }
    }
    public String getAge (String age) { // protection age
        return age;
    }
    public void setAge (String age) {
        if (age > 18) {
            this.age = age;
        }
    }
    @Override //output of information about persons
    public String toString () {
        return "Person info - Fullname: " + Fullname + ", position: " + position + ", e-mail: " + e-mail + ", phone: " + phone + ", salary: " + salary + ", age: " + age
        }
}
