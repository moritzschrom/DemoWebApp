package co.schrom.DemoWebApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    public Person(String firstName, String lastName) {
        this(null, firstName, lastName);
    }

    public String getName() {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name is null or blank.");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is null or blank.");
        }

        return firstName + " " + lastName;
    }

}
