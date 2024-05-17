package builder;

import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Type;

@Getter
@Setter
public abstract class GlobalBuilder implements Constructable {
    private Type type;
}
