package bonusexercises.mashupmadness;

import java.util.List;

public class PopStar implements Singer, Dancer{
    @Override
    public String perform() {
            return Singer.super.perform();
    }
}
