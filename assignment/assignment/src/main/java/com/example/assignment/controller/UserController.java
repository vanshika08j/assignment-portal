package com.example.assignment.controller;

import com.example.assignment.Services.AssignmentService;
import com.example.assignment.Services.UserService;
import com.example.assignment.dto.AssignmentRequest;
import com.example.assignment.model.Assignment;
import com.example.assignment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadAssignment(@RequestBody AssignmentRequest request) {
        Assignment assignment = new Assignment();
        assignment.setUserId(request.getUserId());
        assignment.setTask(request.getTask());
        assignment.setAdmin(request.getAdmin());
        return ResponseEntity.ok(assignmentService.uploadAssignment(assignment));
    }
}

