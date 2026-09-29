/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprxxda;

@sprtea
public class sprkxo
extends sprjto {
    private static String[] cfr_renamed_112;
    private static String[] cfr_renamed_119;
    private static String[] cfr_renamed_91;
    private static String[] cfr_renamed_0;
    private static String[] cfr_renamed_1;
    private static String[] cfr_renamed_2;
    private static String[] cfr_renamed_3;
    private static String[] cfr_renamed_4;

    @Override
    public String[] cfr_renamed_17203() {
        return cfr_renamed_3;
    }

    @Override
    public String cfr_renamed_17204() {
        return sprxxda.cfr_renamed_9("t\u0018t");
    }

    @Override
    @sprtea
    public void cfr_renamed_16916(StringBuilder arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        this.cfr_renamed_17195(arg0, arg2 ? cfr_renamed_4[arg1 - 1] : cfr_renamed_112[arg1 - 1], true);
    }

    @Override
    @sprtea
    public void cfr_renamed_17178(StringBuilder arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        if (arg1 < 20) {
            if (arg1 > 0) {
                sprkxo sprkxo2 = this;
                sprkxo2.cfr_renamed_17195(arg0, sprkxo2.cfr_renamed_17205(arg1, arg3), true);
                return;
            }
        } else {
            if (arg1 > 20 && arg1 < 30) {
                int n = arg1 - 20;
                if (arg3) {
                    this.cfr_renamed_17195(arg0, cfr_renamed_1[n - 1], true);
                    return;
                }
                this.cfr_renamed_17195(arg0, this.cfr_renamed_17206(2, false) + this.cfr_renamed_17207() + this.cfr_renamed_17205(n, false), true);
                return;
            }
            int n = arg1 / 10;
            sprkxo sprkxo3 = this;
            if ((arg1 -= 10 * n) == 0) {
                sprkxo3.cfr_renamed_17195(arg0, this.cfr_renamed_17206(n, arg3), true);
                return;
            }
            sprkxo sprkxo4 = this;
            sprkxo3.cfr_renamed_17195(arg0, new StringBuilder().insert(0, this.cfr_renamed_17206(n, arg3)).append(arg3 ? sprkxo4.cfr_renamed_17204() : sprkxo4.cfr_renamed_17207()).append(this.cfr_renamed_17205(arg1, arg3)).toString(), true);
        }
    }

    @Override
    @sprtea
    public String cfr_renamed_17196(int arg0, boolean arg1, int arg2, sprtvp arg3) {
        return cfr_renamed_119[arg0 - 1];
    }

    @Override
    @sprtea
    public boolean cfr_renamed_17193() {
        return false;
    }

    static {
        String[] stringArray = new String[19];
        stringArray[0] = spruzy.cfr_renamed_9("~\u000bd");
        stringArray[1] = sprxxda.cfr_renamed_9("0\u000e'");
        stringArray[2] = spruzy.cfr_renamed_9("\u0011y\u0000x");
        stringArray[3] = sprxxda.cfr_renamed_9("\u0002!\u0000 \u0013;");
        stringArray[4] = spruzy.cfr_renamed_9("h\fe\u0006d");
        stringArray[5] = sprxxda.cfr_renamed_9("\u00121\b'");
        stringArray[6] = spruzy.cfr_renamed_9("x\fn\u0011n");
        stringArray[7] = sprxxda.cfr_renamed_9("\u000e7\t;");
        stringArray[8] = spruzy.cfr_renamed_9("e\u0010n\u0013n");
        stringArray[9] = sprxxda.cfr_renamed_9("\u0005=\u0004.");
        stringArray[10] = spruzy.cfr_renamed_9("\ne\u0006n");
        stringArray[11] = sprxxda.cfr_renamed_9("\u0005;\u00021");
        stringArray[12] = spruzy.cfr_renamed_9("\u007f\u0017n\u0006n");
        stringArray[13] = sprxxda.cfr_renamed_9("7\u0000 \u000e&\u00021");
        stringArray[14] = spruzy.cfr_renamed_9("\u0014~\fe\u0006n");
        stringArray[15] = sprxxda.cfr_renamed_9("0\b1\u0002=\u0012\u00bd\b'");
        stringArray[16] = spruzy.cfr_renamed_9("\u0001b\u0000h\fx\fn\u0011n");
        stringArray[17] = sprxxda.cfr_renamed_9("0\b1\u0002=\u000e7\t;");
        stringArray[18] = spruzy.cfr_renamed_9("\u0001b\u0000h\fe\u0010n\u0013n");
        cfr_renamed_0 = stringArray;
        String[] stringArray2 = new String[19];
        stringArray2[0] = sprxxda.cfr_renamed_9("$\u0013=\f1\u0013;");
        stringArray2[1] = spruzy.cfr_renamed_9("x\u0000l\u0010e\u0001d");
        stringArray2[2] = sprxxda.cfr_renamed_9(" \u0004&\u00021\u0013;");
        stringArray2[3] = spruzy.cfr_renamed_9("\u0006~\u0004y\u0011d");
        stringArray2[4] = sprxxda.cfr_renamed_9("\u0010!\b:\u0015;");
        stringArray2[5] = spruzy.cfr_renamed_9("x\u0000s\u0011d");
        stringArray2[6] = sprxxda.cfr_renamed_9("'\u0088$\u0015=\f;");
        stringArray2[7] = spruzy.cfr_renamed_9("\nh\u0011j\u0013d");
        stringArray2[8] = sprxxda.cfr_renamed_9("\u000f;\u00171\u000f;");
        stringArray2[9] = spruzy.cfr_renamed_9("\u0001\u00e2\u0006b\bd");
        stringArray2[10] = sprxxda.cfr_renamed_9("\u0014:\u0005\u00bd\u0002=\f;");
        stringArray2[11] = spruzy.cfr_renamed_9("o\u0010d\u0001\u00e2\u0006b\bd");
        stringArray2[12] = sprxxda.cfr_renamed_9("0\u00047\b9\u000e \u0004&\u00021\u0013;");
        stringArray2[13] = spruzy.cfr_renamed_9("\u0001n\u0006b\bd\u0006~\u0004y\u0011d");
        stringArray2[14] = sprxxda.cfr_renamed_9("\u00051\u0002=\f;\u0010!\b:\u0015;");
        stringArray2[15] = spruzy.cfr_renamed_9("o\u0000h\ff\nx\u0000s\u0011d");
        stringArray2[16] = sprxxda.cfr_renamed_9("0\u00047\b9\u000e'\u0088$\u0015=\f;");
        stringArray2[17] = spruzy.cfr_renamed_9("o\u0000h\ff\nh\u0011j\u0013d");
        stringArray2[18] = sprxxda.cfr_renamed_9("\u00051\u0002=\f;\u000f;\u00171\u000f;");
        cfr_renamed_91 = stringArray2;
        String[] stringArray3 = new String[8];
        stringArray3[0] = spruzy.cfr_renamed_9("\u0013n\fe\u0011n");
        stringArray3[1] = sprxxda.cfr_renamed_9(" \u00131\b:\u00155");
        stringArray3[2] = spruzy.cfr_renamed_9("\u0006~\u0004y\u0000e\u0011j");
        stringArray3[3] = sprxxda.cfr_renamed_9("7\b:\u0002!\u0004:\u00155");
        stringArray3[4] = spruzy.cfr_renamed_9("x\u0000x\u0000e\u0011j");
        stringArray3[5] = sprxxda.cfr_renamed_9("'\u0004 \u0004:\u00155");
        stringArray3[6] = spruzy.cfr_renamed_9("d\u0006c\u0000e\u0011j");
        stringArray3[7] = sprxxda.cfr_renamed_9(":\u000e\"\u0004:\u00155");
        cfr_renamed_3 = stringArray3;
        String[] stringArray4 = new String[9];
        stringArray4[0] = spruzy.cfr_renamed_9("}\u0000b\u000b\u007f\f~\u000bd");
        stringArray4[1] = sprxxda.cfr_renamed_9("\"\u0004=\u000f \b0\u0092'");
        stringArray4[2] = spruzy.cfr_renamed_9("\u0013n\fe\u0011b\u0011y\u008cx");
        stringArray4[3] = sprxxda.cfr_renamed_9("\u00171\b:\u0015=\u0002!\u0000 \u0013;");
        stringArray4[4] = spruzy.cfr_renamed_9("}\u0000b\u000b\u007f\fh\fe\u0006d");
        stringArray4[5] = sprxxda.cfr_renamed_9("\u00171\b:\u0015=\u0012\u00bd\b'");
        stringArray4[6] = spruzy.cfr_renamed_9("}\u0000b\u000b\u007f\fx\fn\u0011n");
        stringArray4[7] = sprxxda.cfr_renamed_9("\u00171\b:\u0015=\u000e7\t;");
        stringArray4[8] = spruzy.cfr_renamed_9("}\u0000b\u000b\u007f\fe\u0010n\u0013n");
        cfr_renamed_1 = stringArray4;
        String[] stringArray5 = new String[8];
        stringArray5[0] = sprxxda.cfr_renamed_9("\u0017=\u0006\u00bd\u0012=\f;");
        stringArray5[1] = spruzy.cfr_renamed_9("\u007f\u0017b\u0002\u00e2\u0016b\bd");
        stringArray5[2] = sprxxda.cfr_renamed_9("\u0002!\u00000\u00135\u0006\u00bd\u0012=\f;");
        stringArray5[3] = spruzy.cfr_renamed_9("z\u0010b\u000bh\u0010j\u0002\u00e2\u0016b\bd");
        stringArray5[4] = sprxxda.cfr_renamed_9("\u00121\u00195\u0006\u00bd\u0012=\f;");
        stringArray5[5] = spruzy.cfr_renamed_9("\u0016n\u0015\u007f\u0010j\u0002\u00e2\u0016b\bd");
        stringArray5[6] = sprxxda.cfr_renamed_9("\u000e7\u0015;\u0006\u00bd\u0012=\f;");
        stringArray5[7] = spruzy.cfr_renamed_9("\u000bd\u000bj\u0002\u00e2\u0016b\bd");
        cfr_renamed_2 = stringArray5;
        String[] stringArray6 = new String[9];
        stringArray6[0] = sprxxda.cfr_renamed_9("\u0002=\u0004:\u0015;");
        stringArray6[1] = spruzy.cfr_renamed_9("\u0001d\u0016h\fn\u000b\u007f\nx");
        stringArray6[2] = sprxxda.cfr_renamed_9(" \u00131\u00127\b1\u000f \u000e'");
        stringArray6[3] = spruzy.cfr_renamed_9("h\u0010j\u0011y\nh\fn\u000b\u007f\nx");
        stringArray6[4] = sprxxda.cfr_renamed_9("\u0010!\b:\b1\u000f \u000e'");
        stringArray6[5] = spruzy.cfr_renamed_9("x\u0000b\u0016h\fn\u000b\u007f\nx");
        stringArray6[6] = sprxxda.cfr_renamed_9("'\u0004 \u00047\b1\u000f \u000e'");
        stringArray6[7] = spruzy.cfr_renamed_9("d\u0006c\nh\fn\u000b\u007f\nx");
        stringArray6[8] = sprxxda.cfr_renamed_9(":\u000e\"\u00047\b1\u000f \u000e'");
        cfr_renamed_4 = stringArray6;
        String[] stringArray7 = new String[9];
        stringArray7[0] = spruzy.cfr_renamed_9("h\u0000e\u0011\u00e2\u0016b\bd");
        stringArray7[1] = sprxxda.cfr_renamed_9("0\u00147\u0004:\u0015\u00bd\u0012=\f;");
        stringArray7[2] = spruzy.cfr_renamed_9("\u0011y\fh\u0000e\u0011\u00e2\u0016b\bd");
        stringArray7[3] = sprxxda.cfr_renamed_9("\u0002!\u00000\u0013=\u000f3\u0004:\u0015\u00bd\u0012=\f;");
        stringArray7[4] = spruzy.cfr_renamed_9("z\u0010b\u000bl\u0000e\u0011\u00e2\u0016b\bd");
        stringArray7[5] = sprxxda.cfr_renamed_9("\u00121\u00197\u0004:\u0015\u00bd\u0012=\f;");
        stringArray7[6] = spruzy.cfr_renamed_9("x\u0000{\u0011b\u000bl\u0000e\u0011\u00e2\u0016b\bd");
        stringArray7[7] = sprxxda.cfr_renamed_9(";\u0002 \b:\u0006\u00bd\u0012=\f;");
        stringArray7[8] = spruzy.cfr_renamed_9("\u000bd\u000bb\u000bl\u0000e\u0011\u00e2\u0016b\bd");
        cfr_renamed_112 = stringArray7;
        String[] stringArray8 = new String[3];
        stringArray8[0] = sprxxda.cfr_renamed_9("9\b8");
        stringArray8[1] = spruzy.cfr_renamed_9("\bb\tg\u0096e");
        stringArray8[2] = sprxxda.cfr_renamed_9("\f=\rt\f=\r8\u000e:\u0004'");
        cfr_renamed_119 = stringArray8;
    }

    @Override
    public String[] cfr_renamed_17208() {
        return cfr_renamed_2;
    }

    @Override
    @sprtea
    public boolean cfr_renamed_17209(int arg0) {
        return true;
    }

    @Override
    public String[] cfr_renamed_17210() {
        return cfr_renamed_91;
    }

    @Override
    public String cfr_renamed_17211() {
        return spruzy.cfr_renamed_9("\u00e2\u0016b\bd");
    }

    @Override
    public String[] cfr_renamed_17212() {
        return cfr_renamed_0;
    }

    @Override
    @sprtea
    public String cfr_renamed_17187(boolean arg0) {
        return sprxxda.cfr_renamed_9("\u00021\u0013;");
    }

    @Override
    @sprtea
    public String cfr_renamed_17201() {
        return spruzy.cfr_renamed_9("h\ne");
    }
}

