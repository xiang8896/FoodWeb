package model;

import java.util.Optional;

public interface AccountDAO {
	void createAccount(AccountEntity user);
	Optional<AccountEntity> existAccount(String username); 
}
