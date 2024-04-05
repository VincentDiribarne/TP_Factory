package toy.vehicule;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Motor {
    DIESEL("Diesel"),
    ELECTRIC("Electrique"),
    GASOLINE("Essence");

    private final String name;
}
