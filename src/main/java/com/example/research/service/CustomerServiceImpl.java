package com.example.research.service;

import com.example.research.util.DatasourceConfig;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.sources.tables.pojos.Customers;
import org.jooq.sources.tables.records.CustomersRecord;


import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.sources.tables.Customers.CUSTOMERS;

public class CustomerServiceImpl implements CustomerService {

    DataSource dataSource = DatasourceConfig.createDataSource();

    public List<Customers> findAll() {
        SelectWhereStep<CustomersRecord> customersRecords = DSL.using(dataSource, POSTGRES)
                .selectFrom(CUSTOMERS);
        List<Customers> customersList = new ArrayList<Customers>();
        customersRecords.forEach(s ->customersList.add(new Customers(s.getCustomerId(), s.getFirstname(), s.getSurname(), s.getAge())));
        return customersList;
    }

    public List<Customers> search(String keyword) {
        SelectConditionStep<CustomersRecord> customersRecords = DSL.using(dataSource, POSTGRES).selectFrom(CUSTOMERS).where(CUSTOMERS.FIRSTNAME.like('%' + keyword + '%'));
        List<Customers> customersList = new ArrayList<Customers>();
        customersRecords.forEach(s ->customersList.add(new Customers(s.getCustomerId(), s.getFirstname(), s.getSurname(), s.getAge())));
        return customersList;
    }
}
