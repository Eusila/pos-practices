package Model;

public class Person
{
    private String name;
    private int age;
    private String email;
    private String address;

    public Person(String name, int age, String email, String address) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.address = address;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Address: " + address);
        }
    }

