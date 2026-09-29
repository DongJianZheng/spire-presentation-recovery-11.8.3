/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahk;
import com.spire.presentation.packages.sprcfl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprial;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprmjl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvgl;
import com.spire.presentation.packages.sprwjl;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprbml
implements sprhx {
    public static final int cfr_renamed_105 = 512;
    private sprcfl[] cfr_renamed_137;
    private static final int cfr_renamed_79 = 4;
    private final byte[] cfr_renamed_107;
    public static final int cfr_renamed_132 = 1024;
    private static final int cfr_renamed_102 = 63;
    private static final int cfr_renamed_93 = 48;
    private static final int cfr_renamed_86 = 0;
    public final sprial cfr_renamed_152;
    private byte[] cfr_renamed_112;
    public static final int cfr_renamed_119 = 256;
    private final sprmjl cfr_renamed_91;
    public long[] cfr_renamed_0;
    private long[] cfr_renamed_1;
    private sprcfl[] cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final Hashtable cfr_renamed_4 = new Hashtable();

    static {
        long[] lArray = new long[4];
        lArray[0] = -2228972824489528736L;
        lArray[1] = -8629553674646093540L;
        lArray[2] = 1155188648486244218L;
        lArray[3] = -3677226592081559102L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(256 / 8, 128 / 8), lArray);
        long[] lArray2 = new long[4];
        lArray2[0] = 1450197650740764312L;
        lArray2[1] = 3081844928540042640L;
        lArray2[2] = -3136097061834271170L;
        lArray2[3] = 3301952811952417661L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(256 / 8, 160 / 8), lArray2);
        long[] lArray3 = new long[4];
        lArray3[0] = -4176654842910610933L;
        lArray3[1] = -8688192972455077604L;
        lArray3[2] = -7364642305011795836L;
        lArray3[3] = 4056579644589979102L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(256 / 8, 224 / 8), lArray3);
        long[] lArray4 = new long[4];
        lArray4[0] = -243853671043386295L;
        lArray4[1] = 3443677322885453875L;
        lArray4[2] = -5531612722399640561L;
        lArray4[3] = 7662005193972177513L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(256 / 8, 256 / 8), lArray4);
        long[] lArray5 = new long[8];
        lArray5[0] = -6288014694233956526L;
        lArray5[1] = 2204638249859346602L;
        lArray5[2] = 3502419045458743507L;
        lArray5[3] = -4829063503441264548L;
        lArray5[4] = 983504137758028059L;
        lArray5[5] = 1880512238245786339L;
        lArray5[6] = -6715892782214108542L;
        lArray5[7] = 7602827311880509485L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(512 / 8, 128 / 8), lArray5);
        long[] lArray6 = new long[8];
        lArray6[0] = 2934123928682216849L;
        lArray6[1] = -4399710721982728305L;
        lArray6[2] = 1684584802963255058L;
        lArray6[3] = 5744138295201861711L;
        lArray6[4] = 2444857010922934358L;
        lArray6[5] = -2807833639722848072L;
        lArray6[6] = -5121587834665610502L;
        lArray6[7] = 118355523173251694L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(512 / 8, 160 / 8), lArray6);
        long[] lArray7 = new long[8];
        lArray7[0] = -3688341020067007964L;
        lArray7[1] = -3772225436291745297L;
        lArray7[2] = -8300862168937575580L;
        lArray7[3] = 4146387520469897396L;
        lArray7[4] = 1106145742801415120L;
        lArray7[5] = 7455425944880474941L;
        lArray7[6] = -7351063101234211863L;
        lArray7[7] = -7048981346965512457L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(512 / 8, 224 / 8), lArray7);
        long[] lArray8 = new long[8];
        lArray8[0] = -6631894876634615969L;
        lArray8[1] = -5692838220127733084L;
        lArray8[2] = -7099962856338682626L;
        lArray8[3] = -2911352911530754598L;
        lArray8[4] = 2000907093792408677L;
        lArray8[5] = 9140007292425499655L;
        lArray8[6] = 6093301768906360022L;
        lArray8[7] = 2769176472213098488L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(512 / 8, 384 / 8), lArray8);
        long[] lArray9 = new long[8];
        lArray9[0] = 5261240102383538638L;
        lArray9[1] = 978932832955457283L;
        lArray9[2] = -8083517948103779378L;
        lArray9[3] = -7339365279355032399L;
        lArray9[4] = 6752626034097301424L;
        lArray9[5] = -1531723821829733388L;
        lArray9[6] = -7417126464950782685L;
        lArray9[7] = -5901786942805128141L;
        sprbml.cfr_renamed_4.put(sprbml.cfr_renamed_3785(512 / 8, 512 / 8), lArray9);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprbml sprbml2 = (sprbml)arg0;
        if (this.cfr_renamed_1195() != sprbml2.cfr_renamed_1195() || this.cfr_renamed_3 != sprbml2.cfr_renamed_3) {
            throw new IllegalArgumentException(sprjej.cfr_renamed_9("\u0016u<t2k>o6y3~\u007fk>i>v:o:i,;6u\u007fk-t)r;~;;\fp:r1^1|6u:5"));
        }
        this.cfr_renamed_10479(sprbml2);
    }

    public void cfr_renamed_1221(byte arg0) {
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_107[0] = arg0;
        sprbml2.cfr_renamed_1197(sprbml2.cfr_renamed_107, 0, 1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbml(int n, int n2) {
        void arg0;
        void arg1;
        this.cfr_renamed_107 = new byte[1];
        if (n2 % 8 != 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprttn.cfr_renamed_9("\u0007E<@=DhC!J-\u0010%E;DhR-\u0010)\u0010%E$D!@$Uh_.\u0010p\u0010*Y<Cf\u0010r")).append((int)arg1).toString());
        }
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_3 = arg1 / 8;
        sprbml sprbml3 = this;
        sprbml3.cfr_renamed_152 = new sprial((int)arg0);
        sprbml sprbml4 = this;
        sprbml2.cfr_renamed_91 = new sprmjl(sprbml4, sprbml4.cfr_renamed_152.cfr_renamed_1195());
    }

    private static /* synthetic */ sprcfl[] cfr_renamed_10480(sprcfl[] arg0, sprcfl[] arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 == null || arg1.length != arg0.length) {
            arg1 = new sprcfl[arg0.length];
        }
        System.arraycopy(arg0, 0, arg1, 0, arg1.length);
        return arg1;
    }

    private /* synthetic */ void cfr_renamed_3786(int arg0, byte[] arg1) {
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_3776(arg0);
        sprbml2.cfr_renamed_91.cfr_renamed_3778(arg1, 0, arg1.length, this.cfr_renamed_0);
        this.cfr_renamed_3784();
    }

    private /* synthetic */ void cfr_renamed_3780(long arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        byte[] byArray = new byte[8];
        sprpxe.cfr_renamed_444(arg0, byArray, 0);
        long[] lArray = new long[this.cfr_renamed_0.length];
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_3776(63);
        sprbml2.cfr_renamed_91.cfr_renamed_3778(byArray, 0, byArray.length, lArray);
        this.cfr_renamed_91.cfr_renamed_3781(lArray);
        int n2 = (arg3 + 8 - 1) / 8;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = Math.min(8, arg3 - n * 8);
            if (n4 == 8) {
                sprpxe.cfr_renamed_444(lArray[n], arg1, arg2 + n * 8);
            } else {
                sprpxe.cfr_renamed_444(lArray[n], byArray, 0);
                System.arraycopy(byArray, 0, arg1, arg2 + n * 8, n4);
            }
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3776(int arg0) {
        this.cfr_renamed_91.cfr_renamed_3787(arg0);
    }

    private /* synthetic */ void cfr_renamed_3784() {
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_91.cfr_renamed_3781(sprbml2.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_10479(sprbml sprbml2) {
        sprbml sprbml3 = sprbml2;
        this.cfr_renamed_91.cfr_renamed_10481(sprbml2.cfr_renamed_91);
        this.cfr_renamed_0 = sproze.cfr_renamed_519(sprbml3.cfr_renamed_0, this.cfr_renamed_0);
        this.cfr_renamed_1 = sproze.cfr_renamed_519(sprbml3.cfr_renamed_1, this.cfr_renamed_1);
        this.cfr_renamed_112 = sproze.cfr_renamed_564(sprbml3.cfr_renamed_112, this.cfr_renamed_112);
        this.cfr_renamed_2 = sprbml.cfr_renamed_10480(sprbml3.cfr_renamed_2, this.cfr_renamed_2);
        this.cfr_renamed_137 = sprbml.cfr_renamed_10480(sprbml3.cfr_renamed_137, this.cfr_renamed_137);
    }

    public int cfr_renamed_3466() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbml(sprbml sprbml2) {
        void arg0;
        sprbml sprbml3 = this;
        sprbml3(arg0.cfr_renamed_1195() * 8, arg0.cfr_renamed_3466() * 8);
        sprbml3.cfr_renamed_10479(sprbml2);
    }

    private /* synthetic */ void cfr_renamed_3782(Hashtable arg0) {
        Enumeration enumeration = arg0.keys();
        Vector<sprcfl> vector = new Vector<sprcfl>();
        Vector<sprcfl> vector2 = new Vector<sprcfl>();
        while (enumeration.hasMoreElements()) {
            Integer n = (Integer)enumeration.nextElement();
            byte[] byArray = (byte[])arg0.get(n);
            if (n == 0) {
                this.cfr_renamed_112 = byArray;
                continue;
            }
            if (n < 48) {
                vector.addElement(new sprcfl(n, byArray));
                continue;
            }
            vector2.addElement(new sprcfl(n, byArray));
        }
        this.cfr_renamed_2 = new sprcfl[vector.size()];
        vector.copyInto(this.cfr_renamed_2);
        sprbml.cfr_renamed_10482(this.cfr_renamed_2);
        this.cfr_renamed_137 = new sprcfl[vector2.size()];
        sprbml sprbml2 = this;
        vector2.copyInto(sprbml2.cfr_renamed_137);
        sprbml.cfr_renamed_10482(sprbml2.cfr_renamed_137);
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_3777();
        sprbml2.cfr_renamed_91.cfr_renamed_3778(arg0, arg1, arg2, this.cfr_renamed_0);
    }

    private static /* synthetic */ Integer cfr_renamed_3785(int arg0, int arg1) {
        return spruaf.cfr_renamed_279(arg1 << 16 | arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10111(sprahk sprahk2) {
        sprbml sprbml2 = this;
        sprbml sprbml3 = this;
        sprbml3.cfr_renamed_0 = null;
        sprbml3.cfr_renamed_112 = null;
        sprbml2.cfr_renamed_2 = null;
        sprbml2.cfr_renamed_137 = null;
        if (sprahk2 != null) {
            void arg0;
            if (arg0.cfr_renamed_1521().length < 16) {
                throw new IllegalArgumentException(sprjej.cfr_renamed_9("\fp:r1;4~&;2n,o\u007fy:;>o\u007fw:z,o\u007f*m#\u007fy6o,5"));
            }
            this.cfr_renamed_3782(arg0.cfr_renamed_284());
        }
        this.cfr_renamed_3783();
        this.cfr_renamed_3776(48);
    }

    private /* synthetic */ void cfr_renamed_3783() {
        sprbml sprbml2;
        long[] lArray = (long[])cfr_renamed_4.get(sprbml.cfr_renamed_3785(this.cfr_renamed_1195(), this.cfr_renamed_3466()));
        if (this.cfr_renamed_112 == null && lArray != null) {
            sprbml2 = this;
            this.cfr_renamed_0 = sproze.cfr_renamed_520(lArray);
        } else {
            sprbml sprbml3 = this;
            sprbml3.cfr_renamed_0 = new long[sprbml3.cfr_renamed_1195() / 8];
            if (sprbml3.cfr_renamed_112 != null) {
                sprbml sprbml4 = this;
                sprbml4.cfr_renamed_3786(0, sprbml4.cfr_renamed_112);
            }
            sprbml sprbml5 = this;
            sprbml2 = sprbml5;
            sprbml5.cfr_renamed_3786(4, new sprvgl(this.cfr_renamed_3 * 8).cfr_renamed_81());
        }
        if (sprbml2.cfr_renamed_2 != null) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2.length) {
                sprbml sprbml6 = this;
                sprcfl sprcfl2 = sprbml6.cfr_renamed_2[n];
                sprbml6.cfr_renamed_3786(sprcfl2.cfr_renamed_324(), sprcfl2.cfr_renamed_97());
                n2 = ++n;
            }
        }
        this.cfr_renamed_1 = sproze.cfr_renamed_520(this.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_3777() {
        if (this.cfr_renamed_91 == null) {
            throw new IllegalArgumentException(sprttn.cfr_renamed_9("c#U!^hU&W!^-\u0010!Ch^'DhY&Y<Y)\\!C-Tf"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        int n3;
        void arg1;
        this.cfr_renamed_3777();
        if (byArray.length < arg1 + this.cfr_renamed_3) {
            throw new sprwjl(sprjej.cfr_renamed_9("T*o/n+;=n9}:i\u007fr,;+t0;,s0i+;+t\u007fs0w;;0n+k*o"));
        }
        sprbml sprbml2 = this;
        sprbml2.cfr_renamed_3784();
        if (sprbml2.cfr_renamed_137 != null) {
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_137.length) {
                sprbml sprbml3 = this;
                sprcfl sprcfl2 = sprbml3.cfr_renamed_137[n3];
                sprbml3.cfr_renamed_3786(sprcfl2.cfr_renamed_324(), sprcfl2.cfr_renamed_97());
                n4 = ++n3;
            }
        }
        sprbml sprbml4 = this;
        n3 = sprbml4.cfr_renamed_1195();
        int n5 = (sprbml4.cfr_renamed_3 + n3 - 1) / n3;
        int n6 = n2 = 0;
        while (n6 < n5) {
            void arg0;
            int n7 = n3;
            int n8 = Math.min(n7, this.cfr_renamed_3 - n2 * n7);
            long l = n2;
            int n9 = n2 * n3;
            this.cfr_renamed_3780(l, (byte[])arg0, (int)(arg1 + n9), n8);
            n6 = ++n2;
        }
        sprbml sprbml5 = this;
        sprbml5.cfr_renamed_41();
        return sprbml5.cfr_renamed_3;
    }

    private static /* synthetic */ void cfr_renamed_10482(sprcfl[] arg0) {
        int n;
        if (arg0 == null) {
            return;
        }
        int n2 = n = 1;
        while (n2 < arg0.length) {
            int n3;
            sprcfl sprcfl2 = arg0[n];
            int n4 = n;
            while (n4 > 0 && sprcfl2.cfr_renamed_324() < arg0[n3 - 1].cfr_renamed_324()) {
                int n5 = n3;
                arg0[n5] = arg0[n3 - 1];
                n4 = n5 - 1;
            }
            arg0[n3] = sprcfl2;
            n2 = ++n;
        }
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_152.cfr_renamed_1195();
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprbml(this);
    }

    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_1, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        this.cfr_renamed_3776(48);
    }
}

