package kr.ac.kopo.midtermproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class Notice extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private User writer;
}