/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.sprfkh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprttl;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprwih;
import java.io.IOException;

public class sprowj {
    public static sprvwg cfr_renamed_9518(sprlem arg0, byte[] arg1) {
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg1);
        if (arg0.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            return new sprvwg(0, new sprwih(new sprgfh(0, new sprfvg(sprhdf.cfr_renamed_512(32, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_97()))), new sprfvg(sprhdf.cfr_renamed_512(32, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_97()))));
        }
        if (arg0.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return new sprvwg(1, new sprwih(new sprgfh(0, new sprfvg(sprhdf.cfr_renamed_512(32, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_97()))), new sprfvg(sprhdf.cfr_renamed_512(32, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_97()))));
        }
        if (arg0.cfr_renamed_5078(spris.cfr_renamed_93)) {
            return new sprvwg(2, new sprfkh(new sprdlh(0, new sprfvg(sprhdf.cfr_renamed_512(48, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_97()))), new sprfvg(sprhdf.cfr_renamed_512(48, sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_97()))));
        }
        throw new IllegalArgumentException(sprttl.cfr_renamed_9("r}l}hdi3dfuebZC"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_9519(sprvwg arg0) {
        byte[] byArray;
        byte[] byArray2;
        if (arg0.cfr_renamed_8227() == 0 || arg0.cfr_renamed_8227() == 1) {
            sprwih sprwih2 = sprwih.cfr_renamed_23(arg0.cfr_renamed_79());
            byArray2 = sproug.cfr_renamed_23(sprwih2.cfr_renamed_8389().cfr_renamed_8404()).cfr_renamed_186();
            byArray = sprwih2.cfr_renamed_8390().cfr_renamed_186();
        } else {
            sprfkh sprfkh2 = sprfkh.cfr_renamed_23(arg0.cfr_renamed_79());
            byArray2 = sproug.cfr_renamed_23(sprfkh2.cfr_renamed_8389().cfr_renamed_8395()).cfr_renamed_186();
            byArray = sprfkh2.cfr_renamed_8390().cfr_renamed_186();
        }
        try {
            sprco[] sprcoArray = new sprco[2];
            sprcoArray[0] = new sprktm(sprhdf.cfr_renamed_515(byArray2));
            sprcoArray[1] = new sprktm(sprhdf.cfr_renamed_515(byArray));
            return new sprcen(sprcoArray).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprnsc.cfr_renamed_9("8\u0000.E9\u000b?\n8\f2\u0002|\u0017|C|\u0016"));
        }
    }
}

