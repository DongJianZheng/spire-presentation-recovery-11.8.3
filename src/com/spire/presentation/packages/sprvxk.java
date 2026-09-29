/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprezk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfr;
import com.spire.presentation.packages.sprgyk;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlqk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvuk;
import com.spire.presentation.packages.sprvwk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprwxo;
import com.spire.presentation.packages.sprybl;
import java.io.ByteArrayOutputStream;

public class sprvxk
implements spriw {
    private boolean cfr_renamed_105;
    public final int cfr_renamed_137 = 16;
    private byte[] cfr_renamed_79;
    private String cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private boolean cfr_renamed_93;
    private int cfr_renamed_86;
    public final int cfr_renamed_152 = 40;
    private byte[] cfr_renamed_112;
    private sprfr cfr_renamed_119;
    private int cfr_renamed_91;
    public final int cfr_renamed_0 = 16;
    private ByteArrayOutputStream cfr_renamed_1;
    private final ByteArrayOutputStream cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final ByteArrayOutputStream cfr_renamed_4;

    public static /* synthetic */ byte[] cfr_renamed_10365(sprvxk arg0) {
        return arg0.cfr_renamed_102;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprvxk(sprtqk arg0) {
        sprvxk sprvxk2 = this;
        sprvxk sprvxk3 = this;
        this.cfr_renamed_137 = 16;
        sprvxk3.cfr_renamed_0 = 16;
        sprvxk3.cfr_renamed_152 = 40;
        sprvxk sprvxk4 = this;
        sprvxk2.cfr_renamed_1 = new ByteArrayOutputStream();
        sprvxk4.cfr_renamed_4 = new ByteArrayOutputStream();
        sprvxk2.cfr_renamed_2 = new ByteArrayOutputStream();
        switch (sprlqk.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                this.cfr_renamed_119 = new sprezk(this);
                this.cfr_renamed_107 = "ISAP-A-128A AEAD";
                return;
            }
            case 2: {
                this.cfr_renamed_119 = new sprgyk(this);
                this.cfr_renamed_107 = "ISAP-K-128A AEAD";
                return;
            }
            case 3: {
                this.cfr_renamed_119 = new sprvuk(this);
                this.cfr_renamed_107 = "ISAP-A-128 AEAD";
                return;
            }
            case 4: {
                this.cfr_renamed_119 = new sprvwk(this);
                this.cfr_renamed_107 = "ISAP-K-128 AEAD";
                return;
            }
        }
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_86;
    }

    @Override
    public void cfr_renamed_41() {
        if (!this.cfr_renamed_93) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("7b\u001ccYd\u0018k\u0015'\u0010i\u0010sYa\fi\u001as\u0010h\u0017'\u001bb\u001fh\u000bbYb\u0017d\u000b~\ts\u0010h\u0017(\u001db\u001au\u0000w\rn\u0016i"));
        }
        sprvxk sprvxk2 = this;
        sprvxk2.cfr_renamed_1.reset();
        sprvxk2.cfr_renamed_119.cfr_renamed_41();
        sprvxk2.cfr_renamed_4.reset();
        sprvxk2.cfr_renamed_2.reset();
    }

    public int cfr_renamed_10294() {
        return 16;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(new StringBuilder().insert(0, sprrmo.cfr_renamed_9("c+z0~eh0l#o7*1e**6b*x1")).append(this.cfr_renamed_105 ? sprwxo.cfr_renamed_9("\u001ci\u001au\u0000w\rn\u0016i") : sprrmo.cfr_renamed_9("n i7s5~,e+")).toString());
        }
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        int n;
        if (!this.cfr_renamed_93) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("7b\u001ccYd\u0018k\u0015'\u0010i\u0010sYa\fi\u001as\u0010h\u0017'\u001bb\u001fh\u000bbYb\u0017d\u000b~\ts\u0010h\u0017(\u001db\u001au\u0000w\rn\u0016i"));
        }
        if (this.cfr_renamed_105) {
            byte[] byArray = this.cfr_renamed_4.toByteArray();
            int n2 = byArray.length;
            if (arg1 + n2 + 16 > arg0.length) {
                throw new sprwjl(sprrmo.cfr_renamed_9("e0~5\u007f1*'\u007f#l xec6*1e**6b*x1"));
            }
            this.cfr_renamed_119.cfr_renamed_10366(byArray, 0, n2, arg0, arg1, arg0.length);
            sprvxk sprvxk2 = this;
            this.cfr_renamed_2.write(arg0, arg1, n2);
            arg1 += n2;
            this.cfr_renamed_132 = sprvxk2.cfr_renamed_1.toByteArray();
            sprvxk2.cfr_renamed_3 = sprvxk2.cfr_renamed_2.toByteArray();
            sprvxk2.cfr_renamed_79 = new byte[16];
            sprvxk sprvxk3 = this;
            sprvxk sprvxk4 = this;
            sprvxk2.cfr_renamed_119.cfr_renamed_10367(sprvxk3.cfr_renamed_132, sprvxk3.cfr_renamed_132.length, sprvxk4.cfr_renamed_3, sprvxk4.cfr_renamed_3.length, this.cfr_renamed_79, 0);
            System.arraycopy(this.cfr_renamed_79, 0, arg0, arg1, 16);
            return n2 += 16;
        }
        this.cfr_renamed_132 = this.cfr_renamed_1.toByteArray();
        this.cfr_renamed_3 = this.cfr_renamed_4.toByteArray();
        this.cfr_renamed_79 = new byte[16];
        int n3 = this.cfr_renamed_3.length - this.cfr_renamed_79.length;
        if (n3 + arg1 > arg0.length) {
            throw new sprwjl(sprwxo.cfr_renamed_9("\u0016r\rw\fsYe\fa\u001fb\u000b'\u0010tYs\u0016hYt\u0011h\u000bs"));
        }
        sprvxk sprvxk5 = this;
        sprvxk5.cfr_renamed_119.cfr_renamed_10367(sprvxk5.cfr_renamed_132, this.cfr_renamed_132.length, this.cfr_renamed_3, n3, this.cfr_renamed_79, 0);
        this.cfr_renamed_119.cfr_renamed_41();
        int n4 = n = 0;
        while (n4 < 16) {
            if (this.cfr_renamed_79[n] != this.cfr_renamed_3[n3 + n]) {
                throw new IllegalArgumentException(sprrmo.cfr_renamed_9("G$ien*o6*+e1*(k1i-"));
            }
            n4 = ++n;
        }
        sprvxk sprvxk6 = this;
        sprvxk6.cfr_renamed_119.cfr_renamed_10366(sprvxk6.cfr_renamed_3, 0, n3, arg0, arg1, arg0.length);
        return n3;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + 16;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_79;
    }

    public int cfr_renamed_10299() {
        return 16;
    }

    public static /* synthetic */ byte[] cfr_renamed_10368(sprvxk arg0) {
        return arg0.cfr_renamed_112;
    }

    public static /* synthetic */ int cfr_renamed_10369(sprvxk arg0) {
        return arg0.cfr_renamed_86;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_107;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_105 = arg0;
        if (!(sprbj2 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("0T8WYF<F='\u0010i\u0010sYw\u0018u\u0018j\u001cs\u001cu\n'\u0014r\nsYn\u0017d\u0015r\u001dbYf\u0017'0Q"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 16) {
            throw new IllegalArgumentException(sprrmo.cfr_renamed_9("\fY\u0004ZeK\u0000K\u0001*7o4\u007f,x yeo=k&~)se;w*'s1o6**leC\u0013"));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("0T8WYF<F='\u0010i\u0010sYw\u0018u\u0018j\u001cs\u001cu\n'\u0014r\nsYn\u0017d\u0015r\u001dbYfYl\u001c~"));
        }
        byte[] byArray2 = ((sprtpk)sprkpk2.cfr_renamed_284()).cfr_renamed_1521();
        if (byArray2.length != 16) {
            throw new IllegalArgumentException(sprrmo.cfr_renamed_9("\fY\u0004ZeK\u0000K\u0001*.o<*(\u007f6~eh *t8}*'c1yef*d\""));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915((boolean)arg0)));
        this.cfr_renamed_112 = new byte[byArray.length];
        this.cfr_renamed_102 = new byte[byArray2.length];
        System.arraycopy(byArray, 0, this.cfr_renamed_112, 0, byArray.length);
        System.arraycopy(byArray2, 0, this.cfr_renamed_102, 0, byArray2.length);
        sprvxk sprvxk2 = this;
        sprvxk2.cfr_renamed_119.cfr_renamed_1314();
        sprvxk2.cfr_renamed_93 = true;
        sprvxk2.cfr_renamed_41();
    }

    public static /* synthetic */ int cfr_renamed_10370(sprvxk arg0, int arg1) {
        arg0.cfr_renamed_86 = arg1;
        return arg0.cfr_renamed_86;
    }

    public static /* synthetic */ int cfr_renamed_10371(sprvxk arg0) {
        return arg0.cfr_renamed_91;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    public static /* synthetic */ int cfr_renamed_10372(sprvxk arg0, int arg1) {
        arg0.cfr_renamed_91 = arg1;
        return arg0.cfr_renamed_91;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.cfr_renamed_1.write(arg0);
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (!this.cfr_renamed_93) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("7b\u001ccYd\u0018k\u0015'\u0010i\u0010sYa\fi\u001as\u0010h\u0017'\u001bb\u001fh\u000bbYb\u0017d\u000b~\ts\u0010h\u0017(\u001db\u001au\u0000w\rn\u0016i"));
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprrmo.cfr_renamed_9("c+z0~eh0l#o7*1e**6b*x1"));
        }
        sprvxk sprvxk2 = this;
        sprvxk2.cfr_renamed_4.write(arg0, arg1, arg2);
        if (sprvxk2.cfr_renamed_105 && this.cfr_renamed_4.size() >= this.cfr_renamed_86) {
            arg2 = this.cfr_renamed_4.size() / this.cfr_renamed_86 * this.cfr_renamed_86;
            if (arg4 + arg2 > arg3.length) {
                throw new sprwjl(sprwxo.cfr_renamed_9("\u0016r\rw\fsYe\fa\u001fb\u000b'\u0010tYs\u0016hYt\u0011h\u000bs"));
            }
            sprvxk sprvxk3 = this;
            byte[] byArray = sprvxk3.cfr_renamed_4.toByteArray();
            sprvxk3.cfr_renamed_119.cfr_renamed_10366(byArray, 0, arg2, arg3, arg4, arg3.length);
            sprvxk sprvxk4 = this;
            sprvxk4.cfr_renamed_2.write(arg3, arg4, arg2);
            sprvxk4.cfr_renamed_4.reset();
            sprvxk4.cfr_renamed_4.write(byArray, arg2, byArray.length - arg2);
            return arg2;
        }
        return 0;
    }
}

