package pl.sda.sdaspringtraining.api.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String driverLicense;

}
