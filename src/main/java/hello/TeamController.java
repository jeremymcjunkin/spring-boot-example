package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.Teams;
import hello.TeamsRepository;

@RestController    // This means that this class is a Controller
public class TeamController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TeamsRepository teamRepository;

    @RequestMapping("/teams")
    public @ResponseBody Iterable<Teams> getAllTeams() {
        // This returns a JSON or XML with the users
        return teamRepository.findAll();
    }
}