package builder.plush;

import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Color;
import toy.enumeration.Material;
import toy.enumeration.PlushType;
import toy.enumeration.Type;
import toy.plush.PersonPlush;

import java.util.List;

@Getter
@Setter
public class PersonPlushBuilder extends PlushBuilder {
    private Type plushType;
    private static PersonPlushBuilder instance;

    private PersonPlushBuilder() {
    }

    public static PersonPlushBuilder getInstance() {
        if (instance == null) {
            instance = new PersonPlushBuilder();
        }

        return instance;
    }

    @Override
    public void create() {
        plush = new PersonPlush();
        plush.setType(PlushType.PERSON);
    }

    @Override
    public void setHeight() {
        switch (getPlushType()) {
            case OBELIX_PLUSH -> plush.setSize(50);
            case OUI_OUI_PLUSH -> plush.setSize(30);
        }
    }

    @Override
    public void fill() {
        switch (getPlushType()) {
            case OBELIX_PLUSH -> plush.setMaterials(List.of(Material.COTTON, Material.POLYESTER));
            case OUI_OUI_PLUSH -> plush.setMaterials(List.of(Material.WOOL, Material.POLYESTER));
        }
    }

    @Override
    public void paint() {
        switch (getPlushType()) {
            case OBELIX_PLUSH -> plush.setColor(Color.WHITE);
            case OUI_OUI_PLUSH -> plush.setColor(Color.RED);
        }
    }
}
