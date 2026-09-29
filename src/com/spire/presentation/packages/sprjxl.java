/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtl;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjx;
import com.spire.presentation.packages.sprmrl;
import com.spire.presentation.packages.sprnvl;
import com.spire.presentation.packages.sprtpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprjxl {
    private final sprjx cfr_renamed_3;
    private final sprmrl cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 3;
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

    /*
     * WARNING - void declaration
     */
    public sprjxl(sprjx sprjx2, sprjj sprjj2) {
        void arg1;
        this.cfr_renamed_3 = sprjx2;
        sprjxl sprjxl2 = this;
        this.cfr_renamed_4 = new sprmrl((sprjj)arg1);
    }

    public List cfr_renamed_10950(String arg0) throws sprixl {
        sprjxl sprjxl2 = this;
        sprnvl sprnvl2 = sprjxl2.cfr_renamed_4.cfr_renamed_10946(arg0);
        List list = sprjxl2.cfr_renamed_3.cfr_renamed_10941(sprnvl2.cfr_renamed_10944()).cfr_renamed_8434();
        ArrayList<sprtpl> arrayList = new ArrayList<sprtpl>(list.size());
        for (sprbtl sprbtl2 : list) {
            if (!sprnvl2.cfr_renamed_132(sprbtl2)) continue;
            arrayList.add(sprbtl2.cfr_renamed_2141());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

