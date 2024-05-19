package com.mstechnology.msbrewery.web.mappers;

import com.mstechnology.msbrewery.domain.Customer;
import com.mstechnology.msbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
}
