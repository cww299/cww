package com.cww.user.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
public class User {
	
	/*
	 * @GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键、@GeneratedValue提供了主键的生成策略。
	 * @GeneratedValue注解有两个属性,分别是strategy和generator,
	 * strategy属性：提供四种值:
	 *	-AUTO主键由程序控制, 是默认选项 ,不设置就是这个
	 *	-IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
	 *	-SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
	 *  -Table 提供特定的数据库产生主键, 该方式更有利于数据库的移
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pwd")
	private String pwd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
