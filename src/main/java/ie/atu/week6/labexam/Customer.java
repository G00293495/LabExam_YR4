package ie.atu.week6.labexam;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;
import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Size @Min(2) @NotBlank(message = "First name should not be empty and at least 2 letters")
    private String firstName;

    @Size @Min(2) @NotBlank(message = "Last name should not be empty and at least 2 letters")
    private String lastName;

    @Min(1) @Max(10)
    private int phoneNumber;

    @Past()
    private int dateOfBirth;

    @Email(message = "This should be a valid email format")
    private String email;



}
