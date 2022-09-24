package com.hack23.riksdagsmonitor.data.service;

import com.hack23.riksdagsmonitor.data.entity.SamplePerson;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}