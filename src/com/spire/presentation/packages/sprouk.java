/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprisga;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruir;

public class sprouk
implements spraq {
    public long cfr_renamed_93;
    public int cfr_renamed_86;
    public final int cfr_renamed_152;
    public long cfr_renamed_112;
    public long cfr_renamed_119;
    public final int cfr_renamed_91;
    public long cfr_renamed_0;
    public long cfr_renamed_1;
    public int cfr_renamed_2;
    public long cfr_renamed_3;
    public long cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        int n2 = arg2 & 0xFFFFFFF8;
        if (this.cfr_renamed_86 == 0) {
            int n3 = n;
            while (n3 < n2) {
                int n4 = arg1 + n;
                this.cfr_renamed_0 = sprpxe.cfr_renamed_443(arg0, n4);
                this.cfr_renamed_3469();
                n3 = n += 8;
            }
            int n5 = n;
            while (n5 < arg2) {
                sprouk sprouk2 = this;
                sprouk2.cfr_renamed_0 >>>= 8;
                long l = (long)arg0[arg1 + n] & 0xFFL;
                sprouk2.cfr_renamed_0 |= l << 56;
                n5 = ++n;
            }
            this.cfr_renamed_86 = arg2 - n2;
            return;
        }
        int n6 = this.cfr_renamed_86 << 3;
        int n7 = n;
        while (n7 < n2) {
            long l = sprpxe.cfr_renamed_443(arg0, arg1 + n);
            this.cfr_renamed_0 = l << n6 | this.cfr_renamed_0 >>> -n6;
            this.cfr_renamed_3469();
            this.cfr_renamed_0 = l;
            n7 = n += 8;
        }
        int n8 = n;
        while (n8 < arg2) {
            sprouk sprouk3 = this;
            sprouk3.cfr_renamed_0 >>>= 8;
            sprouk3.cfr_renamed_0 |= ((long)arg0[arg1 + n] & 0xFFL) << 56;
            if (++sprouk3.cfr_renamed_86 == 8) {
                this.cfr_renamed_3469();
                this.cfr_renamed_86 = 0;
            }
            n8 = ++n;
        }
    }

    public long cfr_renamed_1206() throws sprddl, IllegalStateException {
        sprouk sprouk2 = this;
        sprouk2.cfr_renamed_0 >>>= 7 - this.cfr_renamed_86 << 3;
        sprouk2.cfr_renamed_0 >>>= 8;
        sprouk2.cfr_renamed_0 |= ((long)((this.cfr_renamed_2 << 3) + this.cfr_renamed_86) & 0xFFL) << 56;
        sprouk2.cfr_renamed_3469();
        sprouk2.cfr_renamed_4 ^= 0xFFL;
        sprouk2.cfr_renamed_3468(sprouk2.cfr_renamed_152);
        long l = sprouk2.cfr_renamed_93 ^ this.cfr_renamed_112 ^ this.cfr_renamed_4 ^ this.cfr_renamed_3;
        sprouk2.cfr_renamed_41();
        return l;
    }

    public static long cfr_renamed_3467(long arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        sprouk sprouk2 = this;
        sprouk2.cfr_renamed_0 >>>= 8;
        sprouk2.cfr_renamed_0 |= ((long)arg0 & 0xFFL) << 56;
        if (++sprouk2.cfr_renamed_86 == 8) {
            this.cfr_renamed_3469();
            this.cfr_renamed_86 = 0;
        }
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprtpk)) {
            throw new IllegalArgumentException(sprisga.cfr_renamed_9("{H=J=U/\u001f|U)K(\u0018>]|Y2\u00185V/L=V?]|W:\u0018\u0017]%h=J=U9L9J"));
        }
        byte[] byArray = ((sprtpk)arg0).cfr_renamed_1521();
        if (byArray.length != 16) {
            throw new IllegalArgumentException(spruir.cfr_renamed_9("54s6s)ac2)g7fdp!2%2u |?&{02/w="));
        }
        sprouk sprouk2 = this;
        sprouk2.cfr_renamed_1 = sprpxe.cfr_renamed_443(byArray, 0);
        sprouk2.cfr_renamed_119 = sprpxe.cfr_renamed_443(byArray, 8);
        this.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) throws sprddl, IllegalStateException {
        void arg1;
        void arg0;
        sprpxe.cfr_renamed_444(this.cfr_renamed_1206(), (byte[])arg0, (int)arg1);
        return 8;
    }

    /*
     * WARNING - void declaration
     */
    public sprouk(int n, int n2) {
        void arg0;
        sprouk sprouk2 = this;
        sprouk sprouk3 = this;
        this.cfr_renamed_0 = 0L;
        sprouk3.cfr_renamed_86 = 0;
        sprouk3.cfr_renamed_2 = 0;
        sprouk2.cfr_renamed_91 = arg0;
        sprouk2.cfr_renamed_152 = n2;
    }

    @Override
    public void cfr_renamed_41() {
        sprouk sprouk2 = this;
        sprouk sprouk3 = this;
        sprouk sprouk4 = this;
        sprouk4.cfr_renamed_93 = sprouk4.cfr_renamed_1 ^ 0x736F6D6570736575L;
        sprouk4.cfr_renamed_112 = sprouk4.cfr_renamed_119 ^ 0x646F72616E646F6DL;
        sprouk4.cfr_renamed_4 = sprouk4.cfr_renamed_1 ^ 0x6C7967656E657261L;
        sprouk3.cfr_renamed_3 = sprouk4.cfr_renamed_119 ^ 0x7465646279746573L;
        sprouk3.cfr_renamed_0 = 0L;
        sprouk2.cfr_renamed_86 = 0;
        sprouk2.cfr_renamed_2 = 0;
    }

    public void cfr_renamed_3468(int arg0) {
        int n;
        sprouk sprouk2 = this;
        long l = sprouk2.cfr_renamed_93;
        long l2 = sprouk2.cfr_renamed_112;
        long l3 = sprouk2.cfr_renamed_4;
        long l4 = sprouk2.cfr_renamed_3;
        int n2 = n = 0;
        while (n2 < arg0) {
            l += l2;
            l3 += l4;
            l2 = sprouk.cfr_renamed_3467(l2, 13);
            l4 = sprouk.cfr_renamed_3467(l4, 16);
            l2 ^= l;
            l4 ^= l3;
            l = sprouk.cfr_renamed_3467(l, 32);
            l3 += l2;
            l += l4;
            l2 = sprouk.cfr_renamed_3467(l2, 17);
            l4 = sprouk.cfr_renamed_3467(l4, 21);
            l2 ^= l3;
            l4 ^= l;
            l3 = sprouk.cfr_renamed_3467(l3, 32);
            n2 = ++n;
        }
        sprouk sprouk3 = this;
        this.cfr_renamed_93 = l;
        sprouk3.cfr_renamed_112 = l2;
        sprouk3.cfr_renamed_4 = l3;
        this.cfr_renamed_3 = l4;
    }

    public void cfr_renamed_3469() {
        sprouk sprouk2 = this;
        ++sprouk2.cfr_renamed_2;
        sprouk2.cfr_renamed_3 ^= this.cfr_renamed_0;
        sprouk2.cfr_renamed_3468(sprouk2.cfr_renamed_91);
        sprouk2.cfr_renamed_93 ^= this.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_2404() {
        return 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprisga.cfr_renamed_9("\u000fQ,p=K4\u0015")).append(this.cfr_renamed_91).append("-").append(this.cfr_renamed_152).toString();
    }

    public sprouk() {
        sprouk sprouk2 = this;
        sprouk sprouk3 = this;
        this.cfr_renamed_0 = 0L;
        sprouk3.cfr_renamed_86 = 0;
        sprouk3.cfr_renamed_2 = 0;
        sprouk2.cfr_renamed_91 = 2;
        sprouk2.cfr_renamed_152 = 4;
    }
}

