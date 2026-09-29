/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class sprrhp {
    private static final byte cfr_renamed_91 = 80;
    @sprtea
    public static final int cfr_renamed_0 = 1;
    private static final int cfr_renamed_1 = 82;
    @sprtea
    public static final int cfr_renamed_2 = 0x10000000;
    @sprtea
    public static final int cfr_renamed_3 = 4;
    @sprtea
    public static final short cfr_renamed_4 = 20556;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_19155(byte[] arg0) throws Exception {
        try {
            return sprrhp.cfr_renamed_19156(arg0);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static /* synthetic */ long cfr_renamed_19157(byte[] arg0) {
        int n = 12;
        return sprtzja.cfr_renamed_12136(arg0, n);
    }

    @sprtea
    public static void cfr_renamed_18486(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[++n] = (byte)(arg0[n] & 0xFF ^ 0x50);
            n2 = n;
        }
    }

    private static /* synthetic */ int cfr_renamed_19158(byte[] arg0) {
        return sprtzja.cfr_renamed_12169(arg0, 82);
    }

    /*
     * Exception decompiling
     */
    public static byte[] cfr_renamed_19156(byte[] arg0) {
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

    public static String cfr_renamed_19159(byte[] arg0) {
        int n = sprrhp.cfr_renamed_19158(arg0);
        int n2 = 84 + n + 2;
        int n3 = sprtzja.cfr_renamed_12169(arg0, n2);
        return sprszca.cfr_renamed_12801().cfr_renamed_11595(arg0, n2 + 2, n3 & 0xFFFF);
    }

    private static /* synthetic */ int cfr_renamed_19160(byte[] arg0) {
        return sprtzja.cfr_renamed_11604(arg0, 4);
    }

    public static boolean cfr_renamed_19161(byte[] arg0) {
        return (sprrhp.cfr_renamed_19157(arg0) & 0xFFFFFFFFL & 1L) != 0L;
    }

    private static /* synthetic */ int cfr_renamed_19162(byte[] arg0) {
        return sprtzja.cfr_renamed_11604(arg0, 0);
    }

    public static int cfr_renamed_19163(byte[] arg0) {
        return sprrhp.cfr_renamed_19162(arg0) - sprrhp.cfr_renamed_19160(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_19164(int arg0) {
        switch (arg0) {
            case 65536: {
                return 65536;
            }
            case 131073: {
                return 131073;
            }
            case 131074: {
                return 131074;
            }
        }
        return 0;
    }
}

