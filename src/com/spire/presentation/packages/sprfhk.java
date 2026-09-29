/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spreml;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprnyn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprvjk;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprfhk
implements sprvm {
    private int cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private sprwn cfr_renamed_132;
    private sprgf cfr_renamed_102;
    private SecureRandom cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private sprgf cfr_renamed_152;
    private int cfr_renamed_112;
    private sprgf cfr_renamed_119;
    public static final byte cfr_renamed_91 = -68;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte cfr_renamed_4;

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfhk(sprwn sprwn2, sprgf sprgf2, sprgf sprgf3, sprgf sprgf4, byte[] byArray, byte by) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfhk sprfhk2 = this;
        sprfhk sprfhk3 = this;
        sprfhk sprfhk4 = this;
        sprfhk sprfhk5 = this;
        sprfhk5.cfr_renamed_132 = arg0;
        sprfhk5.cfr_renamed_119 = arg1;
        sprfhk4.cfr_renamed_102 = arg2;
        sprfhk4.cfr_renamed_152 = arg3;
        sprfhk3.cfr_renamed_79 = arg2.cfr_renamed_1218();
        sprfhk3.cfr_renamed_112 = arg3.cfr_renamed_1218();
        sprfhk2.cfr_renamed_2 = true;
        sprfhk2.cfr_renamed_0 = byArray.length;
        sprfhk sprfhk6 = this;
        this.cfr_renamed_107 = arg4;
        sprfhk6.cfr_renamed_86 = new byte[8 + this.cfr_renamed_0 + this.cfr_renamed_79];
        sprfhk6.cfr_renamed_4 = arg5;
    }

    public static sprfhk cfr_renamed_9929(sprwn arg0, sprgf arg1, sprgf arg2, byte[] arg3, byte arg4) {
        return new sprfhk(arg0, (sprgf)new spreml(), arg1, arg2, arg3, arg4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        int n;
        sprfhk sprfhk2;
        int n2;
        int n3;
        block16: {
            block15: {
                if (this.cfr_renamed_119.cfr_renamed_1218() != this.cfr_renamed_79) {
                    throw new IllegalStateException();
                }
                sprfhk sprfhk3 = this;
                sprfhk3.cfr_renamed_119.cfr_renamed_1219(sprfhk3.cfr_renamed_86, this.cfr_renamed_86.length - this.cfr_renamed_79 - this.cfr_renamed_0);
                try {
                    byte[] byArray = this.cfr_renamed_132.cfr_renamed_1337(arg0, 0, arg0.length);
                    sproze.cfr_renamed_5214(this.cfr_renamed_3, 0, this.cfr_renamed_3.length - byArray.length, (byte)0);
                    sprfhk sprfhk4 = this;
                    System.arraycopy(byArray, 0, sprfhk4.cfr_renamed_3, sprfhk4.cfr_renamed_3.length - byArray.length, byArray.length);
                }
                catch (Exception exception) {
                    return false;
                }
                n3 = 255 >>> this.cfr_renamed_3.length * 8 - this.cfr_renamed_1;
                if ((this.cfr_renamed_3[0] & 0xFF) != (this.cfr_renamed_3[0] & n3)) break block15;
                sprfhk sprfhk5 = this;
                if (sprfhk5.cfr_renamed_3[sprfhk5.cfr_renamed_3.length - 1] == this.cfr_renamed_4) break block16;
            }
            sprfhk sprfhk6 = this;
            sprfhk6.cfr_renamed_3277(sprfhk6.cfr_renamed_3);
            return false;
        }
        sprfhk sprfhk7 = this;
        sprfhk sprfhk8 = this;
        byte[] byArray = sprfhk7.cfr_renamed_9930(sprfhk7.cfr_renamed_3, sprfhk7.cfr_renamed_3.length - this.cfr_renamed_79 - 1, sprfhk8.cfr_renamed_79, sprfhk8.cfr_renamed_3.length - this.cfr_renamed_79 - 1);
        int n4 = n2 = 0;
        while (n4 != byArray.length) {
            int n5 = n2;
            byte by = (byte)(this.cfr_renamed_3[n5] ^ byArray[n2]);
            this.cfr_renamed_3[n5] = by;
            n4 = ++n2;
        }
        this.cfr_renamed_3[0] = (byte)(this.cfr_renamed_3[0] & n3);
        int n6 = n2 = 0;
        while (n6 != this.cfr_renamed_3.length - this.cfr_renamed_79 - this.cfr_renamed_0 - 2) {
            if (this.cfr_renamed_3[n2] != 0) {
                sprfhk sprfhk9 = this;
                sprfhk9.cfr_renamed_3277(sprfhk9.cfr_renamed_3);
                return false;
            }
            n6 = ++n2;
        }
        sprfhk sprfhk10 = this;
        if (sprfhk10.cfr_renamed_3[sprfhk10.cfr_renamed_3.length - this.cfr_renamed_79 - this.cfr_renamed_0 - 2] != 1) {
            sprfhk sprfhk11 = this;
            sprfhk11.cfr_renamed_3277(sprfhk11.cfr_renamed_3);
            return false;
        }
        sprfhk sprfhk12 = this;
        if (this.cfr_renamed_2) {
            sprfhk sprfhk13 = this;
            System.arraycopy(sprfhk12.cfr_renamed_107, 0, sprfhk13.cfr_renamed_86, sprfhk13.cfr_renamed_86.length - this.cfr_renamed_0, this.cfr_renamed_0);
            sprfhk2 = this;
        } else {
            sprfhk sprfhk14 = this;
            System.arraycopy(sprfhk12.cfr_renamed_3, this.cfr_renamed_3.length - this.cfr_renamed_0 - this.cfr_renamed_79 - 1, sprfhk14.cfr_renamed_86, sprfhk14.cfr_renamed_86.length - this.cfr_renamed_0, this.cfr_renamed_0);
            sprfhk2 = this;
        }
        sprfhk2.cfr_renamed_102.cfr_renamed_1197(this.cfr_renamed_86, 0, this.cfr_renamed_86.length);
        sprfhk sprfhk15 = this;
        sprfhk15.cfr_renamed_102.cfr_renamed_1219(sprfhk15.cfr_renamed_86, this.cfr_renamed_86.length - this.cfr_renamed_79);
        n2 = this.cfr_renamed_3.length - this.cfr_renamed_79 - 1;
        int n7 = n = this.cfr_renamed_86.length - this.cfr_renamed_79;
        while (true) {
            if (n7 == this.cfr_renamed_86.length) {
                sprfhk sprfhk16 = this;
                sprfhk16.cfr_renamed_3277(sprfhk16.cfr_renamed_86);
                sprfhk16.cfr_renamed_3277(sprfhk16.cfr_renamed_3);
                return true;
            }
            if ((this.cfr_renamed_3[n2] ^ this.cfr_renamed_86[n]) != 0) {
                sprfhk sprfhk17 = this;
                sprfhk17.cfr_renamed_3277(sprfhk17.cfr_renamed_86);
                sprfhk17.cfr_renamed_3277(sprfhk17.cfr_renamed_3);
                return false;
            }
            ++n2;
            n7 = ++n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_119.cfr_renamed_41();
    }

    public sprfhk(sprwn arg0, sprgf arg1, sprgf arg2, int arg3, byte arg4) {
        sprgf sprgf2 = arg1;
        this(arg0, sprgf2, sprgf2, arg2, arg3, arg4);
    }

    public sprfhk(sprwn arg0, sprgf arg1, int arg2) {
        this(arg0, arg1, arg2, -68);
    }

    public sprfhk(sprwn arg0, sprgf arg1, sprgf arg2, byte[] arg3, byte arg4) {
        sprgf sprgf2 = arg1;
        this(arg0, sprgf2, sprgf2, arg2, arg3, arg4);
    }

    public static sprfhk cfr_renamed_9931(sprwn arg0, sprgf arg1, sprgf arg2, int arg3, byte arg4) {
        return new sprfhk(arg0, (sprgf)new spreml(), arg1, arg2, arg3, arg4);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfhk(sprwn sprwn2, sprgf sprgf2, sprgf sprgf3, sprgf sprgf4, int n, byte by) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfhk sprfhk2 = this;
        sprfhk sprfhk3 = this;
        sprfhk sprfhk4 = this;
        sprfhk sprfhk5 = this;
        sprfhk sprfhk6 = this;
        this.cfr_renamed_132 = arg0;
        sprfhk6.cfr_renamed_119 = arg1;
        sprfhk6.cfr_renamed_102 = arg2;
        sprfhk5.cfr_renamed_152 = arg3;
        sprfhk5.cfr_renamed_79 = arg2.cfr_renamed_1218();
        sprfhk4.cfr_renamed_112 = arg3.cfr_renamed_1218();
        sprfhk4.cfr_renamed_2 = false;
        sprfhk3.cfr_renamed_0 = arg4;
        sprfhk3.cfr_renamed_107 = new byte[arg4];
        sprfhk2.cfr_renamed_86 = new byte[8 + arg4 + this.cfr_renamed_79];
        sprfhk2.cfr_renamed_4 = by;
    }

    public sprfhk(sprwn arg0, sprgf arg1, sprgf arg2, byte[] arg3) {
        this(arg0, arg1, arg2, arg3, -68);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprfhk sprfhk2;
        sprbj sprbj2;
        sprbj sprbj3;
        sprbj sprbj4;
        if (arg1 instanceof sprbgk) {
            sprbj4 = (sprbgk)arg1;
            sprbj2 = sprbj3 = ((sprbgk)sprbj4).cfr_renamed_284();
            this.cfr_renamed_93 = ((sprbgk)sprbj4).cfr_renamed_1295();
        } else {
            sprbj3 = arg1;
            if (arg0) {
                this.cfr_renamed_93 = sprybl.cfr_renamed_2794();
            }
            sprbj2 = sprbj3;
        }
        if (sprbj2 instanceof sprvjk) {
            sprbj4 = ((sprvjk)sprbj3).cfr_renamed_1157();
            sprfhk sprfhk3 = this;
            sprfhk2 = sprfhk3;
            sprfhk3.cfr_renamed_132.cfr_renamed_5535(arg0, arg1);
        } else {
            sprbj4 = (sprkik)sprbj3;
            sprfhk sprfhk4 = this;
            sprfhk2 = sprfhk4;
            sprfhk4.cfr_renamed_132.cfr_renamed_5535(arg0, sprbj3);
        }
        sprfhk2.cfr_renamed_1 = ((sprkik)sprbj4).cfr_renamed_2295().bitLength() - 1;
        if (this.cfr_renamed_1 < 8 * this.cfr_renamed_79 + 8 * this.cfr_renamed_0 + 9) {
            throw new IllegalArgumentException(sprnyn.cfr_renamed_9("g\u000buNx\u0001cN\u007f\u0003m\u0002`Nj\u0001~N\u007f\u001ei\re\be\u000bhNd\u000f\u007f\u0006,\u000fb\n,\u001dm\u0002xN`\u000bb\tx\u0006\u007f"));
        }
        sprfhk sprfhk5 = this;
        sprfhk5.cfr_renamed_3 = new byte[(sprfhk5.cfr_renamed_1 + 7) / 8];
        sprfhk5.cfr_renamed_41();
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        sprfhk sprfhk2 = this;
        byte[] byArray2 = new byte[sprfhk2.cfr_renamed_112];
        byte[] byArray3 = new byte[4];
        int n = 0;
        sprfhk2.cfr_renamed_152.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / this.cfr_renamed_112) {
            sprfhk sprfhk3 = this;
            sprfhk3.cfr_renamed_3279(n, byArray3);
            sprfhk3.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
            sprfhk3.cfr_renamed_152.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_152.cfr_renamed_1219(byArray2, 0);
            int n3 = n * this.cfr_renamed_112;
            System.arraycopy(byArray2, 0, byArray, n3, this.cfr_renamed_112);
            n2 = ++n;
        }
        if (n * this.cfr_renamed_112 < arg3) {
            sprfhk sprfhk4 = this;
            sprfhk4.cfr_renamed_3279(n, byArray3);
            sprfhk4.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
            sprfhk4.cfr_renamed_152.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_152.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * this.cfr_renamed_112, byArray.length - n * this.cfr_renamed_112);
        }
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprmml, sprddl {
        int n;
        if (this.cfr_renamed_119.cfr_renamed_1218() != this.cfr_renamed_79) {
            throw new IllegalStateException();
        }
        sprfhk sprfhk2 = this;
        sprfhk2.cfr_renamed_119.cfr_renamed_1219(sprfhk2.cfr_renamed_86, this.cfr_renamed_86.length - this.cfr_renamed_79 - this.cfr_renamed_0);
        if (this.cfr_renamed_0 != 0) {
            if (!this.cfr_renamed_2) {
                sprfhk sprfhk3 = this;
                sprfhk3.cfr_renamed_93.nextBytes(sprfhk3.cfr_renamed_107);
            }
            sprfhk sprfhk4 = this;
            System.arraycopy(this.cfr_renamed_107, 0, sprfhk4.cfr_renamed_86, sprfhk4.cfr_renamed_86.length - this.cfr_renamed_0, this.cfr_renamed_0);
        }
        sprfhk sprfhk5 = this;
        byte[] byArray = new byte[sprfhk5.cfr_renamed_79];
        sprfhk5.cfr_renamed_102.cfr_renamed_1197(this.cfr_renamed_86, 0, this.cfr_renamed_86.length);
        sprfhk sprfhk6 = this;
        sprfhk6.cfr_renamed_102.cfr_renamed_1219(byArray, 0);
        sprfhk6.cfr_renamed_3[this.cfr_renamed_3.length - this.cfr_renamed_0 - 1 - this.cfr_renamed_79 - 1] = 1;
        sprfhk sprfhk7 = this;
        System.arraycopy(this.cfr_renamed_107, 0, sprfhk7.cfr_renamed_3, sprfhk7.cfr_renamed_3.length - this.cfr_renamed_0 - this.cfr_renamed_79 - 1, this.cfr_renamed_0);
        byte[] byArray2 = this.cfr_renamed_9930(byArray, 0, byArray.length, this.cfr_renamed_3.length - this.cfr_renamed_79 - 1);
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_3[n3] ^ byArray2[n]);
            this.cfr_renamed_3[n3] = by;
            n2 = ++n;
        }
        sprfhk sprfhk8 = this;
        System.arraycopy(byArray, 0, sprfhk8.cfr_renamed_3, sprfhk8.cfr_renamed_3.length - this.cfr_renamed_79 - 1, this.cfr_renamed_79);
        n = 255 >>> this.cfr_renamed_3.length * 8 - this.cfr_renamed_1;
        sprfhk sprfhk9 = this;
        sprfhk9.cfr_renamed_3[0] = (byte)(sprfhk9.cfr_renamed_3[0] & n);
        sprfhk9.cfr_renamed_3[this.cfr_renamed_3.length - 1] = this.cfr_renamed_4;
        sprfhk sprfhk10 = this;
        byte[] byArray3 = sprfhk10.cfr_renamed_132.cfr_renamed_1337(sprfhk10.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        sprfhk sprfhk11 = this;
        sprfhk11.cfr_renamed_3277(sprfhk11.cfr_renamed_3);
        return byArray3;
    }

    public sprfhk(sprwn arg0, sprgf arg1, sprgf arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, -68);
    }

    public sprfhk(sprwn arg0, sprgf arg1, int arg2, byte arg3) {
        sprgf sprgf2 = arg1;
        this(arg0, sprgf2, sprgf2, arg2, arg3);
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3279(int n, byte[] byArray) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = (byte)(arg0 >>> 24);
        v1[1] = (byte)(arg0 >>> 16);
        v0[2] = (byte)(arg0 >>> 8);
        v0[3] = (byte)(arg0 >>> 0);
    }

    public sprfhk(sprwn arg0, sprgf arg1, byte[] arg2) {
        sprgf sprgf2 = arg1;
        this(arg0, sprgf2, sprgf2, arg2, -68);
    }

    private /* synthetic */ byte[] cfr_renamed_9930(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.cfr_renamed_152 instanceof sprud) {
            byte[] byArray = new byte[arg3];
            sprfhk sprfhk2 = this;
            sprfhk2.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
            ((sprud)sprfhk2.cfr_renamed_152).cfr_renamed_1199(byArray, 0, byArray.length);
            return byArray;
        }
        return this.cfr_renamed_3278(arg0, arg1, arg2, arg3);
    }
}

