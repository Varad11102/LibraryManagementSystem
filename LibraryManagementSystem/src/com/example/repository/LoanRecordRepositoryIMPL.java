package com.example.repository;


import com.example.entity.LoanRecord;
import java.util.ArrayList;
import java.util.List;

public class LoanRecordRepositoryIMPL {
    private List<LoanRecord> records = new ArrayList<>();

    public void save(LoanRecord record) {
        records.add(record);
    }

    public List<LoanRecord> findAll() {
        return records;
    }

    public void deleteById(int id) {
        records.removeIf(record -> record.getId() == id);
    }

    public void update(LoanRecord updatedRecord) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getId() == updatedRecord.getId()) {
                records.set(i, updatedRecord);
            }
        }
    }
}
