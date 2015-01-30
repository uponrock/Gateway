/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "notify")
public class UserRegisterNotify extends UserNotification {
    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public UserRegisterNotify() {
    }

    public UserRegisterNotify(String platformUserNo,
                                    String platformNo,
                                    String bizType,
                                    String code,
                                    String message,
                                    String requestNo,
                                    String sign) {
        super(platformUserNo, platformNo, bizType, code, message,sign);
        this.requestNo = requestNo;
    }
    
    @XmlElement (name = "requestNo")
    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }  
    
}