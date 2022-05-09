package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/addBook")
public class AddressBookController {

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressbookData() {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(1, new AddressbookDTO("ChandraKant", "7007154618"));
        ResponseDTO responseDTO = new ResponseDTO("Get call success", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable(value = "personId") int personId) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, new AddressbookDTO("Tom", "9536546915"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id: ", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(1, addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data for: ", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable int personId, @RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data for: ", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable("personId") int personId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted data successfully", "person id: " + personId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
