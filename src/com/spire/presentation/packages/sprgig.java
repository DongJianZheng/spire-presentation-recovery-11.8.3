/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprelm;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprfqg;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprgxl;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprpd;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprypg;
import com.spire.presentation.packages.sprysm;
import java.io.IOException;

public class sprgig {
    private sprrvm cfr_renamed_4;

    public sprgig cfr_renamed_7362(sprypg arg0) throws IOException {
        sprgig sprgig2 = this;
        sprgig2.cfr_renamed_4.cfr_renamed_5004(new spruom(sprdl.cfr_renamed_287, new sprfvg(new sprfdn(arg0.cfr_renamed_568()).cfr_renamed_91())));
        return sprgig2;
    }

    public sprgig cfr_renamed_7363(sprmh arg0, sprypg arg1) throws IOException {
        return this.cfr_renamed_7364(arg0, new sprcen(arg1.cfr_renamed_568()));
    }

    public sprgig() {
        sprgig sprgig2 = this;
        sprgig2.cfr_renamed_4 = new sprrvm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgmg cfr_renamed_7365(sprpd arg0, char[] arg1) throws sprhng {
        Object object;
        byte[] byArray;
        sprelm sprelm2 = sprelm.cfr_renamed_23(new sprfdn(this.cfr_renamed_4));
        try {
            byArray = sprelm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprhng(new StringBuilder().insert(0, sprljg.cfr_renamed_9("Iv]zP}\u001clS8Yv_wX}\u001cYIlT}RlU{]lY|oyZ}\u00068")).append(iOException.getMessage()).toString(), iOException);
        }
        spruom spruom2 = new spruom(sprdl.cfr_renamed_287, new sprfvg(byArray));
        sprcpm sprcpm2 = null;
        if (arg0 != null) {
            object = new sprfqg(arg0);
            sprcpm2 = ((sprfqg)object).cfr_renamed_1464(arg1, byArray);
        }
        object = new sprysm(spruom2, sprcpm2);
        return new sprgmg((sprysm)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgig cfr_renamed_7364(sprmh arg0, sprszm arg1) throws IOException {
        sprgxl sprgxl2 = new sprgxl();
        try {
            this.cfr_renamed_4.cfr_renamed_5004(sprgxl2.cfr_renamed_7366(new spraql(arg1.cfr_renamed_91()), arg0).cfr_renamed_568());
            return this;
        }
        catch (sprlyl sprlyl2) {
            throw new sprdkg(sprlyl2.getMessage(), sprlyl2.getCause());
        }
    }

    public sprgig cfr_renamed_7367(sprmh arg0, sprypg[] arg1) throws IOException {
        int n;
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != arg1.length) {
            sprrvm2.cfr_renamed_5004(arg1[n++].cfr_renamed_568());
            n2 = n;
        }
        return this.cfr_renamed_7364(arg0, new sprfdn(sprrvm2));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 1;
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

