package com.example.repository;

import com.example.entity.LoanRecord;
import java.util.List;

public interface LoanRecordRepository {

    void save(LoanRecord loanRecord);

    List<LoanRecord> findAll();

    void deleteById(int id);

    void update(LoanRecord loanRecord);
}
