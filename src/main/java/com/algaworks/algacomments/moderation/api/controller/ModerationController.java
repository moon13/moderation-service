package com.algaworks.algacomments.moderation.api.controller;

import com.algaworks.algacomments.moderation.api.model.ModerationInput;
import com.algaworks.algacomments.moderation.api.model.ModerationOutput;
import com.algaworks.algacomments.moderation.domain.service.ModerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ModerationController {

    //final List<String> immutableList = List.of("racismo", "xingamento", "ódio");

    private final ModerationService moderationService;

    @GetMapping
    public String hellowWorld(){
        return "Ola Mundo";

    }


    @PostMapping("/moderate")
    public ModerationOutput moderate(@RequestBody ModerationInput request) {
        return moderationService.moderate(request);
    }

}
