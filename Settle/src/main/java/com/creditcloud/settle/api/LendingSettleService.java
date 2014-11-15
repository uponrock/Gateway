/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.settle.api;

import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.SettleLoanResult;
import com.creditcloud.service.model.DisburseInfo;
import com.creditcloud.service.model.RepayInfo;
import javax.ejb.Remote;

/**
 * settle service for lending
 *
 * @author rooseek
 */
@Remote
public interface LendingSettleService {

    /**
     * repayment of a loan, set repayment status and generate fund record
     *
     * @param repayInfo
     * @return
     */
    boolean repayLoan(RepayInfo repayInfo);

    /**
     * 商户垫付支付
     *
     * @param disburseInfo
     * @return
     */
    boolean disburseLoan(DisburseInfo disburseInfo);

    /**
     * settle a loan , generate related invest repayment
     *
     * @param employeeId
     * @param loanId
     * @return 根据贷款所有投资金额生成的还款计划，用于更新贷款的LoanRepayment中的Repayment
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void settleLoan(String employeeId, String loanId);

    /**
     * cancel failed loan , release related invest
     *
     * @param loan
     * @return
     */
    boolean cancelFailedLoan(Loan loan);
}
