/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprj;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprose;
import com.spire.presentation.packages.sprr;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.sprydb;
import com.spire.presentation.packages.sprykaa;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class sprlgb
extends Provider
implements sprr {
    private static final Map cfr_renamed_86;
    private static final String[] cfr_renamed_152;
    private static String cfr_renamed_112;
    public static String cfr_renamed_119;
    public static final sprwc cfr_renamed_91;
    private static final String cfr_renamed_0 = "org.bouncycastle.pqc.jcajce.provider.";

    public static PrivateKey cfr_renamed_1253(sprmke arg0) throws IOException {
        sprj sprj2 = (sprj)cfr_renamed_86.get(arg0.cfr_renamed_1254().cfr_renamed_593());
        if (sprj2 == null) {
            return null;
        }
        return sprj2.cfr_renamed_1228(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cfr_renamed_127(String string, String string2) {
        void arg1;
        void arg0;
        return this.containsKey((String)arg0 + "." + (String)arg1) || this.containsKey(new StringBuilder().insert(0, sprose.cfr_renamed_9("H!ncH!`,zc")).append((String)arg0).append(".").append((String)arg1).toString());
    }

    public static PublicKey cfr_renamed_1255(sprdce arg0) throws IOException {
        sprj sprj2 = (sprj)cfr_renamed_86.get(arg0.cfr_renamed_593().cfr_renamed_593());
        if (sprj2 == null) {
            return null;
        }
        return sprj2.cfr_renamed_1226(arg0);
    }

    public static /* synthetic */ void cfr_renamed_1256(sprlgb arg0) {
        arg0.cfr_renamed_1257();
    }

    static {
        cfr_renamed_112 = "BouncyCastle Post-Quantum Security Provider v1.50";
        cfr_renamed_119 = "BCPQC";
        cfr_renamed_91 = null;
        cfr_renamed_86 = new HashMap();
        String[] stringArray = new String[2];
        stringArray[0] = sprykaa.cfr_renamed_9("D\u0018\u007f\u0017t\u0016a");
        stringArray[1] = sprose.cfr_renamed_9("D.L!`(j(");
        cfr_renamed_152 = stringArray;
    }

    private /* synthetic */ void cfr_renamed_1257() {
        this.cfr_renamed_1258(cfr_renamed_0, cfr_renamed_152);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1258(String arg0, String[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            Class<?> clazz = null;
            try {
                ClassLoader classLoader = this.getClass().getClassLoader();
                clazz = classLoader != null ? classLoader.loadClass(arg0 + arg1[n] + sprykaa.cfr_renamed_9("24w\tf\u0010x\u001ee")) : Class.forName(new StringBuilder().insert(0, arg0).append(arg1[n]).append(sprose.cfr_renamed_9("iD,y=`#n>")).toString());
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            if (clazz != null) {
                try {
                    ((sprydb)clazz.newInstance()).cfr_renamed_1259(this);
                }
                catch (Exception exception) {
                    throw new InternalError(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\u001aw\u0017x\u0016bYu\u000bs\u0018b\u001c6\u0010x\nb\u0018x\u001asYy\u001f6")).append(arg0).append(arg1[n]).append(sprose.cfr_renamed_9("-\u0000h=y$g*zm3m")).append(exception).toString());
                }
            }
            n2 = ++n;
        }
        return;
    }

    @Override
    public void cfr_renamed_1260(String arg0, String arg1) {
        if (this.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\u001dc\tz\u0010u\u0018b\u001c6\td\u0016`\u0010r\u001cdY}\u001coY>")).append(arg0).append(sprose.cfr_renamed_9("d)+f8g)")).toString());
        }
        this.put(arg0, arg1);
    }

    @Override
    public void cfr_renamed_1261(sprtzd arg0, sprj arg1) {
        cfr_renamed_86.put(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
        sprwc sprwc2 = cfr_renamed_91;
        // MONITORENTER : sprwc2
        // MONITOREXIT : sprwc2
    }

    public sprlgb() {
        super(cfr_renamed_119, 1.5, cfr_renamed_112);
        AccessController.doPrivileged(new sprcgb(this));
    }
}

