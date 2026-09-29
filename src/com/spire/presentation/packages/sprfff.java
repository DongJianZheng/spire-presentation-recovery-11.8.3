/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprycf;
import java.util.Date;

public class sprfff
implements sprhd<sprycf> {
    private final Date cfr_renamed_3;
    private final spren cfr_renamed_4;

    @Override
    public Object clone() {
        return this;
    }

    public spren cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    /*
     * Exception decompiling
     */
    public boolean cfr_renamed_5334(sprycf arg0) {
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

    public sprfff(spren arg0) {
        this(arg0, new Date());
    }

    /*
     * WARNING - void declaration
     */
    public sprfff(spren spren2, Date date) {
        void arg1;
        this.cfr_renamed_4 = spren2;
        sprfff sprfff2 = this;
        this.cfr_renamed_3 = new Date(arg1.getTime());
    }
}

