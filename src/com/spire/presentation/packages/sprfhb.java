/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyca;
import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjeb;
import com.spire.presentation.packages.sprknd;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlhd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprnuba;
import com.spire.presentation.packages.sprrld;
import com.spire.presentation.packages.sprsmd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwfd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprfhb {
    private static Set cfr_renamed_2;
    private static Map cfr_renamed_3;
    private static Set cfr_renamed_4;

    static {
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_3.put(sprm.cfr_renamed_813, spriwa.cfr_renamed_279(128));
        cfr_renamed_3.put(sprm.cfr_renamed_1480, spriwa.cfr_renamed_279(40));
        cfr_renamed_3.put(sprm.cfr_renamed_805, spriwa.cfr_renamed_279(192));
        cfr_renamed_3.put(sprm.cfr_renamed_613, spriwa.cfr_renamed_279(128));
        cfr_renamed_3.put(sprm.cfr_renamed_119, spriwa.cfr_renamed_279(128));
        cfr_renamed_3.put(sprm.cfr_renamed_1512, spriwa.cfr_renamed_279(40));
        cfr_renamed_4.add(sprm.cfr_renamed_813);
        cfr_renamed_4.add(sprm.cfr_renamed_1480);
        cfr_renamed_2.add(sprm.cfr_renamed_805);
        cfr_renamed_2.add(sprm.cfr_renamed_805);
    }

    public static int cfr_renamed_1513(sprtzd arg0) {
        return (Integer)cfr_renamed_3.get(arg0);
    }

    public static sprt cfr_renamed_1514(sprtzd arg0, sprko arg1, int arg2, sprfbe arg3, char[] arg4) {
        sprbyca sprbyca2 = new sprbyca(arg1);
        sprbyca2.cfr_renamed_1515(sprbyca.cfr_renamed_1516(arg4), arg3.cfr_renamed_1205(), arg3.cfr_renamed_1490().intValue());
        if (sprfhb.cfr_renamed_1517(arg0)) {
            sprt sprt2 = sprbyca2.cfr_renamed_249(sprfhb.cfr_renamed_1513(arg0));
            return sprt2;
        }
        sprt sprt3 = sprbyca2.cfr_renamed_1518(sprfhb.cfr_renamed_1513(arg0), arg2 * 8);
        if (sprfhb.cfr_renamed_1519(arg0)) {
            sprlhd.cfr_renamed_1520(((sprnld)((sprnjd)sprt3).cfr_renamed_284()).cfr_renamed_1521());
        }
        return sprt3;
    }

    public static boolean cfr_renamed_1517(sprtzd arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    public static boolean cfr_renamed_1519(sprtzd arg0) {
        return cfr_renamed_2.contains(arg0);
    }

    public static sprha cfr_renamed_1522(sprtzd arg0, sprko arg1, sprfbe arg2, char[] arg3) {
        sprbyca sprbyca2;
        sprbyca sprbyca3 = sprbyca2 = new sprbyca(arg1);
        sprbyca3.cfr_renamed_1515(sprbyca.cfr_renamed_1516(arg3), arg2.cfr_renamed_1205(), arg2.cfr_renamed_1490().intValue());
        sprnld sprnld2 = (sprnld)sprbyca3.cfr_renamed_1523(arg1.cfr_renamed_1218() * 8);
        sprced sprced2 = new sprced(arg1);
        sprced2.cfr_renamed_1524(sprnld2);
        return new sprjeb(arg0, arg2, sprced2, arg3);
    }

    public static sprknd cfr_renamed_1525(sprtzd arg0) {
        sprff sprff2;
        if (arg0.equals(sprm.cfr_renamed_805) || arg0.equals(sprm.cfr_renamed_613)) {
            sprff2 = new sprrld();
        } else if (arg0.equals(sprm.cfr_renamed_119) || arg0.equals(sprm.cfr_renamed_1512)) {
            sprff2 = new sprsmd();
        } else {
            throw new IllegalStateException(sprnuba.cfr_renamed_9("\r.\u0013.\u00177\u0016`\u0019,\u001f/\n)\f(\u0015"));
        }
        return new sprknd(new sprgnd(sprff2), new sprwfd());
    }
}

