package com.pscsw.dao;

import com.pscsw.po.User;

public interface UserMapper {
	User selectByAccount(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated Sun Oct 07 18:16:23 CST 2018
	 */
	int updateByPrimaryKey(User record);
}