package com.entity.vo;

import com.entity.PingfenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 评分
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("pingfen")
public class PingfenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 学年
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xuenian_time")
    private Date xuenianTime;


    /**
     * 学期
     */

    @TableField(value = "pingfen_types")
    private Integer pingfenTypes;


    /**
     * 学业成绩(60%)
     */

    @TableField(value = "xueye_fenshu")
    private Integer xueyeFenshu;


    /**
     * 道德品行(20%)
     */

    @TableField(value = "daode_fenshu")
    private Integer daodeFenshu;


    /**
     * 创新创业(10%)
     */

    @TableField(value = "chuangxin_fenshu")
    private Integer chuangxinFenshu;


    /**
     * 活动实践(10%)
     */

    @TableField(value = "huodong_fenshu")
    private Integer huodongFenshu;


    /**
     * 共计(100)
     */

    @TableField(value = "zong_fenshu")
    private Integer zongFenshu;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 最后修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：学年
	 */
    public Date getXuenianTime() {
        return xuenianTime;
    }


    /**
	 * 获取：学年
	 */

    public void setXuenianTime(Date xuenianTime) {
        this.xuenianTime = xuenianTime;
    }
    /**
	 * 设置：学期
	 */
    public Integer getPingfenTypes() {
        return pingfenTypes;
    }


    /**
	 * 获取：学期
	 */

    public void setPingfenTypes(Integer pingfenTypes) {
        this.pingfenTypes = pingfenTypes;
    }
    /**
	 * 设置：学业成绩(60%)
	 */
    public Integer getXueyeFenshu() {
        return xueyeFenshu;
    }


    /**
	 * 获取：学业成绩(60%)
	 */

    public void setXueyeFenshu(Integer xueyeFenshu) {
        this.xueyeFenshu = xueyeFenshu;
    }
    /**
	 * 设置：道德品行(20%)
	 */
    public Integer getDaodeFenshu() {
        return daodeFenshu;
    }


    /**
	 * 获取：道德品行(20%)
	 */

    public void setDaodeFenshu(Integer daodeFenshu) {
        this.daodeFenshu = daodeFenshu;
    }
    /**
	 * 设置：创新创业(10%)
	 */
    public Integer getChuangxinFenshu() {
        return chuangxinFenshu;
    }


    /**
	 * 获取：创新创业(10%)
	 */

    public void setChuangxinFenshu(Integer chuangxinFenshu) {
        this.chuangxinFenshu = chuangxinFenshu;
    }
    /**
	 * 设置：活动实践(10%)
	 */
    public Integer getHuodongFenshu() {
        return huodongFenshu;
    }


    /**
	 * 获取：活动实践(10%)
	 */

    public void setHuodongFenshu(Integer huodongFenshu) {
        this.huodongFenshu = huodongFenshu;
    }
    /**
	 * 设置：共计(100)
	 */
    public Integer getZongFenshu() {
        return zongFenshu;
    }


    /**
	 * 获取：共计(100)
	 */

    public void setZongFenshu(Integer zongFenshu) {
        this.zongFenshu = zongFenshu;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：最后修改时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：最后修改时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
