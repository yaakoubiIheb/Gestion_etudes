package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Homework {
    private int id;
    private String title;
    private LocalDate starting_date;
    private LocalDate deadline;
    private String nature;
    private String description;
    private String file;
    private int student_id;
    private int subject_id;
    private int group_id;

}
