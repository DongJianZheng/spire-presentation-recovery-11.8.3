/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.spring;
import com.spire.presentation.packages.sprkep;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlqm;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprugg {
    public static boolean cfr_renamed_7411(sprmqg arg0, sprhk arg1) throws sprhng {
        Object object;
        sprrvm sprrvm2;
        sprmqg sprmqg2 = arg0;
        sprurm[] sprurmArray = sprmqg2.cfr_renamed_5109(new sprlem(sprkep.cfr_renamed_9("a#b;}5g=}<}<b9c?d#k=};}?")));
        spring spring2 = new spring(sprurmArray[0]);
        sprurmArray = arg0.cfr_renamed_5109(new sprlem(sprlwy.cfr_renamed_9("\u0004K\u0007S\u0018]\u0002U\u0018T\u0018T\u0007Q\u0006W\u0001K\u000eU\u0018S\u0018V")));
        sprlqm sprlqm2 = sprmqg2.cfr_renamed_568().cfr_renamed_1486();
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprlqm sprlqm3 = sprlqm2;
        sprrvm2.cfr_renamed_5004(sprlqm3.cfr_renamed_3());
        sprrvm3.cfr_renamed_5004(sprlqm3.cfr_renamed_1485());
        sprrvm3.cfr_renamed_5004(sprlqm2.cfr_renamed_1489());
        sprrvm sprrvm4 = new sprrvm();
        Object object2 = sprlqm2.cfr_renamed_82().cfr_renamed_329();
        while (object2.hasMoreElements()) {
            object = sprurm.cfr_renamed_23(object2.nextElement());
            if (((sprurm)object).cfr_renamed_204().cfr_renamed_5078(new sprlem(sprkep.cfr_renamed_9("a#b;}5g=}<}<b9c?d#k=};}>")))) continue;
            sprrvm4.cfr_renamed_5004((sprco)object);
        }
        sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprocn(sprrvm4)));
        Object object3 = object2 = new sprrvm();
        ((sprrvm)object2).cfr_renamed_5004(new sprcen(sprrvm2));
        ((sprrvm)object3).cfr_renamed_5004(spring2.cfr_renamed_89());
        ((sprrvm)object3).cfr_renamed_5004(sprurmArray[0].cfr_renamed_4528()[0]);
        object = new sprmqg(sprmzh.cfr_renamed_23(new sprcen((sprrvm)object2)));
        return ((sprmqg)object).cfr_renamed_7374(arg1);
    }

    public static sprrdm cfr_renamed_7412(spring arg0) throws IOException {
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = 3 << 3 ^ 4;
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
}

