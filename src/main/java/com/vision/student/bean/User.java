package com.vision.student.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer status; // 0学生 1医生  2管理员
    private Integer flag;  //0 已审核，1未审核
    private String remake;
    private String JobNumber; //医生公号
    private String tokenId;
    private String fileNumber; //学生档案号
    private String creatTime;
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getJobNumber() {
        return JobNumber;
    }

    public void setJobNumber(String jobNumber) {
        JobNumber = jobNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", status=" + status +
                ", flag=" + flag +
                ", remake='" + remake + '\'' +
                ", JobNumber='" + JobNumber + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
