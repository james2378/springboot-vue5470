package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GonggaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 公告
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("gonggao")
public class GonggaoView extends GonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 班级的值
	*/
	@ColumnInfo(comment="班级的字典表值",type="varchar(200)")
	private String banjiValue;
	/**
	* 公告类型的值
	*/
	@ColumnInfo(comment="公告类型的字典表值",type="varchar(200)")
	private String gonggaoValue;

	//级联表 老师
		/**
		* 老师唯一编号
		*/

		@ColumnInfo(comment="老师唯一编号",type="varchar(200)")
		private String laoshiUuidNumber;
		/**
		* 老师姓名
		*/

		@ColumnInfo(comment="老师姓名",type="varchar(200)")
		private String laoshiName;
		/**
		* 老师手机号
		*/

		@ColumnInfo(comment="老师手机号",type="varchar(200)")
		private String laoshiPhone;
		/**
		* 老师身份证号
		*/

		@ColumnInfo(comment="老师身份证号",type="varchar(200)")
		private String laoshiIdNumber;
		/**
		* 老师头像
		*/

		@ColumnInfo(comment="老师头像",type="varchar(200)")
		private String laoshiPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String laoshiEmail;
		/**
		* 家庭住址
		*/

		@ColumnInfo(comment="家庭住址",type="varchar(200)")
		private String laoshiAddress;



	public GonggaoView() {

	}

	public GonggaoView(GonggaoEntity gonggaoEntity) {
		try {
			BeanUtils.copyProperties(this, gonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 班级的值
	*/
	public String getBanjiValue() {
		return banjiValue;
	}
	/**
	* 设置： 班级的值
	*/
	public void setBanjiValue(String banjiValue) {
		this.banjiValue = banjiValue;
	}
	//当前表的
	/**
	* 获取： 公告类型的值
	*/
	public String getGonggaoValue() {
		return gonggaoValue;
	}
	/**
	* 设置： 公告类型的值
	*/
	public void setGonggaoValue(String gonggaoValue) {
		this.gonggaoValue = gonggaoValue;
	}


	//级联表的get和set 老师

		/**
		* 获取： 老师唯一编号
		*/
		public String getLaoshiUuidNumber() {
			return laoshiUuidNumber;
		}
		/**
		* 设置： 老师唯一编号
		*/
		public void setLaoshiUuidNumber(String laoshiUuidNumber) {
			this.laoshiUuidNumber = laoshiUuidNumber;
		}

		/**
		* 获取： 老师姓名
		*/
		public String getLaoshiName() {
			return laoshiName;
		}
		/**
		* 设置： 老师姓名
		*/
		public void setLaoshiName(String laoshiName) {
			this.laoshiName = laoshiName;
		}

		/**
		* 获取： 老师手机号
		*/
		public String getLaoshiPhone() {
			return laoshiPhone;
		}
		/**
		* 设置： 老师手机号
		*/
		public void setLaoshiPhone(String laoshiPhone) {
			this.laoshiPhone = laoshiPhone;
		}

		/**
		* 获取： 老师身份证号
		*/
		public String getLaoshiIdNumber() {
			return laoshiIdNumber;
		}
		/**
		* 设置： 老师身份证号
		*/
		public void setLaoshiIdNumber(String laoshiIdNumber) {
			this.laoshiIdNumber = laoshiIdNumber;
		}

		/**
		* 获取： 老师头像
		*/
		public String getLaoshiPhoto() {
			return laoshiPhoto;
		}
		/**
		* 设置： 老师头像
		*/
		public void setLaoshiPhoto(String laoshiPhoto) {
			this.laoshiPhoto = laoshiPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getLaoshiEmail() {
			return laoshiEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setLaoshiEmail(String laoshiEmail) {
			this.laoshiEmail = laoshiEmail;
		}

		/**
		* 获取： 家庭住址
		*/
		public String getLaoshiAddress() {
			return laoshiAddress;
		}
		/**
		* 设置： 家庭住址
		*/
		public void setLaoshiAddress(String laoshiAddress) {
			this.laoshiAddress = laoshiAddress;
		}


	@Override
	public String toString() {
		return "GonggaoView{" +
			", banjiValue=" + banjiValue +
			", gonggaoValue=" + gonggaoValue +
			", laoshiUuidNumber=" + laoshiUuidNumber +
			", laoshiName=" + laoshiName +
			", laoshiPhone=" + laoshiPhone +
			", laoshiIdNumber=" + laoshiIdNumber +
			", laoshiPhoto=" + laoshiPhoto +
			", laoshiEmail=" + laoshiEmail +
			", laoshiAddress=" + laoshiAddress +
			"} " + super.toString();
	}
}
