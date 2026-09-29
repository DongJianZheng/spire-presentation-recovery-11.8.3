/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmjd;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sproie;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;

public class sprdcd {
    public static sprmke cfr_renamed_2619(sprhgb arg0) throws IOException {
        if (arg0 instanceof sprmtc) {
            sprisc sprisc2 = (sprisc)arg0;
            return new sprmke(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprlbe(sprisc2.cfr_renamed_2295(), sprisc2.cfr_renamed_2296(), sprisc2.cfr_renamed_360(), sprisc2.cfr_renamed_1155(), sprisc2.cfr_renamed_1604(), sprisc2.cfr_renamed_2305(), sprisc2.cfr_renamed_2306(), sprisc2.cfr_renamed_1148()));
        }
        if (arg0 instanceof sprlnd) {
            sprlnd sprlnd2 = (sprlnd)arg0;
            sprcld sprcld2 = sprlnd2.cfr_renamed_284();
            return new sprmke(new sprije(sprtk.cfr_renamed_314, new sprzde(sprcld2.cfr_renamed_1155(), sprcld2.cfr_renamed_1604(), sprcld2.cfr_renamed_1145())), new sprooe(sprlnd2.cfr_renamed_1980()));
        }
        if (arg0 instanceof spreed) {
            spruxd spruxd2;
            spreed spreed2 = (spreed)arg0;
            sprqid sprqid2 = spreed2.cfr_renamed_284();
            if (sprqid2 == null) {
                spruxd2 = new spruxd(sprume.cfr_renamed_3);
            } else if (sprqid2 instanceof sprmjd) {
                spruxd2 = new spruxd(((sprmjd)sprqid2).cfr_renamed_313());
            } else {
                sprfpd sprfpd2 = new sprfpd(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_1145(), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153(), sprqid2.cfr_renamed_2113());
                spruxd2 = new spruxd(sprfpd2);
            }
            return new sprmke(new sprije(sprtk.cfr_renamed_137, spruxd2), new sproie(spreed2.cfr_renamed_2112(), spruxd2));
        }
        throw new IOException(sprogb.cfr_renamed_9(":p(5!t#t<p%p#fq{>aqg4v>r?|\"p5;"));
    }
}

