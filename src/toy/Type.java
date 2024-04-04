package toy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {
    SCOOTER("Scooter", "Scooter"),
    BATMAN_CAR("Voiture de Batman", "Batman's car"),
    OUI_OUI_CAR("Voiture de Oui-Oui", "Oui-Oui's car"),
    TRUCK("Camion", "Truck"),
    OUI_OUI_PLUSH("Peluche de Oui-Oui", "Oui-Oui's plush"),
    OBELIX_PLUSH("Peluche d'Obélix", "Obelix's plush"),
    CAT_PLUSH("Peluche de chat", "Cat's plush"),
    LION_PLUSH("Peluche de lion", "Lion's plush");

    private final String frenchName;
    private final String englishName;
}
