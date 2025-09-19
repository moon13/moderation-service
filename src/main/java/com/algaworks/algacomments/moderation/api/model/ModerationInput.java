package com.algaworks.algacomments.moderation.api.model;


import lombok.Data;

import java.util.UUID;

@Data
public class ModerationInput {

    private String text;
    private UUID commentId;


}
