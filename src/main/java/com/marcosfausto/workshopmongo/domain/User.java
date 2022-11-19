package com.marcosfausto.workshopmongo.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@JsonSerialize
public class User implements Serializable {

    private String id;
    private String nome;
    private String email;
}
