/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprscf;
import com.spire.presentation.packages.spryio;
import java.math.BigInteger;

public class sprwhj {
    private static /* synthetic */ String cfr_renamed_9409(BigInteger arg0, spriyk arg1) {
        return new sprscf(sproze.cfr_renamed_527(arg0.toByteArray(), arg1.cfr_renamed_1155().toByteArray(), arg1.cfr_renamed_1778().toByteArray())).toString();
    }

    public static String cfr_renamed_9410(String arg0, BigInteger arg1, spriyk arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        BigInteger bigInteger = arg2.cfr_renamed_1778().modPow(arg1, arg2.cfr_renamed_1155());
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(spryio.cfr_renamed_9("\u0003#Q\u001aU\u0012W\u0016\u00038F\n\u0003(")).append(sprwhj.cfr_renamed_9409(bigInteger, arg2)).append("]").append(string);
        stringBuffer3.append(sprrob.cfr_renamed_9("j\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000f\u0013\u0015j")).append(bigInteger.toString(16)).append(string);
        return stringBuffer3.toString();
    }

    public static String cfr_renamed_9411(String arg0, BigInteger arg1, spriyk arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(spryio.cfr_renamed_9("Ss\u0006A\u001fJ\u0010\u00038F\n\u0003(")).append(sprwhj.cfr_renamed_9409(arg1, arg2)).append("]").append(string);
        stringBuffer3.append(sprrob.cfr_renamed_9("\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000fj\u000f\u0013\u0015j")).append(arg1.toString(16)).append(string);
        return stringBuffer3.toString();
    }
}

