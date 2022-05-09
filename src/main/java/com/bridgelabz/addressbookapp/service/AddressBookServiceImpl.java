package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {
    @Override
    public List<AddressbookData> getAddressbookData() {
        List<AddressbookData> addressbookDataList = new ArrayList<>();
        addressbookDataList.add(new AddressbookData(1, new AddressbookDTO("Chandrakant", "7001950699")));
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, new AddressbookDTO("Shardul", "8789547698"));
        return addressbookData;
    }

    @Override
    public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(1, addressbookDTO);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, addressbookDTO);
        return addressbookData;
    }

    @Override
    public void deleteAddressbooData(int personId) {

    }
}
