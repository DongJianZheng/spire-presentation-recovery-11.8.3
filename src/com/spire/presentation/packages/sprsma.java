/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxz;
import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.spriko;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprpoa;
import com.spire.presentation.packages.sprqna;
import com.spire.presentation.packages.sprula;
import com.spire.presentation.packages.sprzta;
import java.security.SecureRandom;

public class sprsma
extends sprula {
    private int[] cfr_renamed_4;

    public void cfr_renamed_949(int arg0) {
        if (arg0 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        int n = arg0 >> 5;
        this.cfr_renamed_4[n] = this.cfr_renamed_4[n] | 1 << (arg0 & 0x1F);
    }

    public sprsma cfr_renamed_958(int[] arg0) {
        int n;
        int n2 = arg0.length;
        if (arg0[n2 - 1] > this.cfr_renamed_4) {
            throw new ArithmeticException(spraxz.cfr_renamed_9(">W!X;P3\u0019>W3\\/\u0019$\\#"));
        }
        sprsma sprsma2 = new sprsma(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            if ((this.cfr_renamed_4[arg0[n] >> 5] & 1 << (arg0[n] & 0x1F)) != 0) {
                int n4 = n >> 5;
                sprsma2.cfr_renamed_4[n4] = sprsma2.cfr_renamed_4[n4] | 1 << (n & 0x1F);
            }
            n3 = ++n;
        }
        return sprsma2;
    }

    public int[] cfr_renamed_959() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_960(int arg0) {
        if (arg0 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        int n = arg0 >> 5;
        int n2 = arg0 & 0x1F;
        return (this.cfr_renamed_4[n] & 1 << n2) >>> n2;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprsma)) {
            return false;
        }
        sprsma sprsma2 = (sprsma)arg0;
        return this.cfr_renamed_4 == sprsma2.cfr_renamed_4 && sprhva.cfr_renamed_874(this.cfr_renamed_4, sprsma2.cfr_renamed_4);
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
    public sprsma(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        int n3;
        int n4;
        void arg0;
        if (n2 > arg0) {
            throw new ArithmeticException(spriko.cfr_renamed_9("sAB\tOHJDNG@\tPLNNO]\u0007@T\t@[BHSLU\tSAFG\u0007]OL\u0007EBG@]O\tHO\u0007_BJSFU\u0007"));
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
            int n8 = sprqna.cfr_renamed_808((SecureRandom)arg2, n4);
            this.cfr_renamed_949(nArray[n8]);
            nArray[n8] = nArray[--n4];
            n7 = ++n3;
        }
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

    /*
     * WARNING - void declaration
     */
    public sprsma(int n) {
        void arg0;
        if (n < 0) {
            throw new ArithmeticException(spraxz.cfr_renamed_9("w2^6M>O2\u0019;\\9^#Qy"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_4 = new int[this.cfr_renamed_4 + 31 >> 5];
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

    @Override
    public sprula cfr_renamed_807(sprkqa arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (this.cfr_renamed_4 != nArray.length) {
            throw new ArithmeticException(spriko.cfr_renamed_9("EBG@]O\tJ@TDF]DA"));
        }
        sprsma sprsma2 = new sprsma((int)this.cfr_renamed_4);
        int n2 = n = 0;
        while (n2 < nArray.length) {
            if ((this.cfr_renamed_4[nArray[n] >> 5] & 1 << (nArray[n] & 0x1F)) != 0) {
                int n3 = n >> 5;
                sprsma2.cfr_renamed_4[n3] = sprsma2.cfr_renamed_4[n3] | 1 << (n & 0x1F);
            }
            n2 = ++n;
        }
        return sprsma2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsma cfr_renamed_962(int arg0) {
        if (arg0 > this.cfr_renamed_4) {
            throw new ArithmeticException(spraxz.cfr_renamed_9("P9O6U>]wU2W0M?"));
        }
        if (arg0 == this.cfr_renamed_4) {
            return new sprsma(this);
        }
        sprsma sprsma2 = new sprsma(arg0);
        sprsma sprsma3 = this;
        reference var3_3 = sprsma3.cfr_renamed_4 - arg0 >> 5;
        int n = sprsma3.cfr_renamed_4 - arg0 & 0x1F;
        int n2 = arg0 + 31 >> 5;
        reference var6_6 = var3_3;
        if (n != 0) {
            void var6_8;
            void var6_7;
            int n3;
            int n4 = n3 = 0;
            while (n4 < n2 - 1) {
                sprsma2.cfr_renamed_4[n3++] = this.cfr_renamed_4[++var6_7] >>> n | this.cfr_renamed_4[var6_7] << 32 - n;
                n4 = n3;
            }
            sprsma2.cfr_renamed_4[n2 - 1] = this.cfr_renamed_4[var6_7] >>> n;
            if (++var6_8 < this.cfr_renamed_4.length) {
                sprsma sprsma4 = sprsma2;
                int n5 = n2 - 1;
                sprsma4.cfr_renamed_4[n5] = sprsma4.cfr_renamed_4[n5] | this.cfr_renamed_4[var6_8] << 32 - n;
                return sprsma4;
            }
        } else {
            System.arraycopy(this.cfr_renamed_4, (int)var3_3, sprsma2.cfr_renamed_4, 0, n2);
        }
        return sprsma2;
    }

    @Override
    public int hashCode() {
        Object object = this.cfr_renamed_4;
        reference v0 = this.cfr_renamed_4 * 31 + this.cfr_renamed_4.hashCode();
        object = v0;
        return (int)v0;
    }

    public static sprsma cfr_renamed_963(int arg0, byte[] arg1) {
        if (arg0 < 0) {
            throw new ArithmeticException(spriko.cfr_renamed_9("GBNF]N_B\tKLINSA"));
        }
        int n = arg0 + 7 >> 3;
        if (arg1.length > n) {
            throw new ArithmeticException(spraxz.cfr_renamed_9(";\\9^#QwT>J:X#Z?"));
        }
        return new sprsma(arg0, sprpoa.cfr_renamed_889(arg1));
    }

    @Override
    public sprula cfr_renamed_804(sprula arg0) {
        int n;
        if (!(arg0 instanceof sprsma)) {
            throw new ArithmeticException(spriko.cfr_renamed_9("QLD]H[\u0007@T\tIFS\tCLA@ILC\tH_B[\u0007na\u0001\u0015\u0000"));
        }
        sprsma sprsma2 = (sprsma)arg0;
        if (this.cfr_renamed_4 != sprsma2.cfr_renamed_4) {
            throw new ArithmeticException(spraxz.cfr_renamed_9(";\\9^#QwT>J:X#Z?"));
        }
        int[] nArray = sprhva.cfr_renamed_535(((sprsma)arg0).cfr_renamed_4);
        int n2 = n = nArray.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            int n4 = nArray[n3] ^ this.cfr_renamed_4[n];
            nArray[n3] = n4;
            n2 = --n;
        }
        return new sprsma((int)this.cfr_renamed_4, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprsma(int n, int[] nArray) {
        void arg1;
        void arg0;
        if (n < 0) {
            throw new ArithmeticException(spriko.cfr_renamed_9("GBNF]N_B\tKLINSA"));
        }
        this.cfr_renamed_4 = arg0;
        void var3_3 = arg0 + 31 >> 5;
        if (((void)arg1).length != var3_3) {
            throw new ArithmeticException(spraxz.cfr_renamed_9(";\\9^#QwT>J:X#Z?"));
        }
        this.cfr_renamed_4 = sprhva.cfr_renamed_535((int[])arg1);
        int n2 = arg0 & 0x1F;
        if (n2 != 0) {
            void v0 = var3_3 - true;
            this.cfr_renamed_4[v0] = this.cfr_renamed_4[v0] & (1 << n2) - 1;
        }
    }

    @Override
    public byte[] cfr_renamed_91() {
        sprsma sprsma2 = this;
        reference var1_1 = sprsma2.cfr_renamed_4 + 7 >> 3;
        return sprpoa.cfr_renamed_891(sprsma2.cfr_renamed_4, (int)var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprzta cfr_renamed_948(sprmpa sprmpa2) {
        reference var6_6;
        void arg0;
        int n = arg0.cfr_renamed_813();
        if (this.cfr_renamed_4 % n != false) {
            throw new ArithmeticException(spriko.cfr_renamed_9("DFI_B[T@HG\u0007@T\tNDWFTZNKKL"));
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
        return new sprzta((sprmpa)arg0, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprsma(int n, SecureRandom secureRandom) {
        int n2;
        void arg0;
        sprsma sprsma2 = this;
        sprsma2.cfr_renamed_4 = arg0;
        int n3 = n + 31 >> 5;
        sprsma2.cfr_renamed_4 = new int[n3];
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

    public sprsma cfr_renamed_964(int arg0) {
        if (arg0 > this.cfr_renamed_4) {
            throw new ArithmeticException(spraxz.cfr_renamed_9("P9O6U>]wU2W0M?"));
        }
        if (arg0 == this.cfr_renamed_4) {
            return new sprsma(this);
        }
        sprsma sprsma2 = new sprsma(arg0);
        int n = arg0 >> 5;
        int n2 = arg0 & 0x1F;
        System.arraycopy(this.cfr_renamed_4, 0, sprsma2.cfr_renamed_4, 0, n);
        if (n2 != 0) {
            int n3 = n;
            sprsma2.cfr_renamed_4[n3] = this.cfr_renamed_4[n3] & (1 << n2) - 1;
        }
        return sprsma2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsma(int[] nArray, int n) {
        void arg0;
        sprsma sprsma2 = this;
        sprsma2.cfr_renamed_4 = arg0;
        sprsma2.cfr_renamed_4 = (int[])n;
    }

    /*
     * WARNING - void declaration
     */
    public sprsma(sprsma sprsma2) {
        void arg0;
        sprsma sprsma3 = this;
        sprsma3.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprsma3.cfr_renamed_4 = sprhva.cfr_renamed_535(sprsma2.cfr_renamed_4);
    }
}

