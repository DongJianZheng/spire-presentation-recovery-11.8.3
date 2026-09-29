/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfdg;
import com.spire.presentation.packages.sprfeg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprkyf;
import com.spire.presentation.packages.sprleg;
import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrtea;
import com.spire.presentation.packages.sprryf;
import com.spire.presentation.packages.sprvtf;
import com.spire.presentation.packages.sprwag;

public class sprzuf
implements sprgm {
    private byte[] cfr_renamed_3;
    private final sprptf cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_6057(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != arg2) {
            int n3 = arg1 + n;
            arg0[n3] = 0;
            n2 = ++n;
        }
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        sprzuf sprzuf2 = this;
        return sprzuf2.cfr_renamed_6058(sprzuf2.cfr_renamed_4, arg0, arg1, this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_6059(sprptf arg0, byte[] arg1, byte[] arg2) {
        sprkyf sprkyf2;
        sprkyf sprkyf3;
        int n;
        byte[] byArray = new byte[41000];
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[64];
        long[] lArray = new long[8];
        byte[] byArray4 = new byte[32];
        byte[] byArray5 = new byte[32];
        byte[] byArray6 = new byte[1024];
        byte[] byArray7 = new byte[1088];
        int n2 = n = 0;
        while (n2 < 1088) {
            int n3 = n++;
            byArray7[n3] = arg2[n3];
            n2 = n;
        }
        int n4 = 40968;
        System.arraycopy(byArray7, 1056, byArray, n4, 32);
        sprgf sprgf2 = arg0.cfr_renamed_6060();
        Object object = new byte[sprgf2.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1197(byArray, n4, 32);
        sprgf2.cfr_renamed_1197(arg1, 0, arg1.length);
        sprgf2.cfr_renamed_1219((byte[])object, 0);
        this.cfr_renamed_6057(byArray, n4, 32);
        int n5 = 0;
        int n6 = n5;
        while (n6 != lArray.length) {
            int n7 = n5++;
            lArray[n7] = sprpxe.cfr_renamed_443(object, n7 * 8);
            n6 = n5;
        }
        long l = lArray[0] & 0xFFFFFFFFFFFFFFFL;
        System.arraycopy(object, 16, byArray2, 0, 32);
        n4 = 39912;
        System.arraycopy(byArray2, 0, byArray, n4, 32);
        sprkyf sprkyf4 = sprkyf3 = new sprkyf();
        sprkyf3.cfr_renamed_2 = 11;
        sprkyf4.cfr_renamed_3 = 0L;
        sprkyf4.cfr_renamed_4 = 0L;
        int n8 = n4 + 32;
        System.arraycopy(byArray7, 32, byArray, n8, 1024);
        sprfeg.cfr_renamed_6052(arg0, byArray, n8 + 1024, 5, byArray7, sprkyf3, byArray, n8);
        sprgf sprgf3 = sprgf2 = arg0.cfr_renamed_6060();
        sprgf3.cfr_renamed_1197(byArray, n4, 1088);
        sprgf3.cfr_renamed_1197(arg1, 0, arg1.length);
        sprgf2.cfr_renamed_1219(byArray3, 0);
        sprkyf sprkyf5 = sprkyf2 = new sprkyf();
        sprkyf2.cfr_renamed_2 = 12;
        sprkyf5.cfr_renamed_4 = (int)(l & 0x1FL);
        sprkyf5.cfr_renamed_3 = l >>> 5;
        n = 0;
        int n9 = n;
        while (n9 < 32) {
            int n10 = n++;
            byArray[n10] = byArray2[n10];
            n9 = n;
        }
        int n11 = 32;
        System.arraycopy(byArray7, 32, byArray6, 0, 1024);
        int n12 = n = 0;
        while (n12 < 8) {
            int n13 = n11 + n;
            byte by = (byte)(l >>> 8 * n & 0xFFL);
            byArray[n13] = by;
            n12 = ++n;
        }
        sprvtf.cfr_renamed_6056(arg0, byArray5, 0, byArray7, sprkyf2);
        object = new sprleg();
        int n14 = sprleg.cfr_renamed_6061(arg0, byArray, n11 += 8, byArray4, byArray5, byArray6, byArray3);
        n11 += n14;
        sprfdg sprfdg2 = new sprfdg();
        n = 0;
        int n15 = n;
        while (n15 < 12) {
            sprkyf2.cfr_renamed_2 = n++;
            sprptf sprptf2 = arg0;
            sprvtf.cfr_renamed_6056(sprptf2, byArray5, 0, byArray7, sprkyf2);
            int n16 = n11;
            sprfdg2.cfr_renamed_6051(sprptf2, byArray, n16, byArray4, byArray5, byArray6);
            int n17 = n11 += 2144;
            n11 += 160;
            sprzuf.cfr_renamed_6062(arg0, byArray4, byArray, n17, sprkyf2, byArray7, byArray6, 5);
            sprkyf2.cfr_renamed_4 = (int)(sprkyf2.cfr_renamed_3 & 0x1FL);
            sprkyf2.cfr_renamed_3 >>>= 5;
            n15 = n;
        }
        this.cfr_renamed_6057(byArray7, 0, 1088);
        return byArray;
    }

    public static void cfr_renamed_6062(sprptf arg0, byte[] arg1, byte[] arg2, int arg3, sprkyf arg4, byte[] arg5, byte[] arg6, int arg7) {
        int n;
        sprkyf sprkyf2 = new sprkyf(arg4);
        byte[] byArray = new byte[2048];
        byte[] byArray2 = new byte[1024];
        byte[] byArray3 = new byte[68608];
        sprkyf sprkyf3 = sprkyf2;
        sprkyf2.cfr_renamed_4 = 0L;
        while (sprkyf3.cfr_renamed_4 < 32L) {
            sprkyf sprkyf4 = sprkyf2;
            sprkyf3 = sprkyf4;
            sprvtf.cfr_renamed_6056(arg0, byArray2, (int)(sprkyf4.cfr_renamed_4 * 32L), arg5, sprkyf2);
            ++sprkyf4.cfr_renamed_4;
        }
        sprfdg sprfdg2 = new sprfdg();
        sprkyf sprkyf5 = sprkyf2;
        sprkyf2.cfr_renamed_4 = 0L;
        while (sprkyf5.cfr_renamed_4 < 32L) {
            sprkyf sprkyf6 = sprkyf2;
            sprkyf5 = sprkyf6;
            sprfdg2.cfr_renamed_6049(arg0, byArray3, (int)(sprkyf2.cfr_renamed_4 * 67L * 32L), byArray2, (int)(sprkyf2.cfr_renamed_4 * 32L), arg6, 0);
            ++sprkyf6.cfr_renamed_4;
        }
        sprkyf sprkyf7 = sprkyf2;
        sprkyf2.cfr_renamed_4 = 0L;
        while (sprkyf7.cfr_renamed_4 < 32L) {
            sprkyf sprkyf8 = sprkyf2;
            sprkyf7 = sprkyf8;
            sprfeg.cfr_renamed_6055(arg0, byArray, (int)(1024L + sprkyf2.cfr_renamed_4 * 32L), byArray3, (int)(sprkyf2.cfr_renamed_4 * 67L * 32L), arg6, 0);
            ++sprkyf8.cfr_renamed_4;
        }
        int n2 = 0;
        int n3 = n = 32;
        while (n3 > 0) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < n) {
                arg0.cfr_renamed_6054(byArray, (n >>> 1) * 32 + ((n4 += 2) >>> 1) * 32, byArray, n * 32 + n4 * 32, arg6, 2 * (7 + n2) * 32);
                n5 = n4;
            }
            ++n2;
            n3 = n >>> 1;
        }
        int n6 = (int)arg4.cfr_renamed_4;
        int n7 = n = 0;
        while (n7 < arg7) {
            int n8 = (32 >>> n) * 32 + (n6 >>> n ^ 1) * 32;
            int n9 = n * 32;
            System.arraycopy(byArray, n8, arg2, arg3 + n9, 32);
            n7 = ++n;
        }
        System.arraycopy(byArray, 32, arg1, 0, 32);
    }

    /*
     * WARNING - void declaration
     */
    public sprzuf(sprgf sprgf2, sprgf sprgf3) {
        void arg0;
        void arg1;
        if (sprgf2.cfr_renamed_1218() != 32) {
            throw new IllegalArgumentException(sprrtea.cfr_renamed_9("'\u0000-D.H:YiC,H-^iY&\r9_&I<N,\rz\u001fiO0Y,^iB/\r&X=]<Y"));
        }
        if (arg1.cfr_renamed_1218() != 64) {
            throw new IllegalArgumentException(sprahe.cfr_renamed_9("h1w;38?,.\u007f4:?;)\u007f.0z/(0>*9:zin\u007f8&.:)\u007f59z0/+**."));
        }
        this.cfr_renamed_4 = new sprptf((sprgf)arg0, (sprgf)arg1);
    }

    /*
     * Exception decompiling
     */
    public boolean cfr_renamed_6058(sprptf arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Duplicate versioned SSA Ident.
         *     at org.benf.cfr.reader.bytecode.analysis.parse.utils.LValueAssignmentAndAliasCondenser.collectMutatedLValue(LValueAssignmentAndAliasCondenser.java:94)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentPreMutation.collectLValueAssignments(AssignmentPreMutation.java:80)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.collect(Op03SimpleStatement.java:471)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LValueProp.condenseLValues(LValueProp.java:29)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:577)
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
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                this.cfr_renamed_3 = ((sprwag)((sprbgk)arg1).cfr_renamed_284()).cfr_renamed_5683();
                return;
            }
            this.cfr_renamed_3 = ((sprwag)arg1).cfr_renamed_5683();
            return;
        }
        this.cfr_renamed_3 = ((sprryf)arg1).cfr_renamed_5683();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_125(byte[] byArray) {
        void arg0;
        sprzuf sprzuf2 = this;
        return sprzuf2.cfr_renamed_6059(this.cfr_renamed_4, (byte[])arg0, sprzuf2.cfr_renamed_3);
    }

    public static void cfr_renamed_6063(sprptf arg0, byte[] arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7) {
        int n;
        int n2;
        byte[] byArray = new byte[64];
        if ((arg3 & 1) != 0) {
            int n3 = n2 = 0;
            while (n3 < 32) {
                int n4 = 32 + n2;
                byte by = arg2[n2];
                byArray[n4] = by;
                n3 = ++n2;
            }
            int n5 = n2 = 0;
            while (n5 < 32) {
                int n6 = n2++;
                byArray[n6] = arg4[arg5 + n6];
                n5 = n2;
            }
        } else {
            int n7 = n2 = 0;
            while (n7 < 32) {
                int n8 = n2++;
                byArray[n8] = arg2[n8];
                n7 = n2;
            }
            int n9 = n2 = 0;
            while (n9 < 32) {
                int n10 = 32 + n2;
                byte by = arg4[arg5 + n2];
                byArray[n10] = by;
                n9 = ++n2;
            }
        }
        int n11 = arg5 + 32;
        int n12 = n = 0;
        while (n12 < arg7 - 1) {
            if (((arg3 >>>= 1) & 1) != 0) {
                arg0.cfr_renamed_6054(byArray, 32, byArray, 0, arg6, 2 * (7 + n) * 32);
                n2 = 0;
                int n13 = n2;
                while (n13 < 32) {
                    int n14 = n2++;
                    byArray[n14] = arg4[n11 + n14];
                    n13 = n2;
                }
            } else {
                arg0.cfr_renamed_6054(byArray, 0, byArray, 0, arg6, 2 * (7 + n) * 32);
                n2 = 0;
                int n15 = n2;
                while (n15 < 32) {
                    int n16 = n2 + 32;
                    byte by = arg4[n11 + n2];
                    byArray[n16] = by;
                    n15 = ++n2;
                }
            }
            n11 += 32;
            n12 = ++n;
        }
        arg0.cfr_renamed_6054(arg1, 0, byArray, 0, arg6, 2 * (7 + arg7 - 1) * 32);
    }
}

