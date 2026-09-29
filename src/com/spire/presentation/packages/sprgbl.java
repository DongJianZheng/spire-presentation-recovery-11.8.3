/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprark;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spresk;
import com.spire.presentation.packages.sprgxk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprjcz;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprluk;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprot;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqrk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzu;

public class sprgbl
implements sprzu {
    private byte[] cfr_renamed_132;
    private spresk cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private sprirk cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private boolean cfr_renamed_119;
    private final int cfr_renamed_91;
    private sprmr cfr_renamed_0;
    private spresk cfr_renamed_1;
    private sprot cfr_renamed_2;
    private long[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 64;

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl, IllegalStateException {
        void arg0;
        this.cfr_renamed_102.write((int)arg0);
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprgbl sprgbl2;
        sprtpk sprtpk2;
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        if (!(sprbj2 instanceof sprtxk)) {
            if (!(arg1 instanceof sprkpk)) throw new IllegalArgumentException(sprlxg.cfr_renamed_9("s.L!V)^`J!H!W%N%H`J!I3_$"));
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            int n = this.cfr_renamed_132.length - byArray.length;
            sproze.cfr_renamed_492(this.cfr_renamed_132, (byte)0);
            System.arraycopy(byArray, 0, this.cfr_renamed_132, n, byArray.length);
            this.cfr_renamed_152 = null;
            this.cfr_renamed_112 = this.cfr_renamed_91;
            sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
            sprgbl2 = this;
        } else {
            sprtxk sprtxk2 = (sprtxk)arg1;
            byte[] byArray = sprtxk2.cfr_renamed_596();
            int n = this.cfr_renamed_132.length - byArray.length;
            sproze.cfr_renamed_492(this.cfr_renamed_132, (byte)0);
            System.arraycopy(byArray, 0, this.cfr_renamed_132, n, byArray.length);
            sprtxk sprtxk3 = sprtxk2;
            this.cfr_renamed_152 = sprtxk3.cfr_renamed_3388();
            int n2 = sprtxk3.cfr_renamed_2404();
            if (n2 < 64 || n2 > this.cfr_renamed_91 << 3 || (n2 & 7) != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjcz.cfr_renamed_9("?a\u0000n\u001af\u0012/\u0000n\u001az\u0013/\u0010`\u0004/;N5/\u0005f\fjL/")).append(n2).toString());
            }
            this.cfr_renamed_112 = n2 >>> 3;
            sprtpk2 = sprtxk2.cfr_renamed_1521();
            if (this.cfr_renamed_152 != null) {
                sprgbl sprgbl3 = this;
                sprgbl3.cfr_renamed_2417(this.cfr_renamed_152, 0, sprgbl3.cfr_renamed_152.length);
            }
            sprgbl2 = this;
        }
        sprgbl2.cfr_renamed_93 = new byte[this.cfr_renamed_91];
        sprgbl sprgbl4 = this;
        sprgbl4.cfr_renamed_86.cfr_renamed_5535(true, new sprkpk(sprtpk2, this.cfr_renamed_132));
        sprgbl4.cfr_renamed_0.cfr_renamed_5535(true, sprtpk2);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        int n;
        sprgbl sprgbl2;
        sprgbl sprgbl3 = this;
        int n2 = sprgbl3.cfr_renamed_102.size();
        if (!sprgbl3.cfr_renamed_119 && n2 < this.cfr_renamed_112) {
            throw new sprull(sprjcz.cfr_renamed_9("\u0012n\u0002nV{\u0019`V|\u001e`\u0004{"));
        }
        sprgbl sprgbl4 = this;
        byte[] byArray = new byte[sprgbl4.cfr_renamed_91];
        sprgbl4.cfr_renamed_0.cfr_renamed_3064(byArray, 0, byArray, 0);
        sprgbl sprgbl5 = this;
        long[] lArray = new long[sprgbl5.cfr_renamed_91 >>> 3];
        sprpxe.cfr_renamed_447(byArray, 0, lArray);
        sprgbl5.cfr_renamed_2.cfr_renamed_10014(lArray);
        sproze.cfr_renamed_492(byArray, (byte)0);
        sproze.cfr_renamed_516(lArray, 0L);
        int n3 = sprgbl5.cfr_renamed_1.size();
        if (n3 > 0) {
            sprgbl sprgbl6 = this;
            sprgbl6.cfr_renamed_10015(sprgbl6.cfr_renamed_1.cfr_renamed_3461(), 0, n3);
        }
        if (this.cfr_renamed_119) {
            if (arg0.length - arg1 - this.cfr_renamed_112 < n2) {
                throw new sprwjl(sprlxg.cfr_renamed_9("\u000fO4J5N`X5\\&_2\u001a4U/\u001a3R/H4"));
            }
            sprgbl2 = this;
            sprgbl sprgbl7 = this;
            n = this.cfr_renamed_86.cfr_renamed_505(sprgbl7.cfr_renamed_102.cfr_renamed_3461(), 0, n2, arg0, arg1);
            n += this.cfr_renamed_86.cfr_renamed_1219(arg0, arg1 + n);
            sprgbl7.cfr_renamed_10016(arg0, arg1, n2, n3);
        } else {
            int n4 = n2 - this.cfr_renamed_112;
            if (arg0.length - arg1 < n4) {
                throw new sprwjl(sprjcz.cfr_renamed_9("@\u0003{\u0006z\u0002/\u0014z\u0010i\u0013}V{\u0019`V|\u001e`\u0004{"));
            }
            sprgbl sprgbl8 = this;
            sprgbl2 = sprgbl8;
            sprgbl8.cfr_renamed_10016(sprgbl8.cfr_renamed_102.cfr_renamed_3461(), 0, n4, n3);
            n = sprgbl8.cfr_renamed_86.cfr_renamed_505(this.cfr_renamed_102.cfr_renamed_3461(), 0, n4, arg0, arg1);
            n += this.cfr_renamed_86.cfr_renamed_1219(arg0, arg1 + n);
        }
        if (sprgbl2.cfr_renamed_93 == null) {
            throw new IllegalStateException(sprlxg.cfr_renamed_9("-[#\u001a)I`T/N`Y!V#O,[4_$"));
        }
        if (this.cfr_renamed_119) {
            sprgbl sprgbl9 = this;
            System.arraycopy(sprgbl9.cfr_renamed_93, 0, arg0, arg1 + n, this.cfr_renamed_112);
            sprgbl9.cfr_renamed_41();
            return n + this.cfr_renamed_112;
        }
        sprgbl sprgbl10 = this;
        byte[] byArray2 = new byte[sprgbl10.cfr_renamed_112];
        sprgbl sprgbl11 = this;
        System.arraycopy(sprgbl10.cfr_renamed_102.cfr_renamed_3461(), n2 - sprgbl11.cfr_renamed_112, byArray2, 0, this.cfr_renamed_112);
        byte[] byArray3 = new byte[sprgbl11.cfr_renamed_112];
        System.arraycopy(sprgbl10.cfr_renamed_93, 0, byArray3, 0, this.cfr_renamed_112);
        if (!sproze.cfr_renamed_559(byArray2, byArray3)) {
            throw new sprull(sprjcz.cfr_renamed_9("b\u0017lVy\u0013}\u001fi\u001fl\u0017{\u001f`\u0018/\u0010n\u001fc\u0013k"));
        }
        this.cfr_renamed_41();
        return n;
    }

    private static /* synthetic */ void cfr_renamed_10017(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            long l = arg0[n3] ^ sprpxe.cfr_renamed_443(arg1, arg2);
            arg2 += 8;
            arg0[n3] = l;
            n2 = n;
        }
    }

    private static /* synthetic */ sprot cfr_renamed_10018(int arg0) {
        switch (arg0) {
            case 16: {
                return new sprluk();
            }
            case 32: {
                return new sprqrk();
            }
            case 64: {
                return new sprark();
            }
        }
        throw new IllegalArgumentException(sprlxg.cfr_renamed_9("\u000fT,C`\u000br\u0002l\u001ar\u000fv\u0016`[.^`\u000fq\b`\u0017\"S4\u001a\"V/Y+\u001a3S:_3\u001a3O0J/H4_$"));
    }

    @Override
    public void cfr_renamed_41() {
        sprgbl sprgbl2 = this;
        sproze.cfr_renamed_516(sprgbl2.cfr_renamed_3, 0L);
        sprgbl2.cfr_renamed_0.cfr_renamed_41();
        sprgbl2.cfr_renamed_102.reset();
        sprgbl2.cfr_renamed_1.reset();
        if (sprgbl2.cfr_renamed_152 != null) {
            sprgbl sprgbl3 = this;
            sprgbl3.cfr_renamed_2417(this.cfr_renamed_152, 0, sprgbl3.cfr_renamed_152.length);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgbl(sprmr sprmr2) {
        void arg0;
        sprgbl sprgbl2 = this;
        sprgbl sprgbl3 = this;
        sprgbl sprgbl4 = this;
        sprgbl3.cfr_renamed_1 = new spresk();
        sprgbl3.cfr_renamed_102 = new spresk();
        sprgbl3.cfr_renamed_0 = arg0;
        this.cfr_renamed_86 = new sprirk(new sprgxk(this.cfr_renamed_0));
        sprgbl2.cfr_renamed_112 = -1;
        sprgbl2.cfr_renamed_91 = this.cfr_renamed_0.cfr_renamed_1195();
        sprgbl2.cfr_renamed_152 = new byte[sprgbl2.cfr_renamed_91];
        sprgbl2.cfr_renamed_132 = new byte[sprgbl2.cfr_renamed_91];
        sprgbl2.cfr_renamed_2 = sprgbl.cfr_renamed_10018(sprgbl2.cfr_renamed_91);
        this.cfr_renamed_3 = new long[this.cfr_renamed_91 >>> 3];
        this.cfr_renamed_93 = null;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.cfr_renamed_1.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10015(byte[] arg0, int arg1, int arg2) {
        int n = arg1;
        int n2 = arg1 + arg2;
        int n3 = n;
        while (n3 < n2) {
            sprgbl sprgbl2 = this;
            sprgbl.cfr_renamed_10017(sprgbl2.cfr_renamed_3, arg0, n);
            sprgbl2.cfr_renamed_2.cfr_renamed_10019(this.cfr_renamed_3);
            n3 = n + this.cfr_renamed_91;
        }
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_10016(byte[] arg0, int arg1, int arg2, int arg3) {
        int n = arg1;
        int n2 = arg1 + arg2;
        int n3 = n;
        while (n3 < n2) {
            sprgbl sprgbl2 = this;
            sprgbl.cfr_renamed_10017(sprgbl2.cfr_renamed_3, arg0, n);
            sprgbl2.cfr_renamed_2.cfr_renamed_10019(this.cfr_renamed_3);
            n3 = n + this.cfr_renamed_91;
        }
        long l = ((long)arg3 & 0xFFFFFFFFL) << 3;
        long l2 = ((long)arg2 & 0xFFFFFFFFL) << 3;
        sprgbl sprgbl3 = this;
        sprgbl3.cfr_renamed_3[0] = sprgbl3.cfr_renamed_3[0] ^ l;
        sprgbl sprgbl4 = this;
        long[] lArray = sprgbl3.cfr_renamed_3;
        int n4 = sprgbl4.cfr_renamed_91 >>> 4;
        lArray[n4] = lArray[n4] ^ l2;
        sprgbl3.cfr_renamed_93 = sprpxe.cfr_renamed_458(sprgbl4.cfr_renamed_3);
        sprgbl3.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_93, 0, this.cfr_renamed_93, 0);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg0.length < arg1 + arg2) {
            throw new sprddl(sprjcz.cfr_renamed_9("\u001fa\u0006z\u0002/\u0014z\u0010i\u0013}V{\u0019`V|\u001e`\u0004{"));
        }
        this.cfr_renamed_102.write(arg0, arg1, arg2);
        return 0;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_102.size();
        if (this.cfr_renamed_119) {
            return n + this.cfr_renamed_112;
        }
        if (n < this.cfr_renamed_112) {
            return 0;
        }
        return n - this.cfr_renamed_112;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_0;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        sprgbl sprgbl2 = this;
        byte[] byArray = new byte[sprgbl2.cfr_renamed_112];
        System.arraycopy(sprgbl2.cfr_renamed_93, 0, byArray, 0, this.cfr_renamed_112);
        return byArray;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprlxg.cfr_renamed_9("oq\u0007y\r")).toString();
    }
}

