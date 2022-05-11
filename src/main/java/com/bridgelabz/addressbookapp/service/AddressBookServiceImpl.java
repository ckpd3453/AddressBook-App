package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookServiceImpl implements IAddressBookService {
    List<AddressbookData> addressbookDataList = new ArrayList<>();

    @Override
    public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
        log.info("Adding A New AddressBook Data");
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDataList.size() + 1, addressbookDTO);
        addressbookDataList.add(addressbookData);
        return addressbookData;
    }

    @Override
    public List<AddressbookData> getAddressbookData() {
        log.info("Getting All List of AddressBook Data");
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        log.info("Getting AddressBook Data By ID");
        AddressbookData addressbookData = null;
        addressbookData = addressbookDataList.get(personId - 1);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(int personId,@Valid AddressbookDTO addressbookDTO) {
        log.info("Updating/Editing The AddressBook Data of Given ID");
        AddressbookData addressbookData = this.getAddressbookDataById(personId);
        addressbookData.setName(addressbookDTO.name);
        addressbookData.setPhNumber(addressbookDTO.phNumber);
        addressbookDataList.set(personId - 1, addressbookData);
        return addressbookData;
    }

    @Override
    public void deleteAddressbooData(int personId) {
        log.info("Deleting The AddressBook Data of Given ID");
        int i = 1;
        addressbookDataList.remove(personId - 1);
        for (AddressbookData addressbookData : addressbookDataList) {
            addressbookData.setPersonId(i++);
        }
    }
}
