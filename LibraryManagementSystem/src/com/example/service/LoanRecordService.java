package com.example.service;

import com.example.entity.LoanRecord;
import java.util.List;

public interface LoanRecordService {
    void addLoanRecord(LoanRecord loanRecord);
    void deleteLoanRecord(int id);
    void updateLoanRecord(LoanRecord loanRecord);
    List<LoanRecord> listLoanRecords();
}
