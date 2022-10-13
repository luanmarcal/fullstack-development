package dev.luan.demo.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Lock {

    @Id
    private String Id;

    private String LockId;

    private String LockName;

    private String LockDescription;

    private String LockImageUrl;

    private Date creationDate = new Date();

    public Lock(){

    }

    /*  GETTERS AND SETTERS */

    public String getId() {
        return Id;
    }

    public String getLockId() {
        return LockId;
    }

    public String getLockName() {
        return LockName;
    }

    public String getLockDescription() {
        return LockDescription;
    }

    public String getLockImageUrl() {
        return LockImageUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }


    public void setId(String id) {
        Id = id;
    }

    public void setLockId(String lockId) {
        LockId = lockId;
    }

    public void setLockName(String lockName) {
        LockName = lockName;
    }

    public void setLockDescription(String lockDescription) {
        LockDescription = lockDescription;
    }

    public void setLockImageUrl(String lockImageUrl) {
        LockImageUrl = lockImageUrl;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
