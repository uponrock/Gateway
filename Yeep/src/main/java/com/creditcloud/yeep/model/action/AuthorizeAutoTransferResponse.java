/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseResponse;
import com.creditcloud.yeep.enums.ServiceType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class AuthorizeAutoTransferResponse extends BaseResponse {
    
    /**
     * 服务类型
     */
    @NotNull
    private ServiceType service;
    
    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;
    public AuthorizeAutoTransferResponse(String platformNo,
                                         ServiceType service,
                                         String requestNo,
                                         String code,
                                         String description) {
        super(platformNo,  code, description);
        this.service=service;
        this.requestNo=requestNo;
    }
    
}
