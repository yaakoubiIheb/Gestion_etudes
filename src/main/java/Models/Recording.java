package Models;

import Enumerations.RecordingType;

import java.time.LocalDate;

public class Recording {
    private int id;
    private String name;
    private String url;
    private String path;
    private RecordingType type;
    private String description;
    private LocalDate date;
    private int id_session;
}
