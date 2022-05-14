package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Absence {
    private int id;
    private LocalDate date;
    private String purpose;
    private boolean permission;
    private int id_student;
    private int id_session;
}
