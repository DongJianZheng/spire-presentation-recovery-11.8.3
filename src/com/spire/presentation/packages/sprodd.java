/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreds;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprqtha;
import com.spire.presentation.packages.sprt;

public class sprodd
implements sprff {
    private sprff cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_91 = 0;
        System.arraycopy(this.cfr_renamed_4, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        this.cfr_renamed_119.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        sprodd sprodd2;
        if (arg1 + this.cfr_renamed_0 > arg0.length) {
            throw new sprjkd(sprqtha.cfr_renamed_9("n:w!ste!a2b&' h;''o;u "));
        }
        if (arg3 + this.cfr_renamed_0 > arg2.length) {
            throw new sprjkd(spreds.cfr_renamed_9("E\u0005^\u0000_\u0004\n\u0012_\u0016L\u0015XP^\u001fEPY\u0018E\u0002^"));
        }
        sprodd sprodd3 = this;
        if (sprodd3.cfr_renamed_91 > sprodd3.cfr_renamed_0) {
            byte by;
            sprodd sprodd4 = this;
            sprodd4.cfr_renamed_1[this.cfr_renamed_0 - 2] = by = arg0[arg1];
            sprodd sprodd5 = this;
            arg2[arg3] = sprodd5.cfr_renamed_3394(by, sprodd5.cfr_renamed_0 - 2);
            by = arg0[arg1 + 1];
            sprodd sprodd6 = this;
            sprodd6.cfr_renamed_1[sprodd6.cfr_renamed_0 - 1] = by;
            sprodd sprodd7 = this;
            arg2[arg3 + 1] = sprodd7.cfr_renamed_3394(by, sprodd7.cfr_renamed_0 - 1);
            sprodd4.cfr_renamed_119.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
            int n = 2;
            int n2 = n;
            while (n2 < this.cfr_renamed_0) {
                this.cfr_renamed_1[n - 2] = by = arg0[arg1 + n];
                int n3 = arg3 + n;
                byte by2 = this.cfr_renamed_3394(by, n - 2);
                arg2[n3] = by2;
                n2 = ++n;
            }
        } else {
            if (this.cfr_renamed_91 == 0) {
                sprodd sprodd8 = this;
                sprodd8.cfr_renamed_119.cfr_renamed_3064(sprodd8.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                int n = 0;
                int n4 = n;
                while (true) {
                    if (n4 >= this.cfr_renamed_0) {
                        sprodd sprodd9 = this;
                        sprodd2 = sprodd9;
                        sprodd9.cfr_renamed_91 += this.cfr_renamed_0;
                        return sprodd2.cfr_renamed_0;
                    }
                    int n5 = n;
                    this.cfr_renamed_1[n5] = arg0[arg1 + n5];
                    int n6 = n;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n6);
                    arg2[n6] = by;
                    n4 = ++n;
                }
            }
            sprodd sprodd10 = this;
            if (sprodd10.cfr_renamed_91 == sprodd10.cfr_renamed_0) {
                sprodd sprodd11 = this;
                sprodd11.cfr_renamed_119.cfr_renamed_3064(sprodd11.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                byte by = arg0[arg1];
                byte by3 = arg0[arg1 + 1];
                int n = arg3;
                arg2[n] = this.cfr_renamed_3394(by, 0);
                sprodd sprodd12 = this;
                arg2[n + 1] = sprodd12.cfr_renamed_3394(by3, 1);
                sprodd sprodd13 = this;
                System.arraycopy(sprodd13.cfr_renamed_1, 2, this.cfr_renamed_1, 0, this.cfr_renamed_0 - 2);
                sprodd sprodd14 = this;
                sprodd13.cfr_renamed_1[sprodd14.cfr_renamed_0 - 2] = by;
                sprodd14.cfr_renamed_1[this.cfr_renamed_0 - 1] = by3;
                sprodd12.cfr_renamed_119.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                int n7 = 2;
                int n8 = n7;
                while (n8 < this.cfr_renamed_0) {
                    byte by4;
                    this.cfr_renamed_1[n7 - 2] = by4 = arg0[arg1 + n7];
                    int n9 = arg3 + n7;
                    byte by5 = this.cfr_renamed_3394(by4, n7 - 2);
                    arg2[n9] = by5;
                    n8 = ++n7;
                }
                this.cfr_renamed_91 += this.cfr_renamed_0;
            }
        }
        sprodd2 = this;
        return sprodd2.cfr_renamed_0;
    }

    public sprodd(sprff arg0) {
        sprodd sprodd2 = this;
        this.cfr_renamed_119 = arg0;
        sprodd2.cfr_renamed_0 = arg0.cfr_renamed_1195();
        sprodd2.cfr_renamed_4 = new byte[this.cfr_renamed_0];
        sprodd2.cfr_renamed_1 = new byte[sprodd2.cfr_renamed_0];
        sprodd2.cfr_renamed_3 = new byte[sprodd2.cfr_renamed_0];
    }

    private /* synthetic */ byte cfr_renamed_3394(byte arg0, int arg1) {
        return (byte)(this.cfr_renamed_3[arg1] ^ arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_119.cfr_renamed_1315()).append(sprqtha.cfr_renamed_9("{H$b:W\u0013W\u0017A\u0016")).toString();
    }

    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_119;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        sprodd sprodd2 = this;
        sprodd2.cfr_renamed_2 = arg0;
        sprodd2.cfr_renamed_41();
        sprodd2.cfr_renamed_119.cfr_renamed_1217(true, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        sprodd sprodd2;
        if (arg1 + this.cfr_renamed_0 > arg0.length) {
            throw new sprjkd(spreds.cfr_renamed_9("\u0019D\u0000_\u0004\n\u0012_\u0016L\u0015XP^\u001fEPY\u0018E\u0002^"));
        }
        if (arg3 + this.cfr_renamed_0 > arg2.length) {
            throw new sprjkd(sprqtha.cfr_renamed_9(";r w!ste!a2b&' h;''o;u "));
        }
        sprodd sprodd3 = this;
        if (sprodd3.cfr_renamed_91 > sprodd3.cfr_renamed_0) {
            sprodd sprodd4 = this;
            sprodd sprodd5 = this;
            sprodd4.cfr_renamed_1[sprodd4.cfr_renamed_0 - 2] = arg2[arg3] = sprodd5.cfr_renamed_3394(arg0[arg1], sprodd5.cfr_renamed_0 - 2);
            sprodd sprodd6 = this;
            sprodd sprodd7 = this;
            byte by = sprodd7.cfr_renamed_3394(arg0[arg1 + 1], sprodd7.cfr_renamed_0 - 1);
            arg2[arg3 + 1] = by;
            sprodd6.cfr_renamed_1[sprodd6.cfr_renamed_0 - 1] = by;
            sprodd sprodd8 = this;
            sprodd8.cfr_renamed_119.cfr_renamed_3064(sprodd8.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
            int n = 2;
            int n2 = n;
            while (n2 < this.cfr_renamed_0) {
                int n3 = n - 2;
                byte by2 = this.cfr_renamed_3394(arg0[arg1 + n], n - 2);
                arg2[arg3 + n] = by2;
                this.cfr_renamed_1[n3] = by2;
                n2 = ++n;
            }
        } else {
            if (this.cfr_renamed_91 == 0) {
                sprodd sprodd9 = this;
                sprodd9.cfr_renamed_119.cfr_renamed_3064(sprodd9.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                int n = 0;
                int n4 = n;
                while (true) {
                    if (n4 >= this.cfr_renamed_0) {
                        sprodd sprodd10 = this;
                        sprodd2 = sprodd10;
                        sprodd10.cfr_renamed_91 += this.cfr_renamed_0;
                        return sprodd2.cfr_renamed_0;
                    }
                    int n5 = n;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                    arg2[arg3 + n5] = by;
                    this.cfr_renamed_1[n5] = by;
                    n4 = ++n;
                }
            }
            sprodd sprodd11 = this;
            if (sprodd11.cfr_renamed_91 == sprodd11.cfr_renamed_0) {
                sprodd sprodd12 = this;
                sprodd12.cfr_renamed_119.cfr_renamed_3064(sprodd12.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                sprodd sprodd13 = this;
                arg2[arg3] = this.cfr_renamed_3394(arg0[arg1], 0);
                arg2[arg3 + 1] = this.cfr_renamed_3394(arg0[arg1 + 1], 1);
                System.arraycopy(sprodd13.cfr_renamed_1, 2, this.cfr_renamed_1, 0, this.cfr_renamed_0 - 2);
                sprodd sprodd14 = this;
                System.arraycopy(arg2, arg3, sprodd14.cfr_renamed_1, sprodd14.cfr_renamed_0 - 2, 2);
                sprodd13.cfr_renamed_119.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
                int n = 2;
                int n6 = n;
                while (n6 < this.cfr_renamed_0) {
                    int n7 = n - 2;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n - 2);
                    arg2[arg3 + n] = by;
                    this.cfr_renamed_1[n7] = by;
                    n6 = ++n;
                }
                this.cfr_renamed_91 += this.cfr_renamed_0;
            }
        }
        sprodd2 = this;
        return sprodd2.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_119.cfr_renamed_1195();
    }
}

