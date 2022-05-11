package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class AddressbookData {

    @Id
    private int personId;
    private String name;
    private String phNumber;

    public AddressbookData(int personId, AddressbookDTO addressbookDTO) {
        this.personId = personId;
        this.name = addressbookDTO.name;
        this.phNumber = addressbookDTO.phNumber;
    }
}
