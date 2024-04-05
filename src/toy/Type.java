package toy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {
    SCOOTER("Scooter"),
    BATMAN_CAR("Voiture de Batman"),
    OUI_OUI_CAR("Voiture de Oui-Oui"),
    TRUCK("Camion"),
    OUI_OUI_PLUSH("Peluche de Oui-Oui"),
    OBELIX_PLUSH("Peluche d'Obélix"),
    CAT_PLUSH("Peluche de chat"),
    LION_PLUSH("Peluche de lion");

    private final String name;
}
