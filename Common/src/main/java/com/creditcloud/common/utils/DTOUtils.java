/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.common.entities.embedded.Duration;
import com.creditcloud.common.entities.embedded.Repayment;

/**
 *
 * @author rooseek
 */
public class DTOUtils {

    /**
     * handle Duration
     *
     * @param duration
     * @return
     */
    public static com.creditcloud.model.loan.Duration getDurationDTO(Duration duration) {
        com.creditcloud.model.loan.Duration result = null;
        if (duration != null) {
            result = new com.creditcloud.model.loan.Duration(duration.getYears(),
                                                             duration.getMonths(),
                                                             duration.getDays());
        }
        return result;
    }

    public static Duration convertDurationDTO(com.creditcloud.model.loan.Duration duration) {
        Duration result = null;
        if (duration != null) {
            result = new Duration(duration.getYears(),
                                  duration.getMonths(),
                                  duration.getDays());
        }
        return result;
    }

    /**
     * handle Repayment
     *
     * @param repayment
     * @return
     */
    public static com.creditcloud.model.loan.Repayment getRepaymentDTO(Repayment repayment) {
        com.creditcloud.model.loan.Repayment result = null;
        if (repayment != null) {
            result = new com.creditcloud.model.loan.Repayment(repayment.getAmountPrincipal(),
                                                              repayment.getAmountInterest(),
                                                              repayment.getAmountOutstanding(),
                                                              repayment.getDueDate(),
                                                              repayment.getStatus());
        }
        return result;
    }

    public static Repayment convertRepaymentDTO(com.creditcloud.model.loan.Repayment repayment) {
        Repayment result = null;
        if (repayment != null) {
            result = new Repayment(repayment.getAmountPrincipal(),
                                   repayment.getAmountInterest(),
                                   repayment.getAmountOutstanding(),
                                   repayment.getDueDate(),
                                   repayment.getStatus());
        }
        return result;
    }
}