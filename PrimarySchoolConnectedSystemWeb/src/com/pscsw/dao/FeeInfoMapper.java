package com.pscsw.dao;

import com.pscsw.po.ClassInfo;
import com.pscsw.po.FeeInfo;

public interface FeeInfoMapper {
	FeeInfo[] selectByClass(String class_name);

	FeeInfo[] selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int insert(FeeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int insertSelective(FeeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	FeeInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int updateByPrimaryKeySelective(FeeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table fee_info
	 *
	 * @mbg.generated Sun Oct 07 22:22:17 CST 2018
	 */
	int updateByPrimaryKey(FeeInfo record);
}