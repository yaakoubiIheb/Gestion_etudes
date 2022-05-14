package Models;

import Enumerations.SubjectType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private int id;
    private String name;
    private SubjectType type;
    private String level;
}
