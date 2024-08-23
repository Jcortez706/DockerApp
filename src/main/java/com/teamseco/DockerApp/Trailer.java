package com.teamseco.DockerApp;

public class Trailer {
    private Integer id;
    private Integer trailerNumber;
    private String trailerCompany;
    public Trailer(){}


    public Integer getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(Integer trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public String getTrailerCompany() {
        return trailerCompany;
    }

    public void setTrailerCompany(String trailerCompany) {
        this.trailerCompany = trailerCompany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
