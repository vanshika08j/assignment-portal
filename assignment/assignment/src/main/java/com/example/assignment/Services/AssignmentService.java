package com.example.assignment.Services;

import com.example.assignment.model.Assignment;
import com.example.assignment.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment uploadAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignmentsByAdmin(String admin) {
        return assignmentRepository.findByAdmin(admin);
    }

    public Assignment acceptAssignment(String id) {
        Assignment assignment = assignmentRepository.findById(id).orElseThrow();
        assignment.setStatus("ACCEPTED");
        return assignmentRepository.save(assignment);
    }

    public Assignment rejectAssignment(String id) {
        Assignment assignment = assignmentRepository.findById(id).orElseThrow();
        assignment.setStatus("REJECTED");
        return assignmentRepository.save(assignment);
    }
}
