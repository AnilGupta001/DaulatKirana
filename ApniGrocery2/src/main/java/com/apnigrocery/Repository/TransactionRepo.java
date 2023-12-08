package com.apnigrocery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnigrocery.Entity.Trasaction;

public interface TransactionRepo extends JpaRepository<Trasaction, Integer>{

}
