package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.Progress;
import com.example.autoecoleflutter.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progress")
public class ProgressController {
    @Autowired
    private ProgressService progressService;

    @GetMapping("/{id}")
    public ResponseEntity<Progress> getProgressById(@PathVariable int id) {
        Progress progress = progressService.findById(id);
        return ResponseEntity.ok(progress);
    }

    @GetMapping
    public ResponseEntity<List<Progress>> getAllProgress() {
        List<Progress> progressList = progressService.getAllProgress();
        return ResponseEntity.ok(progressList);
    }

    @PostMapping
    public ResponseEntity<Progress> createProgress(@RequestBody Progress progress) {
        Progress createdProgress = progressService.createProgress(progress);
        return ResponseEntity.ok(createdProgress);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Progress> updateProgress(@PathVariable int id, @RequestBody Progress progress) {
        Progress updatedProgress = progressService.updateProgress(id, progress);
        if (updatedProgress != null) {
            return ResponseEntity.ok(updatedProgress);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgress(@PathVariable int id) {
        progressService.deleteProgress(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Progress> getUserProgressByUserId(@PathVariable int userId) {
        Progress userProgress = progressService.getUserProgressByUserId(userId);
        return ResponseEntity.ok(userProgress);
    }
}
