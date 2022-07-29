package vd;

import java.util.Locale;

public class CharacterTransformation {
    private String name;

    public CharacterTransformation() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String capitalizeFirstLetter(){
        return getName().toLowerCase(Locale.ROOT);
    }

}
