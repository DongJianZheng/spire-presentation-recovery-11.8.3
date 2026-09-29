/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sproim;
import com.spire.presentation.packages.sprqim;
import com.spire.presentation.packages.spruef;
import com.spire.presentation.packages.sprycf;
import java.util.ArrayList;
import java.util.List;

public class sprrze {
    private final sprlj cfr_renamed_4;

    public sprycf cfr_renamed_5335(sprbff arg0) throws sprahf, spruef {
        return new sprycf(new sproim((sprqim)((Object)null), null, arg0.cfr_renamed_568()), this.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ (2 ^ 5);
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

    public sprrze(sprlj sprlj2) {
        this.cfr_renamed_4 = sprlj2;
    }

    public List<sprycf> cfr_renamed_5336(List<sprbff> arg0) throws sprahf, spruef {
        int n;
        ArrayList<sprycf> arrayList = new ArrayList<sprycf>(arg0.size());
        int n2 = n = 0;
        while (n2 != arg0.size()) {
            sproim sproim2 = new sproim((sprqim)((Object)null), null, arg0.get(n).cfr_renamed_568());
            arrayList.add(new sprycf(sproim2, this.cfr_renamed_4));
            n2 = ++n;
        }
        return arrayList;
    }
}

