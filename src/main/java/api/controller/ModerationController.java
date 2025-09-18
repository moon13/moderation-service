package api.controller;

import api.model.ModerationInput;
import api.model.ModerationOutput;
import domain.service.ModerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/moderate")
@RequiredArgsConstructor
public class ModerationController {

    //final List<String> immutableList = List.of("racismo", "xingamento", "ódio");

    private final ModerationService moderationService;

    @PostMapping
    public ModerationOutput moderate(@RequestBody ModerationInput request) {
        return moderationService.moderate(request);
    }

}
