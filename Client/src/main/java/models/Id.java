package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * POJO for an Id object
 */
public class Id {
    private String userid = "";
    private String name = "";
    private String github = "";

    @JsonCreator
    public Id(@JsonProperty("userid") String userId,
              @JsonProperty("name") String name,
              @JsonProperty("github") String github){
        this.userid = userId;
        this.name = name;
        this.github = github;
    }

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getGithub() {
        return github;
    }

    // Setters
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGithub(String github) {
        this.github = github;
    }
    public void setIdtoRegister(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Github(" + this.github + ") ";
    }
}