package ru.nirs.nirs_registaration.model;

public enum ApplicationStatus {
    DRAFT,
    UNDER_REVIEW,
    APPROVED,
    REJECTED,
    DELETED;

    @Override
    public String toString() {
        return switch (this) {
            case DRAFT -> "DRAFT";
            case UNDER_REVIEW -> "UNDER_REVIEW";
            case APPROVED -> "APPROVED";
            case REJECTED -> "REJECTED";
            case DELETED -> "DELETED";
        };
    }
}
