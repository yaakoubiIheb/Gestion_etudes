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
    private LocalDate date;
    private int start_hour;
    private int finish_hour;
    private int classroom;
    private String goal;
    private String summary;
    private String tools;
    private SessionType type;


}
