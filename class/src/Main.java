public class Main {
}
class Employee{
    public static void main(String[] args) {
        Employee e = new Employee(500,"mmmm","+4525","muscat","gmail" );
        System.out.println("Name: "+e.name+" Email Address: "+e.address);
    }
    Employee() {
        System.out.println("Create New Employee");
    }
    Employee(double s, String n, String p, String e, String a)
    {

        salary =s;
        name = n;
        phone = p;
        address = a;
        email = e;
    }
    String name;
    double salary;
    String phone;
    String address;
    String email;

}
