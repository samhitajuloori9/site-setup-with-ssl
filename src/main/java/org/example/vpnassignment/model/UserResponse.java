package org.example.vpnassignment.model;

public class UserResponse {
    private String message;
    private String author;

    public UserResponse(String user){
        this.message="Welcome "+user;
        this.author="Samhita Juloori";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
