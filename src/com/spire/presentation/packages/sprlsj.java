/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdgha;
import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprlsk;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprnij;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryxh;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprlsj
extends sprnij {
    public int cfr_renamed_3 = 1024;
    public SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprlsj sprlsj2 = this;
        sprlsj2.cfr_renamed_3 = arg0;
        sprlsj2.cfr_renamed_4 = secureRandom;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprlsk sprlsk2;
        sprlsk sprlsk3 = new sprlsk();
        if (this.cfr_renamed_4 != null) {
            sprlsk sprlsk4 = sprlsk3;
            sprlsk2 = sprlsk4;
            sprlsk4.cfr_renamed_2492(this.cfr_renamed_3, 2, this.cfr_renamed_4);
        } else {
            sprlsk sprlsk5 = sprlsk3;
            sprlsk2 = sprlsk5;
            sprlsk5.cfr_renamed_2492(this.cfr_renamed_3, 2, sprybl.cfr_renamed_2794());
        }
        spriyk spriyk2 = sprlsk2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_9250(sprubs.cfr_renamed_9("5c!xA\u0018C\u001c"));
            algorithmParameters.init(new spryxh(new sprmsh(spriyk2.cfr_renamed_1155(), spriyk2.cfr_renamed_1604(), spriyk2.cfr_renamed_1778())));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprdgha.cfr_renamed_9(",AB]\u0017^\u0012A\u0010Z\u0007JBo\u000eI\r\\\u000bZ\nC2O\u0010O\u000fK\u0016K\u0010}\u0012K\u0001\u000e\u0004A\u0010\u000e%a1zQ\u001aS\u001eB^\u0003\\\u0003C\u0007Z\u0007\\BI\u0007@\u0007\\\u0003Z\u000bA\f\u0000"));
    }
}

