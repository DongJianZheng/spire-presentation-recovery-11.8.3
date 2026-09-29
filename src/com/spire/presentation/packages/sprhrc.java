/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfae;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprhud;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmjd;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;

public class sprhrc {
    public static sprdce cfr_renamed_1530(sprhgb arg0) throws IOException {
        if (arg0 instanceof sprmtc) {
            sprmtc sprmtc2 = (sprmtc)arg0;
            return new sprdce(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprfae(sprmtc2.cfr_renamed_2295(), sprmtc2.cfr_renamed_360()));
        }
        if (arg0 instanceof spruld) {
            spruld spruld2 = (spruld)arg0;
            return new sprdce(new sprije(sprtk.cfr_renamed_314), new sprooe(spruld2.spr\u3181()));
        }
        if (arg0 instanceof sprwmd) {
            sprkra sprkra2;
            spruxd spruxd2;
            sprwmd sprwmd2 = (sprwmd)arg0;
            sprqid sprqid2 = sprwmd2.cfr_renamed_284();
            if (sprqid2 == null) {
                spruxd2 = new spruxd(sprume.cfr_renamed_3);
            } else if (sprqid2 instanceof sprmjd) {
                spruxd2 = new spruxd(((sprmjd)sprqid2).cfr_renamed_313());
            } else {
                sprkra2 = new sprfpd(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_1145(), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153(), sprqid2.cfr_renamed_2113());
                spruxd2 = new spruxd((sprfpd)sprkra2);
            }
            sprkra2 = (sprxue)new sprhud(sprwmd2.cfr_renamed_1604()).cfr_renamed_119();
            return new sprdce(new sprije(sprtk.cfr_renamed_137, spruxd2), ((sprxue)sprkra2).cfr_renamed_186());
        }
        throw new IOException(sprwtba.cfr_renamed_9("S:A\u007fH>J>U:L:J,\u00181W+\u0018-]<W8V6K:\\q"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5;
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

