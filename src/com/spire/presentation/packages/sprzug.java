/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.sprevy;
import com.spire.presentation.packages.sprfdm;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprli;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprpqg;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprtm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprxcm;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

public class sprzug {
    private int cfr_renamed_91;
    private sprtm cfr_renamed_0;
    private OutputStream cfr_renamed_1;
    private byte cfr_renamed_2;
    private int cfr_renamed_3;
    private sprli cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7536(byte[] arg0, int arg1, int arg2) {
        try {
            this.cfr_renamed_1.write(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(new StringBuilder().insert(0, sprtaz.cfr_renamed_9("\u007fTkXf_*Ne\u001a\u007fJn[~_*Ic]d[~Ox_0\u001a")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public void cfr_renamed_1196(byte[] arg0) {
        this.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    public void cfr_renamed_1221(byte arg0) {
        block0: {
            block2: {
                sprzug sprzug2;
                block4: {
                    block3: {
                        block1: {
                            if (this.cfr_renamed_91 != 1) break block0;
                            if (arg0 != 13) break block1;
                            sprzug sprzug3 = this;
                            sprzug2 = sprzug3;
                            sprzug3.cfr_renamed_7537((byte)13);
                            sprzug3.cfr_renamed_7537((byte)10);
                            break block2;
                        }
                        if (arg0 != 10) break block3;
                        if (this.cfr_renamed_2 == 13) break block4;
                        sprzug sprzug4 = this;
                        sprzug2 = sprzug4;
                        sprzug4.cfr_renamed_7537((byte)13);
                        sprzug4.cfr_renamed_7537((byte)10);
                        break block2;
                    }
                    this.cfr_renamed_7537(arg0);
                }
                sprzug2 = this;
            }
            sprzug2.cfr_renamed_2 = arg0;
            return;
        }
        this.cfr_renamed_7537(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7537(byte arg0) {
        try {
            this.cfr_renamed_1.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(new StringBuilder().insert(0, sprevy.cfr_renamed_9("H\u000e\\\u0002Q\u0005\u001d\u0014R@H\u0010Y\u0001I\u0005\u001d\u0013T\u0007S\u0001I\u0015O\u0005\u0007@")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_91 == 1) {
            int n;
            int n2 = arg1 + arg2;
            int n3 = n = arg1;
            while (n3 != n2) {
                this.cfr_renamed_1221(arg0[n++]);
                n3 = n;
            }
        } else {
            this.cfr_renamed_7536(arg0, arg1, arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_7538(int n, sprmah sprmah2) throws sprtqg {
        void arg1;
        void arg0;
        sprzug sprzug2 = this;
        sprzug2.cfr_renamed_4 = sprzug2.cfr_renamed_0.cfr_renamed_7539((int)arg0, (sprmah)arg1);
        sprzug2.cfr_renamed_1 = sprzug2.cfr_renamed_4.cfr_renamed_470();
        this.cfr_renamed_91 = sprzug2.cfr_renamed_4.cfr_renamed_324();
        this.cfr_renamed_2 = 0;
        if (this.cfr_renamed_3 >= 0) {
            sprzug sprzug3 = this;
            if (sprzug3.cfr_renamed_3 != sprzug3.cfr_renamed_4.cfr_renamed_2373()) {
                throw new sprtqg(sprtaz.cfr_renamed_9("a_s\u001akVmUxS~Rg\u001agSyWkNiR"));
            }
        }
    }

    public sprzug(sprtm sprtm2) {
        sprzug sprzug2 = this;
        sprzug2.cfr_renamed_3 = -1;
        sprzug2.cfr_renamed_0 = sprtm2;
    }

    public sprzyg cfr_renamed_31() throws sprtqg {
        sprzug sprzug2;
        sprghm[] sprghmArray;
        ByteArrayOutputStream byteArrayOutputStream;
        long l = new Date().getTime() / 1000L;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        long l2 = l;
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        byteArrayOutputStream3.write(this.cfr_renamed_91);
        byteArrayOutputStream3.write((byte)(l >> 24));
        byteArrayOutputStream.write((byte)(l2 >> 16));
        byteArrayOutputStream2.write((byte)(l2 >> 8));
        byteArrayOutputStream2.write((byte)l);
        byte[] byArray = byteArrayOutputStream2.toByteArray();
        this.cfr_renamed_7536(byArray, 0, byArray.length);
        if (this.cfr_renamed_4.cfr_renamed_2373() == 3 || this.cfr_renamed_4.cfr_renamed_2373() == 1) {
            sprghmArray = new sprghm[1];
            sprzug2 = this;
            sprghmArray[0] = new sprghm(new BigInteger(1, this.cfr_renamed_4.cfr_renamed_79()));
        } else {
            sprzug sprzug3 = this;
            sprzug2 = sprzug3;
            sprghmArray = sprmxg.cfr_renamed_7540(sprzug3.cfr_renamed_4.cfr_renamed_79());
        }
        byte[] byArray2 = sprzug2.cfr_renamed_4.cfr_renamed_580();
        byte[] byArray3 = new byte[]{byArray2[0], byArray2[1]};
        return new sprzyg(new sprxcm(3, this.cfr_renamed_4.cfr_renamed_324(), this.cfr_renamed_4.cfr_renamed_7541(), this.cfr_renamed_4.cfr_renamed_2373(), this.cfr_renamed_4.cfr_renamed_579(), l * 1000L, byArray3, sprghmArray));
    }

    public sprpqg cfr_renamed_7542(boolean arg0) throws sprtqg {
        sprzug sprzug2 = this;
        return new sprpqg(new sprfdm(sprzug2.cfr_renamed_91, sprzug2.cfr_renamed_4.cfr_renamed_579(), this.cfr_renamed_4.cfr_renamed_2373(), this.cfr_renamed_4.cfr_renamed_7541(), arg0));
    }
}

