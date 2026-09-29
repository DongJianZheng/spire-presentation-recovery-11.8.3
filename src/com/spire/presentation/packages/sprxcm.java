/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmpl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprsvda;
import com.spire.presentation.packages.sprtcm;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxyl;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class sprxcm
extends sprzcm
implements sprtg {
    private byte[] cfr_renamed_1328;
    private int cfr_renamed_41;
    private byte[] cfr_renamed_1337;
    private int cfr_renamed_136;
    private sprghm[] cfr_renamed_615;
    private int cfr_renamed_129;
    private long cfr_renamed_1222;
    private long cfr_renamed_1329;
    private sprpnl[] cfr_renamed_1217;
    private sprpnl[] cfr_renamed_1221;
    private int cfr_renamed_725;

    public sprpnl[] cfr_renamed_7677() {
        return this.cfr_renamed_1217;
    }

    public sprxcm(int arg0, long arg1, int arg2, int arg3, sprpnl[] arg4, sprpnl[] arg5, byte[] arg6, sprghm[] arg7) {
        this(4, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public byte[] cfr_renamed_7686() {
        if (this.cfr_renamed_1328 != null) {
            return sproze.cfr_renamed_158(this.cfr_renamed_1328);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int n;
            sprjah sprjah2 = new sprjah(byteArrayOutputStream);
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_615.length) {
                sprjah2.cfr_renamed_7759(this.cfr_renamed_615[n++]);
                n2 = n;
            }
            sprjah2.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException(new StringBuilder().insert(0, sprbcq.cfr_renamed_9("9\u0019$\u0012\"\u00191\u001bp\u0012\"\u0005?\u0005jW")).append(iOException).toString());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public long cfr_renamed_7696() {
        return this.cfr_renamed_1329;
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_1222;
    }

    /*
     * WARNING - void declaration
     */
    public sprxcm(sprmam sprmam2) throws IOException {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        sprxcm sprxcm2;
        int n;
        void arg0;
        sprxcm sprxcm3 = this;
        sprxcm3.cfr_renamed_129 = sprmam2.read();
        if (sprxcm3.cfr_renamed_129 == 3 || this.cfr_renamed_129 == 2) {
            n = arg0.read();
            sprxcm2 = this;
            sprxcm sprxcm4 = this;
            this.cfr_renamed_136 = arg0.read();
            sprxcm4.cfr_renamed_1329 = ((long)arg0.read() << 24 | (long)(arg0.read() << 16) | (long)(arg0.read() << 8) | (long)arg0.read()) * 1000L;
            this.cfr_renamed_1222 |= (long)arg0.read() << 56;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 48;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 40;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 32;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 24;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 16;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read() << 8;
            sprxcm4.cfr_renamed_1222 |= (long)arg0.read();
            this.cfr_renamed_725 = arg0.read();
            this.cfr_renamed_41 = arg0.read();
        } else {
            if (this.cfr_renamed_129 == 4) {
                int n2;
                int n3;
                void v3 = arg0;
                sprxcm sprxcm5 = this;
                sprxcm5.cfr_renamed_136 = arg0.read();
                sprxcm5.cfr_renamed_725 = arg0.read();
                this.cfr_renamed_41 = v3.read();
                n = v3.read() << 8 | arg0.read();
                object5 = new byte[n];
                v3.cfr_renamed_4932((byte[])object5);
                object4 = new sprtcm(new ByteArrayInputStream((byte[])object5));
                object3 = new Vector<sprpnl>();
                sprtcm sprtcm2 = object4;
                while ((object2 = sprtcm2.cfr_renamed_7676()) != null) {
                    sprtcm2 = object4;
                    ((Vector)object3).addElement(object2);
                }
                this.cfr_renamed_1217 = new sprpnl[((Vector)object3).size()];
                int n4 = n3 = 0;
                while (n4 != this.cfr_renamed_1217.length) {
                    sprxcm sprxcm6;
                    object = (sprpnl)((Vector)object3).elementAt(n3);
                    if (object instanceof sprxyl) {
                        this.cfr_renamed_1222 = ((sprxyl)object).cfr_renamed_7541();
                        sprxcm6 = this;
                    } else {
                        if (object instanceof sprmpl) {
                            this.cfr_renamed_1329 = ((sprmpl)object).cfr_renamed_2147().getTime();
                        }
                        sprxcm6 = this;
                    }
                    sprxcm6.cfr_renamed_1217[n3++] = object;
                    n4 = n3;
                }
                void v8 = arg0;
                n3 = v8.read() << 8 | arg0.read();
                byte[] byArray = new byte[n3];
                object = byArray;
                v8.cfr_renamed_4932(byArray);
                Object object6 = object4 = new sprtcm(new ByteArrayInputStream((byte[])object));
                ((Vector)object3).removeAllElements();
                while ((object2 = ((sprtcm)object6).cfr_renamed_7676()) != null) {
                    object6 = object4;
                    ((Vector)object3).addElement(object2);
                }
                this.cfr_renamed_1221 = new sprpnl[((Vector)object3).size()];
                int n5 = n2 = 0;
                while (n5 != this.cfr_renamed_1221.length) {
                    sprpnl sprpnl2 = (sprpnl)((Vector)object3).elementAt(n2);
                    if (sprpnl2 instanceof sprxyl) {
                        this.cfr_renamed_1222 = ((sprxyl)sprpnl2).cfr_renamed_7541();
                    }
                    this.cfr_renamed_1221[n2++] = sprpnl2;
                    n5 = n2;
                }
            } else {
                sprkqe.cfr_renamed_477((InputStream)arg0);
                throw new sprwhm(new StringBuilder().insert(0, sprsvda.cfr_renamed_9("_NYUZPER^EN\u0000\\EXSCOD\u001a\n")).append(this.cfr_renamed_129).toString());
            }
            sprxcm2 = this;
        }
        sprxcm2.cfr_renamed_1337 = new byte[2];
        sprxcm sprxcm7 = this;
        arg0.cfr_renamed_4932(sprxcm7.cfr_renamed_1337);
        switch (sprxcm7.cfr_renamed_725) {
            case 1: 
            case 3: {
                sprghm sprghm2 = new sprghm((sprmam)arg0);
                this.cfr_renamed_615 = new sprghm[1];
                this.cfr_renamed_615[0] = sprghm2;
                return;
            }
            case 17: {
                object5 = new sprghm((sprmam)arg0);
                object2 = new sprghm((sprmam)arg0);
                this.cfr_renamed_615 = new sprghm[2];
                sprxcm sprxcm8 = this;
                sprxcm8.cfr_renamed_615[0] = object5;
                sprxcm8.cfr_renamed_615[1] = object2;
                return;
            }
            case 16: 
            case 20: {
                object4 = new sprghm((sprmam)arg0);
                object3 = new sprghm((sprmam)arg0);
                sprghm sprghm3 = new sprghm((sprmam)arg0);
                this.cfr_renamed_615 = new sprghm[3];
                sprxcm sprxcm9 = this;
                sprxcm9.cfr_renamed_615[0] = object4;
                sprxcm9.cfr_renamed_615[1] = object3;
                sprxcm9.cfr_renamed_615[2] = sprghm3;
                return;
            }
            case 19: 
            case 22: {
                object = new sprghm((sprmam)arg0);
                sprghm sprghm4 = new sprghm((sprmam)arg0);
                this.cfr_renamed_615 = new sprghm[2];
                sprxcm sprxcm10 = this;
                sprxcm10.cfr_renamed_615[0] = object;
                sprxcm10.cfr_renamed_615[1] = sprghm4;
                return;
            }
        }
        if (this.cfr_renamed_725 >= 100 && this.cfr_renamed_725 <= 110) {
            sprxcm sprxcm11 = this;
            sprxcm11.cfr_renamed_615 = null;
            sprxcm11.cfr_renamed_1328 = sprkqe.cfr_renamed_471((InputStream)arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprbcq.cfr_renamed_9("\u0002>\u001c>\u0018'\u0019p\u00049\u0010>\u0016$\u0002\"\u0012p\u001c5\u000ep\u0016<\u0010?\u00059\u00038\u001ajW")).append(this.cfr_renamed_725).toString());
    }

    public static sprxcm cfr_renamed_184(byte[] arg0) throws IOException {
        sprmam sprmam2 = new sprmam(new ByteArrayInputStream(arg0));
        return new sprxcm(sprmam2);
    }

    public sprghm[] cfr_renamed_79() {
        return this.cfr_renamed_615;
    }

    public byte[] cfr_renamed_7690() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1337);
    }

    public byte[] cfr_renamed_7684() {
        byte[] byArray = null;
        if (this.cfr_renamed_129 == 3 || this.cfr_renamed_129 == 2) {
            byArray = new byte[5];
            long l = this.cfr_renamed_1329 / 1000L;
            byte[] byArray2 = byArray;
            byArray[0] = (byte)this.cfr_renamed_136;
            byArray[1] = (byte)(l >> 24);
            byArray[2] = (byte)(l >> 16);
            byArray2[3] = (byte)(l >> 8);
            byArray[4] = (byte)l;
            return byArray2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int n;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            sprxcm sprxcm2 = this;
            ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
            byteArrayOutputStream3.write((byte)this.cfr_renamed_3());
            byteArrayOutputStream3.write((byte)this.cfr_renamed_7576());
            byteArrayOutputStream2.write((byte)sprxcm2.cfr_renamed_2373());
            byteArrayOutputStream2.write((byte)sprxcm2.cfr_renamed_579());
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            sprpnl[] sprpnlArray = this.cfr_renamed_7677();
            int n2 = n = 0;
            while (n2 != sprpnlArray.length) {
                sprpnlArray[n++].cfr_renamed_2623(byteArrayOutputStream4);
                n2 = n;
            }
            byte[] byArray3 = byteArrayOutputStream4.toByteArray();
            byteArrayOutputStream.write((byte)(byArray3.length >> 8));
            byteArrayOutputStream.write((byte)byArray3.length);
            ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream;
            byteArrayOutputStream5.write(byArray3);
            byte[] byArray4 = byteArrayOutputStream5.toByteArray();
            byteArrayOutputStream5.write((byte)this.cfr_renamed_3());
            byteArrayOutputStream5.write(-1);
            byteArrayOutputStream5.write((byte)(byArray4.length >> 24));
            byteArrayOutputStream.write((byte)(byArray4.length >> 16));
            byteArrayOutputStream.write((byte)(byArray4.length >> 8));
            byteArrayOutputStream.write((byte)byArray4.length);
        }
        catch (IOException iOException) {
            throw new RuntimeException(new StringBuilder().insert(0, sprsvda.cfr_renamed_9("ERCOP^IEN\nGONORKTCNM\u0000^RKIFEX\u001a\n")).append(iOException).toString());
        }
        byArray = byteArrayOutputStream.toByteArray();
        return byArray;
    }

    public int cfr_renamed_2373() {
        return this.cfr_renamed_725;
    }

    /*
     * WARNING - void declaration
     */
    public sprxcm(int n, int n2, long l, int n3, int n4, long l2, byte[] byArray, sprghm[] sprghmArray) {
        this((int)arg0, (int)arg1, (long)arg2, (int)arg3, (int)arg4, null, null, (byte[])arg6, (sprghm[])arg7);
        void arg7;
        void arg6;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_1329 = l2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxcm(int n, int n2, long l, int n3, int n4, sprpnl[] sprpnlArray, sprpnl[] sprpnlArray2, byte[] byArray, sprghm[] sprghmArray) {
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxcm sprxcm2 = this;
        sprxcm sprxcm3 = this;
        sprxcm sprxcm4 = this;
        sprxcm sprxcm5 = this;
        this.cfr_renamed_129 = arg0;
        sprxcm5.cfr_renamed_136 = arg1;
        sprxcm5.cfr_renamed_1222 = arg2;
        sprxcm4.cfr_renamed_725 = arg3;
        sprxcm4.cfr_renamed_41 = arg4;
        sprxcm3.cfr_renamed_1217 = arg5;
        sprxcm3.cfr_renamed_1221 = arg6;
        sprxcm2.cfr_renamed_1337 = arg7;
        sprxcm2.cfr_renamed_615 = arg8;
        if (sprpnlArray != null) {
            this.cfr_renamed_11045();
        }
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_41;
    }

    private /* synthetic */ void cfr_renamed_11045() {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_1217.length) {
            if (this.cfr_renamed_1217[n] instanceof sprmpl) {
                this.cfr_renamed_1329 = ((sprmpl)this.cfr_renamed_1217[n]).cfr_renamed_2147().getTime();
                return;
            }
            n2 = ++n;
        }
    }

    public sprpnl[] cfr_renamed_7678() {
        return this.cfr_renamed_1221;
    }

    public int cfr_renamed_7576() {
        return this.cfr_renamed_136;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_129;
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sprjah sprjah2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah3 = new sprjah(byteArrayOutputStream);
        sprxcm sprxcm2 = this;
        sprjah3.write(sprxcm2.cfr_renamed_129);
        if (sprxcm2.cfr_renamed_129 == 3 || this.cfr_renamed_129 == 2) {
            sprjah2 = sprjah3;
            sprjah sprjah4 = sprjah3;
            sprxcm sprxcm3 = this;
            sprjah sprjah5 = sprjah3;
            sprxcm sprxcm4 = this;
            sprjah sprjah6 = sprjah3;
            sprxcm sprxcm5 = this;
            sprjah sprjah7 = sprjah3;
            sprjah sprjah8 = sprjah3;
            sprxcm sprxcm6 = this;
            sprjah sprjah9 = sprjah3;
            sprjah9.write(5);
            long l = sprxcm6.cfr_renamed_1329 / 1000L;
            sprjah9.write(sprxcm6.cfr_renamed_136);
            sprjah8.write((byte)(l >> 24));
            sprjah8.write((byte)(l >> 16));
            sprjah7.write((byte)(l >> 8));
            sprjah7.write((byte)l);
            sprjah7.write((byte)(this.cfr_renamed_1222 >> 56));
            sprjah3.write((byte)(sprxcm5.cfr_renamed_1222 >> 48));
            sprjah6.write((byte)(sprxcm5.cfr_renamed_1222 >> 40));
            sprjah6.write((byte)(this.cfr_renamed_1222 >> 32));
            sprjah3.write((byte)(sprxcm4.cfr_renamed_1222 >> 24));
            sprjah5.write((byte)(sprxcm4.cfr_renamed_1222 >> 16));
            sprjah5.write((byte)(this.cfr_renamed_1222 >> 8));
            sprjah3.write((byte)sprxcm3.cfr_renamed_1222);
            sprjah4.write(sprxcm3.cfr_renamed_725);
            sprjah4.write(this.cfr_renamed_41);
        } else if (this.cfr_renamed_129 == 4) {
            int n;
            int n2;
            sprjah sprjah10 = sprjah3;
            sprxcm sprxcm7 = this;
            sprjah3.write(sprxcm7.cfr_renamed_136);
            sprjah10.write(sprxcm7.cfr_renamed_725);
            sprjah10.write(this.cfr_renamed_41);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int n3 = n2 = 0;
            while (n3 != this.cfr_renamed_1217.length) {
                this.cfr_renamed_1217[n2++].cfr_renamed_2623(byteArrayOutputStream2);
                n3 = n2;
            }
            byte[] byArray = byteArrayOutputStream2.toByteArray();
            sprjah3.write(byArray.length >> 8);
            sprjah3.write(byArray.length);
            sprjah3.write(byArray);
            byteArrayOutputStream2.reset();
            int n4 = n = 0;
            while (n4 != this.cfr_renamed_1221.length) {
                this.cfr_renamed_1221[n++].cfr_renamed_2623(byteArrayOutputStream2);
                n4 = n;
            }
            byArray = byteArrayOutputStream2.toByteArray();
            sprjah3.write(byArray.length >> 8);
            sprjah3.write(byArray.length);
            sprjah sprjah11 = sprjah3;
            sprjah2 = sprjah11;
            sprjah11.write(byArray);
        } else {
            throw new IOException(new StringBuilder().insert(0, sprbcq.cfr_renamed_9("\u0002>\u001c>\u0018'\u0019p\u00015\u0005#\u001e?\u0019jW")).append(this.cfr_renamed_129).toString());
        }
        sprjah2.write(this.cfr_renamed_1337);
        if (this.cfr_renamed_615 != null) {
            int n;
            int n5 = n = 0;
            while (n5 != this.cfr_renamed_615.length) {
                sprjah3.cfr_renamed_7759(this.cfr_renamed_615[n++]);
                n5 = n;
            }
        } else {
            sprjah3.write(this.cfr_renamed_1328);
        }
        sprjah3.close();
        arg0.cfr_renamed_11039(2, byteArrayOutputStream.toByteArray());
    }
}

