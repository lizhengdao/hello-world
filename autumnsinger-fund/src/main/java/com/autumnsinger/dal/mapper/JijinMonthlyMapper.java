package com.autumnsinger.dal.mapper;

import com.autumnsinger.dal.model.JijinMonthly;
import com.autumnsinger.dal.model.JijinMonthlyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JijinMonthlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    long countByExample(JijinMonthlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int deleteByExample(JijinMonthlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int insert(JijinMonthly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int insertSelective(JijinMonthly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    List<JijinMonthly> selectByExample(JijinMonthlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    JijinMonthly selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") JijinMonthly record, @Param("example") JijinMonthlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int updateByExample(@Param("record") JijinMonthly record, @Param("example") JijinMonthlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int updateByPrimaryKeySelective(JijinMonthly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jijin_monthly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    int updateByPrimaryKey(JijinMonthly record);
}