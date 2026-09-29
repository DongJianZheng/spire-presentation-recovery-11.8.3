/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprbfn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcym;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprkn;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprnvn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@sprtea
public abstract class sprgbf
extends sprxgf
implements sprml,
sprkn {
    public static final sprqbn cfr_renamed_2 = new sprcym(sprgbf.class, 3);
    public final byte[] cfr_renamed_3;
    private static final char[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        int n;
        if (!(arg0 instanceof sprgbf)) {
            return false;
        }
        sprgbf sprgbf2 = (sprgbf)arg0;
        byte[] byArray = sprgbf2.cfr_renamed_3;
        byte[] byArray2 = this.cfr_renamed_3;
        int n2 = byArray2.length;
        if (byArray.length != n2) {
            return false;
        }
        if (n2 == 1) {
            return true;
        }
        int n3 = n2 - 1;
        int n4 = n = 0;
        while (n4 < n3) {
            if (byArray2[n] != byArray[n]) {
                return false;
            }
            n4 = ++n;
        }
        n = byArray2[0] & 0xFF;
        byte by = (byte)(byArray2[n3] & 255 << n);
        byte by2 = (byte)(byArray[n3] & 255 << n);
        return by == by2;
    }

    public byte[] cfr_renamed_186() {
        if (this.cfr_renamed_3[0] != 0) {
            throw new IllegalStateException(sprnvn.cfr_renamed_9("srfc\u007fvf&fi2awr2h}h?iqrwr2g~ouhwb2bsrs&tt}k2D[R2UFT[HU"));
        }
        return sproze.cfr_renamed_533(this.cfr_renamed_3, 1, this.cfr_renamed_3.length);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return new sprbfn(this.cfr_renamed_3, false);
    }

    public static byte[] cfr_renamed_4491(int arg0) {
        int n;
        int n2;
        int n3;
        block4: {
            int n4;
            if (arg0 == 0) {
                return new byte[0];
            }
            n3 = 4;
            int n5 = n4 = 3;
            while (n5 >= 1) {
                if ((arg0 & 255 << n4 * 8) != 0) {
                    n2 = n3;
                    break block4;
                }
                --n3;
                n5 = --n4;
            }
            n2 = n3;
        }
        byte[] byArray = new byte[n2];
        int n6 = n = 0;
        while (n6 < n3) {
            int n7 = n++;
            byArray[n7] = (byte)(arg0 >> n7 * 8 & 0xFF);
            n6 = n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprgbf(byte by, int n) {
        void arg0;
        void arg1;
        if (n > 7 || arg1 < 0) {
            throw new IllegalArgumentException(sprbff.cfr_renamed_9("lIx\b~Ah[<K}FrGh\b~M<OnM}\\yZ<\\tIr\b+\bsZ<Dy[o\bh@}F<\u0018"));
        }
        byte[] byArray = new byte[2];
        byArray[0] = (byte)arg1;
        byArray[1] = arg0;
        this.cfr_renamed_3 = byArray;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public static sprgbf cfr_renamed_11295(byte[] arg0) {
        int n = arg0.length;
        if (n < 1) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("ftghqgfcv&POF&AR@O\\A2bwrwefcv"));
        }
        int n2 = arg0[0] & 0xFF;
        if (n2 > 0) {
            if (n2 > 7 || n < 2) {
                throw new IllegalArgumentException(sprbff.cfr_renamed_9("Ar^}DuL<X}L<Ju\\o\bxMhM\u007f\\yL"));
            }
            byte by = arg0[n - 1];
            if (by != (byte)(by & 255 << n2)) {
                return new sprbfn(arg0, false);
            }
        }
        return new sprdye(arg0, false);
    }

    public int cfr_renamed_1868() {
        int n;
        int n2 = 0;
        int n3 = Math.min(5, this.cfr_renamed_3.length - 1);
        int n4 = n = 1;
        while (n4 < n3) {
            int n5 = this.cfr_renamed_3[n] & 0xFF;
            int n6 = 8 * (n - 1);
            n2 |= n5 << n6;
            n4 = ++n;
        }
        if (1 <= n3 && n3 < 5) {
            sprgbf sprgbf2 = this;
            n = sprgbf2.cfr_renamed_3[0] & 0xFF;
            byte by = (byte)(sprgbf2.cfr_renamed_3[n3] & 255 << n);
            n2 |= (by & 0xFF) << 8 * (n3 - 1);
        }
        return n2;
    }

    @Override
    public sprxgf cfr_renamed_2414() {
        return this.cfr_renamed_119();
    }

    public sprkn cfr_renamed_4828() {
        return this;
    }

    public byte[] cfr_renamed_81() {
        if (this.cfr_renamed_3.length == 1) {
            return sproug.cfr_renamed_3;
        }
        sprgbf sprgbf2 = this;
        int n = sprgbf2.cfr_renamed_3[0] & 0xFF;
        byte[] byArray = sproze.cfr_renamed_533(sprgbf2.cfr_renamed_3, 1, this.cfr_renamed_3.length);
        byte[] byArray2 = byArray;
        int n2 = byArray.length - 1;
        byArray[n2] = (byte)(byArray[n2] & (byte)(255 << n));
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgbf(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new NullPointerException(sprnvn.cfr_renamed_9("5bsrs!2esh|if&pc2hgj~"));
        }
        if (((void)arg0).length == 0 && arg1 != false) {
            throw new IllegalArgumentException(sprbff.cfr_renamed_9("RyZs\bpMrOh@<L}\\}\bkAh@<FsF1RyZs\blIx\b~Ah["));
        }
        if (arg1 > 7 || arg1 < 0) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("vsb2d{ra&qg|h}r2dw&utwgfc`&fnsh212i`&~cau2rzg|&\""));
        }
        this.cfr_renamed_3 = sproze.cfr_renamed_560((byte[])arg0, (byte)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprgbf(byte[] byArray, boolean bl) {
        void arg0;
        if (bl) {
            if (null == arg0) {
                throw new NullPointerException(sprbff.cfr_renamed_9("\u000f\u007fGr\\yFh[;\b\u007fIrFs\\<Jy\br]pD"));
            }
            if (((void)arg0).length < 1) {
                throw new IllegalArgumentException(sprnvn.cfr_renamed_9("!qi|rwhfu5&qg|h}r2dw&wkbrk"));
            }
            int n = arg0[0] & 0xFF;
            if (n > 0) {
                if (((void)arg0).length < 2) {
                    throw new IllegalArgumentException(sprbff.cfr_renamed_9("RyZs\bpMrOh@<L}\\}\bkAh@<FsF1RyZs\blIx\b~Ah["));
                }
                if (n > 7) {
                    throw new IllegalArgumentException(sprnvn.cfr_renamed_9("vsb2d{ra&qg|h}r2dw&utwgfc`&fnsh212i`&~cau2rzg|&\""));
                }
            }
        }
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public InputStream cfr_renamed_3231() throws IOException {
        return new ByteArrayInputStream(this.cfr_renamed_3, 1, this.cfr_renamed_3.length - 1);
    }

    @Override
    public InputStream cfr_renamed_698() throws IOException {
        int n = this.cfr_renamed_3[0] & 0xFF;
        if (0 != n) {
            throw new IOException(new StringBuilder().insert(0, sprbff.cfr_renamed_9("MdXyKhMx\bsKhMh\u0005}DuOrMx\b~Ah[hZuF{\u0004<Ji\\<Ns]rL<X}L^Ah[&\b")).append(n).toString());
        }
        return this.cfr_renamed_3231();
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return new sprdye(this.cfr_renamed_3, false);
    }

    static {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 65;
        cArray[11] = 66;
        cArray[12] = 67;
        cArray[13] = 68;
        cArray[14] = 69;
        cArray[15] = 70;
        cfr_renamed_4 = cArray;
    }

    public static sprgbf cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgbf) {
            return (sprgbf)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprgbf) {
                return (sprgbf)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sprgbf)cfr_renamed_2.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprnvn.cfr_renamed_9("`so~cv&fi2e}har`sqr2D[R2UFT[HU&tt}k2dkrw]O<2")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbff.cfr_renamed_9("ApDyO}D<G~ByKh\buF<Oy\\UFo\\}F\u007fM&\b")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public int hashCode() {
        if (this.cfr_renamed_3.length < 2) {
            return 1;
        }
        sprgbf sprgbf2 = this;
        int n = sprgbf2.cfr_renamed_3[0] & 0xFF;
        int n2 = sprgbf2.cfr_renamed_3.length - 1;
        sprgbf sprgbf3 = this;
        byte by = (byte)(sprgbf3.cfr_renamed_3[n2] & 255 << n);
        int n3 = sproze.cfr_renamed_554(sprgbf3.cfr_renamed_3, 0, n2);
        n3 *= 257;
        return n3 ^= by;
    }

    public static int cfr_renamed_4492(int arg0) {
        int n;
        int n2;
        int n3;
        block7: {
            n3 = 0;
            int n4 = n2 = 3;
            while (n4 >= 0) {
                if (n2 != 0) {
                    if (arg0 >> n2 * 8 != 0) {
                        n = n3 = arg0 >> n2 * 8 & 0xFF;
                        break block7;
                    }
                } else if (arg0 != 0) {
                    n = n3 = arg0 & 0xFF;
                    break block7;
                }
                n4 = --n2;
            }
            n = n3;
        }
        if (n == 0) {
            return 0;
        }
        n2 = 1;
        int n5 = n3;
        while (((n3 = n5 << 1) & 0xFF) != 0) {
            n5 = n3;
            ++n2;
        }
        return 8 - n2;
    }

    public static sprgbf cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprgbf)cfr_renamed_2.cfr_renamed_11433(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String cfr_renamed_314() {
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprnvn.cfr_renamed_9("[hfc`hsj2c`t}t2c|e}b{hu&PofUft{hu<2")).append(iOException.getMessage()).toString(), iOException);
        }
        StringBuffer stringBuffer = new StringBuffer(1 + byArray.length * 2);
        stringBuffer.append('#');
        int n = 0;
        int n2 = n;
        while (n2 != byArray.length) {
            byte by = byArray[n];
            stringBuffer.append(cfr_renamed_4[by >>> 4 & 0xF]);
            stringBuffer.append(cfr_renamed_4[by & 0xF]);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    @Override
    public int cfr_renamed_106() {
        return this.cfr_renamed_3[0] & 0xFF;
    }
}

