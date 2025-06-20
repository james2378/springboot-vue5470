package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 评分
 *
 * @author 
 * @email
 */
@TableName("pingfen")
public class PingfenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PingfenEntity() {

	}

	public PingfenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 老师
     */
    @ColumnInfo(comment="老师",type="int(11)")
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 学年
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy")
	@DateTimeFormat
    @ColumnInfo(comment="学年",type="date")
    @TableField(value = "xuenian_time")

    private Date xuenianTime;


    /**
     * 学期
     */
    @ColumnInfo(comment="学期",type="int(11)")
    @TableField(value = "pingfen_types")

    private Integer pingfenTypes;


    /**
     * 学业成绩(60%)
     */
    @ColumnInfo(comment="学业成绩(60%)",type="int(11)")
    @TableField(value = "xueye_fenshu")

    private Integer xueyeFenshu;


    /**
     * 道德品行(20%)
     */
    @ColumnInfo(comment="道德品行(20%)",type="int(11)")
    @TableField(value = "daode_fenshu")

    private Integer daodeFenshu;


    /**
     * 创新创业(10%)
     */
    @ColumnInfo(comment="创新创业(10%)",type="int(11)")
    @TableField(value = "chuangxin_fenshu")

    private Integer chuangxinFenshu;


    /**
     * 活动实践(10%)
     */
    @ColumnInfo(comment="活动实践(10%)",type="int(11)")
    @TableField(value = "huodong_fenshu")

    private Integer huodongFenshu;


    /**
     * 共计(100)
     */
    @ColumnInfo(comment="共计(100)",type="int(11)")
    @TableField(value = "zong_fenshu")

    private Integer zongFenshu;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 最后修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="最后修改时间",type="timestamp")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Pingfen{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", laoshiId=" + laoshiId +
            ", xuenianTime=" + DateUtil.convertString(xuenianTime,"yyyy-MM-dd") +
            ", pingfenTypes=" + pingfenTypes +
            ", xueyeFenshu=" + xueyeFenshu +
            ", daodeFenshu=" + daodeFenshu +
            ", chuangxinFenshu=" + chuangxinFenshu +
            ", huodongFenshu=" + huodongFenshu +
            ", zongFenshu=" + zongFenshu +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
