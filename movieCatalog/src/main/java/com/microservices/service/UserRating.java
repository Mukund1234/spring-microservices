package com.microservices.service;

import com.microservices.dto.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRating {
    private List<Rating> userRating;

    public List<Rating> getUserRating() { return userRating; }

    public void setUserRating(List<Rating> userRating) { this.userRating = userRating; }
}
