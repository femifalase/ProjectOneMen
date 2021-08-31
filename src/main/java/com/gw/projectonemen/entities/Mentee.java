package com.gw.projectonemen.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "MENTEES")
public class Mentee {
    @Id
    private Long menteeId;
    @ManyToOne
    @JoinColumn(name ="MENTOR_ID")
    private Mentor mentor;
    @Column(name = "MENTORSHIP_START_DATE")
    private LocalDate mentorshipStartDate;
    @Column(name = "MENTORSHIP_END_DATE")
    private LocalDate mentorshipEndDate;


}
