/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.spriye;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprvbh;
import java.io.FileInputStream;
import java.security.Security;
import java.util.Iterator;

public class sprnxg {
    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_8060(int arg0) {
        switch (arg0) {
            case 1: {
                return spriye.cfr_renamed_9("x_kSmIdIxMf");
            }
            case 2: {
                return sprdtd.cfr_renamed_9("y[jWnFhZrX\u007f");
            }
            case 3: {
                return spriye.cfr_renamed_9("^yMu_cKd");
            }
            case 16: {
                return sprdtd.cfr_renamed_9("nDlIfIgWnFhZrX\u007f");
            }
            case 17: {
                return "DSA";
            }
            case 18: {
                return spriye.cfr_renamed_9("IiHb");
            }
            case 19: {
                return sprdtd.cfr_renamed_9("nKo[j");
            }
            case 20: {
                return spriye.cfr_renamed_9("o@mMgMfSmIdIxMf");
            }
            case 21: {
                return sprdtd.cfr_renamed_9("LbNmAnWcMgDfIe");
            }
        }
        return "unknown";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        Iterator<sprtbh> iterator = new sprryg(sprmxg.cfr_renamed_7556(new FileInputStream(arg0[0])), (sprrk)new sprmwg()).cfr_renamed_7704();
        block2: while (true) {
            sprtbh sprtbh2;
            Iterator<sprtbh> iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return;
                }
                sprtbh2 = iterator.next();
                try {
                    sprtbh2.cfr_renamed_1157();
                }
                catch (Exception exception) {
                    iterator2 = iterator;
                    exception.printStackTrace();
                    continue;
                }
                break;
            }
            Iterator<sprvbh> iterator3 = sprtbh2.cfr_renamed_7458();
            boolean bl = true;
            Iterator<sprvbh> iterator4 = iterator3;
            while (true) {
                if (!iterator4.hasNext()) continue block2;
                sprvbh sprvbh2 = iterator3.next();
                if (bl) {
                    System.out.println(new StringBuilder().insert(0, spriye.cfr_renamed_9("GOu\nEn6\n")).append(Long.toHexString(sprvbh2.cfr_renamed_7541())).toString());
                    bl = false;
                } else {
                    System.out.println(new StringBuilder().insert(0, sprdtd.cfr_renamed_9("CNq\u000bAo2\u000b")).append(Long.toHexString(sprvbh2.cfr_renamed_7541())).append(spriye.cfr_renamed_9("\n$YyHgOu\u0003")).toString());
                }
                System.out.println(new StringBuilder().insert(0, sprdtd.cfr_renamed_9("\u000b(\u000b(\u000b(\u000b(\u000b(\u000b(jdLgYa_`F2\u000b")).append(sprnxg.cfr_renamed_8060(sprvbh2.cfr_renamed_593())).toString());
                System.out.println(new StringBuilder().insert(0, spriye.cfr_renamed_9("\n,\n,\n,\n,\n,\n,leDkO~Z~Cb^6\n")).append(new String(sprfqe.cfr_renamed_485(sprvbh2.cfr_renamed_5209()))).toString());
                iterator4 = iterator3;
            }
            break;
        }
    }
}

