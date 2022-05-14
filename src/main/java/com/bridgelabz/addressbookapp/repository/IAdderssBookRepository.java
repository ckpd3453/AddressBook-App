package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressbookData;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.From;
import java.util.List;


public interface IAdderssBookRepository extends JpaRepository<AddressbookData,Integer> {
    public AddressbookData findByName(String name);

    @Query(value = "SELECT * FROM Contact_List WHERE CITY = :city", nativeQuery = true)
    public List<AddressbookData> getByCity(@Param(value = "city") String city);
}
