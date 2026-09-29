/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmfa;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;

public class sprikd
implements sprff {
    private sprff cfr_renamed_152;
    private boolean cfr_renamed_112;
    private boolean cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (arg1 + this.cfr_renamed_1 > arg0.length) {
            throw new sprjkd(sprcmfa.cfr_renamed_9("o\u001bv\u0000rUd\u0000`\u0013c\u0007&\u0001i\u001a&\u0006n\u001at\u0001"));
        }
        if (arg3 + this.cfr_renamed_1 > arg2.length) {
            throw new sprjkd(sprkzn.cfr_renamed_9("#x8}9ylo9k*h>-8b#-?e#\u007f8"));
        }
        sprikd sprikd2 = this;
        sprikd2.cfr_renamed_152.cfr_renamed_3064(sprikd2.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_1) {
            int n3 = arg3 + n;
            byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
            arg2[n3] = by;
            n2 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_1) {
            int n5 = n++;
            this.cfr_renamed_4[n5] = arg2[arg3 + n5];
            n4 = n;
        }
        return this.cfr_renamed_1;
    }

    private /* synthetic */ int cfr_renamed_3395(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (arg1 + this.cfr_renamed_1 > arg0.length) {
            throw new sprjkd(sprcmfa.cfr_renamed_9("o\u001bv\u0000rUd\u0000`\u0013c\u0007&\u0001i\u001a&\u0006n\u001at\u0001"));
        }
        if (arg3 + this.cfr_renamed_1 > arg2.length) {
            throw new sprjkd(sprkzn.cfr_renamed_9("#x8}9ylo9k*h>-8b#-?e#\u007f8"));
        }
        if (this.cfr_renamed_3 == 0) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_1) {
                int n3 = n++;
                this.cfr_renamed_4[n3] = arg0[arg1 + n3];
                n2 = n;
            }
            sprikd sprikd2 = this;
            sprikd2.cfr_renamed_152.cfr_renamed_3064(sprikd2.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            this.cfr_renamed_3 += this.cfr_renamed_1;
            return 0;
        }
        sprikd sprikd3 = this;
        if (sprikd3.cfr_renamed_3 == sprikd3.cfr_renamed_1) {
            sprikd sprikd4 = this;
            System.arraycopy(arg0, arg1, sprikd4.cfr_renamed_0, 0, this.cfr_renamed_1);
            sprikd sprikd5 = this;
            System.arraycopy(sprikd5.cfr_renamed_4, 2, this.cfr_renamed_4, 0, this.cfr_renamed_1 - 2);
            sprikd5.cfr_renamed_4[this.cfr_renamed_1 - 2] = this.cfr_renamed_0[0];
            sprikd4.cfr_renamed_4[this.cfr_renamed_1 - 1] = this.cfr_renamed_0[1];
            sprikd5.cfr_renamed_152.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            int n = 0;
            int n4 = n;
            while (n4 < this.cfr_renamed_1 - 2) {
                int n5 = arg3 + n;
                sprikd sprikd6 = this;
                byte by = sprikd6.cfr_renamed_3394(sprikd6.cfr_renamed_0[n + 2], n);
                arg2[n5] = by;
                n4 = ++n;
            }
            sprikd sprikd7 = this;
            sprikd sprikd8 = this;
            System.arraycopy(sprikd7.cfr_renamed_0, 2, sprikd8.cfr_renamed_4, 0, this.cfr_renamed_1 - 2);
            sprikd8.cfr_renamed_3 += 2;
            return sprikd7.cfr_renamed_1 - 2;
        }
        sprikd sprikd9 = this;
        if (sprikd9.cfr_renamed_3 >= sprikd9.cfr_renamed_1 + 2) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_0, 0, this.cfr_renamed_1);
            sprikd sprikd10 = this;
            arg2[arg3 + 0] = sprikd10.cfr_renamed_3394(this.cfr_renamed_0[0], sprikd10.cfr_renamed_1 - 2);
            sprikd sprikd11 = this;
            arg2[arg3 + 1] = sprikd11.cfr_renamed_3394(this.cfr_renamed_0[1], sprikd11.cfr_renamed_1 - 1);
            sprikd sprikd12 = this;
            System.arraycopy(this.cfr_renamed_0, 0, sprikd12.cfr_renamed_4, this.cfr_renamed_1 - 2, 2);
            sprikd12.cfr_renamed_152.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            int n = 0;
            int n6 = n;
            while (n6 < this.cfr_renamed_1 - 2) {
                int n7 = arg3 + n + 2;
                sprikd sprikd13 = this;
                byte by = sprikd13.cfr_renamed_3394(sprikd13.cfr_renamed_0[n + 2], n);
                arg2[n7] = by;
                n6 = ++n;
            }
            System.arraycopy(this.cfr_renamed_0, 2, this.cfr_renamed_4, 0, this.cfr_renamed_1 - 2);
        }
        return this.cfr_renamed_1;
    }

    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_152;
    }

    @Override
    public String cfr_renamed_1315() {
        if (this.cfr_renamed_112) {
            return new StringBuilder().insert(0, this.cfr_renamed_152.cfr_renamed_1315()).append(sprcmfa.cfr_renamed_9("ZV2V6@7q\u001cr\u001dO#")).toString();
        }
        return new StringBuilder().insert(0, this.cfr_renamed_152.cfr_renamed_1315()).append(sprkzn.cfr_renamed_9("c]\u000b]\u000fK\u000e")).toString();
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (arg1 + this.cfr_renamed_1 > arg0.length) {
            throw new sprjkd(sprcmfa.cfr_renamed_9("o\u001bv\u0000rUd\u0000`\u0013c\u0007&\u0001i\u001a&\u0006n\u001at\u0001"));
        }
        if (arg3 + this.cfr_renamed_1 > arg2.length) {
            throw new sprjkd(sprkzn.cfr_renamed_9("#x8}9ylo9k*h>-8b#-?e#\u007f8"));
        }
        sprikd sprikd2 = this;
        sprikd2.cfr_renamed_152.cfr_renamed_3064(sprikd2.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_1) {
            int n3 = arg3 + n;
            byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
            arg2[n3] = by;
            n2 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_1) {
            int n5 = n++;
            this.cfr_renamed_4[n5] = arg0[arg1 + n5];
            n4 = n;
        }
        return this.cfr_renamed_1;
    }

    private /* synthetic */ byte cfr_renamed_3394(byte arg0, int arg1) {
        return (byte)(this.cfr_renamed_2[arg1] ^ arg0);
    }

    public sprikd(sprff arg0, boolean arg1) {
        sprikd sprikd2 = this;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_112 = arg1;
        sprikd2.cfr_renamed_1 = arg0.cfr_renamed_1195();
        sprikd2.cfr_renamed_91 = new byte[this.cfr_renamed_1];
        sprikd2.cfr_renamed_4 = new byte[sprikd2.cfr_renamed_1];
        sprikd2.cfr_renamed_2 = new byte[sprikd2.cfr_renamed_1];
        sprikd2.cfr_renamed_0 = new byte[sprikd2.cfr_renamed_1];
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        this.cfr_renamed_3 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_112) {
                this.cfr_renamed_4[n] = 0;
            } else {
                sprikd sprikd2 = this;
                int n3 = n;
                sprikd2.cfr_renamed_4[n3] = sprikd2.cfr_renamed_91[n3];
            }
            n2 = ++n;
        }
        this.cfr_renamed_152.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        if (sprt2 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_91.length) {
                int n;
                sprikd sprikd2 = this;
                System.arraycopy(byArray, 0, sprikd2.cfr_renamed_91, sprikd2.cfr_renamed_91.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_91.length - byArray.length) {
                    this.cfr_renamed_91[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            }
            sprikd sprikd3 = this;
            sprikd3.cfr_renamed_41();
            sprikd3.cfr_renamed_152.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
            return;
        }
        sprikd sprikd4 = this;
        sprikd4.cfr_renamed_41();
        sprikd4.cfr_renamed_152.cfr_renamed_1217(true, (sprt)arg1);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_152.cfr_renamed_1195();
    }

    private /* synthetic */ int cfr_renamed_3397(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (arg1 + this.cfr_renamed_1 > arg0.length) {
            throw new sprjkd(sprcmfa.cfr_renamed_9("o\u001bv\u0000rUd\u0000`\u0013c\u0007&\u0001i\u001a&\u0006n\u001at\u0001"));
        }
        if (this.cfr_renamed_3 == 0) {
            if (arg3 + 2 * this.cfr_renamed_1 + 2 > arg2.length) {
                throw new sprjkd(sprkzn.cfr_renamed_9("#x8}9ylo9k*h>-8b#-?e#\u007f8"));
            }
            sprikd sprikd2 = this;
            sprikd2.cfr_renamed_152.cfr_renamed_3064(sprikd2.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            int n = 0;
            int n2 = n;
            while (n2 < this.cfr_renamed_1) {
                int n3 = arg3 + n;
                sprikd sprikd3 = this;
                byte by = sprikd3.cfr_renamed_3394(sprikd3.cfr_renamed_91[n], n);
                arg2[n3] = by;
                n2 = ++n;
            }
            System.arraycopy(arg2, arg3, this.cfr_renamed_4, 0, this.cfr_renamed_1);
            sprikd sprikd4 = this;
            sprikd4.cfr_renamed_152.cfr_renamed_3064(sprikd4.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            int n4 = arg3;
            sprikd sprikd5 = this;
            arg2[arg3 + this.cfr_renamed_1] = sprikd5.cfr_renamed_3394(this.cfr_renamed_91[sprikd5.cfr_renamed_1 - 2], 0);
            sprikd sprikd6 = this;
            arg2[n4 + this.cfr_renamed_1 + 1] = sprikd6.cfr_renamed_3394(this.cfr_renamed_91[sprikd6.cfr_renamed_1 - 1], 1);
            sprikd sprikd7 = this;
            System.arraycopy(arg2, n4 + 2, sprikd7.cfr_renamed_4, 0, this.cfr_renamed_1);
            sprikd7.cfr_renamed_152.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            n = 0;
            int n5 = n;
            while (n5 < this.cfr_renamed_1) {
                int n6 = arg3 + this.cfr_renamed_1 + 2 + n;
                byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                arg2[n6] = by;
                n5 = ++n;
            }
            System.arraycopy(arg2, arg3 + this.cfr_renamed_1 + 2, this.cfr_renamed_4, 0, this.cfr_renamed_1);
            this.cfr_renamed_3 += 2 * this.cfr_renamed_1 + 2;
            return 2 * this.cfr_renamed_1 + 2;
        }
        sprikd sprikd8 = this;
        if (sprikd8.cfr_renamed_3 >= sprikd8.cfr_renamed_1 + 2) {
            if (arg3 + this.cfr_renamed_1 > arg2.length) {
                throw new sprjkd(sprcmfa.cfr_renamed_9("\u001as\u0001v\u0000rUd\u0000`\u0013c\u0007&\u0001i\u001a&\u0006n\u001at\u0001"));
            }
            sprikd sprikd9 = this;
            sprikd9.cfr_renamed_152.cfr_renamed_3064(sprikd9.cfr_renamed_4, 0, this.cfr_renamed_2, 0);
            int n = 0;
            int n7 = n;
            while (n7 < this.cfr_renamed_1) {
                int n8 = arg3 + n;
                byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                arg2[n8] = by;
                n7 = ++n;
            }
            System.arraycopy(arg2, arg3, this.cfr_renamed_4, 0, this.cfr_renamed_1);
        }
        return this.cfr_renamed_1;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_112) {
            if (this.cfr_renamed_119) {
                return this.cfr_renamed_3397(arg0, arg1, arg2, arg3);
            }
            return this.cfr_renamed_3395(arg0, arg1, arg2, arg3);
        }
        sprikd sprikd2 = this;
        if (this.cfr_renamed_119) {
            return sprikd2.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return sprikd2.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }
}

