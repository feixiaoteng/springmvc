package com.fei.entity;

import com.fei.valid.UsersValid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author feixiaoteng
 * @create 2019-07-04 13:04
 */
public class Users {
    private Long id;
    @NotNull(message="{users.name}",groups = {UsersValid.class})
    private String name;
    private String password;
    @Past(message="日期必须是一个过去的时间")
    @NotNull(message="创建日期不能为null")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;
    private Double  salary;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users() {
    }
    public Users(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", salary=" + salary +
                '}';
    }
}
