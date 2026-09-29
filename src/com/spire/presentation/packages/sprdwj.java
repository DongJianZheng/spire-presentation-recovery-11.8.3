/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceea;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprscf;
import com.spire.presentation.packages.sprvao;
import com.spire.presentation.packages.sprwsk;
import java.math.BigInteger;

public class sprdwj {
    public static String cfr_renamed_9453(String arg0, BigInteger arg1, sprwsk arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        BigInteger bigInteger = arg2.cfr_renamed_1145().modPow(arg1, arg2.cfr_renamed_1155());
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprceea.cfr_renamed_9("7\u001ae#a+c/7\u0001r37\u0011")).append(sprdwj.cfr_renamed_9454(bigInteger, arg2)).append("]").append(string);
        stringBuffer3.append(sprvao.cfr_renamed_9("\b\u007f\b\u007f\b\u007f\b\u007f\b\u007f\b\u007f\b\u007fqe\b")).append(bigInteger.toString(16)).append(string);
        return stringBuffer3.toString();
    }

    private static /* synthetic */ String cfr_renamed_9454(BigInteger arg0, sprwsk arg1) {
        return new sprscf(sproze.cfr_renamed_527(arg0.toByteArray(), arg1.cfr_renamed_1155().toByteArray(), arg1.cfr_renamed_1145().toByteArray())).toString();
    }

    public static String cfr_renamed_9455(String arg0, BigInteger arg1, sprwsk arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprceea.cfr_renamed_9("jG?u&~)7\u0001r37\u0011")).append(sprdwj.cfr_renamed_9454(arg1, arg2)).append("]").append(string);
        stringBuffer3.append(sprvao.cfr_renamed_9("\u007f\b\u007f\b\u007f\b\u007f\b\u007f\b\u007f\b\u007fqe\b")).append(arg1.toString(16)).append(string);
        return stringBuffer3.toString();
    }
}

