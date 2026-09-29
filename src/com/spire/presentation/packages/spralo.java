/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprijo;
import com.spire.presentation.packages.sprljo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzno;

@sprtea
public class spralo {
    private sprggo cfr_renamed_3;
    private sprhio cfr_renamed_4;

    private /* synthetic */ sprzno cfr_renamed_16702(long arg0) {
        spralo spralo2 = this;
        int n = spralo2.cfr_renamed_4.cfr_renamed_12261();
        int n2 = spralo2.cfr_renamed_4.cfr_renamed_12261();
        int n3 = spralo2.cfr_renamed_4.cfr_renamed_12261();
        int n4 = spralo2.cfr_renamed_4.cfr_renamed_12261();
        switch (spralo2.cfr_renamed_4.cfr_renamed_12261()) {
            case 0: {
                return new sprzno(this.cfr_renamed_16703(n, n2, n3, n4));
            }
            case 1: {
                return new sprzno(this.cfr_renamed_16704(arg0));
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ byte[] cfr_renamed_16703(int arg0, int arg1, int arg2, int arg3) {
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprljo cfr_renamed_16705(long arg0) {
        spralo spralo2 = this;
        int n = spralo2.cfr_renamed_4.cfr_renamed_12261();
        int n2 = spralo2.cfr_renamed_4.cfr_renamed_12261();
        byte[] byArray = n == 2 ? this.cfr_renamed_16706(n2) : this.cfr_renamed_4.cfr_renamed_16065(n2);
        return new sprljo(byArray, this.cfr_renamed_3);
    }

    private /* synthetic */ sprwbp[] cfr_renamed_16707() {
        int n;
        this.cfr_renamed_4.cfr_renamed_12261();
        int n2 = this.cfr_renamed_4.cfr_renamed_12261();
        sprwbp[] sprwbpArray = new sprwbp[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            sprwbpArray[n++] = this.cfr_renamed_4.cfr_renamed_16637();
            n3 = n;
        }
        return sprwbpArray;
    }

    private /* synthetic */ byte[] cfr_renamed_16704(long arg0) {
        return this.cfr_renamed_4.cfr_renamed_16065((int)(arg0 - this.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_3274()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_16706(int arg0) {
        int n = 22;
        int n2 = 2;
        sprpdja sprpdja2 = new sprpdja(arg0 + n);
        try {
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_16065(n);
            sprpdja2.cfr_renamed_4924(byArray, 0, byArray.length);
            this.cfr_renamed_4.cfr_renamed_16065(n2);
            byte[] byArray2 = this.cfr_renamed_4.cfr_renamed_16065(arg0);
            sprpdja2.cfr_renamed_4924(byArray2, 0, byArray2.length);
            byte[] byArray3 = sprpdja2.cfr_renamed_4529();
            return byArray3;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprijo cfr_renamed_16670(long arg0) {
        spralo spralo2 = this;
        spralo2.cfr_renamed_4.cfr_renamed_12261();
        switch (spralo2.cfr_renamed_4.cfr_renamed_12261()) {
            case 0: {
                return null;
            }
            case 1: {
                return this.cfr_renamed_16702(arg0);
            }
            case 2: {
                return this.cfr_renamed_16705(arg0);
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * WARNING - void declaration
     */
    public spralo(sprhio sprhio2, sprggo sprggo2) {
        void arg0;
        spralo spralo2 = this;
        spralo2.cfr_renamed_4 = arg0;
        spralo2.cfr_renamed_3 = sprggo2;
    }
}

