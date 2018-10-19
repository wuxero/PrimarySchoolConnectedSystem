package com.pscsw.dao;

import com.pscsw.po.StudentInfo;

public interface StudentInfoMapper {
	StudentInfo selectByAccount(String account);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int insert(StudentInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int insertSelective(StudentInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	StudentInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int updateByPrimaryKeySelective(StudentInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table student_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int updateByPrimaryKey(StudentInfo record);
}