package com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.service;


import com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.model.MyRecord;
import com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordService {
    @Autowired
    private RecordRepository recordRepository;

    // Method to create a new record
    public MyRecord createRecord(MyRecord record) {
        return recordRepository.save(record);
    }

    // Method to retrieve all records
    public List<MyRecord> getAllRecords() {
        return recordRepository.findAll();
    }

    // Method to retrieve a record by its ID
    public Optional<MyRecord> getRecordById(Long id) {
        return recordRepository.findById(id);
    }

    // Method to update an existing record
    public MyRecord updateRecord(Long id, MyRecord  updatedRecord) {
        Optional<MyRecord> existingRecordOptional = recordRepository.findById(id);
        if (existingRecordOptional.isPresent()) {
            MyRecord  existingRecord = existingRecordOptional.get();
            existingRecord.setName(updatedRecord.getName());
            existingRecord.setSurname(updatedRecord.getSurname());
            return recordRepository.save(existingRecord);
        } else {
            // Handle the case where the record with the given ID is not found
            return null;
        }
    }

    // Method to delete a record by its ID
    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
