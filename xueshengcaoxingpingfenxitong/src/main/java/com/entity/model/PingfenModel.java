package com.entity.model;

import com.entity.PingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 评分
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PingfenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 学年
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xuenianTime;


    /**
     * 学期
     */
    private Integer pingfenTypes;


    /**
     * 学业成绩(60%)
     */
    private Integer xueyeFenshu;


    /**
     * 道德品行(20%)
     */
    private Integer daodeFenshu;


    /**
     * 创新创业(10%)
     */
    private Integer chuangxinFenshu;


    /**
     * 活动实践(10%)
     */
    private Integer huodongFenshu;


    /**
     * 共计(100)
     */
    private Integer zongFenshu;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 最后修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：学年
	 */
    public Date getXuenianTime() {
        return xuenianTime;
    }


    /**
	 * 设置：学年
	 */
    public void setXuenianTime(Date xuenianTime) {
        this.xuenianTime = xuenianTime;
    }
    /**
	 * 获取：学期
	 */
    public Integer getPingfenTypes() {
        return pingfenTypes;
    }


    /**
	 * 设置：学期
	 */
    public void setPingfenTypes(Integer pingfenTypes) {
        this.pingfenTypes = pingfenTypes;
    }
    /**
	 * 获取：学业成绩(60%)
	 */
    public Integer getXueyeFenshu() {
        return xueyeFenshu;
    }


    /**
	 * 设置：学业成绩(60%)
	 */
    public void setXueyeFenshu(Integer xueyeFenshu) {
        this.xueyeFenshu = xueyeFenshu;
    }
    /**
	 * 获取：道德品行(20%)
	 */
    public Integer getDaodeFenshu() {
        return daodeFenshu;
    }


    /**
	 * 设置：道德品行(20%)
	 */
    public void setDaodeFenshu(Integer daodeFenshu) {
        this.daodeFenshu = daodeFenshu;
    }
    /**
	 * 获取：创新创业(10%)
	 */
    public Integer getChuangxinFenshu() {
        return chuangxinFenshu;
    }


    /**
	 * 设置：创新创业(10%)
	 */
    public void setChuangxinFenshu(Integer chuangxinFenshu) {
        this.chuangxinFenshu = chuangxinFenshu;
    }
    /**
	 * 获取：活动实践(10%)
	 */
    public Integer getHuodongFenshu() {
        return huodongFenshu;
    }


    /**
	 * 设置：活动实践(10%)
	 */
    public void setHuodongFenshu(Integer huodongFenshu) {
        this.huodongFenshu = huodongFenshu;
    }
    /**
	 * 获取：共计(100)
	 */
    public Integer getZongFenshu() {
        return zongFenshu;
    }


    /**
	 * 设置：共计(100)
	 */
    public void setZongFenshu(Integer zongFenshu) {
        this.zongFenshu = zongFenshu;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：最后修改时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：最后修改时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
