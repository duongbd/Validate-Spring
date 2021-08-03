package model;

import custom.validate.PhoneConstraint;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    @Size(min = 5, max = 45, message = "length out of range")
    @NotNull
    String firstName;
    @Column
    @Size(min = 5, max = 45, message = "length out of range")
    @NotNull
    String lastName;
    @Column
    @Min(18)
    @NotNull
    Integer age;
    @Column
    //@Pattern(regexp = "0[0-9]{9,10}", message = "email invalid")
    @PhoneConstraint
    String phone;
    @Column
    @Email
    String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}