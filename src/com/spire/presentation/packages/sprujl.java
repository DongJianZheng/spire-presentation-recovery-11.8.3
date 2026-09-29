/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmz;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprytm;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public class sprujl
extends sprnng {
    private sprmz cfr_renamed_0;
    private final sprddm cfr_renamed_1;
    private Map cfr_renamed_2;
    private final int cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    /*
     * Exception decompiling
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm arg0, byte[] arg1) throws spryhg {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public sprujl cfr_renamed_7451(sprlem arg0, String arg1) {
        sprujl sprujl2 = this;
        sprujl2.cfr_renamed_2.put(arg0, arg1);
        return sprujl2;
    }

    /*
     * WARNING - void declaration
     */
    public sprujl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_0 = new sprdhl((Provider)arg0);
        return this;
    }

    public int cfr_renamed_10689() {
        return this.cfr_renamed_3;
    }

    public sprujl(sprddm arg0, PrivateKey arg1) {
        sprujl sprujl2 = this;
        sprujl sprujl3 = this;
        super(sprcom.cfr_renamed_23(arg1.getEncoded()).cfr_renamed_1254());
        sprujl sprujl4 = this;
        sprujl4.cfr_renamed_0 = new sprjrl();
        sprujl3.cfr_renamed_2 = new HashMap();
        sprytm sprytm2 = sprytm.cfr_renamed_23(arg0.cfr_renamed_284());
        sprujl2.cfr_renamed_4 = arg1;
        sprujl3.cfr_renamed_1 = arg0;
        sprujl2.cfr_renamed_3 = sproul.cfr_renamed_10728(sprytm2.cfr_renamed_10729().cfr_renamed_593());
    }

    /*
     * WARNING - void declaration
     */
    public sprujl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprpfl((String)arg0);
        return this;
    }
}

