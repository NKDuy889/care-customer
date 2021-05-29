package com.example.demo.DTO;


public class TicketDTO {
    private String id;
    private String ticketId;
    private String phoneNumber;
    private String opinionCustomer;
    private String receptionTime;
    private String answerCustomer;
    private String status;
    private String processingTime;
    private String idDepartment;


    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOpinionCustomer() {
        return opinionCustomer;
    }

    public void setOpinionCustomer(String opinionCustomer) {
        this.opinionCustomer = opinionCustomer;
    }

    public String getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(String receptionTime) {
        this.receptionTime = receptionTime;
    }

    public String getAnswerCustomer() {
        return answerCustomer;
    }

    public void setAnswerCustomer(String answerCustomer) {
        this.answerCustomer = answerCustomer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }
}
