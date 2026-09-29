/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcan;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprccn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcn;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprdfn;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfcn;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprhan;
import com.spire.presentation.packages.sprian;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjzm;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmfn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproxm;
import com.spire.presentation.packages.sprozm;
import com.spire.presentation.packages.sprpan;
import com.spire.presentation.packages.sprpcn;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprpo;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrfn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtwm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.spruwm;
import com.spire.presentation.packages.sprwbn;
import com.spire.presentation.packages.sprwfn;
import com.spire.presentation.packages.sprwwm;
import com.spire.presentation.packages.sprwzm;
import com.spire.presentation.packages.sprxcn;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprrzm
extends FilterInputStream
implements sprpo {
    private final boolean cfr_renamed_955;
    private final int cfr_renamed_1228;
    private final byte[][] cfr_renamed_4;

    public sprrvm cfr_renamed_11503(sprmfn arg0) throws IOException {
        int n = arg0.cfr_renamed_4583();
        if (n < 1) {
            return new sprrvm(0);
        }
        sprrzm sprrzm2 = this;
        return new sprrzm(arg0, n, sprrzm2.cfr_renamed_955, sprrzm2.cfr_renamed_4).cfr_renamed_4789();
    }

    public sprrzm(InputStream arg0) {
        InputStream inputStream = arg0;
        this(inputStream, sprwbn.cfr_renamed_4582(inputStream));
    }

    public sprgbf cfr_renamed_11504(sprrvm arg0) throws IOException {
        int n;
        sprgbf[] sprgbfArray = new sprgbf[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprgbfArray.length) {
            sprco sprco2 = arg0.cfr_renamed_576(n);
            if (!(sprco2 instanceof sprgbf)) {
                throw new sprign(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("o=q=u$tsu1p6y':6t0u&t'\u007f!\u007f7::tsy<t n!o0n6~sX\u001aNsI\u0007H\u001aT\u0014 s")).append(sprco2.getClass()).toString());
            }
            sprgbfArray[n] = (sprgbf)sprco2;
            n2 = ++n;
        }
        return new sprwwm(sprgbfArray);
    }

    public sprrzm(InputStream arg0, int arg1, boolean arg2) {
        this(arg0, arg1, arg2, new byte[11][]);
    }

    public sprxgf cfr_renamed_11505(int arg0, int arg1, boolean arg2, sprmfn arg3) throws IOException {
        if (!arg2) {
            byte[] byArray = arg3.cfr_renamed_954();
            return sprnvm.cfr_renamed_11478(arg0, arg1, byArray);
        }
        sprrvm sprrvm2 = this.cfr_renamed_11503(arg3);
        return sprnvm.cfr_renamed_11480(arg0, arg1, sprrvm2);
    }

    private static /* synthetic */ byte[] cfr_renamed_11506(sprmfn arg0, byte[][] arg1) throws IOException {
        int n = arg0.cfr_renamed_4583();
        if (n >= arg1.length) {
            return arg0.cfr_renamed_954();
        }
        byte[] byArray = arg1[n];
        if (byArray == null) {
            int n2 = n;
            byte[] byArray2 = new byte[n2];
            arg1[n2] = byArray2;
            byArray = byArray2;
        }
        arg0.cfr_renamed_11311(byArray);
        return byArray;
    }

    public sproug cfr_renamed_11507(sprrvm arg0) throws IOException {
        int n;
        sproug[] sprougArray = new sproug[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprougArray.length) {
            sprco sprco2 = arg0.cfr_renamed_576(n);
            if (!(sprco2 instanceof sproug)) {
                throw new sprign(new StringBuilder().insert(0, sprccb.cfr_renamed_9("p9n9j kwj5o2f#%2k4j\"k#`%`3%>kwf8k$q%p4q2awJ\u0014Q\u0012QwV\u0003W\u001eK\u0010?w")).append(sprco2.getClass()).toString());
            }
            sprougArray[n] = (sproug)sprco2;
            n2 = ++n;
        }
        return new sprfwm(sprougArray);
    }

    public void cfr_renamed_4932(byte[] arg0) throws IOException {
        if (sprkqe.cfr_renamed_473(this, arg0, 0, arg0.length) != arg0.length) {
            throw new EOFException(sprdfj.cfr_renamed_9("\u0016U\u0015:6t0u&t'\u007f!\u007f7::tsw:~7v6:<|su1p6y'"));
        }
    }

    public sprxgf cfr_renamed_4936(int arg0, int arg1, int arg2) throws IOException {
        sprrzm sprrzm2 = this;
        sprmfn sprmfn2 = new sprmfn(sprrzm2, arg2, sprrzm2.cfr_renamed_1228);
        if (0 == (arg0 & 0xE0)) {
            return sprrzm.cfr_renamed_11484(arg1, sprmfn2, this.cfr_renamed_4);
        }
        int n = arg0 & 0xC0;
        if (0 != n) {
            boolean bl = (arg0 & 0x20) != 0;
            return this.cfr_renamed_11505(n, arg1, bl, sprmfn2);
        }
        switch (arg1) {
            case 3: {
                sprrzm sprrzm3 = this;
                while (false) {
                }
                return sprrzm3.cfr_renamed_11504(sprrzm3.cfr_renamed_11503(sprmfn2));
            }
            case 4: {
                sprrzm sprrzm4 = this;
                return sprrzm4.cfr_renamed_11507(sprrzm4.cfr_renamed_11503(sprmfn2));
            }
            case 16: {
                if (sprmfn2.cfr_renamed_4583() < 1) {
                    return sprcan.cfr_renamed_4;
                }
                if (this.cfr_renamed_955) {
                    return new sprdcn(sprmfn2.cfr_renamed_954());
                }
                return sprcan.cfr_renamed_11287(this.cfr_renamed_11503(sprmfn2));
            }
            case 17: {
                return sprcan.cfr_renamed_11283(this.cfr_renamed_11503(sprmfn2));
            }
            case 8: {
                return sprcan.cfr_renamed_11287(this.cfr_renamed_11503(sprmfn2)).cfr_renamed_11215();
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprccb.cfr_renamed_9("p9n9j kwq6bw")).append(arg1).append(sprdfj.cfr_renamed_9(":6t0u&t'\u007f!\u007f7")).toString());
    }

    public sprrzm(InputStream arg0, boolean arg1) {
        InputStream inputStream = arg0;
        this(inputStream, sprwbn.cfr_renamed_4582(inputStream), arg1);
    }

    public sprrvm cfr_renamed_4789() throws IOException {
        sprxgf sprxgf2 = this.cfr_renamed_24();
        if (null == sprxgf2) {
            return new sprrvm(0);
        }
        sprrvm sprrvm2 = new sprrvm();
        do {
            sprrvm2.cfr_renamed_5004(sprxgf2);
        } while ((sprxgf2 = this.cfr_renamed_24()) != null);
        return sprrvm2;
    }

    public sprrzm(InputStream arg0, int arg1) {
        this(arg0, arg1, false);
    }

    private static /* synthetic */ char[] cfr_renamed_11508(sprmfn arg0) throws IOException {
        int n = arg0.cfr_renamed_4583();
        if (0 != (n & 1)) {
            throw new IOException(sprccb.cfr_renamed_9("h6i1j%h2awG\u001aU\u0004q%l9bw`9f8a>k0%2k4j\"k#`%`3"));
        }
        char[] cArray = new char[n / 2];
        int n2 = 0;
        byte[] byArray = new byte[8];
        int n3 = n;
        while (n3 >= 8) {
            if (sprkqe.cfr_renamed_473(arg0, byArray, 0, 8) != 8) {
                throw new EOFException(sprdfj.cfr_renamed_9("_\u001c\\s\u007f=y<o=n6h6~ss=:>s7~?\u007fsu5:\u0011W\u0003I'h:t4"));
            }
            int n4 = n2;
            cArray[n2] = (char)(byArray[0] << 8 | byArray[1] & 0xFF);
            cArray[n2 + 1] = (char)(byArray[2] << 8 | byArray[3] & 0xFF);
            cArray[n4 + 2] = (char)(byArray[4] << 8 | byArray[5] & 0xFF);
            n2 += 4;
            cArray[n4 + 3] = (char)(byArray[6] << 8 | byArray[7] & 0xFF);
            n3 = n -= 8;
        }
        if (n > 0) {
            if (sprkqe.cfr_renamed_473(arg0, byArray, 0, n) != n) {
                throw new EOFException(sprccb.cfr_renamed_9("@\u0018Cw`9f8p9q2w2awl9%:l3a;`wj1%\u0015H\u0007V#w>k0"));
            }
            int n5 = 0;
            do {
                int n6 = byArray[n5] << 8;
                int n7 = n6;
                int n8 = byArray[++n5] & 0xFF;
                int n9 = n8;
                cArray[n2++] = (char)(n7 | n9);
            } while (++n5 < n);
        }
        if (0 != arg0.cfr_renamed_4583() || cArray.length != n2) {
            throw new IllegalStateException();
        }
        return cArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxgf cfr_renamed_24() throws IOException {
        int n = this.read();
        if (n <= 0) {
            if (n == 0) {
                throw new IOException(sprdfj.cfr_renamed_9("&t6b#\u007f0n6~s\u007f=~~u570u=n6t'isw2h8\u007f!"));
            }
            return null;
        }
        sprrzm sprrzm2 = this;
        int n2 = sprrzm.cfr_renamed_4917(sprrzm2, n);
        int n3 = sprrzm2.cfr_renamed_4934();
        if (n3 >= 0) {
            try {
                return this.cfr_renamed_4936(n, n2, n3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new sprign(sprccb.cfr_renamed_9("4j%w\"u#`3%$q%`6hwa2q2f#`3"), illegalArgumentException);
            }
        }
        if (0 == (n & 0x20)) {
            throw new IOException(sprdfj.cfr_renamed_9("s=~6|:t:n67?\u007f=}'rsj!s>s's%\u007fs\u007f=y<~:t4:6t0u&t'\u007f!\u007f7"));
        }
        sprrzm sprrzm3 = this;
        sprozm sprozm2 = new sprozm(sprrzm3, sprrzm3.cfr_renamed_1228);
        sprrzm sprrzm4 = this;
        sprden sprden2 = new sprden(sprozm2, sprrzm4.cfr_renamed_1228, sprrzm4.cfr_renamed_4);
        int n4 = n & 0xC0;
        if (0 != n4) {
            return sprden2.cfr_renamed_11428(n4, n2);
        }
        switch (n2) {
            case 3: {
                return sprrfn.cfr_renamed_11307(sprden2);
            }
            case 4: {
                return sproxm.cfr_renamed_11307(sprden2);
            }
            case 8: {
                return sprpcn.cfr_renamed_11307(sprden2);
            }
            case 16: {
                return sprdfn.cfr_renamed_11307(sprden2);
            }
            case 17: {
                return sprccn.cfr_renamed_11307(sprden2);
            }
        }
        throw new IOException(sprccb.cfr_renamed_9("p9n9j kwG\u0012Wwj5o2f#%2k4j\"k#`%`3"));
    }

    public int cfr_renamed_4934() throws IOException {
        sprrzm sprrzm2 = this;
        return sprrzm.cfr_renamed_11485(sprrzm2, sprrzm2.cfr_renamed_1228, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxgf cfr_renamed_11484(int arg0, sprmfn arg1, byte[][] arg2) throws IOException {
        try {
            switch (arg0) {
                case 3: {
                    return sprgbf.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 30: {
                    return sprfcn.cfr_renamed_11509(sprrzm.cfr_renamed_11508(arg1));
                }
                case 1: {
                    return sprbxm.cfr_renamed_11295(sprrzm.cfr_renamed_11506(arg1, arg2));
                }
                case 10: {
                    return sprqvg.cfr_renamed_11491(sprrzm.cfr_renamed_11506(arg1, arg2), true);
                }
                case 27: {
                    return sprwzm.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 24: {
                    return sprjfn.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 25: {
                    return spruwm.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 22: {
                    return sprupm.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 2: {
                    return sprktm.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 5: {
                    return sprfan.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 18: {
                    return sprhan.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 7: {
                    return sprtwm.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 6: {
                    return sprlem.cfr_renamed_11491(sprrzm.cfr_renamed_11506(arg1, arg2), true);
                }
                case 4: {
                    return sproug.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 19: {
                    return sprpfn.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 13: {
                    return sprjzm.cfr_renamed_11491(arg1.cfr_renamed_954(), false);
                }
                case 20: {
                    return sprwfn.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 28: {
                    return sprian.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 23: {
                    return sprgen.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 12: {
                    return sprkgn.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 21: {
                    return sprxcn.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 26: {
                    return sprpan.cfr_renamed_11295(arg1.cfr_renamed_954());
                }
                case 14: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: {
                    throw new IOException(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("o=i&j#u!n6~sn2}s")).append(arg0).append(sprccb.cfr_renamed_9("%2k4j\"k#`%`3")).toString());
                }
            }
            throw new IOException(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("o=q=u$tsn2}s")).append(arg0).append(sprccb.cfr_renamed_9("%2k4j\"k#`%`3")).toString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprign(illegalArgumentException.getMessage(), illegalArgumentException);
        }
        catch (IllegalStateException illegalStateException) {
            throw new sprign(illegalStateException.getMessage(), illegalStateException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrzm(byte[] byArray) {
        this((InputStream)new ByteArrayInputStream((byte[])arg0), ((void)arg0).length);
        void arg0;
    }

    public int cfr_renamed_4584() {
        return this.cfr_renamed_1228;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrzm(InputStream inputStream, int n, boolean bl, byte[][] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprrzm sprrzm2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_1228 = arg1;
        sprrzm2.cfr_renamed_955 = arg2;
        sprrzm2.cfr_renamed_4 = byArray;
    }

    public static int cfr_renamed_4917(InputStream arg0, int arg1) throws IOException {
        int n = arg1 & 0x1F;
        if (n == 31) {
            int n2 = arg0.read();
            if (n2 < 31) {
                if (n2 < 0) {
                    throw new EOFException(sprdfj.cfr_renamed_9("\u0016U\u0015:5u&t7::t s7\u007fsn2}sl2v&\u007f}"));
                }
                throw new IOException(sprccb.cfr_renamed_9("4j%w\"u#`3%$q%`6hw(wm>b?%#d0%9p:g2ww9w6f%1j\"k3"));
            }
            n = n2 & 0x7F;
            if (0 == n) {
                throw new IOException(sprdfj.cfr_renamed_9("y<h!o#n6~si'h6{>:~::t%{?s7:;s4rsn2}st&w1\u007f!:5u&t7"));
            }
            int n3 = n2;
            while ((n3 & 0x80) != 0) {
                if (n >>> 24 != 0) {
                    throw new IOException(sprccb.cfr_renamed_9("Q6bwk\"h5`%%:j%`wq?d9%d4wg>q$"));
                }
                n <<= 7;
                n2 = arg0.read();
                if (n2 < 0) {
                    throw new EOFException(sprdfj.cfr_renamed_9("\u0016U\u0015:5u&t7::t s7\u007fsn2}sl2v&\u007f}"));
                }
                n |= n2 & 0x7F;
                n3 = n2;
            }
        }
        return n;
    }

    public static int cfr_renamed_11485(InputStream arg0, int arg1, boolean arg2) throws IOException {
        int n = arg0.read();
        if (0 == n >>> 7) {
            return n;
        }
        if (128 == n) {
            return -1;
        }
        if (n < 0) {
            throw new EOFException(sprccb.cfr_renamed_9("@\u0018Cwc8p9awr?`9%;`9b#mw`/u2f#`3"));
        }
        if (255 == n) {
            throw new IOException(sprdfj.cfr_renamed_9("s=l2v:~sv<t4:5u!ws~6|:t:n67?\u007f=}'rs*+\\\u0015"));
        }
        int n2 = n & 0x7F;
        int n3 = 0;
        n = 0;
        do {
            int n4;
            if ((n4 = arg0.read()) < 0) {
                throw new EOFException(sprccb.cfr_renamed_9("@\u0018Cwc8p9aww2d3l9bwi2k0q?"));
            }
            if (n >>> 23 != 0) {
                throw new IOException(sprdfj.cfr_renamed_9("?u=}s|<h>:7\u007f5s=s'\u007f~v6t4n;:>u!\u007fsn;{=:`+sx:n "));
            }
            n = (n << 8) + n4;
        } while (++n3 < n2);
        if (n >= arg1 && !arg2) {
            throw new IOException(new StringBuilder().insert(0, sprccb.cfr_renamed_9("4j%w\"u#`3%$q%`6hw(wj\"qwj1%5j\"k3vwi2k0q?%1j\"k3?w")).append(n).append(sprdfj.cfr_renamed_9(":m's")).append(arg1).toString());
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprrzm(byte[] byArray, boolean bl) {
        this(new ByteArrayInputStream((byte[])arg0), ((void)arg0).length, (boolean)arg1);
        void arg1;
        void arg0;
    }
}

