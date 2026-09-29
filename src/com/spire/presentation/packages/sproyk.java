/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;

public class sproyk
extends sprirk {
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sproyk(sprmr sprmr2) {
        void arg0;
        if (sprmr2 instanceof sprsrk) {
            throw new IllegalArgumentException(sprccb.cfr_renamed_9("F#v\u0015i8f<F>u?`%%4d9%8k;|wd4f2u#%\u0012F\u0015)wj%%\u0014G\u0014%4l'm2w$"));
        }
        sproyk sproyk2 = this;
        this.cfr_renamed_2 = arg0;
        sproyk2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sproyk2.cfr_renamed_91 = new byte[this.cfr_renamed_4 * 2];
        this.cfr_renamed_0 = 0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        sproyk sproyk2;
        if (this.cfr_renamed_0 + arg1 > arg0.length) {
            throw new sprwjl(sprkki.cfr_renamed_9("<\u001a'\u001f&\u001bs\r&\t5\n!O'\u0000s\u001c>\u000e?\u0003s\u0006=O7\u0000\u0015\u0006=\u000e?"));
        }
        sproyk sproyk3 = this;
        int n = sproyk3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = sproyk3.cfr_renamed_0 - n;
        byte[] byArray = new byte[n];
        if (sproyk3.cfr_renamed_119) {
            if (this.cfr_renamed_0 < n) {
                throw new sprddl(sprccb.cfr_renamed_9("k2`3%6qwi2d$qwj9`wg;j4nwj1%>k'p#%1j%%\u0014Q\u0004"));
            }
            sproyk sproyk4 = this;
            sproyk4.cfr_renamed_2.cfr_renamed_3064(sproyk4.cfr_renamed_91, 0, byArray, 0);
            if (sproyk4.cfr_renamed_0 > n) {
                byte[] byArray2;
                int n3;
                int n4 = n3 = this.cfr_renamed_0;
                while (n4 != this.cfr_renamed_91.length) {
                    int n5 = n3++;
                    this.cfr_renamed_91[n5] = byArray[n5 - n];
                    n4 = n3;
                }
                int n6 = n3 = n;
                while (n6 != this.cfr_renamed_0) {
                    int n7 = n3;
                    byte by = (byte)(this.cfr_renamed_91[n7] ^ byArray[n3 - n]);
                    this.cfr_renamed_91[n7] = by;
                    n6 = ++n3;
                }
                sproyk sproyk5 = this;
                if (this.cfr_renamed_2 instanceof sprhqk) {
                    sprmr sprmr2 = ((sprhqk)sproyk5.cfr_renamed_2).cfr_renamed_2349();
                    byArray2 = byArray;
                    sprmr2.cfr_renamed_3064(this.cfr_renamed_91, n, arg0, arg1);
                } else {
                    sproyk5.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, n, arg0, arg1);
                    byArray2 = byArray;
                }
                System.arraycopy(byArray2, 0, arg0, arg1 + n, n2);
                sproyk2 = this;
            } else {
                System.arraycopy(byArray, 0, arg0, arg1, n);
                sproyk2 = this;
            }
        } else {
            if (this.cfr_renamed_0 < n) {
                throw new sprddl(sprkki.cfr_renamed_9("\u00016\n7O2\u001bs\u00036\u000e \u001bs\u0000=\ns\r?\u00000\u0004s\u00005O:\u0001#\u001a'O5\u0000!O\u0010;\u0000"));
            }
            byte[] byArray3 = new byte[n];
            if (this.cfr_renamed_0 > n) {
                int n8;
                int n9;
                sproyk sproyk6 = this;
                if (this.cfr_renamed_2 instanceof sprhqk) {
                    sprmr sprmr3 = ((sprhqk)sproyk6.cfr_renamed_2).cfr_renamed_2349();
                    n9 = n;
                    sprmr3.cfr_renamed_3064(this.cfr_renamed_91, 0, byArray, 0);
                } else {
                    sproyk6.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, byArray, 0);
                    n9 = n;
                }
                int n10 = n8 = n9;
                while (n10 != this.cfr_renamed_0) {
                    int n11 = n8 - n;
                    byte by = (byte)(byArray[n8 - n] ^ this.cfr_renamed_91[n8]);
                    byArray3[n11] = by;
                    n10 = ++n8;
                }
                sproyk sproyk7 = this;
                sproyk2 = sproyk7;
                System.arraycopy(sproyk7.cfr_renamed_91, n, byArray, 0, n2);
                sproyk7.cfr_renamed_2.cfr_renamed_3064(byArray, 0, arg0, arg1);
                System.arraycopy(byArray3, 0, arg0, arg1 + n, n2);
            } else {
                sproyk sproyk8 = this;
                sproyk2 = sproyk8;
                sproyk8.cfr_renamed_2.cfr_renamed_3064(sproyk8.cfr_renamed_91, 0, byArray, 0);
                System.arraycopy(byArray, 0, arg0, arg1, n);
            }
        }
        int n12 = sproyk2.cfr_renamed_0;
        this.cfr_renamed_41();
        return n12;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        sproyk sproyk2 = this;
        if (sproyk2.cfr_renamed_0 == sproyk2.cfr_renamed_91.length) {
            sproyk sproyk3 = this;
            sproyk sproyk4 = this;
            n = sproyk3.cfr_renamed_2.cfr_renamed_3064(sproyk4.cfr_renamed_91, 0, arg1, arg2);
            sproyk sproyk5 = this;
            System.arraycopy(sproyk3.cfr_renamed_91, sproyk5.cfr_renamed_4, sproyk5.cfr_renamed_91, 0, this.cfr_renamed_4);
            sproyk3.cfr_renamed_0 = sproyk4.cfr_renamed_4;
        }
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprccb.cfr_renamed_9("\u0014d9\"#%?d!`wdwk2b6q>s2%>k'p#%;`9b#mv"));
        }
        sproyk sproyk2 = this;
        int n = sproyk2.cfr_renamed_1195();
        int n2 = sproyk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprkki.cfr_renamed_9("<\u001a'\u001f&\u001bs\r&\t5\n!O'\u0000<O \u0007<\u001d'"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_91.length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sproyk sproyk3 = this;
            System.arraycopy(arg0, arg1, sproyk3.cfr_renamed_91, sproyk3.cfr_renamed_0, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg3, arg4);
            int n5 = n;
            System.arraycopy(this.cfr_renamed_91, n5, this.cfr_renamed_91, 0, n);
            this.cfr_renamed_0 = n5;
            arg1 += n4;
            int n6 = arg2 -= n4;
            while (n6 > n) {
                sproyk sproyk4 = this;
                System.arraycopy(arg0, arg1, sproyk4.cfr_renamed_91, sproyk4.cfr_renamed_0, n);
                sproyk sproyk5 = this;
                n3 += this.cfr_renamed_2.cfr_renamed_3064(sproyk5.cfr_renamed_91, 0, arg3, arg4 + n3);
                int n7 = n;
                System.arraycopy(sproyk5.cfr_renamed_91, n7, this.cfr_renamed_91, 0, n7);
                arg1 += n;
                n6 = arg2 -= n;
            }
        }
        sproyk sproyk6 = this;
        System.arraycopy(arg0, arg1, sproyk6.cfr_renamed_91, sproyk6.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
        return n3;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_0;
        int n2 = n % this.cfr_renamed_91.length;
        if (n2 == 0) {
            return n - this.cfr_renamed_91.length;
        }
        return n - n2;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_0;
    }
}

