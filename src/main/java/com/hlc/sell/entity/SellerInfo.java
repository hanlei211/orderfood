package com.hlc.sell.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class SellerInfo implements Serializable {

    private String sellerId;

    private String username;

    private String password;

    private String openid;
}

