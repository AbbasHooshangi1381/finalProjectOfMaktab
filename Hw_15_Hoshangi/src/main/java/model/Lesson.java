package model;

import base.model.BaseEntity;
import enumuration.LessonStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "lesson")
@Entity
public class Lesson extends BaseEntity<Integer> {

    private String lessonName;

    private Integer UnitCount;

    private String field;

    private Integer grade;

    @Enumerated(value = EnumType.STRING)
    LessonStatus lessonStatus;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany
    @JoinColumn(name = "selectedlesson_id")
    List<SelectedLesson> selectedLessonList;

}