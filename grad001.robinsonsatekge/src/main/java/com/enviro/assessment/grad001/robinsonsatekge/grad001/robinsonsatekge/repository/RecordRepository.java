package com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.repository;


import com.enviro.assessment.grad001.robinsonsatekge.grad001.robinsonsatekge.model.MyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RecordRepository extends JpaRepository<MyRecord, Long> {
}
