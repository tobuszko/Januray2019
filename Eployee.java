import sun.management.ExtendedPlatformComponent;

public class Eployee {
    String name;
    int age;
    int salary;

    public Eployee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Eployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            System.out.println("Równość refencyjna");
        }

        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Eployee employee = (Eployee) object;

        if (this.name == null) {
            if (employee.name != null) {
                return false;
            }
        } else if (!this.name.equals(employee.name)) {
            return false;
        } else if (this.age != employee.age) {
            return false;

        } else if (this.salary != employee.salary) {
            return false;
        }
            return true;

    }


}



