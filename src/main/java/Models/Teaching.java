package Models;

import Enumerations.TeachingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teaching {
    private int id;
    private int teacher_id;
    private int subject_id;
    private TeachingType type;
    private int nbr_hours;
}
