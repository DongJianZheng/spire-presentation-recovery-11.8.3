/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqvca;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryzha;

public class spryvk
implements sprmr {
    private static final int cfr_renamed_185 = 6;
    private static final int spr\ufe34 = 3;
    private static final int cfr_renamed_82 = 16;
    private static final int cfr_renamed_126 = 13;
    private static final int cfr_renamed_88 = 1;
    private boolean cfr_renamed_31;
    private static final int cfr_renamed_272 = 8;
    private static final int cfr_renamed_145 = 9;
    private static final int cfr_renamed_114 = 1;
    private static final int cfr_renamed_96 = 17;
    private static final int[] cfr_renamed_105;
    private static final int cfr_renamed_137 = 5;
    private static final int cfr_renamed_79 = 6;
    private int[][] cfr_renamed_107;
    private static final int cfr_renamed_132 = 16;
    private int cfr_renamed_102;
    private static final int cfr_renamed_93 = 4;
    private static final int cfr_renamed_86 = 4;
    private static final int cfr_renamed_152 = 7;
    private static final int cfr_renamed_112 = 3;
    private static final int cfr_renamed_119 = 3;
    private final int[] cfr_renamed_91 = new int[4];
    private static final int cfr_renamed_0 = 11;
    private static final int cfr_renamed_1 = 5;
    private static final int cfr_renamed_2 = 0;
    private static final int cfr_renamed_3 = 4;
    private static final int cfr_renamed_4 = 2;

    private /* synthetic */ void cfr_renamed_10354(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_102) {
            int n4 = spryvk.cfr_renamed_10355(cfr_renamed_105[n & 7], n);
            int[] nArray = this.cfr_renamed_107[n];
            int n5 = 0;
            int[] nArray2 = nArray;
            int[] nArray3 = nArray;
            int n6 = n2;
            int n7 = spryvk.cfr_renamed_10355(arg0[n2 & 7] + n4, 1);
            nArray[n5] = n7;
            int n8 = nArray[n5];
            arg0[n6 & 7] = n8;
            nArray2[++n5] = spryvk.cfr_renamed_10355(arg0[++n2 & 7] + spryvk.cfr_renamed_10355(n4, n5), 3);
            int n9 = n2 & 7;
            int n10 = nArray[n5];
            arg0[n9] = n10;
            nArray3[++n5] = spryvk.cfr_renamed_10355(arg0[++n2 & 7] + spryvk.cfr_renamed_10355(n4, n5), 6);
            int n11 = n2 & 7;
            int n12 = nArray[n5];
            arg0[n11] = n12;
            nArray2[++n5] = spryvk.cfr_renamed_10355(arg0[++n2 & 7] + spryvk.cfr_renamed_10355(n4, n5), 11);
            int n13 = n2 & 7;
            int n14 = nArray[n5];
            arg0[n13] = n14;
            nArray3[++n5] = spryvk.cfr_renamed_10355(arg0[++n2 & 7] + spryvk.cfr_renamed_10355(n4, n5), 13);
            int n15 = n2 & 7;
            int n16 = nArray[n5];
            arg0[n15] = n16;
            nArray2[++n5] = spryvk.cfr_renamed_10355(arg0[++n2 & 7] + spryvk.cfr_renamed_10355(n4, n5), 17);
            int n17 = n2 & 7;
            ++n2;
            arg0[n17] = nArray[n5];
            n3 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqvca.cfr_renamed_9("\u0003 \u000e");
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10356(byte[] arg0) {
        this.cfr_renamed_102 = (arg0.length >> 1) + 16;
        this.cfr_renamed_107 = new int[this.cfr_renamed_102][6];
        int n = arg0.length / 4;
        int[] nArray = new int[n];
        sprpxe.cfr_renamed_438(arg0, 0, nArray, 0, n);
        switch (n) {
            case 4: {
                this.cfr_renamed_10357(nArray);
                return;
            }
            case 6: {
                this.cfr_renamed_10358(nArray);
                return;
            }
        }
        this.cfr_renamed_10354(nArray);
    }

    private static /* synthetic */ int cfr_renamed_10359(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << 32 - arg1;
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        spryvk spryvk2 = this;
        sprpxe.cfr_renamed_438(arg0, arg1, spryvk2.cfr_renamed_91, 0, 4);
        int n2 = n = spryvk2.cfr_renamed_102 - 1;
        while (n2 >= 0) {
            this.cfr_renamed_10360(n--);
            n2 = n;
        }
        sprpxe.cfr_renamed_449(this.cfr_renamed_91, arg2, arg3);
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprpxe.cfr_renamed_438((byte[])arg0, (int)arg1, this.cfr_renamed_91, 0, 4);
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_102) {
            this.cfr_renamed_10361(n3++);
            n4 = n3;
        }
        sprpxe.cfr_renamed_449(this.cfr_renamed_91, (byte[])arg2, (int)arg3);
        return 16;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    private /* synthetic */ void cfr_renamed_10358(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102) {
            int n3 = spryvk.cfr_renamed_10355(cfr_renamed_105[n % 6], n);
            int n4 = 0;
            int[] nArray = arg0;
            int[] nArray2 = arg0;
            arg0[++n4] = spryvk.cfr_renamed_10355(arg0[n4] + spryvk.cfr_renamed_10355(n3, n4), 1);
            nArray[++n4] = spryvk.cfr_renamed_10355(arg0[n4] + spryvk.cfr_renamed_10355(n3, n4), 3);
            int n5 = n4;
            int n6 = arg0[n4] + spryvk.cfr_renamed_10355(n3, n5);
            arg0[n5] = spryvk.cfr_renamed_10355(n6, 6);
            int n7 = ++n4;
            int n8 = arg0[n4] + spryvk.cfr_renamed_10355(n3, n7);
            nArray2[n7] = spryvk.cfr_renamed_10355(n8, 11);
            int n9 = ++n4;
            int n10 = arg0[n4] + spryvk.cfr_renamed_10355(n3, n9);
            nArray[n9] = spryvk.cfr_renamed_10355(n10, 13);
            int n11 = ++n4;
            int n12 = arg0[n4] + spryvk.cfr_renamed_10355(n3, n11);
            nArray2[n11] = spryvk.cfr_renamed_10355(n12, 17);
            int[] nArray3 = this.cfr_renamed_107[n];
            System.arraycopy(nArray, 0, nArray3, 0, ++n4);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        spryvk.cfr_renamed_10362((byte[])arg0, (int)arg1, false);
        spryvk.cfr_renamed_10362(byArray2, (int)arg3, true);
        if (this.cfr_renamed_31) {
            return this.cfr_renamed_3393((byte[])arg0, (int)arg1, (byte[])arg2, (int)arg3);
        }
        return this.cfr_renamed_3396((byte[])arg0, (int)arg1, (byte[])arg2, (int)arg3);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spryzha.cfr_renamed_9("%q\u001a~\u0000v\b?\u001c~\u001e~\u0001z\u0018z\u001e?\u001c~\u001fl\t{Lk\u0003? Z-?\u0005q\u0005kL2L")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        int n = byArray.length;
        if ((n << 1) % 16 != 0 || n < 16 || n > 32) {
            throw new IllegalArgumentException(sprqvca.cfr_renamed_9(".*\u001c\r\f;6&\u001f*E\"\u0010<\u0011o\u0007*E~WwIoTvWo\n=E}Py"));
        }
        this.cfr_renamed_31 = arg0;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), n * 8, arg1, sprlrk.cfr_renamed_9915(this.cfr_renamed_31)));
        this.cfr_renamed_10356(byArray);
    }

    private static /* synthetic */ int cfr_renamed_10363(int arg0) {
        if (arg0 == 0) {
            return 3;
        }
        return arg0 - 1;
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = -1007687205;
        nArray[1] = 1147300610;
        nArray[2] = 2044886154;
        nArray[3] = 2027892972;
        nArray[4] = 1902027934;
        nArray[5] = -947529206;
        nArray[6] = -531697110;
        nArray[7] = -440137385;
        cfr_renamed_105 = nArray;
    }

    private static /* synthetic */ int cfr_renamed_10364(int arg0) {
        if (arg0 == 3) {
            return 0;
        }
        return arg0 + 1;
    }

    private static /* synthetic */ int cfr_renamed_10355(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    private /* synthetic */ void cfr_renamed_10357(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102) {
            int n3 = spryvk.cfr_renamed_10355(cfr_renamed_105[n & 3], n);
            int n4 = 0;
            arg0[++n4] = spryvk.cfr_renamed_10355(arg0[n4] + n3, 1);
            arg0[++n4] = spryvk.cfr_renamed_10355(arg0[n4] + spryvk.cfr_renamed_10355(n3, n4), 3);
            int n5 = n4;
            int n6 = arg0[n4] + spryvk.cfr_renamed_10355(n3, n5);
            arg0[n5] = spryvk.cfr_renamed_10355(n6, 6);
            int n7 = ++n4;
            arg0[n7] = spryvk.cfr_renamed_10355(arg0[n4] + spryvk.cfr_renamed_10355(n3, n7), 11);
            int[] nArray = this.cfr_renamed_107[n];
            nArray[0] = arg0[0];
            nArray[1] = arg0[1];
            nArray[2] = arg0[2];
            nArray[3] = arg0[1];
            nArray[4] = arg0[3];
            nArray[5] = arg0[1];
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_10361(int arg0) {
        spryvk spryvk2 = this;
        int[] nArray = spryvk2.cfr_renamed_107[arg0];
        int n = (3 + arg0) % 4;
        int n2 = spryvk.cfr_renamed_10363(n);
        spryvk spryvk3 = this;
        spryvk2.cfr_renamed_91[n] = spryvk.cfr_renamed_10359((spryvk3.cfr_renamed_91[n2] ^ nArray[4]) + (this.cfr_renamed_91[n] ^ nArray[5]), 3);
        n = n2;
        n2 = spryvk.cfr_renamed_10363(n);
        int n3 = n;
        spryvk3.cfr_renamed_91[n3] = spryvk.cfr_renamed_10359((this.cfr_renamed_91[n2] ^ nArray[2]) + (this.cfr_renamed_91[n3] ^ nArray[3]), 5);
        n = n2;
        n2 = spryvk.cfr_renamed_10363(n);
        int n4 = n;
        spryvk2.cfr_renamed_91[n4] = spryvk.cfr_renamed_10355((this.cfr_renamed_91[n2] ^ nArray[0]) + (this.cfr_renamed_91[n4] ^ nArray[1]), 9);
    }

    private /* synthetic */ void cfr_renamed_10360(int arg0) {
        spryvk spryvk2 = this;
        int[] nArray = spryvk2.cfr_renamed_107[arg0];
        int n = arg0 % 4;
        int n2 = spryvk.cfr_renamed_10364(n);
        spryvk spryvk3 = this;
        spryvk2.cfr_renamed_91[n2] = spryvk.cfr_renamed_10359(spryvk3.cfr_renamed_91[n2], 9) - (this.cfr_renamed_91[n] ^ nArray[0]) ^ nArray[1];
        n = n2;
        int n3 = n2 = spryvk.cfr_renamed_10364(n2);
        spryvk3.cfr_renamed_91[n3] = spryvk.cfr_renamed_10355(this.cfr_renamed_91[n3], 5) - (this.cfr_renamed_91[n] ^ nArray[2]) ^ nArray[3];
        n = n2;
        int n4 = n2 = spryvk.cfr_renamed_10364(n2);
        spryvk2.cfr_renamed_91[n4] = spryvk.cfr_renamed_10355(this.cfr_renamed_91[n4], 3) - (this.cfr_renamed_91[n] ^ nArray[4]) ^ nArray[5];
    }

    private static /* synthetic */ int cfr_renamed_10058(byte[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        return arg0.length;
    }

    private static /* synthetic */ void cfr_renamed_10362(byte[] arg0, int arg1, boolean arg2) {
        boolean bl;
        int n = spryvk.cfr_renamed_10058(arg0);
        int n2 = arg1 + 16;
        boolean bl2 = bl = arg1 < 0 || n2 < 0;
        if (bl || n2 > n) {
            throw arg2 ? new sprwjl(spryzha.cfr_renamed_9("P\u0019k\u001cj\u0018?\u000ej\ny\tmLk\u0003pLl\u0004p\u001ekB")) : new sprddl(sprqvca.cfr_renamed_9("\u0006\u000b?\u0010;E-\u0010)\u0003*\u0017o\u0011 \no\u0016'\n=\u0011a"));
        }
    }

    @Override
    public void cfr_renamed_41() {
    }
}

