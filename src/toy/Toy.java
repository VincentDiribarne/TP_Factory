package toy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import toy.enumeration.Color;

@Getter
@Setter
@ToString
public class Toy {
    private String name;
    private Color color;
}
