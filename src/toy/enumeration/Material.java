package toy.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Material {
    COTTON("Coton"),
    POLYESTER("Polyester"),
    ACRYLIC("Acrylique"),
    WOOL("Laine");

    private final String name;
}