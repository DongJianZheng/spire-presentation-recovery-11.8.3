/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawe;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprrre;
import com.spire.presentation.packages.sprsqe;
import com.spire.presentation.packages.spruwd;
import com.spire.presentation.packages.sprwyd;
import com.spire.presentation.packages.spryxg;
import com.spire.presentation.packages.sprzod;

public class sprgud {
    private sprmee cfr_renamed_1;
    private sprrre cfr_renamed_2;
    private sprmoe cfr_renamed_3;
    private sprdce cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 3;
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5);
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
    public sprgud cfr_renamed_4327(spruwd spruwd2, char[] cArray) throws sprzod {
        void arg1;
        sprgud sprgud2 = this;
        sprgud2.cfr_renamed_3 = spruwd2.cfr_renamed_4328((char[])arg1, sprgud2.cfr_renamed_4);
        return sprgud2;
    }

    public sprsqe cfr_renamed_1484(sprqa arg0) {
        sprawe sprawe2;
        if (this.cfr_renamed_1 != null && this.cfr_renamed_3 != null) {
            throw new IllegalStateException(spryxg.cfr_renamed_9("2n1j|n2k|\u007f)m0f?D9v\u0011N\u001f/?n2a3{|m3{4/>j||9{r"));
        }
        if (this.cfr_renamed_2 != null) {
            sprawe2 = null;
            sprwyd.cfr_renamed_4329(this.cfr_renamed_2, arg0.cfr_renamed_470());
        } else if (this.cfr_renamed_1 != null) {
            sprgud sprgud2 = this;
            sprawe2 = new sprawe(sprgud2.cfr_renamed_1, sprgud2.cfr_renamed_4);
            sprwyd.cfr_renamed_4329(sprawe2, arg0.cfr_renamed_470());
        } else {
            sprgud sprgud3 = this;
            sprawe2 = new sprawe(sprgud3.cfr_renamed_3, sprgud3.cfr_renamed_4);
            sprwyd.cfr_renamed_4329(sprawe2, arg0.cfr_renamed_470());
        }
        return new sprsqe(sprawe2, arg0.cfr_renamed_615(), new sprmra(arg0.cfr_renamed_79()));
    }

    public sprgud(sprrre sprrre2) {
        this.cfr_renamed_2 = sprrre2;
    }

    public sprgud cfr_renamed_4330(sprmee arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprgud(sprdce sprdce2) {
        this.cfr_renamed_4 = sprdce2;
    }
}

