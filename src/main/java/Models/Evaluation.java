package Models;

import Enumerations.HomeworkType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation {
    private int id;
    private float mark;
    private String comment;
    private String file;
    private HomeworkType state;
    private int student_id;
    private int homework_id;
}
