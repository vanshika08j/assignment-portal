package com.example.assignment.controller;

import com.example.assignment.Services.AssignmentService;
import com.example.assignment.Services.UserService;
import com.example.assignment.model.Assignment;
import com.example.assignment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/assignments")
    public ResponseEntity<?> getAssignments(@RequestParam String admin) {
        return ResponseEntity.ok(assignmentService.getAssignmentsByAdmin(admin));
    }

    @PostMapping("/assignments/{id}/accept")
    public ResponseEntity<?> acceptAssignment(@PathVariable String id) {
        return ResponseEntity.ok(assignmentService.acceptAssignment(id));
    }

    @PostMapping("/assignments/{id}/reject")
    public ResponseEntity<?> rejectAssignment(@PathVariable String id) {
        return ResponseEntity.ok(assignmentService.rejectAssignment(id));
    }
}
