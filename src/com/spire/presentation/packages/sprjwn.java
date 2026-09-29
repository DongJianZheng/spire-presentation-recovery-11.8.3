/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkdo;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprucda;
import com.spire.presentation.packages.spruym;
import com.spire.presentation.packages.sprzsn;

@sprtea
public class sprjwn {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = (2 ^ 5) << 4;
        int n4 = n2;
        int n5 = 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static sprzsn cfr_renamed_15467(Object arg0) {
        sprkdo sprkdo2;
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
        if (sprszm2.cfr_renamed_84() >= 4 && sprszm2.cfr_renamed_84() <= 5) {
            sprkdo2 = sprkdo.cfr_renamed_119;
        } else if (sprszm2.cfr_renamed_84() == 2) {
            sprkdo2 = sprkdo.cfr_renamed_2;
        } else {
            throw new IllegalArgumentException(sprucda.cfr_renamed_9("\u6731\u77fe\u769f\u656b\u6375\u7ec8\u679f\uff17\u65fb\u6cce\u5322\u9156\u4ee0\u4f4e\u5de9\u77fe\u7253\u6737\u752e\u5b4b\u7b65\u7afb\u656b\u6375\u3019"));
        }
        return new sprzsn(sprkdo2, sprszm2);
    }

    public static sprzsn cfr_renamed_15468(Object arg0) {
        sprkdo sprkdo2;
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
        if (sprszm2.cfr_renamed_84() == 4) {
            sprkdo2 = sprkdo.cfr_renamed_119;
        } else if (sprszm2.cfr_renamed_84() == 2) {
            sprkdo2 = sprkdo.cfr_renamed_2;
        } else {
            throw new IllegalArgumentException(spruym.cfr_renamed_9("\u675c\u77ca\u76f2\u655f\u6318\u7efc\u67f2\uff23\u6596\u6cfa\u534f\u9162\u4e8d\u4f7a\u5d84\u77ca\u723e\u6703\u7543\u5b7f\u5306\u7acf\u3074"));
        }
        return new sprzsn(sprkdo2, sprszm2);
    }
}

