package com.hyc.ssh.user.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户
 * @author yecai
 * @date 2018-01-03
 */
@Entity
@Table(name="sys_user")
public class User implements Serializable{
  

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 用户id（登录表用）
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	/**
     * 姓氏
     */
	@Column(name="name")
    private String name;
 
    /**
     * 企业id(租户)
     */
	@Column(name="enterprise_id")
    private String enterpriseId;

    /**
     * 归属部门
     */
	@Column(name="organization_id")
    private String organizationId;


    /**
     * 显示手机
     */
	@Column(name="mobile")
    private String mobile;

    /**
     * 用户头像
     */
	@Column(name="photo")
    private String photo;

    /**
     * 性别
     */
	@Column(name="sex")
    private String sex;

    /**
     * 邮箱
     */
	@Column(name="email")
    private String email;

    /**
     * 微信账号
     */
	@Column(name="weixin")
    private String weixin;

    /**
     * qq账号
     */
	@Column(name="qq")
    private String qq;

    /**
     * 办公地址
     */
	@Column(name="office_address")
    private String officeAddress;

    /**
     * 职位
     */
	@Column(name="job")
    private String job;

    /**
     * 工号
     */
	@Column(name="job_number")
    private String jobNumber;

    /**
     * 学历
     */
	@Column(name="education")
    private String education;

    /**
     * 毕业学校
     */
	@Column(name="school")
    private String school;

    /**
     * 专业
     */
	@Column(name="major")
    private String major;

    /**
     * 毕业日期
     */
	@Column(name="graduation_date")
    private String graduationDate;

    /**
     * 籍贯
     */
	@Column(name="natives")
    private String natives;

    /**
     * 民族
     */
	@Column(name="nation")
    private String nation;

    /**
     * 身份证号
     */
	@Column(name="identity")
    private String identity;

    /**
     * 护照号码
     */
	@Column(name="passport")
    private String passport;

    /**
     * 社保号码
     */
	@Column(name="social")
    private String social;

    /**
     * 银行账号
     */
	@Column(name="bank_account")
    private String bankAccount;

    /**
     * 生日
     */
	@Column(name="birthday")
    private String birthday;

    /**
     * 婚姻状况
     */
	@Column(name="marriage")
    private String marriage;

    /**
     * 家庭住址
     */
	@Column(name="address")
    private String address;

    /**
     * 紧急联系人
     */
	@Column(name="emergency_contact")
    private String emergencyContact;

    /**
     * 紧急联系电话
     */
	@Column(name="emergency_phone")
    private String emergencyPhone;

    /**
     * 座机
     */
	@Column(name="tel_phone")
    private String telPhone;

   

    /**
     * 是否已上传过头像，0：未上传，1：已上传
     */
	@Column(name="is_upload")
    private int isUpload;

    /**
     * 是否删除
     */
	@Column(name="is_delete")
    private int isDelete;

    /**
     * 联系人列表及信息
     */
	@Column(name="link_list")
    private String linkList;
    /**
     * 密码
     */
	@Column(name="password")
    private String  password;
    /**
     * 是否激活
     */
	@Column(name="auth_flag")
    private int authFlag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getNatives() {
		return natives;
	}
	public void setNatives(String natives) {
		this.natives = natives;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getEmergencyPhone() {
		return emergencyPhone;
	}
	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}
	public String getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public int getIsUpload() {
		return isUpload;
	}
	public void setIsUpload(int isUpload) {
		this.isUpload = isUpload;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public String getLinkList() {
		return linkList;
	}
	public void setLinkList(String linkList) {
		this.linkList = linkList;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAuthFlag() {
		return authFlag;
	}
	public void setAuthFlag(int authFlag) {
		this.authFlag = authFlag;
	}
    
}