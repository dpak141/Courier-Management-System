package com.css.bll;



public class Feedback {

    private String feedbackID;
    private String username;
    private String email;
    private String message;

    public Feedback(String feedbackID, String username, String email, String message) {
        this.feedbackID = feedbackID;
        this.username = username;
        this.email = email;
        this.message = message;

    }
    public Feedback() {
    }

    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
}
