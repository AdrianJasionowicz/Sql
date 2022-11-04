package pl.twojstary.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    private SoczekRepository soczekRepository;

    @GetMapping("/soczki")
    public List<Soczek> getSoczki() {
        return soczekRepository.findAll();
    }

    @GetMapping("/firmy")
    public String getSoc2zki() {
        return "asd";
    }
}
