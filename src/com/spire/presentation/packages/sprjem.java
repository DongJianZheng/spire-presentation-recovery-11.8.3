/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.sprihp;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprjem
extends sprzcm {
    private byte[] cfr_renamed_93;
    private sprpik cfr_renamed_86;
    public static final int cfr_renamed_152 = 6;
    private byte[] cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 5;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_8027() {
        return this.cfr_renamed_93;
    }

    public int cfr_renamed_7757() {
        return this.cfr_renamed_119;
    }

    public static sprjem cfr_renamed_7918(int arg0, sprpik arg1, byte[] arg2) {
        return new sprjem(arg0, arg1, arg2);
    }

    public sprpik cfr_renamed_7738() {
        return this.cfr_renamed_86;
    }

    public static byte[] cfr_renamed_11042(int arg0, int arg1, int arg2) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = -61;
        byArray[1] = (byte)(arg0 & 0xFF);
        byArray2[2] = (byte)(arg1 & 0xFF);
        byArray[3] = (byte)(arg2 & 0xFF);
        return byArray2;
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sprjah sprjah2;
        ByteArrayOutputStream byteArrayOutputStream;
        block4: {
            sprjah sprjah3;
            block3: {
                block2: {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    (this.cfr_renamed_91 == 4 ? (sprjah3 = new sprjah(byteArrayOutputStream)) : (sprjah3 = new sprjah((OutputStream)byteArrayOutputStream, true))).write(this.cfr_renamed_91);
                    if (this.cfr_renamed_91 != 4) break block2;
                    sprjem sprjem2 = this;
                    sprjah3.write(this.cfr_renamed_119);
                    sprjah3.cfr_renamed_7759(sprjem2.cfr_renamed_86);
                    if (sprjem2.cfr_renamed_1 == null || this.cfr_renamed_1.length <= 0) break block3;
                    sprjah sprjah4 = sprjah3;
                    sprjah2 = sprjah4;
                    sprjah4.write(this.cfr_renamed_1);
                    break block4;
                }
                if (this.cfr_renamed_91 == 5 || this.cfr_renamed_91 == 6) {
                    int n = this.cfr_renamed_86.cfr_renamed_91().length;
                    int n2 = 3 + n + this.cfr_renamed_4.length;
                    sprjem sprjem3 = this;
                    sprjah sprjah5 = sprjah3;
                    sprjah sprjah6 = sprjah3;
                    sprjah3.write(n2);
                    sprjah6.write(this.cfr_renamed_119);
                    sprjah6.write(this.cfr_renamed_0);
                    sprjah5.write(n);
                    sprjah5.cfr_renamed_7759(this.cfr_renamed_86);
                    sprjah3.write(sprjem3.cfr_renamed_4);
                    if (sprjem3.cfr_renamed_1 != null && this.cfr_renamed_1.length > 0) {
                        sprjah3.write(this.cfr_renamed_1);
                    }
                    sprjah3.write(this.cfr_renamed_93);
                }
            }
            sprjah2 = sprjah3;
        }
        sprjah2.close();
        arg0.cfr_renamed_11039(3, byteArrayOutputStream.toByteArray());
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjem(sprmam sprmam2) throws IOException {
        int n;
        void arg0;
        sprjem sprjem2 = this;
        sprjem2.cfr_renamed_91 = sprmam2.read();
        if (sprjem2.cfr_renamed_91 == 4) {
            sprjem sprjem3 = this;
            sprjem3.cfr_renamed_119 = arg0.read();
            sprjem sprjem4 = this;
            sprjem3.cfr_renamed_86 = new sprpik((InputStream)arg0);
            sprjem3.cfr_renamed_1 = arg0.cfr_renamed_145();
            return;
        }
        if (this.cfr_renamed_91 != 5 && this.cfr_renamed_91 != 6) {
            throw new sprwhm(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("\u0014M2V1S.Q5F%\u0003\u0011d\u0011\u00032Z,N$W3J\"\u000e*F8\u0003$M\"Q8S5F%\u00032F2P(L/\u0003*F8\u00031B\"H$WaU$Q2J.MaF/@.V/W$Q$G{\u0003")).append(this.cfr_renamed_91).toString());
        }
        void v3 = arg0;
        int n2 = arg0.read();
        void v4 = arg0;
        this.cfr_renamed_119 = v4.read();
        this.cfr_renamed_0 = v4.read();
        int n3 = v3.read();
        this.cfr_renamed_112 = new byte[n3];
        v3.cfr_renamed_4932(this.cfr_renamed_112);
        try {
            this.cfr_renamed_86 = new sprpik(new ByteArrayInputStream(this.cfr_renamed_112));
            n = n2;
        }
        catch (sprwhm sprwhm2) {
            n = n2;
        }
        int n4 = n - 3 - n3;
        this.cfr_renamed_4 = new byte[n4];
        if (arg0.read(this.cfr_renamed_4) != this.cfr_renamed_4.length) {
            throw new EOFException(sprihp.cfr_renamed_9("d<Q#U:A<QnQ Pn[(\u0014=@<Q/Y`"));
        }
        int n5 = sprsgm.cfr_renamed_7912(this.cfr_renamed_0);
        this.cfr_renamed_93 = new byte[n5];
        byte[] byArray = arg0.cfr_renamed_145();
        this.cfr_renamed_1 = new byte[byArray.length - n5];
        System.arraycopy(byArray, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        System.arraycopy(byArray, this.cfr_renamed_1.length, this.cfr_renamed_93, 0, n5);
    }

    public static sprjem cfr_renamed_7913(int arg0, int arg1, byte[] arg2, sprpik arg3, byte[] arg4, byte[] arg5) {
        return new sprjem(6, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjem(int n, int n2, int n3, byte[] byArray, sprpik sprpik2, byte[] byArray2, byte[] byArray3) {
        void arg6;
        void arg3;
        void arg5;
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprjem sprjem2 = this;
        sprjem sprjem3 = this;
        this.cfr_renamed_91 = arg0;
        sprjem3.cfr_renamed_119 = arg1;
        sprjem3.cfr_renamed_0 = arg2;
        sprjem2.cfr_renamed_86 = arg4;
        sprjem2.cfr_renamed_1 = arg5;
        int n4 = sprsgm.cfr_renamed_7910(n3);
        if (n4 != ((void)arg3).length) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprihp.cfr_renamed_9("y'G#U:W&Q*\u0014\u000fq\u000fpn}\u0018\u0014\"Q S:\\`\u0014\u000bL>Q-@+Pn")).append(n4).append(sprdsh.cfr_renamed_9("m\u0003&L5\u0003")).append(((void)arg3).length).toString());
        }
        this.cfr_renamed_4 = arg3;
        int n5 = sprsgm.cfr_renamed_7912((int)arg2);
        if (n5 != ((void)arg6).length) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprihp.cfr_renamed_9("\u0003]=Y/@-\\+Pnu\u000bu\n\u0014\u000fA:\\\u001aU)\u0014\"Q S:\\`\u0014\u000bL>Q-@+Pn")).append(n5).append(sprdsh.cfr_renamed_9("m\u0003&L5\u0003")).append(((void)arg6).length).toString());
        }
        this.cfr_renamed_93 = arg6;
    }

    /*
     * WARNING - void declaration
     */
    public sprjem(int n, sprpik sprpik2, byte[] byArray) {
        void arg1;
        void arg0;
        sprjem sprjem2 = this;
        sprjem sprjem3 = this;
        sprjem3.cfr_renamed_91 = 4;
        sprjem3.cfr_renamed_119 = arg0;
        sprjem2.cfr_renamed_86 = arg1;
        sprjem2.cfr_renamed_1 = byArray;
    }

    public byte[] cfr_renamed_8028() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_7954() {
        return sprjem.cfr_renamed_11042(this.cfr_renamed_3(), this.cfr_renamed_7757(), this.cfr_renamed_7855());
    }

    public byte[] cfr_renamed_7821() {
        return this.cfr_renamed_1;
    }

    public static sprjem cfr_renamed_7917(int arg0, int arg1, byte[] arg2, sprpik arg3, byte[] arg4, byte[] arg5) {
        return new sprjem(5, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int cfr_renamed_7855() {
        return this.cfr_renamed_0;
    }
}

