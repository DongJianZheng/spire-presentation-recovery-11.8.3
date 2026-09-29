/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcho;
import com.spire.presentation.packages.sprclja;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfrja;
import com.spire.presentation.packages.sprgmja;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvkja;
import com.spire.presentation.packages.sprznja;

@sprtea
public class sprero {
    /*
     * Exception decompiling
     */
    @sprtea
    public static byte[] cfr_renamed_17678(sprznja arg0) {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_17815(byte[] arg0, sprphja arg1, boolean arg2) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            byte[] byArray = sprero.cfr_renamed_16233(sprpdja2, arg1, arg2);
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_16233(spreen arg0, sprphja arg1, boolean arg2) {
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(0L);
        sprgmja sprgmja2 = sprgmja.cfr_renamed_4930(spreen2);
        try {
            byte[] byArray = sprero.cfr_renamed_17676(spresca.cfr_renamed_11777(sprgmja2, sprznja.class), arg1, arg2);
            return byArray;
        }
        finally {
            if (sprgmja2 != null) {
                sprgmja2.dispose();
            }
        }
    }

    private /* synthetic */ sprero() {
    }

    /*
     * Exception decompiling
     */
    public static byte[] cfr_renamed_17676(sprznja arg0, sprphja arg1, boolean arg2) {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] cfr_renamed_17816(byte[] arg0, sprphja arg1) {
        sprczo sprczo2 = sprsto.cfr_renamed_13321(arg0);
        sprlfja sprlfja2 = new sprlfja(sprczo2.cfr_renamed_1942(), sprczo2.cfr_renamed_1452());
        int n = (int)arg1.cfr_renamed_1942();
        float f = (float)n / arg1.cfr_renamed_1452();
        float f2 = (float)n / arg1.cfr_renamed_1942();
        int n2 = (int)((float)sprlfja2.cfr_renamed_1942() * f2);
        int n3 = (int)((float)sprlfja2.cfr_renamed_1452() * f);
        if (n < 150) {
            int n4 = 150 / n;
            n4 = 150 % n != 0 && n4 % 2 != 0 ? n4 + 1 : n4;
            f = (float)(n *= n4) / arg1.cfr_renamed_1452();
            f2 = (float)n / arg1.cfr_renamed_1942();
            sprlfja sprlfja3 = sprlfja2;
            n2 = (int)((float)sprlfja3.cfr_renamed_1942() * f2);
            n3 = (int)((float)sprlfja3.cfr_renamed_1452() * f);
        }
        if (sprsto.cfr_renamed_16429(n2, n3)) {
            int n5 = n = 300;
            while (true) {
                f = (float)n5 / arg1.cfr_renamed_1452();
                f2 = (float)n / arg1.cfr_renamed_1942();
                sprlfja sprlfja4 = sprlfja2;
                n2 = (int)((float)sprlfja4.cfr_renamed_1942() * f2);
                if (!sprsto.cfr_renamed_16429(n2, n3 = (int)((float)sprlfja4.cfr_renamed_1452() * f))) break;
                n5 = n / 2;
            }
        }
        sprlfja sprlfja5 = sprlfja2;
        float f3 = (float)sprnmp.cfr_renamed_16525(sprlfja5.cfr_renamed_1942(), arg1.cfr_renamed_1942());
        float f4 = (float)sprnmp.cfr_renamed_16525(sprlfja5.cfr_renamed_1452(), arg1.cfr_renamed_1452());
        sprmrn sprmrn2 = new sprson(new sprsuja(0.0f, 0.0f), new sprphja(f3, f4), arg0).cfr_renamed_13693();
        sprvkja sprvkja2 = new sprvkja(n2, n3);
        try {
            byte[] byArray;
            block16: {
                Object object;
                sprvkja sprvkja3 = sprvkja2;
                sprsto.cfr_renamed_17812(sprvkja3, n, n);
                sprfrja sprfrja2 = sprero.cfr_renamed_17666(sprvkja3);
                try {
                    sprfrja2.cfr_renamed_16975(3);
                    sprfrja2.cfr_renamed_15987(7);
                    object = new sprcho();
                    ((sprcho)object).cfr_renamed_15025(sprmrn2, sprfrja2);
                    object = null;
                }
                finally {
                    if (sprfrja2 != null) {
                        sprfrja2.dispose();
                    }
                }
                object = new sprpdja();
                try {
                    sprvkja2.cfr_renamed_17811((spreen)object, sprclja.cfr_renamed_17703());
                    byArray = sprmvo.cfr_renamed_12452((spreen)object);
                    if (object == null) break block16;
                }
                catch (Throwable throwable) {
                    if (object != null) {
                        ((spreen)object).cfr_renamed_2637();
                    }
                    throw throwable;
                }
                ((spreen)object).cfr_renamed_2637();
            }
            return byArray;
        }
        finally {
            if (sprvkja2 != null) {
                sprvkja2.dispose();
            }
        }
    }

    public static sprfrja cfr_renamed_17666(sprgmja arg0) {
        return sprfrja.cfr_renamed_17708(arg0);
    }
}

