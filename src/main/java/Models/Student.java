package Models;

import Enumerations.StudentState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private StudentState state;
    private LocalDate birthdate;
    private String photo;
    private int id_group;

}
