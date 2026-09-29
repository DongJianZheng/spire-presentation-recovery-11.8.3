/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdnk;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.spreok;
import com.spire.presentation.packages.sprfjo;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprhlk;
import com.spire.presentation.packages.sprhmk;
import com.spire.presentation.packages.sprjpk;
import com.spire.presentation.packages.sprlpk;
import com.spire.presentation.packages.sprppk;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprskk;
import com.spire.presentation.packages.sprsok;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvek;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwkk;
import com.spire.presentation.packages.sprwok;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxnk;
import com.spire.presentation.packages.sprxok;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzfaa;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class sprqgk {
    private static Map cfr_renamed_4 = new HashMap();

    public static spryye cfr_renamed_2615(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfjo.cfr_renamed_9("^KLg[HZjTZT\u000eT\\GOL\u000e[[YB"));
        }
        if (arg0.length == 0) {
            throw new IllegalArgumentException(sprzfaa.cfr_renamed_9("]\rO!X\u000eY,W\u001cWHW\u001aD\tOHS\u0005F\u001cO"));
        }
        return sprqgk.cfr_renamed_5660(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0)));
    }

    public static spryye cfr_renamed_5945(sprvhm arg0, Object arg1) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfjo.cfr_renamed_9("EPW|@SA\u0015OGI@CP@A\u000e[[YB"));
        }
        sprddm sprddm2 = arg0.cfr_renamed_593();
        sprxnk sprxnk2 = (sprxnk)cfr_renamed_4.get(sprddm2.cfr_renamed_593());
        if (null == sprxnk2) {
            throw new IOException(new StringBuilder().insert(0, sprzfaa.cfr_renamed_9("W\u0004Q\u0007D\u0001B\u0000[H_\fS\u0006B\u0001P\u0001S\u001a\u0016\u0001XHF\u001dT\u0004_\u000b\u0016\u0003S\u0011\u0016\u0006Y\u001c\u0016\u001aS\u000bY\u000fX\u0001E\rRR\u0016")).append(sprddm2.cfr_renamed_593()).toString());
        }
        return sprxnk2.cfr_renamed_5946(arg0, arg1);
    }

    static {
        cfr_renamed_4.put(sprdl.cfr_renamed_1205, new sprppk(null));
        cfr_renamed_4.put(sprdl.cfr_renamed_3250, new sprppk(null));
        cfr_renamed_4.put(sprhl.cfr_renamed_2415, new sprppk(null));
        cfr_renamed_4.put(sprbr.cfr_renamed_31, new sprsok(null));
        cfr_renamed_4.put(sprdl.cfr_renamed_1214, new sprwok(null));
        cfr_renamed_4.put(sprbr.cfr_renamed_84, new sprskk(null));
        cfr_renamed_4.put(sprgt.cfr_renamed_93, new sprskk(null));
        cfr_renamed_4.put(sprgt.cfr_renamed_152, new sprhlk(null));
        cfr_renamed_4.put(sprbr.cfr_renamed_135, new spreok(null));
        cfr_renamed_4.put(sprqo.cfr_renamed_93, new sprxok(null));
        cfr_renamed_4.put(sprdt.cfr_renamed_96, new sprjpk(null));
        cfr_renamed_4.put(sprdt.cfr_renamed_91, new sprjpk(null));
        cfr_renamed_4.put(sprcr.cfr_renamed_951, new sprlpk(null));
        cfr_renamed_4.put(sprcr.cfr_renamed_126, new sprlpk(null));
        cfr_renamed_4.put(sprtu.cfr_renamed_3, new sprwkk(null));
        cfr_renamed_4.put(sprtu.cfr_renamed_4, new sprvek(null));
        cfr_renamed_4.put(sprtu.cfr_renamed_0, new sprdnk(null));
        cfr_renamed_4.put(sprtu.cfr_renamed_2, new sprhmk(null));
    }

    public static spryye cfr_renamed_2614(InputStream arg0) throws IOException {
        return sprqgk.cfr_renamed_5660(sprvhm.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24()));
    }

    public static /* synthetic */ byte[] cfr_renamed_9872(sprvhm arg0, Object arg1) {
        return sprqgk.cfr_renamed_9873(arg0, arg1);
    }

    private static /* synthetic */ byte[] cfr_renamed_9873(sprvhm arg0, Object arg1) {
        return arg0.cfr_renamed_2314().cfr_renamed_186();
    }

    public static spryye cfr_renamed_5660(sprvhm arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfjo.cfr_renamed_9("EPW|@SA\u0015OGI@CP@A\u000e[[YB"));
        }
        return sprqgk.cfr_renamed_5945(arg0, null);
    }
}

