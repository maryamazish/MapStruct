package com.azish.mapstruct.member.presentation;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * کلاس مدل عضو
 */
@Data
@EqualsAndHashCode
public class MemberDto implements Serializable {
    private Long id;
    private String name;
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
