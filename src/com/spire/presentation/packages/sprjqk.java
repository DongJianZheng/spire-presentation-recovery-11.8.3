/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbzk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.spreqk;
import com.spire.presentation.packages.sprfq;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprswk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;

public class sprjqk
implements sprfq {
    private byte[] cfr_renamed_86;
    private int cfr_renamed_152;
    private sprbj cfr_renamed_112;
    private sprbzk cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private sprmr cfr_renamed_1;
    private sprbzk cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3460() {
        return this.cfr_renamed_2.size() + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.length);
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_119.size();
        if (this.cfr_renamed_4) {
            return n + this.cfr_renamed_152;
        }
        if (n < this.cfr_renamed_152) {
            return 0;
        }
        return n - this.cfr_renamed_152;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_1.cfr_renamed_1315()).append(spruci.cfr_renamed_9("yE\u0015K")).toString();
    }

    public int cfr_renamed_3462(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalStateException, sprull, sprddl {
        int n;
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprdsh.cfr_renamed_9("`\u0002na@(S)F3\u00034M(W(B-J;F%\r"));
        }
        int n2 = this.cfr_renamed_86.length;
        int n3 = 15 - n2;
        if (n3 < 4 && arg2 >= (n = 1 << 8 * n3)) {
            throw new IllegalStateException(spruci.cfr_renamed_9("E\u0015Kvv7e=c\"&\"i9&:g$a3&0i$&5n9o5cvi0&'("));
        }
        sprjqk sprjqk2 = this;
        byte[] byArray = new byte[sprjqk2.cfr_renamed_91];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(n3 - 1 & 7);
        System.arraycopy(sprjqk2.cfr_renamed_86, 0, byArray2, 1, this.cfr_renamed_86.length);
        sprswk sprswk2 = new sprswk(this.cfr_renamed_1);
        sprjqk sprjqk3 = this;
        sprswk2.cfr_renamed_5535(sprjqk3.cfr_renamed_4, new sprkpk(this.cfr_renamed_112, byArray2));
        int n4 = arg1;
        int n5 = arg4;
        if (sprjqk3.cfr_renamed_4) {
            int n6 = arg2 + this.cfr_renamed_152;
            if (arg3.length < n6 + arg4) {
                throw new sprwjl(sprdsh.cfr_renamed_9("\u000eV5S4WaA4E'F3\u00035L.\u00032K.Q5\r"));
            }
            this.cfr_renamed_3458(arg0, arg1, arg2, this.cfr_renamed_0);
            byte[] byArray3 = new byte[this.cfr_renamed_91];
            sprswk2.cfr_renamed_3064(this.cfr_renamed_0, 0, byArray3, 0);
            int n7 = n4;
            while (n7 < arg1 + arg2 - this.cfr_renamed_91) {
                sprswk2.cfr_renamed_3064(arg0, n4, arg3, n5);
                n5 += this.cfr_renamed_91;
                n7 = n4 += this.cfr_renamed_91;
            }
            byte[] byArray4 = new byte[this.cfr_renamed_91];
            System.arraycopy(arg0, n4, byArray4, 0, arg2 + arg1 - n4);
            sprswk2.cfr_renamed_3064(byArray4, 0, byArray4, 0);
            System.arraycopy(byArray4, 0, arg3, n5, arg2 + arg1 - n4);
            System.arraycopy(byArray3, 0, arg3, arg4 + arg2, this.cfr_renamed_152);
            return n6;
        }
        if (arg2 < this.cfr_renamed_152) {
            throw new sprull(spruci.cfr_renamed_9("2g\"gvr9ivu>i$r"));
        }
        int n8 = arg2 - this.cfr_renamed_152;
        if (arg3.length < n8 + arg4) {
            throw new sprwjl(sprdsh.cfr_renamed_9("\u000eV5S4WaA4E'F3\u00035L.\u00032K.Q5\r"));
        }
        System.arraycopy(arg0, arg1 + n8, this.cfr_renamed_0, 0, this.cfr_renamed_152);
        sprswk2.cfr_renamed_3064(this.cfr_renamed_0, 0, this.cfr_renamed_0, 0);
        int n9 = this.cfr_renamed_152;
        int n10 = n9;
        while (n10 != this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n9++] = 0;
            n10 = n9;
        }
        int n11 = n4;
        while (n11 < arg1 + n8 - this.cfr_renamed_91) {
            sprswk2.cfr_renamed_3064(arg0, n4, arg3, n5);
            n5 += this.cfr_renamed_91;
            n11 = n4 += this.cfr_renamed_91;
        }
        sprjqk sprjqk4 = this;
        byte[] byArray5 = new byte[sprjqk4.cfr_renamed_91];
        System.arraycopy(arg0, n4, byArray5, 0, n8 - (n4 - arg1));
        sprswk2.cfr_renamed_3064(byArray5, 0, byArray5, 0);
        sprjqk sprjqk5 = this;
        System.arraycopy(byArray5, 0, arg3, n5, n8 - (n4 - arg1));
        byte[] byArray6 = new byte[sprjqk5.cfr_renamed_91];
        sprjqk5.cfr_renamed_3458(arg3, arg4, n8, byArray6);
        if (!sproze.cfr_renamed_559(sprjqk4.cfr_renamed_0, byArray6)) {
            throw new sprull(spruci.cfr_renamed_9("k7eve>c5mvo8&\u0015E\u001b&0g?j3b"));
        }
        return n8;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.cfr_renamed_2.write(arg0);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        sprjqk sprjqk2 = this;
        byte[] byArray = new byte[sprjqk2.cfr_renamed_152];
        System.arraycopy(sprjqk2.cfr_renamed_0, 0, byArray, 0, byArray.length);
        return byArray;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprjqk sprjqk2 = this;
        sprjqk sprjqk3 = this;
        int n = sprjqk3.cfr_renamed_3462(sprjqk2.cfr_renamed_119.cfr_renamed_3461(), 0, sprjqk3.cfr_renamed_119.size(), arg0, arg1);
        sprjqk2.cfr_renamed_41();
        return n;
    }

    private /* synthetic */ int cfr_renamed_10101(boolean arg0, int arg1) {
        if (arg0 && (arg1 < 32 || arg1 > 128 || 0 != (arg1 & 0xF))) {
            throw new IllegalArgumentException(sprdsh.cfr_renamed_9("W DaO$M&W)\u0003(MaL\"W$W2\u0003,V2WaA$\u0003.M$\u0003.EaXu\u000fw\u000fy\u000fp\u0013m\u0012s\u000fp\u0017m\u0012w^"));
        }
        return arg1 >>> 3;
    }

    @Override
    public void cfr_renamed_41() {
        sprjqk sprjqk2 = this;
        sprjqk2.cfr_renamed_1.cfr_renamed_41();
        sprjqk2.cfr_renamed_2.reset();
        sprjqk2.cfr_renamed_119.reset();
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return 0;
    }

    public static sprfq cfr_renamed_7530(sprmr arg0) {
        return new sprjqk(arg0);
    }

    public sprjqk(sprmr arg0) {
        sprjqk sprjqk2 = this;
        this.cfr_renamed_2 = new sprbzk();
        sprjqk2.cfr_renamed_119 = new sprbzk();
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_91 = arg0.cfr_renamed_1195();
        this.cfr_renamed_0 = new byte[this.cfr_renamed_91];
        if (this.cfr_renamed_91 != 16) {
            throw new IllegalArgumentException(spruci.cfr_renamed_9("5o&n3tvt3w#o$c2&!o\"nvgvd:i5mvu?|3&9`v7`("));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl, IllegalStateException {
        void arg0;
        this.cfr_renamed_119.write((int)arg0);
        return 0;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_3463(byte[] arg0, int arg1, int arg2) throws IllegalStateException, sprull {
        sprjqk sprjqk2;
        byte[] byArray;
        if (this.cfr_renamed_4) {
            byArray = new byte[arg2 + this.cfr_renamed_152];
            sprjqk2 = this;
        } else {
            if (arg2 < this.cfr_renamed_152) {
                throw new sprull(sprdsh.cfr_renamed_9("%B5BaW.LaP)L3W"));
            }
            byArray = new byte[arg2 - this.cfr_renamed_152];
            sprjqk2 = this;
        }
        sprjqk2.cfr_renamed_3462(arg0, arg1, arg2, byArray, 0);
        return byArray;
    }

    private /* synthetic */ boolean cfr_renamed_3459() {
        return this.cfr_renamed_3460() > 0;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg0.length < arg1 + arg2) {
            throw new sprddl(spruci.cfr_renamed_9("\u001fh&s\"&4s0`3tvr9ivu>i$r"));
        }
        this.cfr_renamed_119.write(arg0, arg1, arg2);
        return 0;
    }

    private /* synthetic */ int cfr_renamed_3458(byte[] arg0, int arg1, int arg2, byte[] arg3) {
        sprjqk sprjqk2 = this;
        spreqk spreqk2 = new spreqk(sprjqk2.cfr_renamed_1, sprjqk2.cfr_renamed_152 * 8);
        spreqk2.cfr_renamed_5692(this.cfr_renamed_112);
        byte[] byArray = new byte[16];
        if (this.cfr_renamed_3459()) {
            byArray[0] = (byte)(byArray[0] | 0x40);
        }
        byte[] byArray2 = byArray;
        byArray2[0] = (byte)(byArray2[0] | ((spreqk2.cfr_renamed_2404() - 2) / 2 & 7) << 3);
        byArray[0] = (byte)(byArray[0] | 15 - this.cfr_renamed_86.length - 1 & 7);
        System.arraycopy(this.cfr_renamed_86, 0, byArray, 1, this.cfr_renamed_86.length);
        int n = arg2;
        int n2 = 1;
        int n3 = n;
        while (n3 > 0) {
            byArray[byArray.length - n2] = (byte)(n & 0xFF);
            ++n2;
            n3 = n >>>= 8;
        }
        spreqk2.cfr_renamed_1197(byArray, 0, byArray.length);
        if (this.cfr_renamed_3459()) {
            int n4;
            sprjqk sprjqk3;
            int n5 = this.cfr_renamed_3460();
            if (n5 < 65280) {
                sprjqk3 = this;
                spreqk spreqk3 = spreqk2;
                spreqk3.cfr_renamed_1221((byte)(n5 >> 8));
                spreqk3.cfr_renamed_1221((byte)n5);
                n4 = 2;
            } else {
                spreqk spreqk4 = spreqk2;
                int n6 = n5;
                spreqk spreqk5 = spreqk2;
                spreqk spreqk6 = spreqk2;
                spreqk6.cfr_renamed_1221((byte)-1);
                spreqk6.cfr_renamed_1221((byte)-2);
                spreqk5.cfr_renamed_1221((byte)(n5 >> 24));
                spreqk5.cfr_renamed_1221((byte)(n5 >> 16));
                spreqk4.cfr_renamed_1221((byte)(n6 >> 8));
                spreqk4.cfr_renamed_1221((byte)n6);
                n4 = 6;
                sprjqk3 = this;
            }
            if (sprjqk3.cfr_renamed_3 != null) {
                spreqk2.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            }
            if (this.cfr_renamed_2.size() > 0) {
                spreqk2.cfr_renamed_1197(this.cfr_renamed_2.cfr_renamed_3461(), 0, this.cfr_renamed_2.size());
            }
            if ((n4 = (n4 + n5) % 16) != 0) {
                int n7;
                int n8 = n7 = n4;
                while (n8 != 16) {
                    spreqk2.cfr_renamed_1221((byte)0);
                    n8 = ++n7;
                }
            }
        }
        spreqk2.cfr_renamed_1197(arg0, arg1, arg2);
        return spreqk2.cfr_renamed_1219(arg3, 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprbj sprbj3;
        sprbj sprbj4;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprbj2 instanceof sprtxk) {
            sprtxk sprtxk2;
            sprtxk sprtxk3 = sprtxk2 = (sprtxk)arg1;
            this.cfr_renamed_86 = sprtxk3.cfr_renamed_596();
            this.cfr_renamed_3 = sprtxk3.cfr_renamed_3388();
            this.cfr_renamed_152 = this.cfr_renamed_10101((boolean)arg0, sprtxk2.cfr_renamed_2404());
            sprbj3 = sprbj4 = sprtxk2.cfr_renamed_1521();
        } else if (arg1 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            this.cfr_renamed_86 = sprkpk2.cfr_renamed_1205();
            this.cfr_renamed_3 = null;
            this.cfr_renamed_152 = this.cfr_renamed_10101((boolean)arg0, 64);
            sprbj3 = sprbj4 = sprkpk2.cfr_renamed_284();
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("(M7B-J%\u00031B3B,F5F3PaS P2F%\u00035La`\u0002n{\u0003")).append(arg1.getClass().getName()).toString());
        }
        if (sprbj3 != null) {
            this.cfr_renamed_112 = sprbj4;
        }
        if (this.cfr_renamed_86 == null || this.cfr_renamed_86.length < 7 || this.cfr_renamed_86.length > 13) {
            throw new IllegalArgumentException(spruci.cfr_renamed_9("8i8e3&;s%rvn7p3&:c8a\"nv`$i;&a&\"iv7e&9e\"c\"u"));
        }
        this.cfr_renamed_41();
    }
}

