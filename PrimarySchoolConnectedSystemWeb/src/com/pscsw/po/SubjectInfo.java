package com.pscsw.po;

import java.util.Date;

public class SubjectInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.id
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.state
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.subject_number
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private String subjectNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.subject_name
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private String subjectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.subject_class
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private String subjectClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.subject_teacher
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private String subjectTeacher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_info.create_time
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.id
     *
     * @return the value of subject_info.id
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.id
     *
     * @param id the value for subject_info.id
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.state
     *
     * @return the value of subject_info.state
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.state
     *
     * @param state the value for subject_info.state
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.subject_number
     *
     * @return the value of subject_info.subject_number
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public String getSubjectNumber() {
        return subjectNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.subject_number
     *
     * @param subjectNumber the value for subject_info.subject_number
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber == null ? null : subjectNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.subject_name
     *
     * @return the value of subject_info.subject_name
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.subject_name
     *
     * @param subjectName the value for subject_info.subject_name
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.subject_class
     *
     * @return the value of subject_info.subject_class
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public String getSubjectClass() {
        return subjectClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.subject_class
     *
     * @param subjectClass the value for subject_info.subject_class
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setSubjectClass(String subjectClass) {
        this.subjectClass = subjectClass == null ? null : subjectClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.subject_teacher
     *
     * @return the value of subject_info.subject_teacher
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.subject_teacher
     *
     * @param subjectTeacher the value for subject_info.subject_teacher
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher == null ? null : subjectTeacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_info.create_time
     *
     * @return the value of subject_info.create_time
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_info.create_time
     *
     * @param createTime the value for subject_info.create_time
     *
     * @mbg.generated Sun Oct 07 18:16:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}