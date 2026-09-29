/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprexe;
import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sproai;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprydf;
import java.security.SecureRandom;

public class spradf
extends sprcye {
    private int[] cfr_renamed_4;

    @Override
    public sprcye cfr_renamed_5468(sprcye arg0) {
        int n;
        if (!(arg0 instanceof spradf)) {
            throw new ArithmeticException(sprahe.cfr_renamed_9(")?<.0(\u007f3,z15+z;?931?;z0,:(\u007f\u001d\u0019rms"));
        }
        spradf spradf2 = (spradf)arg0;
        if (this.cfr_renamed_4 != spradf2.cfr_renamed_4) {
            throw new ArithmeticException(sproai.cfr_renamed_9("0\u001f2\u001d(\u0012|\u00175\t1\u001b(\u00194"));
        }
        int[] nArray = sprydf.cfr_renamed_535(((spradf)arg0).cfr_renamed_4);
        int n2 = n = nArray.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            int n4 = nArray[n3] ^ this.cfr_renamed_4[n];
            nArray[n3] = n4;
            n2 = --n;
        }
        return new spradf((int)this.cfr_renamed_4, nArray);
    }

    public int[] cfr_renamed_959() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            if (this.cfr_renamed_4[n] != 0) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprexe cfr_renamed_5490(sprnhf sprnhf2) {
        reference var6_6;
        void arg0;
        int n = arg0.cfr_renamed_813();
        if (this.cfr_renamed_4 % n != false) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("<51,:(,304\u007f3,z67/5,)683?"));
        }
        reference var3_3 = this.cfr_renamed_4 / n;
        int[] nArray = new int[var3_3];
        int n2 = 0;
        reference v0 = var6_6 = var3_3 - true;
        while (v0 >= 0) {
            void var6_7;
            int n3 = arg0.cfr_renamed_813() - 1;
            while (n3 >= 0) {
                int n4;
                int n5 = n2 >>> 5;
                int n6 = n2 & 0x1F;
                if ((this.cfr_renamed_4[n5] >>> n6 & 1) == 1) {
                    void v2 = var6_7;
                    nArray[v2] = nArray[v2] ^ 1 << n4;
                }
                ++n2;
                n3 = --n4;
            }
            v0 = --var6_7;
        }
        return new sprexe((sprnhf)arg0, nArray);
    }

    @Override
    public sprcye cfr_renamed_5467(sprwff arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (this.cfr_renamed_4 != nArray.length) {
            throw new ArithmeticException(sproai.cfr_renamed_9("0\u001f2\u001d(\u0012|\u00175\t1\u001b(\u00194"));
        }
        spradf spradf2 = new spradf((int)this.cfr_renamed_4);
        int n2 = n = 0;
        while (n2 < nArray.length) {
            if ((this.cfr_renamed_4[nArray[n] >> 5] & 1 << (nArray[n] & 0x1F)) != 0) {
                int n3 = n >> 5;
                spradf2.cfr_renamed_4[n3] = spradf2.cfr_renamed_4[n3] | 1 << (n & 0x1F);
            }
            n2 = ++n;
        }
        return spradf2;
    }

    public int cfr_renamed_960(int arg0) {
        if (arg0 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        int n = arg0 >> 5;
        int n2 = arg0 & 0x1F;
        return (this.cfr_renamed_4[n] & 1 << n2) >>> n2;
    }

    /*
     * WARNING - void declaration
     */
    public spradf(int n) {
        void arg0;
        if (n < 0) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("\u0011?8;+3)?\u007f6:48.7t"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_4 = new int[this.cfr_renamed_4 + 31 >> 5];
    }

    /*
     * WARNING - void declaration
     */
    public spradf(spradf spradf2) {
        void arg0;
        spradf spradf3 = this;
        spradf3.cfr_renamed_4 = arg0.cfr_renamed_4;
        spradf3.cfr_renamed_4 = sprydf.cfr_renamed_535(spradf2.cfr_renamed_4);
    }

    public int cfr_renamed_961() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            int n4;
            int n5 = this.cfr_renamed_4[n];
            int n6 = n4 = 0;
            while (n6 < 32) {
                if ((n5 & 1) != 0) {
                    ++n2;
                }
                n5 >>>= 1;
                n6 = ++n4;
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public spradf cfr_renamed_962(int arg0) {
        if (arg0 > this.cfr_renamed_4) {
            throw new ArithmeticException(sproai.cfr_renamed_9("\u00132\f=\u00165\u001e|\u00169\u0014;\u000e4"));
        }
        if (arg0 == this.cfr_renamed_4) {
            return new spradf(this);
        }
        spradf spradf2 = new spradf(arg0);
        spradf spradf3 = this;
        reference var3_3 = spradf3.cfr_renamed_4 - arg0 >> 5;
        int n = spradf3.cfr_renamed_4 - arg0 & 0x1F;
        int n2 = arg0 + 31 >> 5;
        reference var6_6 = var3_3;
        if (n != 0) {
            void var6_8;
            void var6_7;
            int n3;
            int n4 = n3 = 0;
            while (n4 < n2 - 1) {
                spradf2.cfr_renamed_4[n3++] = this.cfr_renamed_4[++var6_7] >>> n | this.cfr_renamed_4[var6_7] << 32 - n;
                n4 = n3;
            }
            spradf2.cfr_renamed_4[n2 - 1] = this.cfr_renamed_4[var6_7] >>> n;
            if (++var6_8 < this.cfr_renamed_4.length) {
                spradf spradf4 = spradf2;
                int n5 = n2 - 1;
                spradf4.cfr_renamed_4[n5] = spradf4.cfr_renamed_4[n5] | this.cfr_renamed_4[var6_8] << 32 - n;
                return spradf4;
            }
        } else {
            System.arraycopy(this.cfr_renamed_4, (int)var3_3, spradf2.cfr_renamed_4, 0, n2);
        }
        return spradf2;
    }

    public spradf cfr_renamed_958(int[] arg0) {
        int n;
        int n2 = arg0.length;
        if (arg0[n2 - 1] > this.cfr_renamed_4) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("31,>66>\u007f31>:\"\u007f):."));
        }
        spradf spradf2 = new spradf(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            if ((this.cfr_renamed_4[arg0[n] >> 5] & 1 << (arg0[n] & 0x1F)) != 0) {
                int n4 = n >> 5;
                spradf2.cfr_renamed_4[n4] = spradf2.cfr_renamed_4[n4] | 1 << (n & 0x1F);
            }
            n3 = ++n;
        }
        return spradf2;
    }

    /*
     * WARNING - void declaration
     */
    public spradf(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        int n3;
        int n4;
        void arg0;
        if (n2 > arg0) {
            throw new ArithmeticException(sproai.cfr_renamed_9(".4\u001f|\u0012=\u00171\u00132\u001d|\r9\u0013;\u0012(Z5\t|\u001d.\u001f=\u000e9\b|\u000e4\u001b2Z(\u00129Z0\u001f2\u001d(\u0012|\u0015:Z*\u001f?\u000e3\br"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_4 = new int[this.cfr_renamed_4 + 31 >> 5];
        int[] nArray = new int[arg0];
        int n5 = n4 = 0;
        while (n5 < arg0) {
            int n6 = n4++;
            nArray[n6] = n6;
            n5 = n4;
        }
        n4 = arg0;
        int n7 = n3 = 0;
        while (n7 < arg1) {
            void arg2;
            int n8 = sprfhf.cfr_renamed_808((SecureRandom)arg2, n4);
            this.cfr_renamed_949(nArray[n8]);
            nArray[n8] = nArray[--n4];
            n7 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spradf(int n, int[] nArray) {
        void arg1;
        void arg0;
        if (n < 0) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("4:=>.6,:z3?1=+2"));
        }
        this.cfr_renamed_4 = arg0;
        void var3_3 = arg0 + 31 >> 5;
        if (((void)arg1).length != var3_3) {
            throw new ArithmeticException(sproai.cfr_renamed_9("0\u001f2\u001d(\u0012|\u00175\t1\u001b(\u00194"));
        }
        this.cfr_renamed_4 = sprydf.cfr_renamed_535((int[])arg1);
        int n2 = arg0 & 0x1F;
        if (n2 != 0) {
            void v0 = var3_3 - true;
            this.cfr_renamed_4[v0] = this.cfr_renamed_4[v0] & (1 << n2) - 1;
        }
    }

    @Override
    public int hashCode() {
        Object object = this.cfr_renamed_4;
        reference v0 = this.cfr_renamed_4 * 31 + sproze.cfr_renamed_552(this.cfr_renamed_4);
        object = v0;
        return (int)v0;
    }

    @Override
    public byte[] cfr_renamed_91() {
        spradf spradf2 = this;
        reference var1_1 = spradf2.cfr_renamed_4 + 7 >> 3;
        return sprfdf.cfr_renamed_891(spradf2.cfr_renamed_4, (int)var1_1);
    }

    public spradf cfr_renamed_964(int arg0) {
        if (arg0 > this.cfr_renamed_4) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("64);33;z3?1=+2"));
        }
        if (arg0 == this.cfr_renamed_4) {
            return new spradf(this);
        }
        spradf spradf2 = new spradf(arg0);
        int n = arg0 >> 5;
        int n2 = arg0 & 0x1F;
        System.arraycopy(this.cfr_renamed_4, 0, spradf2.cfr_renamed_4, 0, n);
        if (n2 != 0) {
            int n3 = n;
            spradf2.cfr_renamed_4[n3] = this.cfr_renamed_4[n3] & (1 << n2) - 1;
        }
        return spradf2;
    }

    public void cfr_renamed_949(int arg0) {
        if (arg0 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        int n = arg0 >> 5;
        this.cfr_renamed_4[n] = this.cfr_renamed_4[n] | 1 << (arg0 & 0x1F);
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spradf)) {
            return false;
        }
        spradf spradf2 = (spradf)arg0;
        return this.cfr_renamed_4 == spradf2.cfr_renamed_4 && sprydf.cfr_renamed_874(this.cfr_renamed_4, spradf2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public spradf(int n, SecureRandom secureRandom) {
        int n2;
        void arg0;
        spradf spradf2 = this;
        spradf2.cfr_renamed_4 = arg0;
        int n3 = n + 31 >> 5;
        spradf2.cfr_renamed_4 = new int[n3];
        int n4 = n2 = n3 - 1;
        while (n4 >= 0) {
            void arg1;
            this.cfr_renamed_4[n2--] = arg1.nextInt();
            n4 = n2;
        }
        n2 = arg0 & 0x1F;
        if (n2 != 0) {
            int n5 = n3 - 1;
            this.cfr_renamed_4[n5] = this.cfr_renamed_4[n5] & (1 << n2) - 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spradf(int[] nArray, int n) {
        void arg0;
        spradf spradf2 = this;
        spradf2.cfr_renamed_4 = arg0;
        spradf2.cfr_renamed_4 = (int[])n;
    }

    public static spradf cfr_renamed_963(int arg0, byte[] arg1) {
        if (arg0 < 0) {
            throw new ArithmeticException(sproai.cfr_renamed_9("2\u001f;\u001b(\u0013*\u001f|\u00169\u0014;\u000e4"));
        }
        int n = arg0 + 7 >> 3;
        if (arg1.length > n) {
            throw new ArithmeticException(sprahe.cfr_renamed_9("6:48.7z23,7>.<2"));
        }
        return new spradf(arg0, sprfdf.cfr_renamed_889(arg1));
    }

    @Override
    public String toString() {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3;
            int n4;
            if (n != 0 && (n & 0x1F) == 0) {
                stringBuffer.append(' ');
            }
            if ((this.cfr_renamed_4[n4 = n >> 5] & 1 << (n3 = n & 0x1F)) == 0) {
                stringBuffer.append('0');
            } else {
                stringBuffer.append('1');
            }
            n2 = ++n;
        }
        return stringBuffer.toString();
    }
}

