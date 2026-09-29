/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.sprfol;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgtm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprmum;
import com.spire.presentation.packages.sprmwl;
import com.spire.presentation.packages.sprsfy;
import com.spire.presentation.packages.sprxs;
import java.io.IOException;

public class sprqnl {
    private sprmwl cfr_renamed_3;
    private spraql cfr_renamed_4;

    public sprqnl cfr_renamed_10961(sprfz arg0) {
        sprqnl sprqnl2 = this;
        sprqnl2.cfr_renamed_3.cfr_renamed_10803(arg0);
        return sprqnl2;
    }

    public sprfol cfr_renamed_7357(sprmh arg0) throws sprlyl {
        sprqnl sprqnl2 = this;
        sprjtm sprjtm2 = sprjtm.cfr_renamed_23(sprqnl2.cfr_renamed_3.cfr_renamed_7366(sprqnl2.cfr_renamed_4, arg0).cfr_renamed_568().cfr_renamed_480());
        return new sprfol(new sprmum(new sprdtm(sprjtm2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqnl(sprcom arg0, sprigm arg1) {
        sprgtm sprgtm2 = new sprgtm(arg0, arg1);
        try {
            this.cfr_renamed_4 = new spraql(sprxs.cfr_renamed_4, sprgtm2.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprsfy.cfr_renamed_9("2\u001b&\u0017+\u0010g\u0001(U\"\u001b$\u001a#\u0010g\u001e\"\fg\u0014)\u0011g\u0012\"\u001b\"\u0007&\u0019g\u001b&\u0018\"U.\u001b!\u001a"));
        }
        this.cfr_renamed_3 = new sprmwl();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

