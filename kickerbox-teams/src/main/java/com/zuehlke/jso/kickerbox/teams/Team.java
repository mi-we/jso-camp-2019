package com.zuehlke.jso.kickerbox.teams;

import java.util.Objects;
import java.util.Set;

public class Team {

    private final long id;
    private final String name;
    private final Set<Member> members;

    public Team(long id, String name, Set<Member> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Member> getMembers() {
        return members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
