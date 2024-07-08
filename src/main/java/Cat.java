import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

public class Cat {
    private String nameCat;
    public Cat() {
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }
}
