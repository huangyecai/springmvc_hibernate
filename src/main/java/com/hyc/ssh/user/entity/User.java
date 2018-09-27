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
 * �û�
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
	 * �û�id����¼���ã�
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	/**
     * ����
     */
	@Column(name="name")
    private String name;
 
    /**
     * ��ҵid(�⻧)
     */
	@Column(name="enterprise_id")
    private String enterpriseId;

    /**
     * ��������
     */
	@Column(name="organization_id")
    private String organizationId;


    /**
     * ��ʾ�ֻ�
     */
	@Column(name="mobile")
    private String mobile;

    /**
     * �û�ͷ��
     */
	@Column(name="photo")
    private String photo;

    /**
     * �Ա�
     */
	@Column(name="sex")
    private String sex;

    /**
     * ����
     */
	@Column(name="email")
    private String email;

    /**
     * ΢���˺�
     */
	@Column(name="weixin")
    private String weixin;

    /**
     * qq�˺�
     */
	@Column(name="qq")
    private String qq;

    /**
     * �칫��ַ
     */
	@Column(name="office_address")
    private String officeAddress;

    /**
     * ְλ
     */
	@Column(name="job")
    private String job;

    /**
     * ����
     */
	@Column(name="job_number")
    private String jobNumber;

    /**
     * ѧ��
     */
	@Column(name="education")
    private String education;

    /**
     * ��ҵѧУ
     */
	@Column(name="school")
    private String school;

    /**
     * רҵ
     */
	@Column(name="major")
    private String major;

    /**
     * ��ҵ����
     */
	@Column(name="graduation_date")
    private String graduationDate;

    /**
     * ����
     */
	@Column(name="natives")
    private String natives;

    /**
     * ����
     */
	@Column(name="nation")
    private String nation;

    /**
     * ���֤��
     */
	@Column(name="identity")
    private String identity;

    /**
     * ���պ���
     */
	@Column(name="passport")
    private String passport;

    /**
     * �籣����
     */
	@Column(name="social")
    private String social;

    /**
     * �����˺�
     */
	@Column(name="bank_account")
    private String bankAccount;

    /**
     * ����
     */
	@Column(name="birthday")
    private String birthday;

    /**
     * ����״��
     */
	@Column(name="marriage")
    private String marriage;

    /**
     * ��ͥסַ
     */
	@Column(name="address")
    private String address;

    /**
     * ������ϵ��
     */
	@Column(name="emergency_contact")
    private String emergencyContact;

    /**
     * ������ϵ�绰
     */
	@Column(name="emergency_phone")
    private String emergencyPhone;

    /**
     * ����
     */
	@Column(name="tel_phone")
    private String telPhone;

   

    /**
     * �Ƿ����ϴ���ͷ��0��δ�ϴ���1�����ϴ�
     */
	@Column(name="is_upload")
    private int isUpload;

    /**
     * �Ƿ�ɾ��
     */
	@Column(name="is_delete")
    private int isDelete;

    /**
     * ��ϵ���б���Ϣ
     */
	@Column(name="link_list")
    private String linkList;
    /**
     * ����
     */
	@Column(name="password")
    private String  password;
    /**
     * �Ƿ񼤻�
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