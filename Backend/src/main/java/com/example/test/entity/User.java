package com.example.test.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "User")
public class User {
    @Id
    int id;

    LocalDateTime StartTiming;
    LocalDateTime EndTiming;
    LocalDateTime BreakStart;
    LocalDateTime BreakEnd;
    LocalDateTime LunchStart;
    LocalDateTime LunchEnd;

    public User(int id, LocalDateTime startTiming, LocalDateTime endTiming, LocalDateTime breakStart, LocalDateTime breakEnd, LocalDateTime lunchStart, LocalDateTime lunchEnd) {
        this.id = id;
        StartTiming = startTiming;
        EndTiming = endTiming;
        BreakStart = breakStart;
        BreakEnd = breakEnd;
        LunchStart = lunchStart;
        LunchEnd = lunchEnd;
    }
}
