/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmd;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprffd;
import com.spire.presentation.packages.sprjcz;
import com.spire.presentation.packages.sprjgd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.sprzra;

public class sprljd
implements sprpj {
    private sprjgd cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private boolean cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private sprt cfr_renamed_2;
    private sprff cfr_renamed_3;
    private sprjgd cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3458(byte[] arg0, int arg1, int arg2, byte[] arg3) {
        sprljd sprljd2 = this;
        sprffd sprffd2 = new sprffd(sprljd2.cfr_renamed_3, sprljd2.cfr_renamed_1 * 8);
        sprffd2.cfr_renamed_1524(this.cfr_renamed_2);
        byte[] byArray = new byte[16];
        if (this.cfr_renamed_3459()) {
            byArray[0] = (byte)(byArray[0] | 0x40);
        }
        byte[] byArray2 = byArray;
        byArray2[0] = (byte)(byArray2[0] | ((sprffd2.cfr_renamed_2404() - 2) / 2 & 7) << 3);
        byArray[0] = (byte)(byArray[0] | 15 - this.cfr_renamed_152.length - 1 & 7);
        System.arraycopy(this.cfr_renamed_152, 0, byArray, 1, this.cfr_renamed_152.length);
        int n = arg2;
        int n2 = 1;
        int n3 = n;
        while (n3 > 0) {
            byArray[byArray.length - n2] = (byte)(n & 0xFF);
            ++n2;
            n3 = n >>>= 8;
        }
        sprffd2.cfr_renamed_1197(byArray, 0, byArray.length);
        if (this.cfr_renamed_3459()) {
            int n4;
            sprljd sprljd3;
            int n5 = this.cfr_renamed_3460();
            if (n5 < 65280) {
                sprljd3 = this;
                sprffd sprffd3 = sprffd2;
                sprffd3.cfr_renamed_1221((byte)(n5 >> 8));
                sprffd3.cfr_renamed_1221((byte)n5);
                n4 = 2;
            } else {
                sprffd sprffd4 = sprffd2;
                int n6 = n5;
                sprffd sprffd5 = sprffd2;
                sprffd sprffd6 = sprffd2;
                sprffd6.cfr_renamed_1221((byte)-1);
                sprffd6.cfr_renamed_1221((byte)-2);
                sprffd5.cfr_renamed_1221((byte)(n5 >> 24));
                sprffd5.cfr_renamed_1221((byte)(n5 >> 16));
                sprffd4.cfr_renamed_1221((byte)(n6 >> 8));
                sprffd4.cfr_renamed_1221((byte)n6);
                n4 = 6;
                sprljd3 = this;
            }
            if (sprljd3.cfr_renamed_91 != null) {
                sprffd2.cfr_renamed_1197(this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            }
            if (this.cfr_renamed_86.size() > 0) {
                sprffd2.cfr_renamed_1197(this.cfr_renamed_86.cfr_renamed_3461(), 0, this.cfr_renamed_86.size());
            }
            if ((n4 = (n4 + n5) % 16) != 0) {
                int n7;
                int n8 = n7 = n4;
                while (n8 != 16) {
                    sprffd2.cfr_renamed_1221((byte)0);
                    n8 = ++n7;
                }
            }
        }
        sprffd2.cfr_renamed_1197(arg0, arg1, arg2);
        return sprffd2.cfr_renamed_1219(arg3, 0);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_86.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprpjd {
        sprljd sprljd2 = this;
        sprljd sprljd3 = this;
        int n = sprljd3.cfr_renamed_3462(sprljd2.cfr_renamed_4.cfr_renamed_3461(), 0, sprljd3.cfr_renamed_4.size(), arg0, arg1);
        sprljd2.cfr_renamed_41();
        return n;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprjkd, IllegalStateException {
        void arg0;
        this.cfr_renamed_4.write((int)arg0);
        return 0;
    }

    public byte[] cfr_renamed_3463(byte[] arg0, int arg1, int arg2) throws IllegalStateException, sprpjd {
        sprljd sprljd2;
        byte[] byArray;
        if (this.cfr_renamed_119) {
            byArray = new byte[arg2 + this.cfr_renamed_1];
            sprljd2 = this;
        } else {
            if (arg2 < this.cfr_renamed_1) {
                throw new sprpjd(sprfap.cfr_renamed_9("WUGU\u0013@\\[\u0013G[[A@"));
            }
            byArray = new byte[arg2 - this.cfr_renamed_1];
            sprljd2 = this;
        }
        sprljd2.cfr_renamed_3462(arg0, arg1, arg2, byArray, 0);
        return byArray;
    }

    private /* synthetic */ boolean cfr_renamed_3459() {
        return this.cfr_renamed_3460() > 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprjcz.cfr_renamed_9("YL5B")).toString();
    }

    public int cfr_renamed_3462(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalStateException, sprpjd, sprjkd {
        int n;
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprfap.cfr_renamed_9("wpy\u0013WZD[QA\u0014FZZ@ZU_]IQW\u001a"));
        }
        int n2 = this.cfr_renamed_152.length;
        int n3 = 15 - n2;
        if (n3 < 4 && arg2 >= (n = 1 << 8 * n3)) {
            throw new IllegalStateException(sprjcz.cfr_renamed_9("L5BV\u007f\u0017l\u001dj\u0002/\u0002`\u0019/\u001an\u0004h\u0013/\u0010`\u0004/\u0015g\u0019f\u0015jV`\u0010/\u0007!"));
        }
        sprljd sprljd2 = this;
        byte[] byArray = new byte[sprljd2.cfr_renamed_112];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(n3 - 1 & 7);
        System.arraycopy(sprljd2.cfr_renamed_152, 0, byArray2, 1, this.cfr_renamed_152.length);
        sprcmd sprcmd2 = new sprcmd(this.cfr_renamed_3);
        sprljd sprljd3 = this;
        sprcmd2.cfr_renamed_1217(sprljd3.cfr_renamed_119, new sprnjd(this.cfr_renamed_2, byArray2));
        int n4 = arg1;
        int n5 = arg4;
        if (sprljd3.cfr_renamed_119) {
            int n6 = arg2 + this.cfr_renamed_1;
            if (arg3.length < n6 + arg4) {
                throw new spreid(sprfap.cfr_renamed_9("|AGDF@\u0013VFRUQA\u0014G[\\\u0014@\\\\FG\u001a"));
            }
            this.cfr_renamed_3458(arg0, arg1, arg2, this.cfr_renamed_0);
            sprcmd2.cfr_renamed_3064(this.cfr_renamed_0, 0, this.cfr_renamed_0, 0);
            int n7 = n4;
            while (n7 < arg1 + arg2 - this.cfr_renamed_112) {
                sprcmd2.cfr_renamed_3064(arg0, n4, arg3, n5);
                n5 += this.cfr_renamed_112;
                n7 = n4 += this.cfr_renamed_112;
            }
            byte[] byArray3 = new byte[this.cfr_renamed_112];
            System.arraycopy(arg0, n4, byArray3, 0, arg2 + arg1 - n4);
            sprcmd2.cfr_renamed_3064(byArray3, 0, byArray3, 0);
            System.arraycopy(byArray3, 0, arg3, n5, arg2 + arg1 - n4);
            System.arraycopy(this.cfr_renamed_0, 0, arg3, arg4 + arg2, this.cfr_renamed_1);
            return n6;
        }
        if (arg2 < this.cfr_renamed_1) {
            throw new sprpjd(sprjcz.cfr_renamed_9("\u0012n\u0002nV{\u0019`V|\u001e`\u0004{"));
        }
        int n8 = arg2 - this.cfr_renamed_1;
        if (arg3.length < n8 + arg4) {
            throw new spreid(sprfap.cfr_renamed_9("|AGDF@\u0013VFRUQA\u0014G[\\\u0014@\\\\FG\u001a"));
        }
        System.arraycopy(arg0, arg1 + n8, this.cfr_renamed_0, 0, this.cfr_renamed_1);
        sprcmd2.cfr_renamed_3064(this.cfr_renamed_0, 0, this.cfr_renamed_0, 0);
        int n9 = this.cfr_renamed_1;
        int n10 = n9;
        while (n10 != this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n9++] = 0;
            n10 = n9;
        }
        int n11 = n4;
        while (n11 < arg1 + n8 - this.cfr_renamed_112) {
            sprcmd2.cfr_renamed_3064(arg0, n4, arg3, n5);
            n5 += this.cfr_renamed_112;
            n11 = n4 += this.cfr_renamed_112;
        }
        sprljd sprljd4 = this;
        byte[] byArray4 = new byte[sprljd4.cfr_renamed_112];
        System.arraycopy(arg0, n4, byArray4, 0, n8 - (n4 - arg1));
        sprcmd2.cfr_renamed_3064(byArray4, 0, byArray4, 0);
        sprljd sprljd5 = this;
        System.arraycopy(byArray4, 0, arg3, n5, n8 - (n4 - arg1));
        byte[] byArray5 = new byte[sprljd5.cfr_renamed_112];
        sprljd5.cfr_renamed_3458(arg3, arg4, n8, byArray5);
        if (!sprzra.cfr_renamed_559(sprljd4.cfr_renamed_0, byArray5)) {
            throw new sprpjd(sprjcz.cfr_renamed_9("b\u0017lVl\u001ej\u0015dVf\u0018/5L;/\u0010n\u001fc\u0013k"));
        }
        return n8;
    }

    @Override
    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_41() {
        sprljd sprljd2 = this;
        sprljd2.cfr_renamed_3.cfr_renamed_41();
        sprljd2.cfr_renamed_86.reset();
        sprljd2.cfr_renamed_4.reset();
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_4.size();
        if (this.cfr_renamed_119) {
            return n + this.cfr_renamed_1;
        }
        if (n < this.cfr_renamed_1) {
            return 0;
        }
        return n - this.cfr_renamed_1;
    }

    public sprljd(sprff arg0) {
        sprljd sprljd2 = this;
        this.cfr_renamed_86 = new sprjgd(this);
        sprljd2.cfr_renamed_4 = new sprjgd(this);
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_112 = arg0.cfr_renamed_1195();
        this.cfr_renamed_0 = new byte[this.cfr_renamed_112];
        if (this.cfr_renamed_112 != 16) {
            throw new IllegalArgumentException(sprfap.cfr_renamed_9("P]C\\VF\u0013FVEF]AQW\u0014D]G\\\u0013U\u0013V_[P_\u0013GZNV\u0014\\R\u0013\u0005\u0005\u001a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        sprt sprt3;
        sprt sprt4;
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        if (sprt2 instanceof sprxfd) {
            sprxfd sprxfd2;
            sprxfd sprxfd3 = sprxfd2 = (sprxfd)arg1;
            sprljd sprljd2 = this;
            sprljd2.cfr_renamed_152 = sprxfd2.cfr_renamed_596();
            sprljd2.cfr_renamed_91 = sprxfd2.cfr_renamed_3388();
            this.cfr_renamed_1 = sprxfd3.cfr_renamed_2404() / 8;
            sprt3 = sprt4 = sprxfd3.cfr_renamed_1521();
        } else if (arg1 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            sprljd sprljd3 = this;
            this.cfr_renamed_152 = sprnjd2.cfr_renamed_1205();
            sprljd3.cfr_renamed_91 = null;
            sprljd3.cfr_renamed_1 = this.cfr_renamed_0.length / 2;
            sprt3 = sprt4 = sprnjd2.cfr_renamed_284();
        } else {
            throw new IllegalArgumentException(sprjcz.cfr_renamed_9("\u001fa\u0000n\u001af\u0012/\u0006n\u0004n\u001bj\u0002j\u0004|V\u007f\u0017|\u0005j\u0012/\u0002`VL5B"));
        }
        if (sprt3 != null) {
            this.cfr_renamed_2 = sprt4;
        }
        if (this.cfr_renamed_152 == null || this.cfr_renamed_152.length < 7 || this.cfr_renamed_152.length > 13) {
            throw new IllegalArgumentException(sprfap.cfr_renamed_9("][]WV\u0014^A@@\u0013\\RBV\u0014_Q]SG\\\u0013RA[^\u0014\u0004\u0014G[\u0013\u0005\u0000\u0014\\WGQGG"));
        }
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.cfr_renamed_86.write(arg0);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        sprljd sprljd2 = this;
        byte[] byArray = new byte[sprljd2.cfr_renamed_1];
        System.arraycopy(sprljd2.cfr_renamed_0, 0, byArray, 0, byArray.length);
        return byArray;
    }

    private /* synthetic */ int cfr_renamed_3460() {
        return this.cfr_renamed_86.size() + (this.cfr_renamed_91 == null ? 0 : this.cfr_renamed_91.length);
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return 0;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg0.length < arg1 + arg2) {
            throw new sprjkd(sprjcz.cfr_renamed_9("?a\u0006z\u0002/\u0014z\u0010i\u0013}V{\u0019`V|\u001e`\u0004{"));
        }
        this.cfr_renamed_4.write(arg0, arg1, arg2);
        return 0;
    }
}

