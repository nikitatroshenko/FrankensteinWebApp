package by.nikita.model;

import java.io.Serializable;

/**
 * Created by niat0717 on 7/20/2017.
 */
public class User implements Serializable {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
