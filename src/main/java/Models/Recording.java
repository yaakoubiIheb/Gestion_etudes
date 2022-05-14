package Models;

import Enumerations.RecordingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recording {
    private int id;
    private String name;
    private String url;
    private String path;
    private RecordingType type;
    private String description;
    private LocalDate recording_date;
    private int session_id;
}
