/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.sprayca;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpek;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.spruaf;
import java.math.BigInteger;

/*
 * Exception performing whole class analysis ignored.
 */
public class sprzal {
    public static final double cfr_renamed_0;
    public static final String cfr_renamed_1 = "com.spire.psmodel.security.fpe.disable_ff1";
    public static final String cfr_renamed_2 = "com.spire.psmodel.security.fpe.disable";
    public static final double cfr_renamed_3;
    public static final int cfr_renamed_4 = 16;

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10226(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprmr sprmr3 = arg0;
        sprzal.cfr_renamed_10227(sprmr3, true, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        void var6_6 = arg5;
        void var7_7 = var6_6 / 2;
        void var8_8 = var6_6 - var7_7;
        short[] sArray = sprzal.cfr_renamed_10228((byte[])arg3, (int)arg4, (int)var7_7);
        short[] sArray2 = sprzal.cfr_renamed_10228(byArray2, (int)(arg4 + var7_7), (int)var8_8);
        return sprzal.cfr_renamed_10229(sprzal.cfr_renamed_10230(sprmr3, (sprpek)arg1, (byte[])arg2, (int)var6_6, (int)var7_7, (int)var8_8, sArray, sArray2));
    }

    public static BigInteger cfr_renamed_10231(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        return new BigInteger(1, sproze.cfr_renamed_533(arg0, n, n + arg2));
    }

    /*
     * Exception decompiling
     */
    public static short[] cfr_renamed_10230(sprmr var0, sprpek var1, byte[] var2, int var3, int var4, int var5, short[] var6, short[] var7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1631)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1871)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:461)
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

    public static byte[] cfr_renamed_10232(sprmr arg0, sprpek arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        byte[] byArray = arg2;
        int n = arg5;
        int n2 = n / 2;
        int n3 = n - n2;
        short[] sArray = sprzal.cfr_renamed_10228(arg3, arg4, n3);
        short[] sArray2 = sprzal.cfr_renamed_10228(arg3, arg4 + n3, n2);
        return sprzal.cfr_renamed_10229(sprzal.cfr_renamed_10233(arg0, arg1, byArray, n, n2, n3, sArray, sArray2));
    }

    public static short[] cfr_renamed_10234(sprmr arg0, sprpek arg1, byte[] arg2, short[] arg3, int arg4, int arg5) {
        byte[] byArray = arg2;
        int n = arg5;
        int n2 = n / 2;
        int n3 = n - n2;
        short[] sArray = new short[n3];
        short[] sArray2 = new short[n2];
        System.arraycopy(arg3, arg4, sArray, 0, n3);
        System.arraycopy(arg3, arg4 + n3, sArray2, 0, n2);
        return sprzal.cfr_renamed_10233(arg0, arg1, byArray, n, n2, n3, sArray, sArray2);
    }

    public static void cfr_renamed_10235(byte[] arg0) {
        int n;
        int n2 = arg0.length / 2;
        int n3 = arg0.length - 1;
        int n4 = n = 0;
        while (n4 < n2) {
            byte by = arg0[n];
            arg0[n] = arg0[n3 - n];
            int n5 = n3 - n;
            arg0[n5] = by;
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_10227(sprmr sprmr2, boolean bl, int n, byte[] byArray, int n2, int n3) {
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        void arg2;
        sprmr arg0;
        sprzal.cfr_renamed_10236(arg0);
        if (n < 2 || arg2 > 256) {
            throw new IllegalArgumentException();
        }
        sprzal.cfr_renamed_10237((boolean)arg1, (int)arg2, (byte[])arg3, (int)arg4, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10238(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprmr sprmr3 = arg0;
        sprzal.cfr_renamed_10227(sprmr3, true, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        void var6_6 = arg5;
        void var7_7 = var6_6 / 2;
        void var8_8 = var6_6 - var7_7;
        short[] sArray = sprzal.cfr_renamed_10228((byte[])arg3, (int)arg4, (int)var7_7);
        short[] sArray2 = sprzal.cfr_renamed_10228(byArray2, (int)(arg4 + var7_7), (int)var8_8);
        return sprzal.cfr_renamed_10229(sprzal.cfr_renamed_10239(sprmr3, (sprpek)arg1, (byte[])arg2, (int)var6_6, (int)var7_7, (int)var8_8, sArray, sArray2));
    }

    public static void cfr_renamed_10236(sprmr arg0) {
        if (16 != arg0.cfr_renamed_1195()) {
            throw new IllegalArgumentException();
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ short[] cfr_renamed_10240(sprmr arg0, sprpek arg1, byte[] arg2, int arg3, int arg4, int arg5, short[] arg6, short[] arg7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1631)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1871)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:461)
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

    public static void cfr_renamed_10241(boolean arg0, int arg1, short[] arg2, int arg3, int arg4) {
        int n;
        sprzal.cfr_renamed_10242(arg0, arg1, arg4);
        int n2 = n = 0;
        while (n2 < arg4) {
            if ((arg2[arg3 + n] & 0xFFFF) >= arg1) {
                throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("bX{C\u007f\u0016oW\u007fW+Y~Bx_oS+Ym\u0016yWo_s"));
            }
            n2 = ++n;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ short[] cfr_renamed_10233(sprmr arg0, sprpek arg1, byte[] arg2, int arg3, int arg4, int arg5, short[] arg6, short[] arg7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1631)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1871)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:461)
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

    /*
     * Exception decompiling
     */
    private static /* synthetic */ short[] cfr_renamed_10239(sprmr var0, sprpek var1, byte[] var2, int var3, int var4, int var5, short[] var6, short[] var7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1631)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1871)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:461)
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

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10243(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10227(arg0, false, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 8) {
            throw new IllegalArgumentException();
        }
        return sprzal.cfr_renamed_10244(arg0, (sprpek)arg1, (byte[])arg2, (byte[])arg3, (int)arg4, (int)arg5);
    }

    public static byte[] cfr_renamed_10245(byte[] arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[8];
        byArray[0] = arg0[0];
        byArray[1] = arg0[1];
        byArray[2] = arg0[2];
        byArray[3] = (byte)(arg0[3] & 0xF0);
        byArray[4] = arg0[4];
        byArray[5] = arg0[5];
        byArray2[6] = arg0[6];
        byArray[7] = (byte)(arg0[3] << 4);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public static short[] cfr_renamed_10246(sprmr sprmr2, sprpek sprpek2, byte[] byArray, short[] sArray, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprmr sprmr3 = arg0;
        sprzal.cfr_renamed_10247(sprmr3, true, arg1.cfr_renamed_9210(), (short[])arg3, (int)arg4, (int)arg5);
        int n3 = n2;
        int n4 = n3 / 2;
        int n5 = n3 - n4;
        short[] sArray2 = new short[n4];
        short[] sArray3 = new short[n5];
        void v1 = arg3;
        System.arraycopy(v1, (int)arg4, sArray2, 0, n4);
        System.arraycopy(v1, (int)(arg4 + n4), sArray3, 0, n5);
        return sprzal.cfr_renamed_10239(sprmr3, (sprpek)arg1, (byte[])arg2, n3, n4, n5, sArray2, sArray3);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_10247(sprmr sprmr2, boolean bl, int n, short[] sArray, int n2, int n3) {
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        void arg2;
        sprmr arg0;
        sprzal.cfr_renamed_10236(arg0);
        if (n < 2 || arg2 > 65536) {
            throw new IllegalArgumentException();
        }
        sprzal.cfr_renamed_10241((boolean)arg1, (int)arg2, (short[])arg3, (int)arg4, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    public static short[] cfr_renamed_10248(sprmr sprmr2, sprpek sprpek2, byte[] byArray, short[] sArray, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10247(arg0, false, arg1.cfr_renamed_9210(), (short[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 7) {
            throw new IllegalArgumentException(sprayca.cfr_renamed_9("\"{3m=,%d9y:hvn3,c:vn?x%"));
        }
        byte[] byArray2 = sprzal.cfr_renamed_10245((byte[])arg2);
        return sprzal.cfr_renamed_10249(arg0, (sprpek)arg1, byArray2, (short[])arg3, (int)arg4, (int)arg5);
    }

    private static /* synthetic */ void cfr_renamed_10242(boolean arg0, int arg1, int arg2) {
        int n;
        if (arg2 < 2 || Math.pow(arg1, arg2) < 1000000.0) {
            throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("bX{C\u007f\u0016\u007fYd\u0016x^dD\u007f"));
        }
        if (!arg0 && arg2 > (n = 2 * (int)Math.floor(Math.log(cfr_renamed_0) / Math.log(arg1)))) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprayca.cfr_renamed_9("a7t?a#ave8|#xv`3b1x>,?\u007fv")).append(n).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10250(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10227(arg0, false, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 7) {
            throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("\u007fAnW`\u0016x^dCgR+Tn\u0016>\u0000+TbBx"));
        }
        byte[] byArray3 = sprzal.cfr_renamed_10245((byte[])arg2);
        return sprzal.cfr_renamed_10244(arg0, (sprpek)arg1, byArray3, (byte[])arg3, (int)arg4, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10251(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10227(arg0, false, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 7) {
            throw new IllegalArgumentException(sprayca.cfr_renamed_9("\"{3m=,%d9y:hvn3,c:vn?x%"));
        }
        byte[] byArray3 = sprzal.cfr_renamed_10245((byte[])arg2);
        return sprzal.cfr_renamed_10252(arg0, (sprpek)arg1, byArray3, (byte[])arg3, (int)arg4, (int)arg5);
    }

    public static BigInteger cfr_renamed_10253(sprmr arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5, short[] arg6, sprpek arg7) {
        byte[] byArray;
        int n = arg1.length;
        byte[] byArray2 = sprhdf.cfr_renamed_514(arg7.cfr_renamed_9868(arg6));
        int n2 = -(n + arg2 + 1) & 0xF;
        byte[] byArray3 = new byte[n + n2 + 1 + arg2];
        System.arraycopy(arg1, 0, byArray3, 0, n);
        byArray3[n + n2] = (byte)arg4;
        System.arraycopy(byArray2, 0, byArray3, byArray3.length - byArray2.length, byArray2.length);
        byte[] byArray4 = byArray = sprzal.cfr_renamed_10254(arg0, sproze.cfr_renamed_543(arg5, byArray3));
        if (arg3 > 16) {
            int n3;
            int n4 = (arg3 + 16 - 1) / 16;
            byArray4 = new byte[n4 * 16];
            System.arraycopy(byArray, 0, byArray4, 0, 16);
            byte[] byArray5 = new byte[4];
            int n5 = n3 = 1;
            while (n5 < n4) {
                int n6 = n3 * 16;
                System.arraycopy(byArray, 0, byArray4, n6, 16);
                sprpxe.cfr_renamed_442(n3, byArray5, 0);
                sprzal.cfr_renamed_10067(byArray5, 0, byArray4, n6 + 16 - 4, 4);
                int n7 = n6;
                arg0.cfr_renamed_3064(byArray4, n7, byArray4, n7);
                n5 = ++n3;
            }
        }
        return sprzal.cfr_renamed_10231(byArray4, 0, arg3);
    }

    public static BigInteger[] cfr_renamed_10255(BigInteger arg0, int arg1, int arg2) {
        BigInteger[] bigIntegerArray;
        bigIntegerArray = new BigInteger[]{arg0.pow(arg1), bigIntegerArray[0]};
        if (arg2 != arg1) {
            bigIntegerArray[1] = bigIntegerArray[1].multiply(arg0);
        }
        return bigIntegerArray;
    }

    public static byte[] cfr_renamed_10256(int arg0, byte arg1, int arg2, int arg3) {
        byte[] byArray = new byte[16];
        byArray[0] = 1;
        byArray[1] = 2;
        byArray[2] = 1;
        byArray[3] = 0;
        byArray[4] = (byte)(arg0 >> 8);
        byArray[5] = (byte)arg0;
        byArray[6] = 10;
        byArray[7] = arg1;
        sprpxe.cfr_renamed_442(arg2, byArray, 8);
        sprpxe.cfr_renamed_442(arg3, byArray, 12);
        return byArray;
    }

    public static short[] cfr_renamed_10249(sprmr arg0, sprpek arg1, byte[] arg2, short[] arg3, int arg4, int arg5) {
        byte[] byArray = arg2;
        int n = arg5;
        int n2 = n / 2;
        int n3 = n - n2;
        short[] sArray = new short[n3];
        short[] sArray2 = new short[n2];
        System.arraycopy(arg3, arg4, sArray, 0, n3);
        System.arraycopy(arg3, arg4 + n3, sArray2, 0, n2);
        return sprzal.cfr_renamed_10240(arg0, arg1, byArray, n, n2, n3, sArray, sArray2);
    }

    public static byte[] cfr_renamed_10244(sprmr arg0, sprpek arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        byte[] byArray = arg2;
        int n = arg5;
        int n2 = n / 2;
        int n3 = n - n2;
        short[] sArray = sprzal.cfr_renamed_10228(arg3, arg4, n3);
        short[] sArray2 = sprzal.cfr_renamed_10228(arg3, arg4 + n3, n2);
        return sprzal.cfr_renamed_10229(sprzal.cfr_renamed_10240(arg0, arg1, byArray, n, n2, n3, sArray, sArray2));
    }

    /*
     * WARNING - void declaration
     */
    public static short[] cfr_renamed_10257(sprmr sprmr2, sprpek sprpek2, byte[] byArray, short[] sArray, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10247(arg0, false, arg1.cfr_renamed_9210(), (short[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 7) {
            throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("\u007fAnW`\u0016x^dCgR+Tn\u0016>\u0000+TbBx"));
        }
        byte[] byArray2 = sprzal.cfr_renamed_10245((byte[])arg2);
        return sprzal.cfr_renamed_10258(arg0, (sprpek)arg1, byArray2, (short[])arg3, (int)arg4, (int)arg5);
    }

    private static /* synthetic */ short[] cfr_renamed_10228(byte[] arg0, int arg1, int arg2) {
        int n;
        short[] sArray = new short[arg2];
        int n2 = n = 0;
        while (n2 != sArray.length) {
            int n3 = n++;
            sArray[n3] = (short)(arg0[arg1 + n3] & 0xFF);
            n2 = n;
        }
        return sArray;
    }

    public static void cfr_renamed_10067(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            byte by = (byte)(arg2[n3] ^ arg0[arg1 + n]);
            arg2[n3] = by;
            n2 = ++n;
        }
    }

    public static BigInteger cfr_renamed_10259(sprmr arg0, byte[] arg1, int arg2, int arg3, short[] arg4, sprpek arg5) {
        byte[] byArray = new byte[16];
        sprpxe.cfr_renamed_442(arg3, byArray, 0);
        sprzal.cfr_renamed_10067(arg1, arg2, byArray, 0, 4);
        byte[] byArray2 = sprhdf.cfr_renamed_514(arg5.cfr_renamed_9868(arg4));
        if (byArray.length - byArray2.length < 4) {
            throw new IllegalStateException(sprayca.cfr_renamed_9("e8|#xvc#xvc0,$m8k3"));
        }
        System.arraycopy(byArray2, 0, byArray, byArray.length - byArray2.length, byArray2.length);
        sprzal.cfr_renamed_10235(byArray);
        arg0.cfr_renamed_3064(byArray, 0, byArray, 0);
        sprzal.cfr_renamed_10235(byArray);
        byte[] byArray3 = byArray;
        return sprzal.cfr_renamed_10231(byArray3, 0, byArray3.length);
    }

    /*
     * WARNING - void declaration
     */
    public static short[] cfr_renamed_10258(sprmr sprmr2, sprpek sprpek2, byte[] byArray, short[] sArray, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10247(arg0, false, arg1.cfr_renamed_9210(), (short[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 8) {
            throw new IllegalArgumentException();
        }
        return sprzal.cfr_renamed_10234(arg0, (sprpek)arg1, (byte[])arg2, (short[])arg3, (int)arg4, (int)arg5);
    }

    public static int cfr_renamed_10260(int arg0, int arg1) {
        int n = spruaf.cfr_renamed_5203(arg0);
        int n2 = n * arg1;
        int n3 = arg0 >>> n;
        if (n3 != 1) {
            n2 += BigInteger.valueOf(n3).pow(arg1).bitLength();
        }
        return (n2 + 7) / 8;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] cfr_renamed_10252(sprmr sprmr2, sprpek sprpek2, byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprzal.cfr_renamed_10227(arg0, false, arg1.cfr_renamed_9210(), (byte[])arg3, (int)arg4, (int)arg5);
        if (byArray.length != 8) {
            throw new IllegalArgumentException();
        }
        return sprzal.cfr_renamed_10232(arg0, (sprpek)arg1, (byte[])arg2, (byte[])arg3, (int)arg4, (int)arg5);
    }

    private static /* synthetic */ byte[] cfr_renamed_10229(short[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public static void cfr_renamed_10261(short[] arg0) {
        int n;
        int n2 = arg0.length / 2;
        int n3 = arg0.length - 1;
        int n4 = n = 0;
        while (n4 < n2) {
            short s = arg0[n];
            arg0[n] = arg0[n3 - n];
            int n5 = n3 - n;
            arg0[n5] = s;
            n4 = ++n;
        }
    }

    public static void cfr_renamed_10237(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        sprzal.cfr_renamed_10242(arg0, arg1, arg4);
        int n2 = n = 0;
        while (n2 < arg4) {
            if ((arg2[arg3 + n] & 0xFF) >= arg1) {
                throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("bX{C\u007f\u0016oW\u007fW+Y~Bx_oS+Ym\u0016yWo_s"));
            }
            n2 = ++n;
        }
    }

    static {
        cfr_renamed_3 = Math.log(2.0);
        cfr_renamed_0 = Math.pow(2.0, 96.0);
    }

    /*
     * WARNING - void declaration
     */
    public static short[] cfr_renamed_10262(sprmr sprmr2, sprpek sprpek2, byte[] byArray, short[] sArray, int n, int n2) {
        void arg2;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        sprmr arg0;
        sprmr sprmr3 = arg0;
        sprzal.cfr_renamed_10247(sprmr3, true, arg1.cfr_renamed_9210(), (short[])arg3, (int)arg4, (int)arg5);
        int n3 = n2;
        int n4 = n3 / 2;
        int n5 = n3 - n4;
        short[] sArray2 = new short[n4];
        short[] sArray3 = new short[n5];
        void v1 = arg3;
        System.arraycopy(v1, (int)arg4, sArray2, 0, n4);
        System.arraycopy(v1, (int)(arg4 + n4), sArray3, 0, n5);
        return sprzal.cfr_renamed_10230(sprmr3, (sprpek)arg1, (byte[])arg2, n3, n4, n5, sArray2, sArray3);
    }

    public static byte[] cfr_renamed_10254(sprmr arg0, byte[] arg1) {
        int n;
        if (arg1.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int n2 = arg1.length / 16;
        byte[] byArray = new byte[16];
        int n3 = n = 0;
        while (n3 < n2) {
            sprzal.cfr_renamed_10067(arg1, n * 16, byArray, 0, 16);
            arg0.cfr_renamed_3064(byArray, 0, byArray, 0);
            n3 = ++n;
        }
        return byArray;
    }
}

