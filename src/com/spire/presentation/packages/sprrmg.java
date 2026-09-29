/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlog;
import com.spire.presentation.packages.sprxlh;

public final class sprrmg
extends sprlog {
    @Override
    public short cfr_renamed_7142(int arg0) {
        int n = arg0 & 0xFFF;
        int n2 = arg0 >>> 12;
        int n3 = (arg0 & 0x1FF000) >>> 9;
        int n4 = (arg0 & 0xE00000) >>> 18;
        int n5 = arg0 >>> 21;
        return (short)(n ^ n2 ^ n3 ^ n4 ^ n5);
    }

    private /* synthetic */ int cfr_renamed_7141(short arg0, short arg1, short arg2, short arg3) {
        int n;
        short s = arg0;
        short s2 = arg1;
        short s3 = arg2;
        short s4 = arg3;
        int n2 = s * (s2 & 1);
        int n3 = s3 * (s4 & 1);
        int n4 = n = 1;
        while (n4 < 12) {
            n2 ^= s * (s2 & 1 << n);
            int n5 = s4 & 1 << n;
            n3 ^= s3 * n5;
            n4 = ++n;
        }
        return n2 ^ n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_7145(int n, int[] nArray, short[] sArray, short[] sArray2, int[] nArray2) {
        void arg4;
        void arg0;
        int n2;
        void arg3;
        arg4[0] = this.cfr_renamed_7143((short)arg3[0]);
        int n3 = n2 = 1;
        while (n3 < arg0) {
            void v1 = arg4;
            int n4 = n2;
            v1[n4 + n4 - 1] = false;
            int n5 = n2 + n2;
            int n6 = this.cfr_renamed_7143((short)arg3[n2]);
            v1[n5] = n6;
            n3 = ++n2;
        }
        int n7 = n2 = (arg0 - true) * 2;
        while (n7 >= arg0) {
            void arg1;
            int n8;
            void var7_7 = arg4[n2];
            int n9 = n8 = 0;
            while (n9 < ((void)arg1).length - 1) {
                void v7 = arg4;
                int n10 = n2 - arg0 + arg1[n8];
                v7[n10] = v7[n10] ^ var7_7;
                n9 = ++n8;
            }
            void v9 = arg4;
            int n11 = n2 - arg0;
            v9[n11] = v9[n11] ^ var7_7 << 1;
            n7 = --n2;
        }
        int n12 = n2 = 0;
        while (n12 < arg0) {
            int n13 = n2++;
            arg2[n13] = this.cfr_renamed_7142((int)arg4[n13]);
            n12 = n2;
        }
    }

    @Override
    public short cfr_renamed_7135(short arg0, short arg1) {
        sprrmg sprrmg2 = this;
        return sprrmg2.cfr_renamed_7147(sprrmg2.cfr_renamed_7148(arg0), arg1);
    }

    @Override
    public int cfr_renamed_7143(short arg0) {
        return sprxlh.cfr_renamed_7144(arg0);
    }

    @Override
    public short cfr_renamed_7146(short arg0) {
        int n = sprxlh.cfr_renamed_7144(arg0);
        return this.cfr_renamed_7142(n);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_7139(int n, int[] nArray, short[] sArray, short[] sArray2, short[] sArray3, int[] nArray2) {
        void arg5;
        short s;
        void var8_8;
        void arg0;
        int n2;
        void arg4;
        void arg3;
        arg5[0] = this.cfr_renamed_7140((short)arg3[0], (short)arg4[0]);
        int n3 = n2 = 1;
        while (n3 < arg0) {
            int n4;
            int n5 = n2;
            arg5[n5 + n5 - 1] = false;
            var8_8 = arg3[n5];
            s = arg4[n2];
            int n6 = n4 = 0;
            while (n6 < n2) {
                void v3 = arg5;
                int n7 = n2 + n4;
                int n8 = v3[n7] ^ this.cfr_renamed_7141((short)var8_8, (short)arg4[n4], (short)arg3[n4], s);
                v3[n7] = n8;
                n6 = ++n4;
            }
            int n9 = n2++;
            arg5[n9 + n9] = this.cfr_renamed_7140((short)var8_8, s);
            n3 = n2;
        }
        int n10 = n2 = (arg0 - true) * 2;
        while (n10 >= arg0) {
            void arg1;
            var8_8 = arg5[n2];
            short s2 = s = 0;
            while (s2 < ((void)arg1).length - 1) {
                void v9 = arg5;
                int n11 = n2 - arg0 + arg1[s];
                v9[n11] = v9[n11] ^ var8_8;
                s2 = ++s;
            }
            void v11 = arg5;
            int n12 = n2 - arg0;
            v11[n12] = v11[n12] ^ var8_8 << 1;
            n10 = --n2;
        }
        int n13 = n2 = 0;
        while (n13 < arg0) {
            int n14 = n2++;
            arg2[n14] = this.cfr_renamed_7142((int)arg5[n14]);
            n13 = n2;
        }
    }

    @Override
    public short cfr_renamed_7147(short arg0, short arg1) {
        int n;
        short s = arg0;
        short s2 = arg1;
        int n2 = s * (s2 & 1);
        int n3 = n = 1;
        while (n3 < 12) {
            int n4 = s2 & 1 << n;
            n2 ^= s * n4;
            n3 = ++n;
        }
        return this.cfr_renamed_7142(n2);
    }

    @Override
    public short cfr_renamed_7148(short arg0) {
        short s = arg0;
        sprrmg sprrmg2 = this;
        s = sprrmg2.cfr_renamed_7146(s);
        short s2 = sprrmg2.cfr_renamed_7147(s, arg0);
        s = sprrmg2.cfr_renamed_7146(s2);
        s = sprrmg2.cfr_renamed_7146(s);
        short s3 = sprrmg2.cfr_renamed_7147(s, s2);
        s = sprrmg2.cfr_renamed_7146(s3);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7147(s, s3);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7147(s, s2);
        s = sprrmg2.cfr_renamed_7146(s);
        s = sprrmg2.cfr_renamed_7147(s, arg0);
        return sprrmg2.cfr_renamed_7146(s);
    }

    @Override
    public int cfr_renamed_7140(short arg0, short arg1) {
        int n;
        short s = arg0;
        short s2 = arg1;
        int n2 = s * (s2 & 1);
        int n3 = n = 1;
        while (n3 < 12) {
            int n4 = s2 & 1 << n;
            n2 ^= s * n4;
            n3 = ++n;
        }
        return n2;
    }
}

