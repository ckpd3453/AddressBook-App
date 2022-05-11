package com.bridgelabz.addressbookapp.dto;




import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AddressbookDTO {

    @NotNull(message = "ERROR: Name cannot be null!!!")
    @NotEmpty(message = "ERROR: Name cannot be empty!")
    @Pattern(regexp = "^([A-Z][a-zA-Z]{2,}[ ]?)+$", message = "ERROR: Please enter a valid name!")
    public String name;
    public  String city;
    public  String state;
    public  String zipCode;

    @NotNull(message = "ERROR: phone number cannot be null!!")
    @Min(value = 1000000000, message = "ERROR: Please enter 10 digit number")
    public String phNumber;
    public String email;



}
