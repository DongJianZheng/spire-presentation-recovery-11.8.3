/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;

/*
 * Exception performing whole class analysis ignored.
 */
@sprtea
public class sprhon {
    private spralq cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_14738(sprpip arg0) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            return (byte[])this.cfr_renamed_4.get(arg0);
        }
        for (sprpip sprpip2 : this.cfr_renamed_4.keySet()) {
            if (!sprhon.cfr_renamed_14739(sprpip2, arg0)) continue;
            return (byte[])this.cfr_renamed_4.get(sprpip2);
        }
        return null;
    }

    public sprhon() {
        sprhon sprhon2 = this;
        sprhon2.cfr_renamed_4 = new spralq();
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ byte[] cfr_renamed_14740(sprpip arg0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ boolean cfr_renamed_14741(sprpip arg0) {
        return arg0.cfr_renamed_13509() != -3.4028235E38f && arg0.cfr_renamed_13509() < 1.0f || arg0.cfr_renamed_14742() != null;
    }

    private static /* synthetic */ boolean cfr_renamed_14739(sprpip arg0, sprpip arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0.cfr_renamed_12510() != arg1.cfr_renamed_12510()) {
            return false;
        }
        if (arg0.cfr_renamed_13509() != arg1.cfr_renamed_13509()) {
            return false;
        }
        if (!sprhon.cfr_renamed_14743(arg0.cfr_renamed_14742(), arg1.cfr_renamed_14742())) {
            return false;
        }
        return sprhon.cfr_renamed_14744(arg0.cfr_renamed_13533(), arg1.cfr_renamed_13533());
    }

    private static /* synthetic */ boolean cfr_renamed_14745(sprgeja arg0, sprczo arg1) {
        if (arg0.cfr_renamed_29()) {
            return false;
        }
        return arg0.cfr_renamed_13430() != 0.0f || arg0.cfr_renamed_13342() != 0.0f || arg0.cfr_renamed_1942() != (float)arg1.cfr_renamed_1942() || arg0.cfr_renamed_1452() != (float)arg1.cfr_renamed_1452();
    }

    private static /* synthetic */ boolean cfr_renamed_14746(sprpip arg0) {
        sprpip sprpip2 = arg0;
        int n = sprsto.cfr_renamed_13225(sprpip2.cfr_renamed_12510());
        sprczo sprczo2 = sprsto.cfr_renamed_14747(sprpip2.cfr_renamed_12510(), n);
        if (sprsto.cfr_renamed_14748(n)) {
            return true;
        }
        if (sprhon.cfr_renamed_14741(arg0)) {
            return true;
        }
        return sprhon.cfr_renamed_14745(arg0.cfr_renamed_13533(), sprczo2);
    }

    private static /* synthetic */ boolean cfr_renamed_14744(sprgeja arg0, sprgeja arg1) {
        if (arg0.cfr_renamed_29() && arg1.cfr_renamed_29()) {
            return true;
        }
        return sprgeja.cfr_renamed_13775(arg0, arg1);
    }

    private static /* synthetic */ boolean cfr_renamed_14743(sprwbp[] arg0, sprwbp[] arg1) {
        int n;
        if (arg0 == null && arg1 == null) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (!sprwbp.cfr_renamed_14749(arg0[n], arg1[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public sprpip cfr_renamed_14586(sprpip arg0) {
        if (!sprhon.cfr_renamed_14746(arg0)) {
            return arg0;
        }
        byte[] byArray = this.cfr_renamed_14738(arg0);
        if (byArray == null) {
            byArray = sprhon.cfr_renamed_14740(arg0);
            this.cfr_renamed_4.put(arg0, byArray);
        }
        return sprhon.cfr_renamed_14750(arg0, byArray);
    }

    private static /* synthetic */ sprpip cfr_renamed_14750(sprpip arg0, byte[] arg1) {
        sprpip sprpip2 = new sprpip(arg1, arg0.cfr_renamed_13337());
        sprpip2.cfr_renamed_12643(arg0.cfr_renamed_12672());
        return sprpip2;
    }
}

