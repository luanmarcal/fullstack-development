package dev.luan.demo.models.requests;

public class LockRequest {

    private String LockName;

    private String LockDescription;

    private String LockImageUrl;

    public LockRequest(){
    }

    public String getLockName() { return LockName; }

    public String getLockDescription() { return LockDescription; }

    public String getLockImageUrl() { return LockImageUrl; }

    @Override
    public String toString() {
        return "LockRequest{" +
                "LockName='" + LockName + '\'' +
                ", LockDescription='" + LockDescription + '\'' +
                ", LockImageUrl='" + LockImageUrl + '\'' +
                '}';
    }

}
