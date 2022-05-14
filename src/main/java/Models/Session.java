package Models;

import Enumerations.SessionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    private int id;
    private LocalDate session_date;
    private String start_hour;
    private String finish_hour;
    private int classroom;
    private String goal;
    private String summary;
    private String tools;
    private SessionType type;
    private int group_id;
    private int subject_id;


}
