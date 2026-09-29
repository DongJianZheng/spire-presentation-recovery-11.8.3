/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprug;
import java.util.ArrayList;
import java.util.List;

public class sprnql {
    private final List cfr_renamed_3;
    private final List cfr_renamed_4;

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 2;
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

    public sprnpl cfr_renamed_31() {
        spridn spridn2 = this.cfr_renamed_3 == null ? null : spreul.cfr_renamed_4016(this.cfr_renamed_3);
        spridn spridn3 = this.cfr_renamed_4 == null ? null : spreul.cfr_renamed_4016(this.cfr_renamed_4);
        return new sprnpl(new sprpnm(spridn2, spridn3));
    }

    public sprnql(sprug arg0) throws sprlyl {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprnql(sprug sprug2, sprug sprug3) throws sprlyl {
        void v0;
        void arg1;
        if (sprug2 != null) {
            void arg0;
            v0 = arg1;
            this.cfr_renamed_3 = spreul.cfr_renamed_10676((sprug)arg0);
        } else {
            this.cfr_renamed_3 = null;
            v0 = arg1;
        }
        if (v0 != null) {
            this.cfr_renamed_4 = spreul.cfr_renamed_10677((sprug)arg1);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnql(sprtpl sprtpl2) {
        void arg0;
        sprnql sprnql2 = this;
        this.cfr_renamed_3 = new ArrayList(1);
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3.add(arg0.cfr_renamed_568());
    }
}

