/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravy;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprllf;
import com.spire.presentation.packages.sprmi;
import com.spire.presentation.packages.sprplf;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwif;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class sprmnf
extends Provider
implements sprmi {
    public static final sprqw cfr_renamed_102;
    private static String cfr_renamed_93;
    private static final Map cfr_renamed_86;
    private static final String cfr_renamed_152 = "com.spire.psmodel.security.pqc.jcajce.provider.";
    private static final String[] cfr_renamed_112;
    public static String cfr_renamed_119;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5719(String string, String string2, Map<String, String> map) {
        void arg2;
        void arg1;
        void arg0;
        sprmnf sprmnf2 = this;
        sprmnf2.cfr_renamed_1260((String)arg0, (String)arg1);
        sprmnf2.cfr_renamed_5720(string, (Map<String, String>)arg2);
    }

    public static /* synthetic */ void cfr_renamed_5721(sprmnf arg0) {
        arg0.cfr_renamed_1257();
    }

    @Override
    public sprcn cfr_renamed_5722(sprlem arg0) {
        return (sprcn)cfr_renamed_86.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5723(String string, sprlem sprlem2, String string2, Map<String, String> map) {
        void arg3;
        void arg1;
        void arg0;
        sprmnf sprmnf2 = this;
        sprmnf2.cfr_renamed_5724(string, sprlem2, string2);
        sprmnf2.cfr_renamed_5720((String)arg0 + "." + arg1, (Map<String, String>)arg3);
        this.cfr_renamed_5720(new StringBuilder().insert(0, (String)arg0).append(sprqmn.cfr_renamed_9("j\u0016\r\u001dj")).append(arg1).toString(), (Map<String, String>)arg3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cfr_renamed_127(String string, String string2) {
        void arg1;
        void arg0;
        return this.containsKey((String)arg0 + "." + (String)arg1) || this.containsKey(new StringBuilder().insert(0, spravy.cfr_renamed_9(")V\u000f\u0014)V\u0001[\u001b\u0014")).append((String)arg0).append(".").append((String)arg1).toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static /* synthetic */ sprcn cfr_renamed_5725(sprlem arg0) {
        Map map = cfr_renamed_86;
        // MONITORENTER : map
        // MONITOREXIT : map
        return (sprcn)cfr_renamed_86.get(arg0);
    }

    public sprmnf() {
        super(cfr_renamed_119, 1.75, cfr_renamed_93);
        AccessController.doPrivileged(new sprwif(this));
    }

    public static PublicKey cfr_renamed_5726(sprvhm arg0) throws IOException {
        sprcn sprcn2 = sprmnf.cfr_renamed_5725(arg0.cfr_renamed_593().cfr_renamed_593());
        if (sprcn2 == null) {
            return null;
        }
        return sprcn2.cfr_renamed_3215(arg0);
    }

    static {
        cfr_renamed_93 = "BouncyCastle Post-Quantum Security Provider v1.75";
        cfr_renamed_119 = "BCPQC";
        cfr_renamed_102 = null;
        cfr_renamed_86 = new HashMap();
        String[] stringArray = new String[17];
        stringArray[0] = sprqmn.cfr_renamed_9("\u0017\t\f\u0010\n\u001a\u0017");
        stringArray[1] = spravy.cfr_renamed_9("v%i");
        stringArray[2] = sprqmn.cfr_renamed_9("\u0017\f");
        stringArray[3] = spravy.cfr_renamed_9("0w;i");
        stringArray[4] = sprqmn.cfr_renamed_9("\u0017\t\f\u0010\n\u001a\u0017\t(,7");
        stringArray[5] = spravy.cfr_renamed_9("+w+\u007f");
        stringArray[6] = sprqmn.cfr_renamed_9("\u0002++=+");
        stringArray[7] = spravy.cfr_renamed_9("i)x-h");
        stringArray[8] = sprqmn.cfr_renamed_9("\t-:*0'");
        stringArray[9] = spravy.cfr_renamed_9("&n:o");
        stringArray[10] = sprqmn.cfr_renamed_9("\u001f%5'6*");
        stringArray[11] = spravy.cfr_renamed_9("q\u0011X\rH");
        stringArray[12] = sprqmn.cfr_renamed_9("\u00000(001-,)");
        stringArray[13] = spravy.cfr_renamed_9("t<h=j\u001aS\u0005_");
        stringArray[14] = sprqmn.cfr_renamed_9("\u001b\r\u0012\u0001");
        stringArray[15] = spravy.cfr_renamed_9("r9y");
        stringArray[16] = sprqmn.cfr_renamed_9("\u00168-7&63");
        cfr_renamed_112 = stringArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class cfr_renamed_5727(Class arg0, String arg1) {
        try {
            ClassLoader classLoader = arg0.getClassLoader();
            if (classLoader == null) return (Class)AccessController.doPrivileged(new sprllf(arg1));
            return classLoader.loadClass(arg1);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
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
        sprqw sprqw2 = cfr_renamed_102;
        // MONITORENTER : sprqw2
        // MONITOREXIT : sprqw2
    }

    @Override
    public void cfr_renamed_1260(String arg0, String arg1) {
        if (this.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, spravy.cfr_renamed_9("\fO\u0018V\u0001Y\tN\r\u001a\u0018H\u0007L\u0001^\rHHQ\rCH\u0012")).append(arg0).append(sprqmn.cfr_renamed_9("my\"617 ")).toString());
        }
        this.put(arg0, arg1);
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
            Class clazz = sprmnf.cfr_renamed_5727(sprmnf.class, new StringBuilder().insert(0, arg0).append(arg1[n]).append(spravy.cfr_renamed_9("\u001e%[\u0018J\u0001T\u000fI")).toString());
            if (clazz != null) {
                try {
                    ((sprplf)clazz.newInstance()).cfr_renamed_5728(this);
                }
                catch (Exception exception) {
                    throw new InternalError(new StringBuilder().insert(0, sprqmn.cfr_renamed_9(":%7*60y'+!80<d0**08*:!y+?d")).append(arg0).append(arg1[n]).append(spravy.cfr_renamed_9("Lw\tJ\u0018S\u0006]\u001b\u001aR\u001a")).append(exception).toString());
                }
            }
            n2 = ++n;
        }
        return;
    }

    @Override
    public void cfr_renamed_5720(String arg0, Map<String, String> arg1) {
        Iterator<String> iterator;
        Iterator<String> iterator2 = iterator = arg1.keySet().iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            String string2 = new StringBuilder().insert(0, arg0).append(" ").append(string).toString();
            if (this.containsKey(string2)) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprqmn.cfr_renamed_9("=1)(0'80<d)6620 <6y%-0+-;1-!y/<=yl")).append(string2).append(spravy.cfr_renamed_9("\u0013H\\\u0007O\u0006^")).toString());
            }
            this.put(string2, arg1.get(string));
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5724(String string, sprlem sprlem2, String string2) {
        void arg1;
        void arg2;
        void arg0;
        if (!this.containsKey((String)arg0 + "." + (String)arg2)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprqmn.cfr_renamed_9("4+-4%+=y/<=yl")).append((String)arg0).append(".").append((String)arg2).append(spravy.cfr_renamed_9("\u0013HT\u0007NH\\\u0007O\u0006^")).toString());
        }
        sprmnf sprmnf2 = this;
        sprmnf2.cfr_renamed_1260(new StringBuilder().insert(0, (String)arg0).append(".").append(arg1).toString(), (String)arg2);
        sprmnf2.cfr_renamed_1260(new StringBuilder().insert(0, (String)arg0).append(sprqmn.cfr_renamed_9("j\u0016\r\u001dj")).append(arg1).toString(), (String)arg2);
    }

    public static PrivateKey cfr_renamed_5729(sprcom arg0) throws IOException {
        sprcn sprcn2 = sprmnf.cfr_renamed_5725(arg0.cfr_renamed_1254().cfr_renamed_593());
        if (sprcn2 == null) {
            return null;
        }
        return sprcn2.cfr_renamed_5653(arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_5730(sprlem arg0, sprcn arg1) {
        Map map = cfr_renamed_86;
        synchronized (map) {
            cfr_renamed_86.put(arg0, arg1);
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_1257() {
        this.cfr_renamed_1258(cfr_renamed_152, cfr_renamed_112);
    }
}

