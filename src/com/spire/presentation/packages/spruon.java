/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprtt;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;

@sprtea
public abstract class spruon
implements sprtt {
    public void cfr_renamed_13980(sprhhn arg0) {
    }

    public void cfr_renamed_13982(sprxln arg0) {
        if (arg0.cfr_renamed_12571() != null) {
            this.cfr_renamed_14020(arg0.cfr_renamed_12571().cfr_renamed_12551());
        }
        if (arg0.cfr_renamed_12551() != null) {
            this.cfr_renamed_14020(arg0.cfr_renamed_12551());
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public byte[] cfr_renamed_14021(byte[] arg0) {
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
    public void cfr_renamed_13983(sprthn sprthn2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_12554(this.cfr_renamed_13866(arg0.cfr_renamed_12553()));
        v0.cfr_renamed_13733(this.cfr_renamed_13866(v0.cfr_renamed_13268()));
    }

    @Override
    public abstract sprwbp cfr_renamed_13866(sprwbp var1);

    private /* synthetic */ void cfr_renamed_14020(sprpln arg0) {
        if (arg0 == null) {
            return;
        }
        arg0.cfr_renamed_13865(this);
    }
}

