package toy.vehicule;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Motor {
    DIESEL("Diesel", "Diesel"),
    ELECTRIC("Electrique", "Electric"),
    GASOLINE("Essence", "Gasoline");

    private final String frenchName;
    private final String englishName;
}
