/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmjm;
import com.spire.presentation.packages.sprmuda;
import com.spire.presentation.packages.sprnfo;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxdm;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprpik
extends sprklk {
    public int cfr_renamed_137;
    public static final int cfr_renamed_79 = 101;
    public int cfr_renamed_107;
    public int cfr_renamed_132;
    public int cfr_renamed_102;
    public int cfr_renamed_93;
    public static final int cfr_renamed_86 = 3;
    public static final int cfr_renamed_152 = 4;
    public static final int cfr_renamed_112 = 1;
    public static final int cfr_renamed_119 = 2;
    public int cfr_renamed_91;
    private static final int cfr_renamed_0 = 6;
    public int cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_324() {
        return this.cfr_renamed_137;
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_9486() {
        return this.cfr_renamed_132;
    }

    public int cfr_renamed_7892() {
        return this.cfr_renamed_102;
    }

    private /* synthetic */ void cfr_renamed_11071(sprjah arg0, int arg1, String arg2) throws IOException {
        if (arg1 >= 256) {
            throw new IllegalStateException(new StringBuilder().insert(0, arg2).append(sprnfo.cfr_renamed_9("9fv|9mwkvlxjum")).toString());
        }
        arg0.write(arg1);
    }

    public static sprpik cfr_renamed_11072(sprxdm arg0) {
        return new sprpik(arg0);
    }

    public static sprpik cfr_renamed_11073(int arg0, byte[] arg1, int arg2) {
        return new sprpik(arg0, arg1, arg2);
    }

    public static sprpik cfr_renamed_11074(sprmjm arg0) {
        return new sprpik(arg0);
    }

    public static sprpik cfr_renamed_11075(int arg0, byte[] arg1) {
        return new sprpik(arg0, arg1);
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_91;
    }

    public static sprpik cfr_renamed_11076(int arg0) {
        return new sprpik(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpik(int n, byte[] byArray, int n2) {
        void arg2;
        void arg1;
        void arg0;
        sprpik sprpik2 = this;
        sprpik sprpik3 = this;
        sprpik sprpik4 = this;
        sprpik4.cfr_renamed_1 = -1;
        sprpik4.cfr_renamed_102 = -1;
        sprpik3.cfr_renamed_132 = -1;
        sprpik3.cfr_renamed_137 = 3;
        sprpik2.cfr_renamed_91 = arg0;
        sprpik2.cfr_renamed_4 = arg1;
        if (n2 >= 256 && arg2 <= 65536) {
            throw new IllegalArgumentException(sprmuda.cfr_renamed_9("N\u001fQ\u0010K\u0018CQN\u0005d\u001eR\u001fS"));
        }
        this.cfr_renamed_1 = arg2;
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        switch (this.cfr_renamed_137) {
            case 0: {
                sprjah sprjah2 = arg0;
                while (false) {
                }
                sprpik sprpik2 = this;
                sprjah2.write(sprpik2.cfr_renamed_137);
                sprjah2.write(sprpik2.cfr_renamed_91);
                return;
            }
            case 1: {
                sprjah sprjah3 = arg0;
                sprpik sprpik3 = this;
                arg0.write(this.cfr_renamed_137);
                sprjah3.write(sprpik3.cfr_renamed_91);
                sprjah3.write(sprpik3.cfr_renamed_4);
                return;
            }
            case 3: {
                sprjah sprjah4 = arg0;
                sprpik sprpik4 = this;
                arg0.write(this.cfr_renamed_137);
                sprjah4.write(sprpik4.cfr_renamed_91);
                sprjah4.write(sprpik4.cfr_renamed_4);
                sprpik sprpik5 = this;
                sprpik5.cfr_renamed_11071(arg0, sprpik5.cfr_renamed_1, sprnfo.cfr_renamed_9("Ammkimavf9kv}w|"));
                return;
            }
            case 4: {
                sprjah sprjah5 = arg0;
                sprpik sprpik6 = this;
                sprjah5.write(sprpik6.cfr_renamed_137);
                sprjah5.write(sprpik6.cfr_renamed_4);
                sprpik sprpik7 = this;
                sprpik sprpik8 = this;
                sprjah sprjah6 = arg0;
                sprpik8.cfr_renamed_11071(sprjah6, this.cfr_renamed_102, sprmuda.cfr_renamed_9("!F\u0002T\u0014T"));
                sprpik7.cfr_renamed_11071(sprjah6, sprpik8.cfr_renamed_93, sprnfo.cfr_renamed_9("Xxzxdumuaje"));
                sprpik7.cfr_renamed_11071(arg0, sprpik7.cfr_renamed_107, sprmuda.cfr_renamed_9("<B\u001cH\u0003^QT\u0018]\u0014\u0007\u0014_\u0001H\u001fB\u001fS"));
                return;
            }
            case 101: {
                sprjah sprjah7 = arg0;
                sprjah sprjah8 = arg0;
                sprpik sprpik9 = this;
                arg0.write(sprpik9.cfr_renamed_137);
                sprjah8.write(sprpik9.cfr_renamed_91);
                sprjah8.write(71);
                sprjah7.write(78);
                sprjah7.write(85);
                arg0.write(this.cfr_renamed_132);
                return;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprnfo.cfr_renamed_9("]wcwgnf9[+C9|`x|(")).append(this.cfr_renamed_137).toString());
    }

    public sprpik(int n) {
        sprpik sprpik2 = this;
        sprpik sprpik3 = this;
        this.cfr_renamed_1 = -1;
        sprpik3.cfr_renamed_102 = -1;
        sprpik3.cfr_renamed_132 = -1;
        sprpik2.cfr_renamed_137 = 0;
        sprpik2.cfr_renamed_91 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprpik(sprmjm sprmjm2) {
        void arg0;
        sprpik sprpik2 = this;
        void v1 = arg0;
        sprpik sprpik3 = this;
        sprpik sprpik4 = this;
        this.cfr_renamed_1 = -1;
        sprpik4.cfr_renamed_102 = -1;
        sprpik4.cfr_renamed_132 = -1;
        sprpik3.cfr_renamed_137 = 4;
        sprpik3.cfr_renamed_4 = arg0.cfr_renamed_1477();
        this.cfr_renamed_102 = v1.cfr_renamed_7892();
        sprpik2.cfr_renamed_93 = v1.cfr_renamed_7894();
        sprpik2.cfr_renamed_107 = sprmjm2.cfr_renamed_11077();
    }

    /*
     * WARNING - void declaration
     */
    public sprpik(int n, byte[] byArray) {
        void arg0;
        sprpik sprpik2 = this;
        sprpik sprpik3 = this;
        sprpik sprpik4 = this;
        sprpik4.cfr_renamed_1 = -1;
        sprpik4.cfr_renamed_102 = -1;
        sprpik3.cfr_renamed_132 = -1;
        sprpik3.cfr_renamed_137 = 1;
        sprpik2.cfr_renamed_91 = arg0;
        sprpik2.cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprpik(InputStream arg0) throws IOException {
        sprpik sprpik2 = this;
        this.cfr_renamed_1 = -1;
        sprpik2.cfr_renamed_102 = -1;
        this.cfr_renamed_132 = -1;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sprpik2.cfr_renamed_137 = dataInputStream.read();
        switch (this.cfr_renamed_137) {
            case 0: {
                this.cfr_renamed_91 = dataInputStream.read();
                return;
            }
            case 1: {
                this.cfr_renamed_91 = dataInputStream.read();
                this.cfr_renamed_4 = new byte[8];
                dataInputStream.readFully(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                return;
            }
            case 3: {
                this.cfr_renamed_91 = dataInputStream.read();
                this.cfr_renamed_4 = new byte[8];
                dataInputStream.readFully(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                this.cfr_renamed_1 = dataInputStream.read();
                return;
            }
            case 4: {
                sprpik sprpik3 = this;
                DataInputStream dataInputStream2 = dataInputStream;
                DataInputStream dataInputStream3 = dataInputStream;
                sprpik sprpik4 = this;
                sprpik4.cfr_renamed_4 = new byte[16];
                dataInputStream3.readFully(this.cfr_renamed_4);
                sprpik4.cfr_renamed_102 = dataInputStream3.read();
                sprpik3.cfr_renamed_93 = dataInputStream2.read();
                sprpik3.cfr_renamed_107 = dataInputStream2.read();
                return;
            }
            case 101: {
                this.cfr_renamed_91 = dataInputStream.read();
                dataInputStream.read();
                dataInputStream.read();
                dataInputStream.read();
                this.cfr_renamed_132 = dataInputStream.read();
                return;
            }
        }
        throw new sprwhm(new StringBuilder().insert(0, sprmuda.cfr_renamed_9("8I\u0007F\u001dN\u0015\u0007\"\u0015:\u0007\u0005^\u0001BK\u0007")).append(this.cfr_renamed_137).toString());
    }

    public sprpik(sprxdm sprxdm2) {
        sprpik sprpik2 = this;
        sprpik sprpik3 = this;
        this.cfr_renamed_1 = -1;
        sprpik3.cfr_renamed_102 = -1;
        sprpik3.cfr_renamed_132 = -1;
        sprpik2.cfr_renamed_137 = 101;
        sprpik2.cfr_renamed_132 = sprxdm2.cfr_renamed_9486();
    }

    public int cfr_renamed_7896() {
        return this.cfr_renamed_107;
    }

    public long cfr_renamed_1478() {
        if (this.cfr_renamed_1 >= 256) {
            return this.cfr_renamed_1;
        }
        return 16 + (this.cfr_renamed_1 & 0xF) << (this.cfr_renamed_1 >> 4) + 6;
    }

    public int cfr_renamed_7894() {
        return this.cfr_renamed_93;
    }
}

