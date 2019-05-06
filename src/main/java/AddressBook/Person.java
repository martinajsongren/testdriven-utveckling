package AddressBook;

import java.util.Date;
import java.util.UUID;

public class Person {
    private String name, streetAddress,email,phone;
    private int  age;
    private Date birthday;
    private UUID id;

    public Person(String name, String streetAddress, String email, String phone, int age, Date birthday) {
        super();
        this.name = name;
        this.streetAddress = streetAddress;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.birthday = birthday;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public UUID getId() {
        return id;
    }



}
