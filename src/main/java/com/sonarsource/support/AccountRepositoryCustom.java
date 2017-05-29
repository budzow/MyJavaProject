package com.sonarsource.support;

import java.util.Collection;

public interface AccountRepositoryCustom {

	Collection<Account> findByClientIdWithSQLInjectionPattern(String clientId);

}
