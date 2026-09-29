/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprscf;
import com.spire.presentation.packages.sprudy;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzmg;

public class sprfnj {
    public static String cfr_renamed_9414(String arg0, String arg1, spryye arg2) {
        StringBuffer stringBuffer;
        byte[] byArray;
        StringBuffer stringBuffer2 = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        if (arg2 instanceof sprlnk) {
            byArray = ((sprlnk)arg2).cfr_renamed_91();
            stringBuffer = stringBuffer2;
        } else if (arg2 instanceof sprpxk) {
            byArray = ((sprpxk)arg2).cfr_renamed_91();
            stringBuffer = stringBuffer2;
        } else {
            spryye spryye2 = arg2;
            if (arg2 instanceof sprwgk) {
                byArray = ((sprwgk)spryye2).cfr_renamed_91();
                stringBuffer = stringBuffer2;
            } else {
                byArray = ((sprnuk)spryye2).cfr_renamed_91();
                stringBuffer = stringBuffer2;
            }
        }
        stringBuffer.append(arg1).append(" ").append(arg0).append(sprudy.cfr_renamed_9("A\u0003")).append(sprfnj.cfr_renamed_9415(byArray)).append("]").append(string).append(sprzmg.cfr_renamed_9("|r|r,'>>51|6=&=h|")).append(sprfqe.cfr_renamed_503(byArray)).append(string);
        return stringBuffer2.toString();
    }

    public static boolean cfr_renamed_9416(byte[] arg0, byte[] arg1) {
        int n;
        if (arg1.length < arg0.length) {
            return !sprfnj.cfr_renamed_9416(arg0, arg0);
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != arg0.length) {
            byte by = arg0[n];
            byte by2 = arg1[n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        return n2 == 0;
    }

    private static /* synthetic */ String cfr_renamed_9415(byte[] arg0) {
        return new sprscf(arg0).toString();
    }
}

