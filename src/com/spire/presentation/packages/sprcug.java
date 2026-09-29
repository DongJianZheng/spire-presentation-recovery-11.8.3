/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprpzl;
import com.spire.presentation.packages.sprqrg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprssg;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtgba;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Security;
import java.util.Iterator;

public class sprcug {
    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0.length == 1) {
            sprtbh sprtbh2 = new sprtbh(sprmxg.cfr_renamed_7556(new FileInputStream(arg0[0])), (sprrk)new sprmwg());
            sprvbh sprvbh2 = sprtbh2.cfr_renamed_1157();
            Iterator<sprzyg> iterator = sprvbh2.cfr_renamed_7808(31);
            while (iterator.hasNext()) {
                int n;
                sprzyg sprzyg2 = iterator.next();
                System.out.println(new StringBuilder().insert(0, sprtgba.cfr_renamed_9("o([/]5I3YaX H$\u001c(O{\u001c")).append(sprzyg2.cfr_renamed_7677().cfr_renamed_7604()).toString());
                sprpzl[] sprpzlArray = sprzyg2.cfr_renamed_7677().cfr_renamed_7612();
                int n2 = n = 0;
                while (n2 < sprpzlArray.length) {
                    StringBuilder stringBuilder = new StringBuilder().insert(0, sprdmo.cfr_renamed_9("1R\u0002S\u0013\u001d9R\u0003\\\u0003T\u0018SWS\u0016P\u0012YW\u001a")).append(sprpzlArray[n].cfr_renamed_7626()).append(sprtgba.cfr_renamed_9("f\u001c6U5Ta_.R5Y/Ha\u001b")).append(sprpzlArray[n].cfr_renamed_8079());
                    System.out.println(stringBuilder.append(sprdmo.cfr_renamed_9("P\u0013")).toString());
                    n2 = ++n;
                }
            }
        } else {
            if (arg0.length == 5) {
                sprtbh sprtbh3;
                sprbrg sprbrg2 = new sprbrg(sprmxg.cfr_renamed_7556(new FileInputStream(arg0[0])), (sprrk)new sprmwg());
                String string = arg0[1];
                sprtbh sprtbh4 = new sprtbh(sprmxg.cfr_renamed_7556(new FileInputStream(arg0[2])), (sprrk)new sprmwg());
                String string2 = arg0[3];
                String string3 = arg0[4];
                sprtbh4 = sprtbh3 = new sprtbh(new ByteArrayInputStream(sprcug.cfr_renamed_8080(sprbrg2.cfr_renamed_7711(), string, sprtbh4.cfr_renamed_1157(), string2, string3)), (sprrk)new sprmwg());
                sprczl sprczl2 = new sprczl(new FileOutputStream(sprtgba.cfr_renamed_9("o([/Y%w$Eo]2_")));
                sprtbh3.cfr_renamed_2623(sprczl2);
                sprczl sprczl3 = sprczl2;
                sprczl3.flush();
                sprczl3.close();
                return;
            }
            System.err.println(sprdmo.cfr_renamed_9("\u0002N\u0016Z\u0012\u0007Wy\u001eO\u0012^\u0003v\u0012D$T\u0010S\u0016I\u0002O\u0012\u001d\u0004X\u0014O\u0012I<X\u000e{\u001eQ\u0012\u001d\u0004X\u0014O\u0012I<X\u000em\u0016N\u0004\u001d\u0007H\u0015Q\u001e^<X\u000e{\u001eQ\u0012\u0015\u001cX\u000e\u001d\u0003RW_\u0012\u001d\u0004T\u0010S\u0012Y^\u001d9R\u0003\\\u0003T\u0018S9\\\u001aXWs\u0018I\u0016I\u001eR\u0019k\u0016Q\u0002X"));
            System.err.println(sprtgba.cfr_renamed_9(".N{\u001c\u0005U3Y\"H\nY8o([/]5I3YaO([/Y%l4^-U\"w$E\u0007U-Y"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ byte[] cfr_renamed_8080(spriyg spriyg2, String string, sprvbh sprvbh2, String string2, String string3) throws Exception {
        void arg2;
        void arg4;
        void arg3;
        void arg1;
        spriyg arg0;
        sprmah sprmah2 = arg0.cfr_renamed_7744(new sprqrg().cfr_renamed_1499("BC").cfr_renamed_1480(arg1.toCharArray()));
        sprssg sprssg2 = new sprssg(new sprebh(arg0.cfr_renamed_1157().cfr_renamed_593(), 2).cfr_renamed_1499("BC"));
        sprssg2.cfr_renamed_7538(31, sprmah2);
        sprsxg sprsxg2 = new sprsxg();
        boolean bl = true;
        sprsxg sprsxg3 = sprsxg2;
        sprsxg3.cfr_renamed_7642(true, bl, (String)arg3, (String)arg4);
        sprssg2.cfr_renamed_7666(sprsxg3.cfr_renamed_31());
        return sprvbh.cfr_renamed_7805((sprvbh)arg2, sprssg2.cfr_renamed_31()).cfr_renamed_91();
    }
}

