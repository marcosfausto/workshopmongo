package com.marcosfausto.workshopmongo.dto;

import com.marcosfausto.workshopmongo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO {

    private String id;
    private String name;

    public AuthorDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
    }

}
