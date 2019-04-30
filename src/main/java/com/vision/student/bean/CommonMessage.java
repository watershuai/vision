package com.vision.student.bean;

import java.io.Serializable;

public class CommonMessage implements Serializable {
    private String id;
    private String studentName;
    private String phone;//手机号
    private String Gender;//性别
    private  String parentPhone;
    private String dateBirth;
    private String heigh;
    private String weight;
    private String province; //省
    private String city;//市
    private String county;//县/区
    private String school;
    private String bu;//部
    private String grade;//年纪
    private String classd;//班级
    private String rowRow ;//做第几排
    private String findPoorTime;//发现视力不佳时间
    private String workTime;//作业时间(h)
    private String sleepTime;//睡眠时间(h)
    private String watchTvTime;//看电视时间(h)
    private String computerTime;//用电脑时间(h)
    private String physicalExercise;//体育锻炼 0 无  1有
    private String partialEclipse;//偏食  0 无  1有
    private String inheritance;//遗传 0 无  1有
    private String eyeInjury;//眼伤 0 无  1有
    private String prematureDelivery;//早产 0 无  1有

    private String checkTime;//医生检查时间
    private String checkDoctor;
    private  String checkDoctorPhone;//检查医生的手机号
    private String leftVisionType; //视力类型
    private String leftNakedEye;  //裸眼视力
    private String leftdaijingEye;  //戴镜视力
    private String leftSanTongYanGuangQiu; //散瞳验光-球竟
    private String leftSanTongYanGuangZhu; // 散瞳验光 -主镜
    private String leftSanTongYanGuangZhou; // 散瞳验光-轴颈
    private String leftZhuJueYanGuangQiu; // 主教验光 -球
    private String leftZhuJueYanGuangZhu; // 主教验光-主
    private String leftZhuJueYanGuangZhou; // 主教验光 轴
    private String leftYanBuCheckJie; // 眼部检查-结膜
    private String leftYanBuCheckJiao; // 眼部检查-角膜
    private String leftEyeCheckDi; //眼部检查 眼底
    private String leftEyeCheckXian; // 眼部检查-显性
    private String leftEyeCheckYin; // 眼部检查 -隐形
    private String leftEyeCheckOther; // 眼部检查-其他
    private String rightVisionType; //视力类型
    private String rightNakedEye;  //裸眼视力
    private String rightdaijingEye;  //戴镜视力
    private String rightSanTongYanGuangQiu; //散瞳验光-球竟
    private String rightSanTongYanGuangZhu; // 散瞳验光 -主镜
    private String rightSanTongYanGuangZhou; // 散瞳验光-轴颈
    private String rightZhuJueYanGuangQiu; // 主教验光 -球
    private String rightZhuJueYanGuangZhu; // 主教验光-主
    private String rightZhuJueYanGuangZhou; // 主教验光 轴
    private String rightYanBuCheckJie; // 眼部检查-结膜
    private String rightYanBuCheckJiao; // 眼部检查-角膜
    private String rightEyeCheckDi; //眼部检查 眼底
    private String rightEyeCheckXian; // 眼部检查-显性
    private String rightEyeCheckYin; // 眼部检查 -隐形
    private String rightEyeCheckOther; // 眼部检查-其他
    private String creatTime;
    private String updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getHeigh() {
        return heigh;
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassd() {
        return classd;
    }

    public void setClassd(String classd) {
        this.classd = classd;
    }

    public String getRowRow() {
        return rowRow;
    }

    public void setRowRow(String rowRow) {
        this.rowRow = rowRow;
    }

    public String getFindPoorTime() {
        return findPoorTime;
    }

    public void setFindPoorTime(String findPoorTime) {
        this.findPoorTime = findPoorTime;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(String sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getWatchTvTime() {
        return watchTvTime;
    }

    public void setWatchTvTime(String watchTvTime) {
        this.watchTvTime = watchTvTime;
    }

    public String getComputerTime() {
        return computerTime;
    }

    public void setComputerTime(String computerTime) {
        this.computerTime = computerTime;
    }

    public String getPhysicalExercise() {
        return physicalExercise;
    }

    public void setPhysicalExercise(String physicalExercise) {
        this.physicalExercise = physicalExercise;
    }

    public String getPartialEclipse() {
        return partialEclipse;
    }

    public void setPartialEclipse(String partialEclipse) {
        this.partialEclipse = partialEclipse;
    }

    public String getInheritance() {
        return inheritance;
    }

    public void setInheritance(String inheritance) {
        this.inheritance = inheritance;
    }

    public String getEyeInjury() {
        return eyeInjury;
    }

    public void setEyeInjury(String eyeInjury) {
        this.eyeInjury = eyeInjury;
    }

    public String getPrematureDelivery() {
        return prematureDelivery;
    }

    public void setPrematureDelivery(String prematureDelivery) {
        this.prematureDelivery = prematureDelivery;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckDoctor() {
        return checkDoctor;
    }

    public void setCheckDoctor(String checkDoctor) {
        this.checkDoctor = checkDoctor;
    }

    public String getCheckDoctorPhone() {
        return checkDoctorPhone;
    }

    public void setCheckDoctorPhone(String checkDoctorPhone) {
        this.checkDoctorPhone = checkDoctorPhone;
    }

    public String getLeftVisionType() {
        return leftVisionType;
    }

    public void setLeftVisionType(String leftVisionType) {
        this.leftVisionType = leftVisionType;
    }

    public String getLeftNakedEye() {
        return leftNakedEye;
    }

    public void setLeftNakedEye(String leftNakedEye) {
        this.leftNakedEye = leftNakedEye;
    }

    public String getLeftdaijingEye() {
        return leftdaijingEye;
    }

    public void setLeftdaijingEye(String leftdaijingEye) {
        this.leftdaijingEye = leftdaijingEye;
    }

    public String getLeftSanTongYanGuangQiu() {
        return leftSanTongYanGuangQiu;
    }

    public void setLeftSanTongYanGuangQiu(String leftSanTongYanGuangQiu) {
        this.leftSanTongYanGuangQiu = leftSanTongYanGuangQiu;
    }

    public String getLeftSanTongYanGuangZhu() {
        return leftSanTongYanGuangZhu;
    }

    public void setLeftSanTongYanGuangZhu(String leftSanTongYanGuangZhu) {
        this.leftSanTongYanGuangZhu = leftSanTongYanGuangZhu;
    }

    public String getLeftSanTongYanGuangZhou() {
        return leftSanTongYanGuangZhou;
    }

    public void setLeftSanTongYanGuangZhou(String leftSanTongYanGuangZhou) {
        this.leftSanTongYanGuangZhou = leftSanTongYanGuangZhou;
    }

    public String getLeftZhuJueYanGuangQiu() {
        return leftZhuJueYanGuangQiu;
    }

    public void setLeftZhuJueYanGuangQiu(String leftZhuJueYanGuangQiu) {
        this.leftZhuJueYanGuangQiu = leftZhuJueYanGuangQiu;
    }

    public String getLeftZhuJueYanGuangZhu() {
        return leftZhuJueYanGuangZhu;
    }

    public void setLeftZhuJueYanGuangZhu(String leftZhuJueYanGuangZhu) {
        this.leftZhuJueYanGuangZhu = leftZhuJueYanGuangZhu;
    }

    public String getLeftZhuJueYanGuangZhou() {
        return leftZhuJueYanGuangZhou;
    }

    public void setLeftZhuJueYanGuangZhou(String leftZhuJueYanGuangZhou) {
        this.leftZhuJueYanGuangZhou = leftZhuJueYanGuangZhou;
    }

    public String getLeftYanBuCheckJie() {
        return leftYanBuCheckJie;
    }

    public void setLeftYanBuCheckJie(String leftYanBuCheckJie) {
        this.leftYanBuCheckJie = leftYanBuCheckJie;
    }

    public String getLeftYanBuCheckJiao() {
        return leftYanBuCheckJiao;
    }

    public void setLeftYanBuCheckJiao(String leftYanBuCheckJiao) {
        this.leftYanBuCheckJiao = leftYanBuCheckJiao;
    }

    public String getLeftEyeCheckDi() {
        return leftEyeCheckDi;
    }

    public void setLeftEyeCheckDi(String leftEyeCheckDi) {
        this.leftEyeCheckDi = leftEyeCheckDi;
    }

    public String getLeftEyeCheckXian() {
        return leftEyeCheckXian;
    }

    public void setLeftEyeCheckXian(String leftEyeCheckXian) {
        this.leftEyeCheckXian = leftEyeCheckXian;
    }

    public String getLeftEyeCheckYin() {
        return leftEyeCheckYin;
    }

    public void setLeftEyeCheckYin(String leftEyeCheckYin) {
        this.leftEyeCheckYin = leftEyeCheckYin;
    }

    public String getLeftEyeCheckOther() {
        return leftEyeCheckOther;
    }

    public void setLeftEyeCheckOther(String leftEyeCheckOther) {
        this.leftEyeCheckOther = leftEyeCheckOther;
    }

    public String getRightVisionType() {
        return rightVisionType;
    }

    public void setRightVisionType(String rightVisionType) {
        this.rightVisionType = rightVisionType;
    }

    public String getRightNakedEye() {
        return rightNakedEye;
    }

    public void setRightNakedEye(String rightNakedEye) {
        this.rightNakedEye = rightNakedEye;
    }

    public String getRightdaijingEye() {
        return rightdaijingEye;
    }

    public void setRightdaijingEye(String rightdaijingEye) {
        this.rightdaijingEye = rightdaijingEye;
    }

    public String getRightSanTongYanGuangQiu() {
        return rightSanTongYanGuangQiu;
    }

    public void setRightSanTongYanGuangQiu(String rightSanTongYanGuangQiu) {
        this.rightSanTongYanGuangQiu = rightSanTongYanGuangQiu;
    }

    public String getRightSanTongYanGuangZhu() {
        return rightSanTongYanGuangZhu;
    }

    public void setRightSanTongYanGuangZhu(String rightSanTongYanGuangZhu) {
        this.rightSanTongYanGuangZhu = rightSanTongYanGuangZhu;
    }

    public String getRightSanTongYanGuangZhou() {
        return rightSanTongYanGuangZhou;
    }

    public void setRightSanTongYanGuangZhou(String rightSanTongYanGuangZhou) {
        this.rightSanTongYanGuangZhou = rightSanTongYanGuangZhou;
    }

    public String getRightZhuJueYanGuangQiu() {
        return rightZhuJueYanGuangQiu;
    }

    public void setRightZhuJueYanGuangQiu(String rightZhuJueYanGuangQiu) {
        this.rightZhuJueYanGuangQiu = rightZhuJueYanGuangQiu;
    }

    public String getRightZhuJueYanGuangZhu() {
        return rightZhuJueYanGuangZhu;
    }

    public void setRightZhuJueYanGuangZhu(String rightZhuJueYanGuangZhu) {
        this.rightZhuJueYanGuangZhu = rightZhuJueYanGuangZhu;
    }

    public String getRightZhuJueYanGuangZhou() {
        return rightZhuJueYanGuangZhou;
    }

    public void setRightZhuJueYanGuangZhou(String rightZhuJueYanGuangZhou) {
        this.rightZhuJueYanGuangZhou = rightZhuJueYanGuangZhou;
    }

    public String getRightYanBuCheckJie() {
        return rightYanBuCheckJie;
    }

    public void setRightYanBuCheckJie(String rightYanBuCheckJie) {
        this.rightYanBuCheckJie = rightYanBuCheckJie;
    }

    public String getRightYanBuCheckJiao() {
        return rightYanBuCheckJiao;
    }

    public void setRightYanBuCheckJiao(String rightYanBuCheckJiao) {
        this.rightYanBuCheckJiao = rightYanBuCheckJiao;
    }

    public String getRightEyeCheckDi() {
        return rightEyeCheckDi;
    }

    public void setRightEyeCheckDi(String rightEyeCheckDi) {
        this.rightEyeCheckDi = rightEyeCheckDi;
    }

    public String getRightEyeCheckXian() {
        return rightEyeCheckXian;
    }

    public void setRightEyeCheckXian(String rightEyeCheckXian) {
        this.rightEyeCheckXian = rightEyeCheckXian;
    }

    public String getRightEyeCheckYin() {
        return rightEyeCheckYin;
    }

    public void setRightEyeCheckYin(String rightEyeCheckYin) {
        this.rightEyeCheckYin = rightEyeCheckYin;
    }

    public String getRightEyeCheckOther() {
        return rightEyeCheckOther;
    }

    public void setRightEyeCheckOther(String rightEyeCheckOther) {
        this.rightEyeCheckOther = rightEyeCheckOther;
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
        return "CommonMessage{" +
                "id='" + id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", phone='" + phone + '\'' +
                ", Gender='" + Gender + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", heigh='" + heigh + '\'' +
                ", weight='" + weight + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", school='" + school + '\'' +
                ", bu='" + bu + '\'' +
                ", grade='" + grade + '\'' +
                ", classd='" + classd + '\'' +
                ", rowRow='" + rowRow + '\'' +
                ", findPoorTime='" + findPoorTime + '\'' +
                ", workTime='" + workTime + '\'' +
                ", sleepTime='" + sleepTime + '\'' +
                ", watchTvTime='" + watchTvTime + '\'' +
                ", computerTime='" + computerTime + '\'' +
                ", physicalExercise='" + physicalExercise + '\'' +
                ", partialEclipse='" + partialEclipse + '\'' +
                ", inheritance='" + inheritance + '\'' +
                ", eyeInjury='" + eyeInjury + '\'' +
                ", prematureDelivery='" + prematureDelivery + '\'' +
                ", checkTime='" + checkTime + '\'' +
                ", checkDoctor='" + checkDoctor + '\'' +
                ", checkDoctorPhone='" + checkDoctorPhone + '\'' +
                ", leftVisionType='" + leftVisionType + '\'' +
                ", leftNakedEye='" + leftNakedEye + '\'' +
                ", leftdaijingEye='" + leftdaijingEye + '\'' +
                ", leftSanTongYanGuangQiu='" + leftSanTongYanGuangQiu + '\'' +
                ", leftSanTongYanGuangZhu='" + leftSanTongYanGuangZhu + '\'' +
                ", leftSanTongYanGuangZhou='" + leftSanTongYanGuangZhou + '\'' +
                ", leftZhuJueYanGuangQiu='" + leftZhuJueYanGuangQiu + '\'' +
                ", leftZhuJueYanGuangZhu='" + leftZhuJueYanGuangZhu + '\'' +
                ", leftZhuJueYanGuangZhou='" + leftZhuJueYanGuangZhou + '\'' +
                ", leftYanBuCheckJie='" + leftYanBuCheckJie + '\'' +
                ", leftYanBuCheckJiao='" + leftYanBuCheckJiao + '\'' +
                ", leftEyeCheckDi='" + leftEyeCheckDi + '\'' +
                ", leftEyeCheckXian='" + leftEyeCheckXian + '\'' +
                ", leftEyeCheckYin='" + leftEyeCheckYin + '\'' +
                ", leftEyeCheckOther='" + leftEyeCheckOther + '\'' +
                ", rightVisionType='" + rightVisionType + '\'' +
                ", rightNakedEye='" + rightNakedEye + '\'' +
                ", rightdaijingEye='" + rightdaijingEye + '\'' +
                ", rightSanTongYanGuangQiu='" + rightSanTongYanGuangQiu + '\'' +
                ", rightSanTongYanGuangZhu='" + rightSanTongYanGuangZhu + '\'' +
                ", rightSanTongYanGuangZhou='" + rightSanTongYanGuangZhou + '\'' +
                ", rightZhuJueYanGuangQiu='" + rightZhuJueYanGuangQiu + '\'' +
                ", rightZhuJueYanGuangZhu='" + rightZhuJueYanGuangZhu + '\'' +
                ", rightZhuJueYanGuangZhou='" + rightZhuJueYanGuangZhou + '\'' +
                ", rightYanBuCheckJie='" + rightYanBuCheckJie + '\'' +
                ", rightYanBuCheckJiao='" + rightYanBuCheckJiao + '\'' +
                ", rightEyeCheckDi='" + rightEyeCheckDi + '\'' +
                ", rightEyeCheckXian='" + rightEyeCheckXian + '\'' +
                ", rightEyeCheckYin='" + rightEyeCheckYin + '\'' +
                ", rightEyeCheckOther='" + rightEyeCheckOther + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
