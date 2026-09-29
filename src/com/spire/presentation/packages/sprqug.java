/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayg;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class sprqug
implements sprse {
    private sprrk cfr_renamed_3;
    private sprmam cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqug(InputStream inputStream, sprrk sprrk2) {
        void arg0;
        sprqug sprqug2 = this;
        sprqug2.cfr_renamed_4 = sprmam.cfr_renamed_7730((InputStream)arg0);
        sprqug2.cfr_renamed_3 = sprrk2;
    }

    /*
     * Exception decompiling
     */
    public Object cfr_renamed_7703() throws IOException {
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

    /*
     * WARNING - void declaration
     */
    public sprqug(byte[] byArray, sprrk sprrk2) {
        this(new ByteArrayInputStream((byte[])arg0), (sprrk)arg1);
        void arg1;
        void arg0;
    }

    @Override
    public Iterator iterator() {
        return new sprayg(this);
    }
}

