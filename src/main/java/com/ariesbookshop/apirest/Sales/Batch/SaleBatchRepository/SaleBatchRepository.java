package com.ariesbookshop.apirest.Sales.Batch.SaleBatchRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ariesbookshop.apirest.Sales.Batch.SaleBatch.SaleBatch;



@Repository
public interface SaleBatchRepository extends JpaRepository<SaleBatch, Integer>{
    
}