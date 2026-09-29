/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprccf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdf;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprghl;
import com.spire.presentation.packages.sprip;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmz;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnm;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprqbf;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryhg;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

public class sprpil
extends sprghl {
    private sprddm cfr_renamed_152;
    private static Map cfr_renamed_112 = new HashMap();
    private SecureRandom cfr_renamed_119;
    private final sprddm cfr_renamed_91;
    private PublicKey cfr_renamed_0;
    private sprmz cfr_renamed_1;
    private final int cfr_renamed_2;
    private Map cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpil cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprdhl((Provider)arg0);
        return this;
    }

    private /* synthetic */ int cfr_renamed_10727(PublicKey arg0) {
        if (arg0 instanceof sprnm) {
            return (Integer)cfr_renamed_112.get(((sprnm)arg0).cfr_renamed_5682().cfr_renamed_313());
        }
        if (arg0 instanceof sprdf) {
            return (Integer)cfr_renamed_112.get(((sprdf)((Object)arg0)).cfr_renamed_5682().cfr_renamed_313());
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprpil cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprpfl((String)arg0);
        return this;
    }

    /*
     * Exception decompiling
     */
    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
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

    @Override
    public int cfr_renamed_10689() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_112.put(sprqbf.cfr_renamed_119.cfr_renamed_313(), spruaf.cfr_renamed_279(768));
        cfr_renamed_112.put(sprqbf.cfr_renamed_0.cfr_renamed_313(), spruaf.cfr_renamed_279(1088));
        cfr_renamed_112.put(sprqbf.cfr_renamed_2.cfr_renamed_313(), spruaf.cfr_renamed_279(1568));
        cfr_renamed_112.put(sprccf.cfr_renamed_2.cfr_renamed_313(), spruaf.cfr_renamed_279(699));
        cfr_renamed_112.put(sprccf.cfr_renamed_4.cfr_renamed_313(), spruaf.cfr_renamed_279(930));
        cfr_renamed_112.put(sprccf.cfr_renamed_0.cfr_renamed_313(), spruaf.cfr_renamed_279(1230));
        cfr_renamed_112.put(sprccf.cfr_renamed_1.cfr_renamed_313(), spruaf.cfr_renamed_279(1138));
    }

    @Override
    public sprddm cfr_renamed_10688() {
        return this.cfr_renamed_152;
    }

    public sprpil(PublicKey arg0, sprlem arg1) {
        super(arg0 instanceof RSAPublicKey ? new sprddm(sprip.cfr_renamed_112) : sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593());
        sprpil sprpil2 = this;
        sprpil sprpil3 = this;
        sprpil sprpil4 = this;
        sprpil3.cfr_renamed_1 = new sprjrl();
        sprpil4.cfr_renamed_3 = new HashMap();
        sprpil3.cfr_renamed_152 = new sprddm(sprbr.cfr_renamed_1337, new sprddm(sprwr.cfr_renamed_1226, sprpen.cfr_renamed_4));
        sprpil2.cfr_renamed_0 = arg0;
        sprpil2.cfr_renamed_91 = new sprddm(arg1);
        sprpil2.cfr_renamed_2 = sproul.cfr_renamed_10728(arg1);
    }

    @Override
    public byte[] cfr_renamed_5684() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprddm cfr_renamed_10690() {
        return this.cfr_renamed_91;
    }

    public sprpil cfr_renamed_10724(sprddm arg0) {
        this.cfr_renamed_152 = arg0;
        return this;
    }

    public sprpil cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprpil cfr_renamed_7451(sprlem arg0, String arg1) {
        sprpil sprpil2 = this;
        sprpil2.cfr_renamed_3.put(arg0, arg1);
        return sprpil2;
    }
}

