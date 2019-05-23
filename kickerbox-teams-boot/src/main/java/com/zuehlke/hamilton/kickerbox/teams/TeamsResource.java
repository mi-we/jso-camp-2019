package com.zuehlke.hamilton.kickerbox.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamsResource {

    private TeamsRepository teamsRepository;

    @Autowired
    public TeamsResource(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    @GetMapping
    public Iterable<Team> getTeams() {
        return teamsRepository.findAll();
    }

    @PostMapping
    public Team createTeam(@RequestBody  Team team) {
        return teamsRepository.save(team);
    }
}
