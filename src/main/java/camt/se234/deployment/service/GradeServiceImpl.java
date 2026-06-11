package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;
// Added for DeepSource scan
@Service
public class GradeServiceImpl implements GradeService {

    @Override
    public String getGrade(double score) {
        // add a new rule
        if (score > 90.0) {
            return "A+";
        } else if (score > 80.0) {
            return "A";
        } else if (score > 70.0) {
            return "B";
        } else if (score > 60.0) {
            return "C";
        } else {
            return "F";
        }
    }
}