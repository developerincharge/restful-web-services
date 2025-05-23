package com.rizvi.rest.webservices.restful_web_services.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 10, message = "Description should have at least 10 characters")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Post() {}

    public Post(Integer id, String description) {
        this.id = id;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
