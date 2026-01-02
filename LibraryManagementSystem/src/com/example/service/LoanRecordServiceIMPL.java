package com.example.service;

import com.example.entity.LoanRecord;
import com.example.repository.LoanRecordRepository;
import com.example.repository.LoanRecordRepositoryIMPL;

import java.util.List;

public class LoanRecordServiceIMPL implements LoanRecordService {

    private LoanRecordRepositoryIMPL loanRecordRepository =  new LoanRecordRepositoryIMPL();

    @Override
    public void addLoanRecord(LoanRecord loanRecord) {
        loanRecordRepository.save(loanRecord);
    }

    @Override
    public void deleteLoanRecord(int id) {
        loanRecordRepository.deleteById(id);
    }

    @Override
    public void updateLoanRecord(LoanRecord loanRecord) {
        loanRecordRepository.update(loanRecord);
    }

    @Override
    public List<LoanRecord> listLoanRecords() {
        return loanRecordRepository.findAll();
    }
}
