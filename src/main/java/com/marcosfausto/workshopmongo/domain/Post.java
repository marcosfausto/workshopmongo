package com.marcosfausto.workshopmongo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document
public class Post {

    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private Date date;
    private String title;
    private String body;
    private User author;
}
