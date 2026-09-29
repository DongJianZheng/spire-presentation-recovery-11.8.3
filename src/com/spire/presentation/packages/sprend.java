/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraws;
import com.spire.presentation.packages.sprazy;
import com.spire.presentation.packages.sprgrc;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprwcd;
import com.spire.presentation.packages.sprwhd;
import com.spire.presentation.packages.sprxkd;
import com.spire.presentation.packages.sprycd;
import com.spire.presentation.packages.sprzra;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprend
implements sprrj {
    public static final int cfr_renamed_105 = 1024;
    private static final int cfr_renamed_137 = 4;
    private static final int cfr_renamed_79 = 63;
    private long[] cfr_renamed_107;
    public long[] cfr_renamed_132;
    private final sprwhd cfr_renamed_102;
    public final sprxkd cfr_renamed_93;
    private sprycd[] cfr_renamed_86;
    private final int cfr_renamed_152;
    private static final Hashtable cfr_renamed_112 = new Hashtable();
    private static final int cfr_renamed_119 = 48;
    public static final int cfr_renamed_91 = 256;
    private sprycd[] cfr_renamed_0;
    private static final int cfr_renamed_1 = 0;
    private byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    public static final int cfr_renamed_4 = 512;

    /*
     * WARNING - void declaration
     */
    public sprend(sprend sprend2) {
        void arg0;
        sprend sprend3 = this;
        sprend3(arg0.cfr_renamed_1195() * 8, arg0.cfr_renamed_3466() * 8);
        sprend3.cfr_renamed_3775(sprend2);
    }

    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_107, 0, this.cfr_renamed_132, 0, this.cfr_renamed_132.length);
        this.cfr_renamed_3776(48);
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprend sprend2 = this;
        sprend2.cfr_renamed_3777();
        sprend2.cfr_renamed_102.cfr_renamed_3778(arg0, arg1, arg2, this.cfr_renamed_132);
    }

    private static /* synthetic */ void cfr_renamed_3779(sprycd[] arg0) {
        int n;
        if (arg0 == null) {
            return;
        }
        int n2 = n = 1;
        while (n2 < arg0.length) {
            int n3;
            sprycd sprycd2 = arg0[n];
            int n4 = n;
            while (n4 > 0 && sprycd2.cfr_renamed_324() < arg0[n3 - 1].cfr_renamed_324()) {
                int n5 = n3;
                arg0[n5] = arg0[n3 - 1];
                n4 = n5 - 1;
            }
            arg0[n3] = sprycd2;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3780(long arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        byte[] byArray = new byte[8];
        sprxkd.cfr_renamed_3561(arg0, byArray, 0);
        long[] lArray = new long[this.cfr_renamed_132.length];
        sprend sprend2 = this;
        sprend2.cfr_renamed_3776(63);
        sprend2.cfr_renamed_102.cfr_renamed_3778(byArray, 0, byArray.length, lArray);
        this.cfr_renamed_102.cfr_renamed_3781(lArray);
        int n2 = (arg3 + 8 - 1) / 8;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = Math.min(8, arg3 - n * 8);
            if (n4 == 8) {
                sprxkd.cfr_renamed_3561(lArray[n], arg1, arg2 + n * 8);
            } else {
                sprxkd.cfr_renamed_3561(lArray[n], byArray, 0);
                System.arraycopy(byArray, 0, arg1, arg2 + n * 8, n4);
            }
            n3 = ++n;
        }
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprend sprend2 = (sprend)arg0;
        if (this.cfr_renamed_1195() != sprend2.cfr_renamed_1195() || this.cfr_renamed_152 != sprend2.cfr_renamed_152) {
            throw new IllegalArgumentException(spraws.cfr_renamed_9("\u0000O*N$Q(U C%DiQ(S(L,U,S:\u0001 OiQ;N?H-D-\u0001\u001aJ,H'd'F O,\u000f"));
        }
        this.cfr_renamed_3775(sprend2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3465(sprgrc sprgrc2) {
        sprend sprend2 = this;
        sprend sprend3 = this;
        sprend3.cfr_renamed_132 = null;
        sprend3.cfr_renamed_2 = null;
        sprend2.cfr_renamed_0 = null;
        sprend2.cfr_renamed_86 = null;
        if (sprgrc2 != null) {
            void arg0;
            if (arg0.cfr_renamed_1521().length < 16) {
                throw new IllegalArgumentException(sprazy.cfr_renamed_9("O3y1rxw=exq-o,<:yx},<4y9o,<i.`<:u,ov"));
            }
            this.cfr_renamed_3782(arg0.cfr_renamed_284());
        }
        this.cfr_renamed_3783();
        this.cfr_renamed_3776(48);
    }

    public int cfr_renamed_3466() {
        return this.cfr_renamed_152;
    }

    private /* synthetic */ void cfr_renamed_3784() {
        sprend sprend2 = this;
        sprend2.cfr_renamed_102.cfr_renamed_3781(sprend2.cfr_renamed_132);
    }

    static {
        long[] lArray = new long[4];
        lArray[0] = -2228972824489528736L;
        lArray[1] = -8629553674646093540L;
        lArray[2] = 1155188648486244218L;
        lArray[3] = -3677226592081559102L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(256 / 8, 128 / 8), lArray);
        long[] lArray2 = new long[4];
        lArray2[0] = 1450197650740764312L;
        lArray2[1] = 3081844928540042640L;
        lArray2[2] = -3136097061834271170L;
        lArray2[3] = 3301952811952417661L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(256 / 8, 160 / 8), lArray2);
        long[] lArray3 = new long[4];
        lArray3[0] = -4176654842910610933L;
        lArray3[1] = -8688192972455077604L;
        lArray3[2] = -7364642305011795836L;
        lArray3[3] = 4056579644589979102L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(256 / 8, 224 / 8), lArray3);
        long[] lArray4 = new long[4];
        lArray4[0] = -243853671043386295L;
        lArray4[1] = 3443677322885453875L;
        lArray4[2] = -5531612722399640561L;
        lArray4[3] = 7662005193972177513L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(256 / 8, 256 / 8), lArray4);
        long[] lArray5 = new long[8];
        lArray5[0] = -6288014694233956526L;
        lArray5[1] = 2204638249859346602L;
        lArray5[2] = 3502419045458743507L;
        lArray5[3] = -4829063503441264548L;
        lArray5[4] = 983504137758028059L;
        lArray5[5] = 1880512238245786339L;
        lArray5[6] = -6715892782214108542L;
        lArray5[7] = 7602827311880509485L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(512 / 8, 128 / 8), lArray5);
        long[] lArray6 = new long[8];
        lArray6[0] = 2934123928682216849L;
        lArray6[1] = -4399710721982728305L;
        lArray6[2] = 1684584802963255058L;
        lArray6[3] = 5744138295201861711L;
        lArray6[4] = 2444857010922934358L;
        lArray6[5] = -2807833639722848072L;
        lArray6[6] = -5121587834665610502L;
        lArray6[7] = 118355523173251694L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(512 / 8, 160 / 8), lArray6);
        long[] lArray7 = new long[8];
        lArray7[0] = -3688341020067007964L;
        lArray7[1] = -3772225436291745297L;
        lArray7[2] = -8300862168937575580L;
        lArray7[3] = 4146387520469897396L;
        lArray7[4] = 1106145742801415120L;
        lArray7[5] = 7455425944880474941L;
        lArray7[6] = -7351063101234211863L;
        lArray7[7] = -7048981346965512457L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(512 / 8, 224 / 8), lArray7);
        long[] lArray8 = new long[8];
        lArray8[0] = -6631894876634615969L;
        lArray8[1] = -5692838220127733084L;
        lArray8[2] = -7099962856338682626L;
        lArray8[3] = -2911352911530754598L;
        lArray8[4] = 2000907093792408677L;
        lArray8[5] = 9140007292425499655L;
        lArray8[6] = 6093301768906360022L;
        lArray8[7] = 2769176472213098488L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(512 / 8, 384 / 8), lArray8);
        long[] lArray9 = new long[8];
        lArray9[0] = 5261240102383538638L;
        lArray9[1] = 978932832955457283L;
        lArray9[2] = -8083517948103779378L;
        lArray9[3] = -7339365279355032399L;
        lArray9[4] = 6752626034097301424L;
        lArray9[5] = -1531723821829733388L;
        lArray9[6] = -7417126464950782685L;
        lArray9[7] = -5901786942805128141L;
        sprend.cfr_renamed_112.put(sprend.cfr_renamed_3785(512 / 8, 512 / 8), lArray9);
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_93.cfr_renamed_1195();
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        int n3;
        void arg1;
        this.cfr_renamed_3777();
        if (byArray.length < arg1 + this.cfr_renamed_152) {
            throw new sprjkd(new StringBuilder().insert(0, spraws.cfr_renamed_9("n<U9T=\u0001+T/G,SiH:\u0001=N&\u0001:I&S=\u0001=NiI&M-\u0001&T=Q<UiN/\u0001")).append(this.cfr_renamed_152).append(sprazy.cfr_renamed_9("<:e,y+")).toString());
        }
        sprend sprend2 = this;
        sprend2.cfr_renamed_3784();
        if (sprend2.cfr_renamed_86 != null) {
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_86.length) {
                sprend sprend3 = this;
                sprycd sprycd2 = sprend3.cfr_renamed_86[n3];
                sprend3.cfr_renamed_3786(sprycd2.cfr_renamed_324(), sprycd2.cfr_renamed_97());
                n4 = ++n3;
            }
        }
        sprend sprend4 = this;
        n3 = sprend4.cfr_renamed_1195();
        int n5 = (sprend4.cfr_renamed_152 + n3 - 1) / n3;
        int n6 = n2 = 0;
        while (n6 < n5) {
            void arg0;
            int n7 = n3;
            int n8 = Math.min(n7, this.cfr_renamed_152 - n2 * n7);
            long l = n2;
            int n9 = n2 * n3;
            this.cfr_renamed_3780(l, (byte[])arg0, (int)(arg1 + n9), n8);
            n6 = ++n2;
        }
        sprend sprend5 = this;
        sprend5.cfr_renamed_41();
        return sprend5.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprend(int n, int n2) {
        void arg0;
        void arg1;
        this.cfr_renamed_3 = new byte[1];
        if (n2 % 8 != 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spraws.cfr_renamed_9("n<U9T=\u0001:H3DiL<R=\u0001+Di@iL<M=H9M,\u0001&Gi\u0019iC U:\u000fi\u001b")).append((int)arg1).toString());
        }
        sprend sprend2 = this;
        sprend2.cfr_renamed_152 = arg1 / 8;
        sprend sprend3 = this;
        sprend3.cfr_renamed_93 = new sprxkd((int)arg0);
        sprend sprend4 = this;
        sprend2.cfr_renamed_102 = new sprwhd(sprend4, sprend4.cfr_renamed_93.cfr_renamed_1195());
    }

    private static /* synthetic */ Integer cfr_renamed_3785(int arg0, int arg1) {
        return new Integer(arg1 << 16 | arg0);
    }

    private /* synthetic */ void cfr_renamed_3786(int arg0, byte[] arg1) {
        sprend sprend2 = this;
        sprend2.cfr_renamed_3776(arg0);
        sprend2.cfr_renamed_102.cfr_renamed_3778(arg1, 0, arg1.length, this.cfr_renamed_132);
        this.cfr_renamed_3784();
    }

    public void cfr_renamed_1221(byte arg0) {
        sprend sprend2 = this;
        sprend2.cfr_renamed_3[0] = arg0;
        sprend2.cfr_renamed_1197(sprend2.cfr_renamed_3, 0, 1);
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprend(this);
    }

    private /* synthetic */ void cfr_renamed_3776(int arg0) {
        this.cfr_renamed_102.cfr_renamed_3787(arg0);
    }

    private /* synthetic */ void cfr_renamed_3783() {
        sprend sprend2;
        long[] lArray = (long[])cfr_renamed_112.get(sprend.cfr_renamed_3785(this.cfr_renamed_1195(), this.cfr_renamed_3466()));
        if (this.cfr_renamed_2 == null && lArray != null) {
            sprend2 = this;
            this.cfr_renamed_132 = sprzra.cfr_renamed_520(lArray);
        } else {
            sprend sprend3 = this;
            sprend3.cfr_renamed_132 = new long[sprend3.cfr_renamed_1195() / 8];
            if (sprend3.cfr_renamed_2 != null) {
                sprend sprend4 = this;
                sprend4.cfr_renamed_3786(0, sprend4.cfr_renamed_2);
            }
            sprend sprend5 = this;
            sprend2 = sprend5;
            sprend5.cfr_renamed_3786(4, new sprwcd(this.cfr_renamed_152 * 8).cfr_renamed_81());
        }
        if (sprend2.cfr_renamed_0 != null) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_0.length) {
                sprend sprend6 = this;
                sprycd sprycd2 = sprend6.cfr_renamed_0[n];
                sprend6.cfr_renamed_3786(sprycd2.cfr_renamed_324(), sprycd2.cfr_renamed_97());
                n2 = ++n;
            }
        }
        this.cfr_renamed_107 = sprzra.cfr_renamed_520(this.cfr_renamed_132);
    }

    private /* synthetic */ void cfr_renamed_3775(sprend sprend2) {
        sprend sprend3 = sprend2;
        this.cfr_renamed_102.cfr_renamed_3788(sprend2.cfr_renamed_102);
        this.cfr_renamed_132 = sprzra.cfr_renamed_519(sprend3.cfr_renamed_132, this.cfr_renamed_132);
        this.cfr_renamed_107 = sprzra.cfr_renamed_519(sprend3.cfr_renamed_107, this.cfr_renamed_107);
        this.cfr_renamed_2 = sprzra.cfr_renamed_564(sprend3.cfr_renamed_2, this.cfr_renamed_2);
        this.cfr_renamed_0 = sprend.cfr_renamed_3789(sprend3.cfr_renamed_0, this.cfr_renamed_0);
        this.cfr_renamed_86 = sprend.cfr_renamed_3789(sprend3.cfr_renamed_86, this.cfr_renamed_86);
    }

    private static /* synthetic */ sprycd[] cfr_renamed_3789(sprycd[] arg0, sprycd[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            arg1 = new sprycd[arg0.length];
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    private /* synthetic */ void cfr_renamed_3777() {
        if (this.cfr_renamed_102 == null) {
            throw new IllegalArgumentException(sprazy.cfr_renamed_9("O3y1rxy6{1r=<1oxr7hxu6u,u9p1o=xv"));
        }
    }

    private /* synthetic */ void cfr_renamed_3782(Hashtable arg0) {
        Enumeration enumeration = arg0.keys();
        Vector<sprycd> vector = new Vector<sprycd>();
        Vector<sprycd> vector2 = new Vector<sprycd>();
        while (enumeration.hasMoreElements()) {
            Integer n = (Integer)enumeration.nextElement();
            byte[] byArray = (byte[])arg0.get(n);
            if (n == 0) {
                this.cfr_renamed_2 = byArray;
                continue;
            }
            if (n < 48) {
                vector.addElement(new sprycd(n, byArray));
                continue;
            }
            vector2.addElement(new sprycd(n, byArray));
        }
        this.cfr_renamed_0 = new sprycd[vector.size()];
        vector.copyInto(this.cfr_renamed_0);
        sprend.cfr_renamed_3779(this.cfr_renamed_0);
        this.cfr_renamed_86 = new sprycd[vector2.size()];
        sprend sprend2 = this;
        vector2.copyInto(sprend2.cfr_renamed_86);
        sprend.cfr_renamed_3779(sprend2.cfr_renamed_86);
    }
}

