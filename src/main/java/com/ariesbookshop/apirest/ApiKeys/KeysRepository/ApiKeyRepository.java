package com.ariesbookshop.apirest.ApiKeys.KeysRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ariesbookshop.apirest.ApiKeys.Keys.ApiKey;

@Repository
public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer>  {
    ApiKey findByApiKeyName(String apiKeyName);
}

