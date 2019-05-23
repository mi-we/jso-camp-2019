package com.zuehlke.hamilton.kickerbox.teams;


import javax.persistence.Embeddable;

@Embeddable
public class Member {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
