/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragf;
import com.spire.presentation.packages.sprbbf;
import com.spire.presentation.packages.sprdcf;
import com.spire.presentation.packages.sprndda;
import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sprtbf;
import com.spire.presentation.packages.sprzd;
import com.spire.presentation.packages.sprzuy;
import java.math.BigInteger;
import java.util.Random;

public class sprvwe
extends sprdcf {
    private spragf cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    @Override
    public sprzd cfr_renamed_5494(sprzd arg0) throws RuntimeException {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_5493(arg0);
        return sprvwe2;
    }

    @Override
    public byte[] cfr_renamed_954() {
        return this.cfr_renamed_3.cfr_renamed_954();
    }

    @Override
    public sprdcf cfr_renamed_1049() throws RuntimeException {
        sprvwe sprvwe2;
        sprvwe sprvwe3;
        if (this.cfr_renamed_805()) {
            return sprvwe.cfr_renamed_5513((sprbbf)((Object)this.cfr_renamed_3));
        }
        if ((this.cfr_renamed_4 & 1) == 1) {
            return this.cfr_renamed_1047();
        }
        do {
            int n;
            sprvwe sprvwe4 = new sprvwe((sprbbf)((Object)this.cfr_renamed_3), new Random());
            sprvwe2 = sprvwe.cfr_renamed_5513((sprbbf)((Object)this.cfr_renamed_3));
            sprvwe3 = (sprvwe)sprvwe4.clone();
            int n2 = n = 1;
            while (n2 < this.cfr_renamed_4) {
                sprvwe sprvwe5 = sprvwe3;
                sprvwe2.cfr_renamed_1040();
                sprvwe3.cfr_renamed_1040();
                sprvwe2.cfr_renamed_3229(sprvwe5.cfr_renamed_5494(this));
                sprvwe5.cfr_renamed_3229(sprvwe4);
                n2 = ++n;
            }
        } while (sprvwe3.cfr_renamed_805());
        if (!this.equals(sprvwe2.cfr_renamed_1048().cfr_renamed_5492(sprvwe2))) {
            throw new RuntimeException();
        }
        return sprvwe2;
    }

    private /* synthetic */ sprvwe cfr_renamed_1047() throws RuntimeException {
        int n;
        if ((this.cfr_renamed_4 & 1) == 0) {
            throw new RuntimeException();
        }
        sprvwe sprvwe2 = new sprvwe(this);
        int n2 = n = 1;
        while (n2 <= this.cfr_renamed_4 - true >> 1) {
            sprvwe sprvwe3 = sprvwe2;
            sprvwe3.cfr_renamed_1040();
            sprvwe3.cfr_renamed_1040();
            sprvwe3.cfr_renamed_3229(this);
            n2 = ++n;
        }
        return sprvwe2;
    }

    @Override
    public void cfr_renamed_986() {
        this.cfr_renamed_3.cfr_renamed_986();
    }

    public void cfr_renamed_1042() {
        int n;
        spragf spragf2 = new spragf((int)this.cfr_renamed_4);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            sprvwe sprvwe2 = this;
            if (sprvwe2.cfr_renamed_3.cfr_renamed_5506(((sprbbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_4[this.cfr_renamed_4 - n - true])) {
                spragf2.cfr_renamed_949(n);
            }
            n2 = ++n;
        }
        this.cfr_renamed_3 = spragf2;
    }

    public sprvwe cfr_renamed_1043() {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_1042();
        sprvwe2.cfr_renamed_1036();
        return sprvwe2;
    }

    @Override
    public sprdcf cfr_renamed_1048() {
        return this.cfr_renamed_1041();
    }

    @Override
    public sprzd cfr_renamed_5492(sprzd arg0) throws RuntimeException {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_3229(arg0);
        return sprvwe2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5496(Random random) {
        void arg0;
        sprvwe sprvwe2 = this;
        this.cfr_renamed_3.cfr_renamed_973((int)sprvwe2.cfr_renamed_4);
        sprvwe2.cfr_renamed_3.cfr_renamed_5496((Random)arg0);
    }

    public sprvwe cfr_renamed_1035() {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_1010();
        sprvwe2.cfr_renamed_1036();
        return sprvwe2;
    }

    @Override
    public void cfr_renamed_5493(sprzd arg0) throws RuntimeException {
        if (!(arg0 instanceof sprvwe)) {
            throw new RuntimeException();
        }
        if (!((sprtbf)((Object)this.cfr_renamed_3)).equals(((sprvwe)arg0).cfr_renamed_3)) {
            throw new RuntimeException();
        }
        if (this.equals(arg0)) {
            this.cfr_renamed_1040();
            return;
        }
        this.cfr_renamed_3 = this.cfr_renamed_3.cfr_renamed_5502(((sprvwe)arg0).cfr_renamed_3);
        this.cfr_renamed_1036();
    }

    @Override
    public boolean cfr_renamed_1012(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_1012(arg0);
    }

    @Override
    public void cfr_renamed_987() {
        this.cfr_renamed_3.cfr_renamed_987();
    }

    @Override
    public int cfr_renamed_1051() {
        int n;
        sprvwe sprvwe2 = new sprvwe(this);
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4) {
            sprvwe sprvwe3 = sprvwe2;
            sprvwe3.cfr_renamed_1040();
            sprvwe3.cfr_renamed_3229(this);
            n2 = ++n;
        }
        if (sprvwe2.cfr_renamed_287()) {
            return 1;
        }
        return 0;
    }

    private /* synthetic */ spragf cfr_renamed_1038() {
        return new spragf(this.cfr_renamed_3);
    }

    @Override
    public sprdcf cfr_renamed_1045() {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_1046();
        return sprvwe2;
    }

    public sprvwe cfr_renamed_1041() {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_999();
        sprvwe2.cfr_renamed_1036();
        return sprvwe2;
    }

    @Override
    public String cfr_renamed_957(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_957(arg0);
    }

    @Override
    public void cfr_renamed_1046() {
        int n;
        sprvwe sprvwe2 = this;
        this.cfr_renamed_3.cfr_renamed_973((int)((sprvwe2.cfr_renamed_4 << 1) + 32));
        sprvwe2.cfr_renamed_3.cfr_renamed_978();
        int n2 = n = 0;
        while (n2 < ((sprtbf)((Object)this.cfr_renamed_3)).cfr_renamed_813() - 1) {
            this.cfr_renamed_1040();
            n2 = ++n;
        }
    }

    public sprvwe cfr_renamed_1052(int arg0) {
        int n;
        sprvwe sprvwe2;
        if (arg0 == 1) {
            return new sprvwe(this);
        }
        sprvwe sprvwe3 = sprvwe.cfr_renamed_5521((sprbbf)((Object)this.cfr_renamed_3));
        if (arg0 == 0) {
            return sprvwe3;
        }
        sprvwe sprvwe4 = sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_3.cfr_renamed_973((int)((sprvwe4.cfr_renamed_4 << 1) + 32));
        sprvwe4.cfr_renamed_3.cfr_renamed_978();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            if ((arg0 & 1 << n) != 0) {
                sprvwe3.cfr_renamed_5493(sprvwe2);
            }
            sprvwe2.cfr_renamed_1048();
            n2 = ++n;
        }
        return sprvwe3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvwe(sprbbf sprbbf2, Random random) {
        void arg0;
        sprvwe sprvwe2 = this;
        sprvwe2.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = (int[])((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_813();
        sprvwe sprvwe3 = this;
        this.cfr_renamed_3 = new spragf((int)this.cfr_renamed_4);
        this.cfr_renamed_5496(random);
    }

    public sprvwe cfr_renamed_1037() throws ArithmeticException {
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        spragf spragf2 = new spragf((int)this.cfr_renamed_4, sprndda.cfr_renamed_9("XlR"));
        spragf spragf3 = new spragf((int)this.cfr_renamed_4);
        sprvwe sprvwe2 = this;
        spragf spragf4 = sprvwe2.cfr_renamed_1038();
        spragf spragf5 = ((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_1039();
        spragf spragf6 = spragf4;
        while (true) {
            if (!spragf6.cfr_renamed_1012(0)) {
                spragf4.cfr_renamed_1011();
                if (!spragf2.cfr_renamed_1012(0)) {
                    spragf6 = spragf4;
                    spragf2.cfr_renamed_1011();
                    continue;
                }
                spragf spragf7 = spragf2;
                spragf7.cfr_renamed_5501(((sprtbf)((Object)this.cfr_renamed_3)).cfr_renamed_1039());
                spragf7.cfr_renamed_1011();
                spragf6 = spragf4;
                continue;
            }
            if (spragf4.cfr_renamed_287()) {
                return new sprvwe((sprbbf)((Object)this.cfr_renamed_3), spragf2);
            }
            spragf4.cfr_renamed_978();
            spragf5.cfr_renamed_978();
            if (spragf4.cfr_renamed_806() < spragf5.cfr_renamed_806()) {
                spragf spragf8 = spragf4;
                spragf4 = spragf5;
                spragf5 = spragf8;
                spragf spragf9 = spragf2;
                spragf2 = spragf3;
                spragf3 = spragf9;
            }
            spragf6 = spragf4;
            spragf4.cfr_renamed_5501(spragf5);
            spragf2.cfr_renamed_5501(spragf3);
        }
    }

    @Override
    public sprdcf cfr_renamed_1003() {
        sprvwe sprvwe2 = new sprvwe(this);
        sprvwe2.cfr_renamed_984();
        return sprvwe2;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprvwe)) {
            return false;
        }
        sprvwe sprvwe2 = (sprvwe)arg0;
        if (this.cfr_renamed_3 != sprvwe2.cfr_renamed_3 && !((sprtbf)((Object)this.cfr_renamed_3)).cfr_renamed_1039().equals(((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_1039())) {
            return false;
        }
        return this.cfr_renamed_3.equals(sprvwe2.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_1040() {
        this.cfr_renamed_999();
    }

    @Override
    public BigInteger cfr_renamed_953() {
        return this.cfr_renamed_3.cfr_renamed_953();
    }

    public static sprvwe cfr_renamed_5513(sprbbf arg0) {
        spragf spragf2 = new spragf(arg0.cfr_renamed_813());
        return new sprvwe(arg0, spragf2);
    }

    @Override
    public int hashCode() {
        return ((sprtbf)((Object)this.cfr_renamed_3)).hashCode() + this.cfr_renamed_3.hashCode();
    }

    private /* synthetic */ void cfr_renamed_1054(int[] arg0) {
        int n;
        sprvwe sprvwe2 = this;
        reference var3_2 = sprvwe2.cfr_renamed_4 - arg0[2];
        reference var4_3 = sprvwe2.cfr_renamed_4 - arg0[1];
        reference var5_4 = sprvwe2.cfr_renamed_4 - arg0[0];
        int n2 = n = sprvwe2.cfr_renamed_3.cfr_renamed_806() - 1;
        while (n2 >= this.cfr_renamed_4) {
            if (this.cfr_renamed_3.cfr_renamed_1012(n)) {
                sprvwe sprvwe3 = this;
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - var3_2);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - var4_3);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - var5_4);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - this.cfr_renamed_4);
            }
            n2 = --n;
        }
        sprvwe sprvwe4 = this;
        sprvwe4.cfr_renamed_3.cfr_renamed_978();
        sprvwe4.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_3229(sprzd arg0) throws RuntimeException {
        if (!(arg0 instanceof sprvwe)) {
            throw new RuntimeException();
        }
        if (!((sprtbf)((Object)this.cfr_renamed_3)).equals(((sprvwe)arg0).cfr_renamed_3)) {
            throw new RuntimeException();
        }
        this.cfr_renamed_3.cfr_renamed_5501(((sprvwe)arg0).cfr_renamed_3);
    }

    public sprvwe(sprbbf arg0, int[] arg1) {
        sprvwe sprvwe2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = (int[])((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_813();
        sprvwe sprvwe3 = this;
        this.cfr_renamed_3 = new spragf((int)this.cfr_renamed_4, arg1);
        this.cfr_renamed_3.cfr_renamed_973(arg0.cfr_renamed_3 ? 1 : 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvwe(sprvwe sprvwe2) {
        void arg0;
        sprvwe sprvwe3 = this;
        sprvwe3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprvwe3.cfr_renamed_4 = sprvwe2.cfr_renamed_4;
        sprvwe sprvwe4 = this;
        sprvwe3.cfr_renamed_3 = new spragf(arg0.cfr_renamed_3);
    }

    public sprvwe cfr_renamed_1050() throws ArithmeticException {
        int n;
        sprvwe sprvwe2;
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        int n2 = ((sprtbf)((Object)this.cfr_renamed_3)).cfr_renamed_813() - 1;
        sprvwe sprvwe3 = sprvwe2 = new sprvwe(this);
        sprvwe3.cfr_renamed_3.cfr_renamed_973((int)((this.cfr_renamed_4 << 1) + 32));
        sprvwe3.cfr_renamed_3.cfr_renamed_978();
        int n3 = 1;
        int n4 = n = sproef.cfr_renamed_921(n2) - 1;
        while (n4 >= 0) {
            int n5;
            sprvwe sprvwe4 = new sprvwe(sprvwe2);
            int n6 = n5 = 1;
            while (n6 <= n3) {
                sprvwe4.cfr_renamed_999();
                n6 = ++n5;
            }
            sprvwe2.cfr_renamed_5493(sprvwe4);
            n3 <<= 1;
            if ((n2 & cfr_renamed_4[n]) != 0) {
                sprvwe sprvwe5 = sprvwe2;
                ++n3;
                sprvwe5.cfr_renamed_999();
                sprvwe5.cfr_renamed_5493(this);
            }
            n4 = --n;
        }
        sprvwe sprvwe6 = sprvwe2;
        sprvwe6.cfr_renamed_999();
        return sprvwe6;
    }

    @Override
    public sprzd cfr_renamed_952() throws ArithmeticException {
        return this.cfr_renamed_1037();
    }

    private /* synthetic */ void cfr_renamed_1053(int arg0) {
        int n;
        sprvwe sprvwe2 = this;
        reference var3_2 = sprvwe2.cfr_renamed_4 - arg0;
        int n2 = n = sprvwe2.cfr_renamed_3.cfr_renamed_806() - 1;
        while (n2 >= this.cfr_renamed_4) {
            if (this.cfr_renamed_3.cfr_renamed_1012(n)) {
                sprvwe sprvwe3 = this;
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - var3_2);
                sprvwe3.cfr_renamed_3.cfr_renamed_967(n - this.cfr_renamed_4);
            }
            n2 = --n;
        }
        sprvwe sprvwe4 = this;
        sprvwe4.cfr_renamed_3.cfr_renamed_978();
        sprvwe4.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_4);
    }

    public void cfr_renamed_1010() {
        sprvwe sprvwe2 = this;
        sprvwe2.cfr_renamed_3.cfr_renamed_1010();
        sprvwe2.cfr_renamed_1036();
    }

    public void cfr_renamed_999() {
        sprvwe sprvwe2 = this;
        sprvwe2.cfr_renamed_3.cfr_renamed_999();
        sprvwe2.cfr_renamed_1036();
    }

    @Override
    public boolean cfr_renamed_1044() {
        return this.cfr_renamed_3.cfr_renamed_1012(0);
    }

    @Override
    public boolean cfr_renamed_805() {
        return this.cfr_renamed_3.cfr_renamed_805();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1036() {
        if (this.cfr_renamed_3.cfr_renamed_806() > this.cfr_renamed_4) {
            int[] nArray;
            if (((sprbbf)((Object)this.cfr_renamed_3)).cfr_renamed_1024()) {
                int n;
                try {
                    n = ((sprbbf)((Object)this.cfr_renamed_3)).cfr_renamed_1018();
                }
                catch (RuntimeException runtimeException) {
                    throw new RuntimeException(sprzuy.cfr_renamed_9("3\"F\n$\u000b\u0018\u001d\u001a\u000b\u0019\r\u0015\b1\b\u0011\t\u0011\n\u0000J\u0006\u0001\u0010\u0011\u0017\u0001ND\u0000\f\u0011D\u0012\r\u0011\b\u0010D\u0004\u000b\u0018\u001d\u001a\u000b\u0019\r\u0015\bT\r\u0007D\u001a\u000b\u0000D\u0015D\u0000\u0016\u001d\n\u001b\t\u001d\u0005\u0018"));
                }
                if (this.cfr_renamed_4 - n > 32 && this.cfr_renamed_3.cfr_renamed_806() <= this.cfr_renamed_4 << 1) {
                    sprvwe sprvwe2 = this;
                    sprvwe2.cfr_renamed_3.cfr_renamed_1004((int)sprvwe2.cfr_renamed_4, n);
                    return;
                }
                this.cfr_renamed_1053(n);
                return;
            }
            if (!((sprbbf)((Object)this.cfr_renamed_3)).cfr_renamed_1017()) {
                sprvwe sprvwe3 = this;
                this.cfr_renamed_3 = sprvwe3.cfr_renamed_3.cfr_renamed_5497(((sprtbf)((Object)this.cfr_renamed_3)).cfr_renamed_1039());
                sprvwe3.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_4);
                return;
            }
            try {
                nArray = ((sprbbf)((Object)this.cfr_renamed_3)).cfr_renamed_1033();
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException(sprndda.cfr_renamed_9("Pd%LGM{[yMzKvNRNrOrLc\feGsWtG-\u0002cJr\u0002qKrNs\u0002gM{[yMzKvN7Kd\u0002yMc\u0002v\u0002gGyVvLxO~C{"));
            }
            if (this.cfr_renamed_4 - nArray[2] > 32 && this.cfr_renamed_3.cfr_renamed_806() <= this.cfr_renamed_4 << 1) {
                sprvwe sprvwe4 = this;
                sprvwe4.cfr_renamed_3.cfr_renamed_1005((int)sprvwe4.cfr_renamed_4, nArray);
                return;
            }
            this.cfr_renamed_1054(nArray);
            return;
        }
        if (this.cfr_renamed_3.cfr_renamed_806() < this.cfr_renamed_4) {
            sprvwe sprvwe5 = this;
            sprvwe5.cfr_renamed_3.cfr_renamed_973((int)sprvwe5.cfr_renamed_4);
        }
    }

    @Override
    public String toString() {
        return this.cfr_renamed_3.cfr_renamed_957(16);
    }

    static {
        int[] nArray = new int[33];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 256;
        nArray[9] = 512;
        nArray[10] = 1024;
        nArray[11] = 2048;
        nArray[12] = 4096;
        nArray[13] = 8192;
        nArray[14] = 16384;
        nArray[15] = 32768;
        nArray[16] = 65536;
        nArray[17] = 131072;
        nArray[18] = 262144;
        nArray[19] = 524288;
        nArray[20] = 0x100000;
        nArray[21] = 0x200000;
        nArray[22] = 0x400000;
        nArray[23] = 0x800000;
        nArray[24] = 0x1000000;
        nArray[25] = 0x2000000;
        nArray[26] = 0x4000000;
        nArray[27] = 0x8000000;
        nArray[28] = 0x10000000;
        nArray[29] = 0x20000000;
        nArray[30] = 0x40000000;
        nArray[31] = Integer.MIN_VALUE;
        nArray[32] = 0;
        cfr_renamed_4 = nArray;
    }

    public sprvwe(sprbbf arg0, byte[] arg1) {
        sprvwe sprvwe2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = (int[])((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_813();
        sprvwe sprvwe3 = this;
        this.cfr_renamed_3 = new spragf((int)this.cfr_renamed_4, arg1);
        this.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_984() {
        this.cfr_renamed_3.cfr_renamed_984();
    }

    @Override
    public Object clone() {
        return new sprvwe(this);
    }

    @Override
    public boolean cfr_renamed_287() {
        return this.cfr_renamed_3.cfr_renamed_287();
    }

    public sprvwe cfr_renamed_1055() throws ArithmeticException {
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        spragf spragf2 = new spragf((int)(this.cfr_renamed_4 + 32), sprzuy.cfr_renamed_9(";*1"));
        spragf2.cfr_renamed_978();
        spragf spragf3 = new spragf((int)(this.cfr_renamed_4 + 32));
        sprvwe sprvwe2 = this;
        spragf3.cfr_renamed_978();
        spragf spragf4 = sprvwe2.cfr_renamed_1038();
        spragf spragf5 = ((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_1039();
        spragf spragf6 = spragf4;
        spragf spragf7 = spragf6;
        spragf6.cfr_renamed_978();
        while (!spragf7.cfr_renamed_287()) {
            spragf spragf8 = spragf4;
            spragf8.cfr_renamed_978();
            spragf5.cfr_renamed_978();
            int n = spragf8.cfr_renamed_806() - spragf5.cfr_renamed_806();
            if (n < 0) {
                spragf spragf9 = spragf4;
                spragf4 = spragf5;
                spragf5 = spragf9;
                spragf spragf10 = spragf2;
                spragf2 = spragf3;
                spragf3 = spragf10;
                n = -n;
                spragf3.cfr_renamed_978();
            }
            spragf7 = spragf4;
            spragf4.cfr_renamed_5500(spragf5, n);
            spragf2.cfr_renamed_5500(spragf3, n);
        }
        spragf2.cfr_renamed_978();
        return new sprvwe((sprbbf)((Object)this.cfr_renamed_3), spragf2);
    }

    public sprvwe(sprbbf arg0, spragf arg1) {
        sprvwe sprvwe2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = (int[])((sprtbf)((Object)sprvwe2.cfr_renamed_3)).cfr_renamed_813();
        sprvwe sprvwe3 = this;
        this.cfr_renamed_3 = new spragf(arg1);
        this.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_4);
    }

    public static sprvwe cfr_renamed_5521(sprbbf arg0) {
        int[] nArray = new int[1];
        nArray[0] = 1;
        spragf spragf2 = new spragf(arg0.cfr_renamed_813(), nArray);
        return new sprvwe(arg0, spragf2);
    }
}

