package ru.nirs.nirs_registaration.model;

public class Application {

    private Long mId;
    private String mTitle;
    private String mTheses;
    private ApplicationStatus mStatus;


    // -------------------------- Создание объекта --------------------------

    public Application(Long id, String title, String theses, ApplicationStatus status) {
        mId = id;
        mTitle = title;
        mTheses = theses;
        mStatus = status;
    }


    // -------------------------- Геттеры --------------------------

    public Long getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTheses() {
        return mTheses;
    }

    public ApplicationStatus getStatus() {
        return mStatus;
    }

    public String getStatusString() {
        return mStatus.toString();
    }


    // -------------------------- Сеттеры --------------------------

    public void setId(Long id) {
        mId = id;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTheses(String theses) {
        mTheses = theses;
    }

    public void setStatus(ApplicationStatus status) {
        mStatus = status;
    }
}
