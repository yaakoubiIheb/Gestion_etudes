package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    private int id;
    private String name;
    private int nbr_students;
    private String email;
    private String level;
}
