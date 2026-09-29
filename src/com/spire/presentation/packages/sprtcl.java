/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvu;
import com.spire.presentation.packages.sprxq;

public abstract class sprtcl
implements sprpl,
sprhx,
sprvu {
    private long[] cfr_renamed_105;
    public long cfr_renamed_137;
    public long cfr_renamed_79;
    public long cfr_renamed_107;
    public long cfr_renamed_132;
    public long cfr_renamed_102;
    private static final int cfr_renamed_93 = 128;
    public final spriil cfr_renamed_86;
    public long cfr_renamed_152;
    private long cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    public long cfr_renamed_1;
    public static final long[] cfr_renamed_2;
    private long cfr_renamed_3;
    public long cfr_renamed_4;

    private /* synthetic */ long cfr_renamed_3867(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    public void cfr_renamed_3473() {
        int n;
        int n2;
        this.cfr_renamed_3861();
        int n3 = n2 = 16;
        while (n3 <= 79) {
            sprtcl sprtcl2 = this;
            int n4 = n2;
            sprtcl sprtcl3 = this;
            long l = sprtcl2.cfr_renamed_3862(sprtcl2.cfr_renamed_105[n4 - 2]) + this.cfr_renamed_105[n2 - 7] + sprtcl3.cfr_renamed_3863(sprtcl3.cfr_renamed_105[n2 - 15]) + this.cfr_renamed_105[n2 - 16];
            this.cfr_renamed_105[n4] = l;
            n3 = ++n2;
        }
        sprtcl sprtcl4 = this;
        long l = sprtcl4.cfr_renamed_132;
        long l2 = sprtcl4.cfr_renamed_152;
        long l3 = sprtcl4.cfr_renamed_137;
        long l4 = sprtcl4.cfr_renamed_1;
        long l5 = sprtcl4.cfr_renamed_102;
        long l6 = sprtcl4.cfr_renamed_107;
        long l7 = sprtcl4.cfr_renamed_4;
        long l8 = sprtcl4.cfr_renamed_79;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < 10) {
            long l9 = l8 + (this.cfr_renamed_3864(l5) + this.cfr_renamed_3865(l5, l6, l7) + cfr_renamed_2[n5] + this.cfr_renamed_105[n5]);
            l8 = l9;
            l4 += l8;
            l8 += this.cfr_renamed_3866(l) + this.cfr_renamed_3867(l, l2, l3);
            long l10 = l7 + (this.cfr_renamed_3864(l4) + this.cfr_renamed_3865(l4, l5, l6) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l7 = l10;
            l3 += l7;
            l7 += this.cfr_renamed_3866(l8) + this.cfr_renamed_3867(l8, l, l2);
            long l11 = l6 + (this.cfr_renamed_3864(l3) + this.cfr_renamed_3865(l3, l4, l5) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l6 = l11;
            l2 += l6;
            l6 += this.cfr_renamed_3866(l7) + this.cfr_renamed_3867(l7, l8, l);
            long l12 = l5 + (this.cfr_renamed_3864(l2) + this.cfr_renamed_3865(l2, l3, l4) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l5 = l12;
            l += l5;
            l5 += this.cfr_renamed_3866(l6) + this.cfr_renamed_3867(l6, l7, l8);
            long l13 = l4 + (this.cfr_renamed_3864(l) + this.cfr_renamed_3865(l, l2, l3) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l4 = l13;
            l8 += l4;
            l4 += this.cfr_renamed_3866(l5) + this.cfr_renamed_3867(l5, l6, l7);
            long l14 = l3 + (this.cfr_renamed_3864(l8) + this.cfr_renamed_3865(l8, l, l2) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l3 = l14;
            l7 += l3;
            l3 += this.cfr_renamed_3866(l4) + this.cfr_renamed_3867(l4, l5, l6);
            long l15 = l2 + (this.cfr_renamed_3864(l7) + this.cfr_renamed_3865(l7, l8, l) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            l2 = l15;
            l6 += l2;
            l2 += this.cfr_renamed_3866(l3) + this.cfr_renamed_3867(l3, l4, l5);
            long l16 = l + (this.cfr_renamed_3864(l6) + this.cfr_renamed_3865(l6, l7, l8) + cfr_renamed_2[++n5] + this.cfr_renamed_105[n5]);
            ++n5;
            l = l16;
            l5 += l;
            l += this.cfr_renamed_3866(l2) + this.cfr_renamed_3867(l2, l3, l4);
            n6 = ++n;
        }
        sprtcl sprtcl5 = this;
        sprtcl5.cfr_renamed_132 += l;
        sprtcl5.cfr_renamed_152 += l2;
        sprtcl5.cfr_renamed_137 += l3;
        sprtcl5.cfr_renamed_1 += l4;
        sprtcl5.cfr_renamed_102 += l5;
        sprtcl5.cfr_renamed_107 += l6;
        sprtcl5.cfr_renamed_4 += l7;
        sprtcl5.cfr_renamed_79 += l8;
        this.cfr_renamed_119 = 0;
        int n7 = n = 0;
        while (n7 < 16) {
            this.cfr_renamed_105[n++] = 0L;
            n7 = n;
        }
    }

    private /* synthetic */ long cfr_renamed_3865(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ (arg0 ^ 0xFFFFFFFFFFFFFFFFL) & arg2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3797(byte[] byArray) {
        int n;
        void arg0;
        sprtcl sprtcl2 = this;
        void v1 = arg0;
        sprtcl sprtcl3 = this;
        void v3 = arg0;
        sprtcl sprtcl4 = this;
        void v5 = arg0;
        sprtcl sprtcl5 = this;
        void v7 = arg0;
        this.cfr_renamed_0 = sprpxe.cfr_renamed_446((byte[])v7, 8);
        System.arraycopy(v7, 0, this.cfr_renamed_91, 0, this.cfr_renamed_0);
        sprtcl5.cfr_renamed_3 = sprpxe.cfr_renamed_456((byte[])v7, 12);
        sprtcl5.cfr_renamed_112 = sprpxe.cfr_renamed_456((byte[])arg0, 20);
        this.cfr_renamed_132 = sprpxe.cfr_renamed_456((byte[])v5, 28);
        sprtcl4.cfr_renamed_152 = sprpxe.cfr_renamed_456((byte[])v5, 36);
        sprtcl4.cfr_renamed_137 = sprpxe.cfr_renamed_456((byte[])arg0, 44);
        this.cfr_renamed_1 = sprpxe.cfr_renamed_456((byte[])v3, 52);
        sprtcl3.cfr_renamed_102 = sprpxe.cfr_renamed_456((byte[])v3, 60);
        sprtcl3.cfr_renamed_107 = sprpxe.cfr_renamed_456((byte[])arg0, 68);
        this.cfr_renamed_4 = sprpxe.cfr_renamed_456((byte[])v1, 76);
        sprtcl2.cfr_renamed_79 = sprpxe.cfr_renamed_456((byte[])v1, 84);
        sprtcl2.cfr_renamed_119 = sprpxe.cfr_renamed_446(byArray, 92);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            int n3 = n++;
            this.cfr_renamed_105[n3] = sprpxe.cfr_renamed_456((byte[])arg0, 96 + n3 * 8);
            n2 = n;
        }
    }

    private /* synthetic */ long cfr_renamed_3862(long arg0) {
        return (arg0 << 45 | arg0 >>> 19) ^ (arg0 << 3 | arg0 >>> 61) ^ arg0 >>> 6;
    }

    private /* synthetic */ long cfr_renamed_3863(long arg0) {
        return (arg0 << 63 | arg0 >>> 1) ^ (arg0 << 56 | arg0 >>> 8) ^ arg0 >>> 7;
    }

    private /* synthetic */ long cfr_renamed_3866(long arg0) {
        return (arg0 << 36 | arg0 >>> 28) ^ (arg0 << 30 | arg0 >>> 34) ^ (arg0 << 25 | arg0 >>> 39);
    }

    public void cfr_renamed_10488(sprtcl arg0) {
        System.arraycopy(arg0.cfr_renamed_91, 0, this.cfr_renamed_91, 0, arg0.cfr_renamed_91.length);
        sprtcl sprtcl2 = arg0;
        sprtcl sprtcl3 = this;
        sprtcl sprtcl4 = arg0;
        sprtcl sprtcl5 = this;
        sprtcl sprtcl6 = arg0;
        sprtcl sprtcl7 = this;
        sprtcl sprtcl8 = arg0;
        this.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_3 = sprtcl8.cfr_renamed_3;
        sprtcl7.cfr_renamed_112 = sprtcl8.cfr_renamed_112;
        sprtcl7.cfr_renamed_132 = arg0.cfr_renamed_132;
        this.cfr_renamed_152 = sprtcl6.cfr_renamed_152;
        sprtcl5.cfr_renamed_137 = sprtcl6.cfr_renamed_137;
        sprtcl5.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_102 = sprtcl4.cfr_renamed_102;
        sprtcl3.cfr_renamed_107 = sprtcl4.cfr_renamed_107;
        sprtcl3.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_79 = sprtcl2.cfr_renamed_79;
        System.arraycopy(sprtcl2.cfr_renamed_105, 0, this.cfr_renamed_105, 0, arg0.cfr_renamed_105.length);
        this.cfr_renamed_119 = arg0.cfr_renamed_119;
    }

    public void cfr_renamed_3868(long arg0, long arg1) {
        if (this.cfr_renamed_119 > 14) {
            this.cfr_renamed_3473();
        }
        sprtcl sprtcl2 = this;
        sprtcl2.cfr_renamed_105[14] = arg1;
        sprtcl2.cfr_renamed_105[15] = arg0;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        sprtcl sprtcl2 = this;
        if (sprtcl2.cfr_renamed_0 == sprtcl2.cfr_renamed_91.length) {
            sprtcl sprtcl3 = this;
            sprtcl3.cfr_renamed_3766(sprtcl3.cfr_renamed_91, 0);
            sprtcl3.cfr_renamed_0 = 0;
        }
        ++this.cfr_renamed_3;
    }

    public abstract sprxq cfr_renamed_10476();

    @Override
    public int cfr_renamed_3248() {
        return 128;
    }

    public sprtcl() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprtcl sprtcl2 = this;
        while (sprtcl2.cfr_renamed_0 != 0 && arg2 > 0) {
            sprtcl sprtcl3 = this;
            sprtcl2 = sprtcl3;
            sprtcl3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n >= this.cfr_renamed_91.length) {
            int n2 = arg1;
            this.cfr_renamed_3766(arg0, n2);
            arg1 = n2 + this.cfr_renamed_91.length;
            this.cfr_renamed_3 += (long)this.cfr_renamed_91.length;
            n = arg2 -= this.cfr_renamed_91.length;
        }
        int n3 = arg2;
        while (n3 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n3 = --arg2;
        }
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
        cfr_renamed_2 = lArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprtcl(sprtcl sprtcl2) {
        void arg0;
        sprtcl sprtcl3 = this;
        sprtcl3.cfr_renamed_91 = new byte[8];
        sprtcl3.cfr_renamed_105 = new long[80];
        this.cfr_renamed_86 = arg0.cfr_renamed_86;
        this.cfr_renamed_10488(sprtcl2);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprtcl sprtcl2 = this;
        this.cfr_renamed_3 = 0L;
        sprtcl2.cfr_renamed_112 = 0L;
        sprtcl2.cfr_renamed_0 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            this.cfr_renamed_91[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_119 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_105.length) {
            this.cfr_renamed_105[n++] = 0L;
            n3 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3766(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprtcl sprtcl2 = this;
        this.cfr_renamed_105[sprtcl2.cfr_renamed_119] = sprpxe.cfr_renamed_456((byte[])arg0, (int)arg1);
        if (++sprtcl2.cfr_renamed_119 == 16) {
            this.cfr_renamed_3473();
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtcl(spriil spriil2) {
        void arg0;
        sprtcl sprtcl2 = this;
        sprtcl2.cfr_renamed_91 = new byte[8];
        sprtcl2.cfr_renamed_105 = new long[80];
        this.cfr_renamed_86 = arg0;
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_41();
    }

    private /* synthetic */ long cfr_renamed_3864(long arg0) {
        return (arg0 << 50 | arg0 >>> 14) ^ (arg0 << 46 | arg0 >>> 18) ^ (arg0 << 23 | arg0 >>> 41);
    }

    private /* synthetic */ void cfr_renamed_3861() {
        if (this.cfr_renamed_3 > 0x1FFFFFFFFFFFFFFFL) {
            sprtcl sprtcl2 = this;
            sprtcl2.cfr_renamed_112 += this.cfr_renamed_3 >>> 61;
            sprtcl2.cfr_renamed_3 &= 0x1FFFFFFFFFFFFFFFL;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3793(byte[] byArray) {
        int n;
        void arg0;
        sprtcl sprtcl2 = this;
        System.arraycopy(sprtcl2.cfr_renamed_91, 0, arg0, 0, this.cfr_renamed_0);
        sprpxe.cfr_renamed_442(sprtcl2.cfr_renamed_0, (byte[])arg0, 8);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_3, (byte[])arg0, 12);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_112, (byte[])arg0, 20);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_132, (byte[])arg0, 28);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_152, (byte[])arg0, 36);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_137, (byte[])arg0, 44);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_1, (byte[])arg0, 52);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_102, (byte[])arg0, 60);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_107, (byte[])arg0, 68);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_4, (byte[])arg0, 76);
        sprpxe.cfr_renamed_450(sprtcl2.cfr_renamed_79, (byte[])arg0, 84);
        sprpxe.cfr_renamed_442(sprtcl2.cfr_renamed_119, (byte[])arg0, 92);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            sprpxe.cfr_renamed_450(this.cfr_renamed_105[n], (byte[])arg0, 96 + n++ * 8);
            n2 = n;
        }
    }

    public void cfr_renamed_3120() {
        sprtcl sprtcl2 = this;
        sprtcl sprtcl3 = sprtcl2;
        sprtcl2.cfr_renamed_3861();
        long l = sprtcl2.cfr_renamed_3 << 3;
        long l2 = sprtcl2.cfr_renamed_112;
        sprtcl2.cfr_renamed_1221((byte)-128);
        while (sprtcl3.cfr_renamed_0 != 0) {
            sprtcl sprtcl4 = this;
            sprtcl3 = sprtcl4;
            sprtcl4.cfr_renamed_1221((byte)0);
        }
        sprtcl sprtcl5 = this;
        sprtcl5.cfr_renamed_3868(l, l2);
        sprtcl5.cfr_renamed_3473();
    }

    public int cfr_renamed_3792() {
        return 96 + this.cfr_renamed_119 * 8;
    }
}

