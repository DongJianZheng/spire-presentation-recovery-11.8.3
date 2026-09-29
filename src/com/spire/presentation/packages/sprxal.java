/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprwjl;

public class sprxal
implements sprmr {
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprmr cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprdfq.cfr_renamed_9(">!a\u000b\u007f>V>R(S")).toString();
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    public sprxal(sprmr arg0) {
        sprxal sprxal2 = this;
        this.cfr_renamed_3 = arg0;
        sprxal2.cfr_renamed_119 = arg0.cfr_renamed_1195();
        sprxal2.cfr_renamed_0 = new byte[this.cfr_renamed_119];
        sprxal2.cfr_renamed_1 = new byte[sprxal2.cfr_renamed_119];
        sprxal2.cfr_renamed_91 = new byte[sprxal2.cfr_renamed_119];
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        sprxal sprxal2;
        if (arg1 + this.cfr_renamed_119 > arg0.length) {
            throw new sprddl(spreah.cfr_renamed_9("\u001e2\u0007)\u0003|\u0015)\u0011:\u0012.W(\u00183W/\u001f3\u0005("));
        }
        if (arg3 + this.cfr_renamed_119 > arg2.length) {
            throw new sprwjl(sprdfq.cfr_renamed_9("~\u001be\u001ed\u001a1\fd\bw\u000bcNe\u0001~Nb\u0006~\u001ce"));
        }
        sprxal sprxal3 = this;
        if (sprxal3.cfr_renamed_4 > sprxal3.cfr_renamed_119) {
            byte by;
            sprxal sprxal4 = this;
            sprxal4.cfr_renamed_1[this.cfr_renamed_119 - 2] = by = arg0[arg1];
            sprxal sprxal5 = this;
            arg2[arg3] = sprxal5.cfr_renamed_3394(by, sprxal5.cfr_renamed_119 - 2);
            by = arg0[arg1 + 1];
            sprxal sprxal6 = this;
            sprxal6.cfr_renamed_1[sprxal6.cfr_renamed_119 - 1] = by;
            sprxal sprxal7 = this;
            arg2[arg3 + 1] = sprxal7.cfr_renamed_3394(by, sprxal7.cfr_renamed_119 - 1);
            sprxal4.cfr_renamed_3.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
            int n = 2;
            int n2 = n;
            while (n2 < this.cfr_renamed_119) {
                this.cfr_renamed_1[n - 2] = by = arg0[arg1 + n];
                int n3 = arg3 + n;
                byte by2 = this.cfr_renamed_3394(by, n - 2);
                arg2[n3] = by2;
                n2 = ++n;
            }
        } else {
            if (this.cfr_renamed_4 == 0) {
                sprxal sprxal8 = this;
                sprxal8.cfr_renamed_3.cfr_renamed_3064(sprxal8.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                int n = 0;
                int n4 = n;
                while (true) {
                    if (n4 >= this.cfr_renamed_119) {
                        sprxal sprxal9 = this;
                        sprxal2 = sprxal9;
                        sprxal9.cfr_renamed_4 += this.cfr_renamed_119;
                        return sprxal2.cfr_renamed_119;
                    }
                    int n5 = n;
                    this.cfr_renamed_1[n5] = arg0[arg1 + n5];
                    int n6 = arg3 + n;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                    arg2[n6] = by;
                    n4 = ++n;
                }
            }
            sprxal sprxal10 = this;
            if (sprxal10.cfr_renamed_4 == sprxal10.cfr_renamed_119) {
                sprxal sprxal11 = this;
                sprxal11.cfr_renamed_3.cfr_renamed_3064(sprxal11.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                byte by = arg0[arg1];
                byte by3 = arg0[arg1 + 1];
                int n = arg3;
                arg2[n] = this.cfr_renamed_3394(by, 0);
                sprxal sprxal12 = this;
                arg2[n + 1] = sprxal12.cfr_renamed_3394(by3, 1);
                sprxal sprxal13 = this;
                System.arraycopy(sprxal13.cfr_renamed_1, 2, this.cfr_renamed_1, 0, this.cfr_renamed_119 - 2);
                sprxal sprxal14 = this;
                sprxal13.cfr_renamed_1[sprxal14.cfr_renamed_119 - 2] = by;
                sprxal14.cfr_renamed_1[this.cfr_renamed_119 - 1] = by3;
                sprxal12.cfr_renamed_3.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                int n7 = 2;
                int n8 = n7;
                while (n8 < this.cfr_renamed_119) {
                    byte by4;
                    this.cfr_renamed_1[n7 - 2] = by4 = arg0[arg1 + n7];
                    int n9 = arg3 + n7;
                    byte by5 = this.cfr_renamed_3394(by4, n7 - 2);
                    arg2[n9] = by5;
                    n8 = ++n7;
                }
                this.cfr_renamed_4 += this.cfr_renamed_119;
            }
        }
        sprxal2 = this;
        return sprxal2.cfr_renamed_119;
    }

    private /* synthetic */ byte cfr_renamed_3394(byte arg0, int arg1) {
        return (byte)(this.cfr_renamed_91[arg1] ^ arg0);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_3.cfr_renamed_1195();
    }

    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprxal sprxal2 = this;
        sprxal2.cfr_renamed_2 = arg0;
        sprxal2.cfr_renamed_41();
        sprxal2.cfr_renamed_3.cfr_renamed_5535(true, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        sprxal sprxal2;
        if (arg1 + this.cfr_renamed_119 > arg0.length) {
            throw new sprddl(spreah.cfr_renamed_9("\u001e2\u0007)\u0003|\u0015)\u0011:\u0012.W(\u00183W/\u001f3\u0005("));
        }
        if (arg3 + this.cfr_renamed_119 > arg2.length) {
            throw new sprwjl(sprdfq.cfr_renamed_9("~\u001be\u001ed\u001a1\fd\bw\u000bcNe\u0001~Nb\u0006~\u001ce"));
        }
        sprxal sprxal3 = this;
        if (sprxal3.cfr_renamed_4 > sprxal3.cfr_renamed_119) {
            sprxal sprxal4 = this;
            sprxal sprxal5 = this;
            sprxal4.cfr_renamed_1[sprxal4.cfr_renamed_119 - 2] = arg2[arg3] = sprxal5.cfr_renamed_3394(arg0[arg1], sprxal5.cfr_renamed_119 - 2);
            sprxal sprxal6 = this;
            sprxal sprxal7 = this;
            byte by = sprxal7.cfr_renamed_3394(arg0[arg1 + 1], sprxal7.cfr_renamed_119 - 1);
            arg2[arg3 + 1] = by;
            sprxal6.cfr_renamed_1[sprxal6.cfr_renamed_119 - 1] = by;
            sprxal sprxal8 = this;
            sprxal8.cfr_renamed_3.cfr_renamed_3064(sprxal8.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
            int n = 2;
            int n2 = n;
            while (n2 < this.cfr_renamed_119) {
                int n3 = n - 2;
                byte by2 = this.cfr_renamed_3394(arg0[arg1 + n], n - 2);
                arg2[arg3 + n] = by2;
                this.cfr_renamed_1[n3] = by2;
                n2 = ++n;
            }
        } else {
            if (this.cfr_renamed_4 == 0) {
                sprxal sprxal9 = this;
                sprxal9.cfr_renamed_3.cfr_renamed_3064(sprxal9.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                int n = 0;
                int n4 = n;
                while (true) {
                    if (n4 >= this.cfr_renamed_119) {
                        sprxal sprxal10 = this;
                        sprxal2 = sprxal10;
                        sprxal10.cfr_renamed_4 += this.cfr_renamed_119;
                        return sprxal2.cfr_renamed_119;
                    }
                    int n5 = n;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                    arg2[arg3 + n5] = by;
                    this.cfr_renamed_1[n5] = by;
                    n4 = ++n;
                }
            }
            sprxal sprxal11 = this;
            if (sprxal11.cfr_renamed_4 == sprxal11.cfr_renamed_119) {
                sprxal sprxal12 = this;
                sprxal12.cfr_renamed_3.cfr_renamed_3064(sprxal12.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                sprxal sprxal13 = this;
                arg2[arg3] = this.cfr_renamed_3394(arg0[arg1], 0);
                arg2[arg3 + 1] = this.cfr_renamed_3394(arg0[arg1 + 1], 1);
                System.arraycopy(sprxal13.cfr_renamed_1, 2, this.cfr_renamed_1, 0, this.cfr_renamed_119 - 2);
                sprxal sprxal14 = this;
                System.arraycopy(arg2, arg3, sprxal14.cfr_renamed_1, sprxal14.cfr_renamed_119 - 2, 2);
                sprxal13.cfr_renamed_3.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_91, 0);
                int n = 2;
                int n6 = n;
                while (n6 < this.cfr_renamed_119) {
                    int n7 = n - 2;
                    byte by = this.cfr_renamed_3394(arg0[arg1 + n], n - 2);
                    arg2[arg3 + n] = by;
                    this.cfr_renamed_1[n7] = by;
                    n6 = ++n;
                }
                this.cfr_renamed_4 += this.cfr_renamed_119;
            }
        }
        sprxal2 = this;
        return sprxal2.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4 = 0;
        System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        this.cfr_renamed_3.cfr_renamed_41();
    }
}

