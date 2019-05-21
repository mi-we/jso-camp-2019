package com.zuehlke.jso.kickerbox.teams;

import javax.json.bind.annotation.JsonbCreator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Path("/teams")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeamsResource {

    @GET
    public Set<Team> getTeams() {
        Set<Team> teams = new HashSet<>();
        HashSet<Member> members = new HashSet<>();
        members.add(new Member("Frank"));
        members.add(new Member("Ken"));
        teams.add(new Team(42, "Overpowered Team", members));
        return teams;
    }

}