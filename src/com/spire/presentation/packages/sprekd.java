/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjl;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public abstract class sprekd
implements sprko,
sprrj,
sprjl {
    public long cfr_renamed_137;
    public long cfr_renamed_79;
    public long cfr_renamed_107;
    public long cfr_renamed_132;
    private byte[] cfr_renamed_102 = new byte[8];
    public long cfr_renamed_93;
    private long cfr_renamed_86;
    private int cfr_renamed_152;
    public long cfr_renamed_112;
    public long cfr_renamed_119;
    public static final long[] cfr_renamed_91;
    private long[] cfr_renamed_0 = new long[80];
    private static final int cfr_renamed_1 = 128;
    public long cfr_renamed_2;
    private long cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_3473() {
        int n;
        int n2;
        this.cfr_renamed_3861();
        int n3 = n2 = 16;
        while (n3 <= 79) {
            sprekd sprekd2 = this;
            int n4 = n2;
            sprekd sprekd3 = this;
            long l = sprekd2.cfr_renamed_3862(sprekd2.cfr_renamed_0[n4 - 2]) + this.cfr_renamed_0[n2 - 7] + sprekd3.cfr_renamed_3863(sprekd3.cfr_renamed_0[n2 - 15]) + this.cfr_renamed_0[n2 - 16];
            this.cfr_renamed_0[n4] = l;
            n3 = ++n2;
        }
        sprekd sprekd4 = this;
        long l = sprekd4.cfr_renamed_107;
        long l2 = sprekd4.cfr_renamed_93;
        long l3 = sprekd4.cfr_renamed_2;
        long l4 = sprekd4.cfr_renamed_132;
        long l5 = sprekd4.cfr_renamed_112;
        long l6 = sprekd4.cfr_renamed_119;
        long l7 = sprekd4.cfr_renamed_137;
        long l8 = sprekd4.cfr_renamed_79;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < 10) {
            long l9 = l8 + (this.cfr_renamed_3864(l5) + this.cfr_renamed_3865(l5, l6, l7) + cfr_renamed_91[n5] + this.cfr_renamed_0[n5]);
            l8 = l9;
            l4 += l8;
            l8 += this.cfr_renamed_3866(l) + this.cfr_renamed_3867(l, l2, l3);
            long l10 = l7 + (this.cfr_renamed_3864(l4) + this.cfr_renamed_3865(l4, l5, l6) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l7 = l10;
            l3 += l7;
            l7 += this.cfr_renamed_3866(l8) + this.cfr_renamed_3867(l8, l, l2);
            long l11 = l6 + (this.cfr_renamed_3864(l3) + this.cfr_renamed_3865(l3, l4, l5) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l6 = l11;
            l2 += l6;
            l6 += this.cfr_renamed_3866(l7) + this.cfr_renamed_3867(l7, l8, l);
            long l12 = l5 + (this.cfr_renamed_3864(l2) + this.cfr_renamed_3865(l2, l3, l4) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l5 = l12;
            l += l5;
            l5 += this.cfr_renamed_3866(l6) + this.cfr_renamed_3867(l6, l7, l8);
            long l13 = l4 + (this.cfr_renamed_3864(l) + this.cfr_renamed_3865(l, l2, l3) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l4 = l13;
            l8 += l4;
            l4 += this.cfr_renamed_3866(l5) + this.cfr_renamed_3867(l5, l6, l7);
            long l14 = l3 + (this.cfr_renamed_3864(l8) + this.cfr_renamed_3865(l8, l, l2) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l3 = l14;
            l7 += l3;
            l3 += this.cfr_renamed_3866(l4) + this.cfr_renamed_3867(l4, l5, l6);
            long l15 = l2 + (this.cfr_renamed_3864(l7) + this.cfr_renamed_3865(l7, l8, l) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            l2 = l15;
            l6 += l2;
            l2 += this.cfr_renamed_3866(l3) + this.cfr_renamed_3867(l3, l4, l5);
            long l16 = l + (this.cfr_renamed_3864(l6) + this.cfr_renamed_3865(l6, l7, l8) + cfr_renamed_91[++n5] + this.cfr_renamed_0[n5]);
            ++n5;
            l = l16;
            l5 += l;
            l += this.cfr_renamed_3866(l2) + this.cfr_renamed_3867(l2, l3, l4);
            n6 = ++n;
        }
        sprekd sprekd5 = this;
        sprekd5.cfr_renamed_107 += l;
        sprekd5.cfr_renamed_93 += l2;
        sprekd5.cfr_renamed_2 += l3;
        sprekd5.cfr_renamed_132 += l4;
        sprekd5.cfr_renamed_112 += l5;
        sprekd5.cfr_renamed_119 += l6;
        sprekd5.cfr_renamed_137 += l7;
        sprekd5.cfr_renamed_79 += l8;
        this.cfr_renamed_152 = 0;
        int n7 = n = 0;
        while (n7 < 16) {
            this.cfr_renamed_0[n++] = 0L;
            n7 = n;
        }
    }

    public void cfr_renamed_3868(long arg0, long arg1) {
        if (this.cfr_renamed_152 > 14) {
            this.cfr_renamed_3473();
        }
        sprekd sprekd2 = this;
        sprekd2.cfr_renamed_0[14] = arg1;
        sprekd2.cfr_renamed_0[15] = arg0;
    }

    private /* synthetic */ long cfr_renamed_3867(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3793(byte[] byArray) {
        int n;
        void arg0;
        sprekd sprekd2 = this;
        System.arraycopy(sprekd2.cfr_renamed_102, 0, arg0, 0, this.cfr_renamed_4);
        sprtsa.cfr_renamed_442(sprekd2.cfr_renamed_4, (byte[])arg0, 8);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_86, (byte[])arg0, 12);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_3, (byte[])arg0, 20);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_107, (byte[])arg0, 28);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_93, (byte[])arg0, 36);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_2, (byte[])arg0, 44);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_132, (byte[])arg0, 52);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_112, (byte[])arg0, 60);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_119, (byte[])arg0, 68);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_137, (byte[])arg0, 76);
        sprtsa.cfr_renamed_450(sprekd2.cfr_renamed_79, (byte[])arg0, 84);
        sprtsa.cfr_renamed_442(sprekd2.cfr_renamed_152, (byte[])arg0, 92);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152) {
            sprtsa.cfr_renamed_450(this.cfr_renamed_0[n], (byte[])arg0, 96 + n++ * 8);
            n2 = n;
        }
    }

    private /* synthetic */ long cfr_renamed_3863(long arg0) {
        return (arg0 << 63 | arg0 >>> 1) ^ (arg0 << 56 | arg0 >>> 8) ^ arg0 >>> 7;
    }

    public void cfr_renamed_3120() {
        sprekd sprekd2 = this;
        sprekd sprekd3 = sprekd2;
        sprekd2.cfr_renamed_3861();
        long l = sprekd2.cfr_renamed_86 << 3;
        long l2 = sprekd2.cfr_renamed_3;
        sprekd2.cfr_renamed_1221((byte)-128);
        while (sprekd3.cfr_renamed_4 != 0) {
            sprekd sprekd4 = this;
            sprekd3 = sprekd4;
            sprekd4.cfr_renamed_1221((byte)0);
        }
        sprekd sprekd5 = this;
        sprekd5.cfr_renamed_3868(l, l2);
        sprekd5.cfr_renamed_3473();
    }

    public sprekd() {
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprekd sprekd2 = this;
        while (sprekd2.cfr_renamed_4 != 0 && arg2 > 0) {
            sprekd sprekd3 = this;
            sprekd2 = sprekd3;
            sprekd3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n > this.cfr_renamed_102.length) {
            int n2 = arg1;
            this.cfr_renamed_3766(arg0, n2);
            arg1 = n2 + this.cfr_renamed_102.length;
            this.cfr_renamed_86 += (long)this.cfr_renamed_102.length;
            n = arg2 -= this.cfr_renamed_102.length;
        }
        int n3 = arg2;
        while (n3 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n3 = --arg2;
        }
    }

    public int cfr_renamed_3792() {
        return 96 + this.cfr_renamed_152 * 8;
    }

    private /* synthetic */ void cfr_renamed_3861() {
        if (this.cfr_renamed_86 > 0x1FFFFFFFFFFFFFFFL) {
            sprekd sprekd2 = this;
            sprekd2.cfr_renamed_3 += this.cfr_renamed_86 >>> 61;
            sprekd2.cfr_renamed_86 &= 0x1FFFFFFFFFFFFFFFL;
        }
    }

    public void cfr_renamed_3796(sprekd arg0) {
        System.arraycopy(arg0.cfr_renamed_102, 0, this.cfr_renamed_102, 0, arg0.cfr_renamed_102.length);
        sprekd sprekd2 = arg0;
        sprekd sprekd3 = this;
        sprekd sprekd4 = arg0;
        sprekd sprekd5 = this;
        sprekd sprekd6 = arg0;
        sprekd sprekd7 = this;
        sprekd sprekd8 = arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_86 = sprekd8.cfr_renamed_86;
        sprekd7.cfr_renamed_3 = sprekd8.cfr_renamed_3;
        sprekd7.cfr_renamed_107 = arg0.cfr_renamed_107;
        this.cfr_renamed_93 = sprekd6.cfr_renamed_93;
        sprekd5.cfr_renamed_2 = sprekd6.cfr_renamed_2;
        sprekd5.cfr_renamed_132 = arg0.cfr_renamed_132;
        this.cfr_renamed_112 = sprekd4.cfr_renamed_112;
        sprekd3.cfr_renamed_119 = sprekd4.cfr_renamed_119;
        sprekd3.cfr_renamed_137 = arg0.cfr_renamed_137;
        this.cfr_renamed_79 = sprekd2.cfr_renamed_79;
        System.arraycopy(sprekd2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, arg0.cfr_renamed_0.length);
        this.cfr_renamed_152 = arg0.cfr_renamed_152;
    }

    private /* synthetic */ long cfr_renamed_3864(long arg0) {
        return (arg0 << 50 | arg0 >>> 14) ^ (arg0 << 46 | arg0 >>> 18) ^ (arg0 << 23 | arg0 >>> 41);
    }

    static {
        long[] lArray = new long[80];
        lArray[0] = 4794697086780616226L;
        lArray[1] = 8158064640168781261L;
        lArray[2] = -5349999486874862801L;
        lArray[3] = -1606136188198331460L;
        lArray[4] = 4131703408338449720L;
        lArray[5] = 6480981068601479193L;
        lArray[6] = -7908458776815382629L;
        lArray[7] = -6116909921290321640L;
        lArray[8] = -2880145864133508542L;
        lArray[9] = 1334009975649890238L;
        lArray[10] = 2608012711638119052L;
        lArray[11] = 6128411473006802146L;
        lArray[12] = 8268148722764581231L;
        lArray[13] = -9160688886553864527L;
        lArray[14] = -7215885187991268811L;
        lArray[15] = -4495734319001033068L;
        lArray[16] = -1973867731355612462L;
        lArray[17] = -1171420211273849373L;
        lArray[18] = 1135362057144423861L;
        lArray[19] = 2597628984639134821L;
        lArray[20] = 3308224258029322869L;
        lArray[21] = 5365058923640841347L;
        lArray[22] = 6679025012923562964L;
        lArray[23] = 8573033837759648693L;
        lArray[24] = -7476448914759557205L;
        lArray[25] = -6327057829258317296L;
        lArray[26] = -5763719355590565569L;
        lArray[27] = -4658551843659510044L;
        lArray[28] = -4116276920077217854L;
        lArray[29] = -3051310485924567259L;
        lArray[30] = 489312712824947311L;
        lArray[31] = 1452737877330783856L;
        lArray[32] = 2861767655752347644L;
        lArray[33] = 3322285676063803686L;
        lArray[34] = 5560940570517711597L;
        lArray[35] = 5996557281743188959L;
        lArray[36] = 7280758554555802590L;
        lArray[37] = 8532644243296465576L;
        lArray[38] = -9096487096722542874L;
        lArray[39] = -7894198246740708037L;
        lArray[40] = -6719396339535248540L;
        lArray[41] = -6333637450476146687L;
        lArray[42] = -4446306890439682159L;
        lArray[43] = -4076793802049405392L;
        lArray[44] = -3345356375505022440L;
        lArray[45] = -2983346525034927856L;
        lArray[46] = -860691631967231958L;
        lArray[47] = 1182934255886127544L;
        lArray[48] = 1847814050463011016L;
        lArray[49] = 2177327727835720531L;
        lArray[50] = 2830643537854262169L;
        lArray[51] = 3796741975233480872L;
        lArray[52] = 4115178125766777443L;
        lArray[53] = 5681478168544905931L;
        lArray[54] = 6601373596472566643L;
        lArray[55] = 7507060721942968483L;
        lArray[56] = 8399075790359081724L;
        lArray[57] = 8693463985226723168L;
        lArray[58] = -8878714635349349518L;
        lArray[59] = -8302665154208450068L;
        lArray[60] = -8016688836872298968L;
        lArray[61] = -6606660893046293015L;
        lArray[62] = -4685533653050689259L;
        lArray[63] = -4147400797238176981L;
        lArray[64] = -3880063495543823972L;
        lArray[65] = -3348786107499101689L;
        lArray[66] = -1523767162380948706L;
        lArray[67] = -757361751448694408L;
        lArray[68] = 500013540394364858L;
        lArray[69] = 748580250866718886L;
        lArray[70] = 1242879168328830382L;
        lArray[71] = 1977374033974150939L;
        lArray[72] = 2944078676154940804L;
        lArray[73] = 3659926193048069267L;
        lArray[74] = 4368137639120453308L;
        lArray[75] = 4836135668995329356L;
        lArray[76] = 5532061633213252278L;
        lArray[77] = 6448918945643986474L;
        lArray[78] = 6902733635092675308L;
        lArray[79] = 7801388544844847127L;
        cfr_renamed_91 = lArray;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_102[this.cfr_renamed_4++] = arg0;
        sprekd sprekd2 = this;
        if (sprekd2.cfr_renamed_4 == sprekd2.cfr_renamed_102.length) {
            sprekd sprekd3 = this;
            sprekd3.cfr_renamed_3766(sprekd3.cfr_renamed_102, 0);
            sprekd3.cfr_renamed_4 = 0;
        }
        ++this.cfr_renamed_86;
    }

    private /* synthetic */ long cfr_renamed_3866(long arg0) {
        return (arg0 << 36 | arg0 >>> 28) ^ (arg0 << 30 | arg0 >>> 34) ^ (arg0 << 25 | arg0 >>> 39);
    }

    private /* synthetic */ long cfr_renamed_3862(long arg0) {
        return (arg0 << 45 | arg0 >>> 19) ^ (arg0 << 3 | arg0 >>> 61) ^ arg0 >>> 6;
    }

    public sprekd(sprekd sprekd2) {
        this.cfr_renamed_3796(sprekd2);
    }

    private /* synthetic */ long cfr_renamed_3865(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ (arg0 ^ 0xFFFFFFFFFFFFFFFFL) & arg2;
    }

    @Override
    public int cfr_renamed_3248() {
        return 128;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3766(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprekd sprekd2 = this;
        this.cfr_renamed_0[sprekd2.cfr_renamed_152] = sprtsa.cfr_renamed_456((byte[])arg0, (int)arg1);
        if (++sprekd2.cfr_renamed_152 == 16) {
            this.cfr_renamed_3473();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3797(byte[] byArray) {
        int n;
        void arg0;
        sprekd sprekd2 = this;
        void v1 = arg0;
        sprekd sprekd3 = this;
        void v3 = arg0;
        sprekd sprekd4 = this;
        void v5 = arg0;
        sprekd sprekd5 = this;
        void v7 = arg0;
        this.cfr_renamed_4 = sprtsa.cfr_renamed_446((byte[])v7, 8);
        System.arraycopy(v7, 0, this.cfr_renamed_102, 0, this.cfr_renamed_4);
        sprekd5.cfr_renamed_86 = sprtsa.cfr_renamed_456((byte[])v7, 12);
        sprekd5.cfr_renamed_3 = sprtsa.cfr_renamed_456((byte[])arg0, 20);
        this.cfr_renamed_107 = sprtsa.cfr_renamed_456((byte[])v5, 28);
        sprekd4.cfr_renamed_93 = sprtsa.cfr_renamed_456((byte[])v5, 36);
        sprekd4.cfr_renamed_2 = sprtsa.cfr_renamed_456((byte[])arg0, 44);
        this.cfr_renamed_132 = sprtsa.cfr_renamed_456((byte[])v3, 52);
        sprekd3.cfr_renamed_112 = sprtsa.cfr_renamed_456((byte[])v3, 60);
        sprekd3.cfr_renamed_119 = sprtsa.cfr_renamed_456((byte[])arg0, 68);
        this.cfr_renamed_137 = sprtsa.cfr_renamed_456((byte[])v1, 76);
        sprekd2.cfr_renamed_79 = sprtsa.cfr_renamed_456((byte[])v1, 84);
        sprekd2.cfr_renamed_152 = sprtsa.cfr_renamed_446(byArray, 92);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152) {
            int n3 = n++;
            this.cfr_renamed_0[n3] = sprtsa.cfr_renamed_456((byte[])arg0, 96 + n3 * 8);
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprekd sprekd2 = this;
        this.cfr_renamed_86 = 0L;
        sprekd2.cfr_renamed_3 = 0L;
        sprekd2.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102.length) {
            this.cfr_renamed_102[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_152 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = 0L;
            n3 = n;
        }
    }
}

