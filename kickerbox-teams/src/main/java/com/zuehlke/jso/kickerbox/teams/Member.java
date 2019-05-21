package com.zuehlke.jso.kickerbox.teams;

import java.util.Objects;

public class Member {

    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return name.equals(member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
