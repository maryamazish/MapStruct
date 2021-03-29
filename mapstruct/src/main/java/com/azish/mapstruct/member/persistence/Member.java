package com.azish.mapstruct.member.persistence;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;


/**
 * کلاس انتیتی خبر
 */
@Entity
@Table(name = "member")
@Data
@EqualsAndHashCode
public class Member implements Serializable {

    /**
     * شناسه
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * نام
     */
    private String name;
    /**
     * توضیحات
     */
    private String description;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
