package com.sonarsource.support;

import java.sql.Timestamp;
import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountRepositoryImpl implements AccountRepositoryCustom {
    private static final String TYPE = "type";
    private static final String LABEL = "label";
    private static final String CREATION_DATE = "creation_date";
    private static final String BALANCE = "balance";
    
    private final JdbcTemplate jdbcTemplate;
    
    public AccountRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public Collection<Account> findByClientIdWithSQLInjectionPattern(String clientId) {
        return jdbcTemplate.query("SELECT account FROM Account account " +
                "JOIN FETCH account.client client " +
                "WHERE client.id = " + clientId,
                accountRowMapper());
    }
    
    private RowMapper<Account> accountRowMapper() {
        return (resultSet, i) -> {
            String type = resultSet.getString(TYPE);
            String label = resultSet.getString(LABEL);
            Timestamp creationDate = resultSet.getTimestamp(CREATION_DATE);
            int balance = resultSet.getInt(BALANCE);

            return new Account(type, label, creationDate, balance);
        };
    }
}