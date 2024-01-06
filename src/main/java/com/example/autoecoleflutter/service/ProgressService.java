package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.Progress;
import com.example.autoecoleflutter.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    @Autowired
    private ProgressRepository progressRepository;

    public Progress findById(int id_progress) {
        return progressRepository.findById(id_progress).orElse(null);
    }

    public List<Progress> getAllProgress() {
        return progressRepository.findAll();
    }

    public Progress createProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public Progress updateProgress(int id_progress, Progress progress) {
        if (progressRepository.existsById(id_progress)) {
            progress.setId_progress(id_progress);
            return progressRepository.save(progress);
        }
        return null; // Handle non-existing progress
    }

    public void deleteProgress(int id_progress) {
        progressRepository.deleteById(id_progress);
    }

    public Progress getUserProgressByUserId(int id_user) {
        return progressRepository.findByUserId(id_user).orElse(null);
    }
}