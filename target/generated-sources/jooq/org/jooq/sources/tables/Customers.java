/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Indexes;
import org.jooq.sources.Keys;
import org.jooq.sources.Public;
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
public class Customers extends TableImpl<CustomersRecord> {

    private static final long serialVersionUID = 1503496134;

    /**
     * The reference instance of <code>public.customers</code>
     */
    public static final Customers CUSTOMERS = new Customers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomersRecord> getRecordType() {
        return CustomersRecord.class;
    }

    /**
     * The column <code>public.customers.customer_id</code>.
     */
    public final TableField<CustomersRecord, UUID> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.customers.firstname</code>.
     */
    public final TableField<CustomersRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.customers.surname</code>.
     */
    public final TableField<CustomersRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.customers.age</code>.
     */
    public final TableField<CustomersRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.customers</code> table reference
     */
    public Customers() {
        this(DSL.name("customers"), null);
    }

    /**
     * Create an aliased <code>public.customers</code> table reference
     */
    public Customers(String alias) {
        this(DSL.name(alias), CUSTOMERS);
    }

    /**
     * Create an aliased <code>public.customers</code> table reference
     */
    public Customers(Name alias) {
        this(alias, CUSTOMERS);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CUSTOMERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomersRecord> getPrimaryKey() {
        return Keys.CUSTOMERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomersRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomersRecord>>asList(Keys.CUSTOMERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customers as(String alias) {
        return new Customers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customers as(Name alias) {
        return new Customers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(String name) {
        return new Customers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(Name name) {
        return new Customers(name, null);
    }
}