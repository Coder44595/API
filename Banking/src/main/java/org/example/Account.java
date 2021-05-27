package org.example;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Account {
    @Length(min=4, max=43)
    private String name;
    @Size(min=5, max=40)
    private String mus;

    public String getName() {
        return name;
    }

    public String getMus() {
        return mus;
    }

    public Number getId() { return id;
    }

   @Min(5)
   private Number id;

    }

