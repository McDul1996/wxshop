package com.kongmu373.wxshop.generated;

import com.kongmu373.wxshop.generated.Goods;
import com.kongmu373.wxshop.generated.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    Goods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Wed Jul 01 18:38:42 CST 2020
     */
    int updateByPrimaryKey(Goods record);
}