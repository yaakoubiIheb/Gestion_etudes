package Models;

import Enumerations.StudentState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    private int id;
    private String first_name;
    private String last_name;
    private String personal_email;
    private String profesional_email;
    private String photo;
}
