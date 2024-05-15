package builder.plush;

import builder.Constructable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Type;
import toy.plush.Plush;

@Getter
@Setter
public abstract class PlushBuilder implements Constructable {
    private Type plushType;

    @Setter(AccessLevel.NONE)
    protected Plush plush;

    public abstract void setHeight();

    public abstract void fill();

    public void setName() {
        plush.setName(plushType.getName());
    }
}
