package com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.controller;


import com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.model.MyRecord;
import com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.service.RecordService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/records")
@Api(tags = "Record Management")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping
    public ResponseEntity<MyRecord> createRecord(@RequestBody MyRecord record) {
        MyRecord createdRecord = recordService.createRecord(record);
        return new ResponseEntity<>(createdRecord, HttpStatus.CREATED);
    }


    // Endpoint to retrieve all records
    @GetMapping
    public ResponseEntity<List<MyRecord>> getAllRecords() {
        List<MyRecord> records = recordService.getAllRecords();
        return new ResponseEntity<>(records, HttpStatus.OK);
    }

    // Endpoint to retrieve a record by its ID
    @GetMapping("/{id}")
    public ResponseEntity<MyRecord> getRecordById(@PathVariable("id") Long id) {
        Optional<MyRecord> recordOptional = recordService.getRecordById(id);
        if (recordOptional.isPresent()) {
            return new ResponseEntity<>(recordOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    // Endpoint to update an existing record
    @PutMapping("/{id}")
    public ResponseEntity<MyRecord> updateRecord(@PathVariable("id") Long id, @RequestBody MyRecord recordDetails) {
        MyRecord updatedRecord = recordService.updateRecord(id, recordDetails);
        return new ResponseEntity<>(updatedRecord, HttpStatus.OK);
    }

    // Endpoint to delete a record by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable("id") Long id) {
        recordService.deleteRecord(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
