package toy.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PlushType {
    PERSON("Personne"),
    ANIMAL("Animal");

    private final String name;
}
