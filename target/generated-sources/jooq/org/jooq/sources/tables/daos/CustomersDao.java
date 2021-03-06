/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.daos;


import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.sources.tables.Customers;
import org.jooq.sources.tables.records.CustomersRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomersDao extends DAOImpl<CustomersRecord, org.jooq.sources.tables.pojos.Customers, UUID> {

    /**
     * Create a new CustomersDao without any configuration
     */
    public CustomersDao() {
        super(Customers.CUSTOMERS, org.jooq.sources.tables.pojos.Customers.class);
    }

    /**
     * Create a new CustomersDao with an attached configuration
     */
    public CustomersDao(Configuration configuration) {
        super(Customers.CUSTOMERS, org.jooq.sources.tables.pojos.Customers.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(org.jooq.sources.tables.pojos.Customers object) {
        return object.getCustomerId();
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<org.jooq.sources.tables.pojos.Customers> fetchByCustomerId(UUID... values) {
        return fetch(Customers.CUSTOMERS.CUSTOMER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>customer_id = value</code>
     */
    public org.jooq.sources.tables.pojos.Customers fetchOneByCustomerId(UUID value) {
        return fetchOne(Customers.CUSTOMERS.CUSTOMER_ID, value);
    }

    /**
     * Fetch records that have <code>firstname IN (values)</code>
     */
    public List<org.jooq.sources.tables.pojos.Customers> fetchByFirstname(String... values) {
        return fetch(Customers.CUSTOMERS.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>surname IN (values)</code>
     */
    public List<org.jooq.sources.tables.pojos.Customers> fetchBySurname(String... values) {
        return fetch(Customers.CUSTOMERS.SURNAME, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<org.jooq.sources.tables.pojos.Customers> fetchByAge(Integer... values) {
        return fetch(Customers.CUSTOMERS.AGE, values);
    }
}
