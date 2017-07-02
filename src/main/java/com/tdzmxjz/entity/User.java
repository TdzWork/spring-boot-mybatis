package com.tdzmxjz.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Tdz on 2017-7-2.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String userName;

    private String userPassWord;
}
