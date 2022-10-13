package dev.luan.demo.models.responses;

public class LockResponse {

    private String LockId;

    private String LockName;

    private String LockDescription;

    private String LockImageUrl;

    public LockResponse(){

    }

    public String getLockId()
    {
        return LockId;
    }

    public String getLockName()
    {
        return LockName;
    }

    public String getLockDescription()
    {
        return LockDescription;
    }

    public String getLockImageUrl()
    {
        return LockImageUrl;
    }

    public void setLockId(String lockId)
    {
        LockId = lockId;
    }

    public void setLockName(String lockName)
    {
        LockName = lockName;
    }

    public void setLockDescription(String lockDescription)
    {
        LockDescription = lockDescription;
    }

    public void setLockImageUrl(String lockImageUrl)
    {
        LockImageUrl = lockImageUrl;
    }

    @Override
    public String toString() {
        return "LockResponse{" +
                "LockId='" + LockId + '\'' +
                ", LockName='" + LockName + '\'' +
                ", LockDescription='" + LockDescription + '\'' +
                ", LockImageUrl='" + LockImageUrl + '\'' +
                '}';
    }
}
