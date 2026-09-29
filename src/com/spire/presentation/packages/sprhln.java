/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprijn;
import com.spire.presentation.packages.sprnjn;
import com.spire.presentation.packages.sprskn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprukn;
import com.spire.presentation.packages.spryon;

@sprtea
public class sprhln {
    private sprnjn cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprukn cfr_renamed_4;

    /*
     * Exception decompiling
     */
    @sprtea
    public static sprhln cfr_renamed_13049(String arg0, int arg1) {
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

    public sprukn cfr_renamed_13050() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ sprijn cfr_renamed_13051(byte[] arg0) {
        return null;
    }

    @sprtea
    public static sprhln cfr_renamed_13052(String arg0, int arg1) {
        return sprhln.cfr_renamed_13049(arg0, arg1);
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_11540(true);
    }

    /*
     * Exception decompiling
     */
    @sprtea
    public static sprhln cfr_renamed_13053(byte[] arg0, int arg1) {
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 1;
        int cfr_ignored_0 = 3 << 3 ^ 1;
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    private /* synthetic */ void cfr_renamed_13054(int arg0, int[] arg1, int[] arg2) {
        arg1[0] = this.cfr_renamed_4.cfr_renamed_12989(arg0) / 2;
        spryon spryon2 = new spryon();
        this.cfr_renamed_4.cfr_renamed_12998(spryon2);
        arg2[0] = spryon2.getAscender();
    }

    @sprtea
    public void cfr_renamed_13055(int arg0, int arg1, int[] arg2, int[] arg3) {
        int n = 0;
        int n2 = 0;
        int[] nArray = new int[1];
        nArray[0] = n;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[1];
        nArray3[0] = n2;
        int[] nArray4 = nArray3;
        this.cfr_renamed_13056(arg0, arg1, nArray2, nArray4);
        n = nArray2[0];
        n2 = nArray4[0];
        arg2[0] = arg2[0] + n;
        arg3[0] = arg3[0] + n2;
    }

    public sprhln(sprukn sprukn2) {
        sprhln sprhln2 = this;
        sprhln2.cfr_renamed_3 = false;
        sprhln2.cfr_renamed_4 = sprukn2;
        sprhln sprhln3 = this;
        sprhln2.cfr_renamed_2 = new sprnjn();
    }

    private /* synthetic */ void cfr_renamed_13056(int arg0, int arg1, int[] arg2, int[] arg3) {
        if (arg1 == 4) {
            int n = 0;
            int n2 = 0;
            int[] nArray = new int[1];
            nArray[0] = n;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[1];
            nArray3[0] = n2;
            int[] nArray4 = nArray3;
            boolean bl = this.cfr_renamed_12992(arg0, nArray2, nArray4);
            n = nArray2[0];
            n2 = nArray3[0];
            if (bl) {
                int n3 = 0;
                int n4 = 0;
                int[] nArray5 = new int[1];
                nArray5[0] = n3;
                int[] nArray6 = nArray5;
                int[] nArray7 = new int[1];
                nArray7[0] = n4;
                int[] nArray8 = nArray7;
                this.cfr_renamed_13054(arg0, nArray6, nArray8);
                n3 = nArray6[0];
                n4 = nArray8[0];
                arg2[0] = arg2[0] - n3;
                arg3[0] = arg3[0] - n4;
                return;
            }
        } else if (arg1 == 6) {
            int n = 0;
            int n5 = 0;
            int[] nArray = new int[1];
            nArray[0] = n;
            int[] nArray9 = nArray;
            int[] nArray10 = new int[1];
            nArray10[0] = n5;
            int[] nArray11 = nArray10;
            boolean bl = this.cfr_renamed_12996(arg0, nArray9, nArray11);
            n = nArray9[0];
            n5 = nArray10[0];
            if (bl) {
                int n6 = 0;
                int n7 = 0;
                int[] nArray12 = new int[1];
                nArray12[0] = n6;
                int[] nArray13 = nArray12;
                int[] nArray14 = new int[1];
                nArray14[0] = n7;
                int[] nArray15 = nArray14;
                this.cfr_renamed_13054(arg0, nArray13, nArray15);
                n6 = nArray13[0];
                n7 = nArray15[0];
                arg2[0] = arg2[0] + n6;
                arg3[0] = arg3[0] + n7;
                return;
            }
        } else {
            arg2[0] = 0;
            arg3[0] = 0;
        }
    }

    public void cfr_renamed_11540(boolean arg0) {
        if (this.cfr_renamed_3) {
            return;
        }
        if (arg0) {
            if (this.cfr_renamed_4 != null) {
                this.cfr_renamed_4.dispose();
            }
            if (this.cfr_renamed_2 != null) {
                this.cfr_renamed_2.dispose();
            }
        }
        this.cfr_renamed_3 = true;
    }

    @sprtea
    public boolean cfr_renamed_12996(int arg0, int[] arg1, int[] arg2) {
        return this.cfr_renamed_4.cfr_renamed_12996(arg0, arg1, arg2);
    }

    @sprtea
    public void cfr_renamed_12990(sprnjn arg0, sprskn[] arg1) {
        this.cfr_renamed_4.cfr_renamed_12990(arg0, arg1);
    }

    @sprtea
    public boolean cfr_renamed_12992(int arg0, int[] arg1, int[] arg2) {
        return this.cfr_renamed_4.cfr_renamed_12992(arg0, arg1, arg2);
    }

    @sprtea
    public boolean cfr_renamed_13057(int arg0, int arg1, int[] arg2, int[] arg3) {
        return this.cfr_renamed_4.cfr_renamed_12988(arg0, 0, arg1, arg2, arg3);
    }

    @sprtea
    public void cfr_renamed_12993(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.cfr_renamed_4.cfr_renamed_12993(arg0, arg1, arg2, arg3);
    }
}

