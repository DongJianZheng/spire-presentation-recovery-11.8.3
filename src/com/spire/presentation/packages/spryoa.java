/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraada;
import com.spire.presentation.packages.sprcqa;
import com.spire.presentation.packages.sprhua;
import com.spire.presentation.packages.spri;
import com.spire.presentation.packages.sprrgda;
import com.spire.presentation.packages.spryua;
import com.spire.presentation.packages.sprzma;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryoa
extends spryua {
    private sprhua cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public spryoa cfr_renamed_1035() {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_1010();
        spryoa2.cfr_renamed_1036();
        return spryoa2;
    }

    public spryoa cfr_renamed_1037() throws ArithmeticException {
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        sprhua sprhua2 = new sprhua((int)this.cfr_renamed_3, spraada.cfr_renamed_9("r\rx"));
        sprhua sprhua3 = new sprhua((int)this.cfr_renamed_3);
        spryoa spryoa2 = this;
        sprhua sprhua4 = spryoa2.cfr_renamed_1038();
        sprhua sprhua5 = spryoa2.cfr_renamed_4.cfr_renamed_1039();
        sprhua sprhua6 = sprhua4;
        while (true) {
            if (!sprhua6.cfr_renamed_1012(0)) {
                sprhua4.cfr_renamed_1011();
                if (!sprhua2.cfr_renamed_1012(0)) {
                    sprhua6 = sprhua4;
                    sprhua2.cfr_renamed_1011();
                    continue;
                }
                sprhua sprhua7 = sprhua2;
                sprhua7.cfr_renamed_972(this.cfr_renamed_4.cfr_renamed_1039());
                sprhua7.cfr_renamed_1011();
                sprhua6 = sprhua4;
                continue;
            }
            if (sprhua4.cfr_renamed_287()) {
                return new spryoa((sprcqa)this.cfr_renamed_4, sprhua2);
            }
            sprhua4.cfr_renamed_978();
            sprhua5.cfr_renamed_978();
            if (sprhua4.cfr_renamed_806() < sprhua5.cfr_renamed_806()) {
                sprhua sprhua8 = sprhua4;
                sprhua4 = sprhua5;
                sprhua5 = sprhua8;
                sprhua sprhua9 = sprhua2;
                sprhua2 = sprhua3;
                sprhua3 = sprhua9;
            }
            sprhua6 = sprhua4;
            sprhua4.cfr_renamed_972(sprhua5);
            sprhua2.cfr_renamed_972(sprhua3);
        }
    }

    @Override
    public void cfr_renamed_135(spri arg0) throws RuntimeException {
        if (!(arg0 instanceof spryoa)) {
            throw new RuntimeException();
        }
        if (!this.cfr_renamed_4.equals(((spryoa)arg0).cfr_renamed_4)) {
            throw new RuntimeException();
        }
        if (this.equals(arg0)) {
            this.cfr_renamed_1040();
            return;
        }
        this.cfr_renamed_3 = this.cfr_renamed_3.cfr_renamed_982(((spryoa)arg0).cfr_renamed_3);
        this.cfr_renamed_1036();
    }

    @Override
    public spryua cfr_renamed_1003() {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_984();
        return spryoa2;
    }

    @Override
    public spri cfr_renamed_952() throws ArithmeticException {
        return this.cfr_renamed_1037();
    }

    public spryoa cfr_renamed_1041() {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_999();
        spryoa2.cfr_renamed_1036();
        return spryoa2;
    }

    public void cfr_renamed_1042() {
        int n;
        sprhua sprhua2 = new sprhua((int)this.cfr_renamed_3);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            spryoa spryoa2 = this;
            if (spryoa2.cfr_renamed_3.cfr_renamed_996(((sprcqa)spryoa2.cfr_renamed_4).cfr_renamed_1[this.cfr_renamed_3 - n - true])) {
                sprhua2.cfr_renamed_949(n);
            }
            n2 = ++n;
        }
        this.cfr_renamed_3 = sprhua2;
    }

    /*
     * WARNING - void declaration
     */
    public spryoa(spryoa spryoa2) {
        void arg0;
        spryoa spryoa3 = this;
        spryoa3.cfr_renamed_4 = arg0.cfr_renamed_4;
        spryoa3.cfr_renamed_3 = spryoa2.cfr_renamed_3;
        spryoa spryoa4 = this;
        spryoa3.cfr_renamed_3 = new sprhua(arg0.cfr_renamed_3);
    }

    public spryoa cfr_renamed_1043() {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_1042();
        spryoa2.cfr_renamed_1036();
        return spryoa2;
    }

    @Override
    public boolean cfr_renamed_1012(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_1012(arg0);
    }

    @Override
    public boolean cfr_renamed_1044() {
        return this.cfr_renamed_3.cfr_renamed_1012(0);
    }

    public static spryoa cfr_renamed_1022(sprcqa arg0) {
        int[] nArray = new int[1];
        nArray[0] = 1;
        sprhua sprhua2 = new sprhua(arg0.cfr_renamed_813(), nArray);
        return new spryoa(arg0, sprhua2);
    }

    @Override
    public String toString() {
        return this.cfr_renamed_3.cfr_renamed_957(16);
    }

    @Override
    public spryua cfr_renamed_1045() {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_1046();
        return spryoa2;
    }

    @Override
    public spri cfr_renamed_128(spri arg0) throws RuntimeException {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_951(arg0);
        return spryoa2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_992(SecureRandom secureRandom) {
        void arg0;
        spryoa spryoa2 = this;
        this.cfr_renamed_3.cfr_renamed_973((int)spryoa2.cfr_renamed_3);
        spryoa2.cfr_renamed_3.cfr_renamed_992((SecureRandom)arg0);
    }

    @Override
    public void cfr_renamed_1040() {
        this.cfr_renamed_999();
    }

    @Override
    public Object clone() {
        return new spryoa(this);
    }

    private /* synthetic */ spryoa cfr_renamed_1047() throws RuntimeException {
        int n;
        if ((this.cfr_renamed_3 & 1) == 0) {
            throw new RuntimeException();
        }
        spryoa spryoa2 = new spryoa(this);
        int n2 = n = 1;
        while (n2 <= this.cfr_renamed_3 - true >> 1) {
            spryoa spryoa3 = spryoa2;
            spryoa3.cfr_renamed_1040();
            spryoa3.cfr_renamed_1040();
            spryoa3.cfr_renamed_951(this);
            n2 = ++n;
        }
        return spryoa2;
    }

    @Override
    public spryua cfr_renamed_1048() {
        return this.cfr_renamed_1041();
    }

    public spryoa(sprcqa arg0, sprhua arg1) {
        spryoa spryoa2 = this;
        this.cfr_renamed_4 = (int[])arg0;
        this.cfr_renamed_3 = (sprhua)spryoa2.cfr_renamed_4.cfr_renamed_813();
        spryoa spryoa3 = this;
        this.cfr_renamed_3 = new sprhua(arg1);
        this.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_3);
    }

    public static spryoa cfr_renamed_1026(sprcqa arg0) {
        sprhua sprhua2 = new sprhua(arg0.cfr_renamed_813());
        return new spryoa(arg0, sprhua2);
    }

    /*
     * WARNING - void declaration
     */
    public spryoa(sprcqa sprcqa2, SecureRandom secureRandom) {
        void arg0;
        spryoa spryoa2 = this;
        spryoa2.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = (sprhua)spryoa2.cfr_renamed_4.cfr_renamed_813();
        spryoa spryoa3 = this;
        this.cfr_renamed_3 = new sprhua((int)this.cfr_renamed_3);
        this.cfr_renamed_992(secureRandom);
    }

    @Override
    public boolean cfr_renamed_287() {
        return this.cfr_renamed_3.cfr_renamed_287();
    }

    @Override
    public void cfr_renamed_1046() {
        int n;
        spryoa spryoa2 = this;
        this.cfr_renamed_3.cfr_renamed_973((int)((spryoa2.cfr_renamed_3 << 1) + 32));
        spryoa2.cfr_renamed_3.cfr_renamed_978();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_813() - 1) {
            this.cfr_renamed_1040();
            n2 = ++n;
        }
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + this.cfr_renamed_3.hashCode();
    }

    @Override
    public spryua cfr_renamed_1049() throws RuntimeException {
        spryoa spryoa2;
        spryoa spryoa3;
        if (this.cfr_renamed_805()) {
            return spryoa.cfr_renamed_1026((sprcqa)this.cfr_renamed_4);
        }
        if ((this.cfr_renamed_3 & 1) == 1) {
            return this.cfr_renamed_1047();
        }
        do {
            int n;
            spryoa spryoa4 = new spryoa((sprcqa)this.cfr_renamed_4, new SecureRandom());
            spryoa2 = spryoa.cfr_renamed_1026((sprcqa)this.cfr_renamed_4);
            spryoa3 = (spryoa)spryoa4.clone();
            int n2 = n = 1;
            while (n2 < this.cfr_renamed_3) {
                spryoa spryoa5 = spryoa3;
                spryoa2.cfr_renamed_1040();
                spryoa3.cfr_renamed_1040();
                spryoa2.cfr_renamed_951(spryoa5.cfr_renamed_955(this));
                spryoa5.cfr_renamed_951(spryoa4);
                n2 = ++n;
            }
        } while (spryoa3.cfr_renamed_805());
        if (!this.equals(spryoa2.cfr_renamed_1048().cfr_renamed_128(spryoa2))) {
            throw new RuntimeException();
        }
        return spryoa2;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof spryoa)) {
            return false;
        }
        spryoa spryoa2 = (spryoa)arg0;
        if (this.cfr_renamed_4 != spryoa2.cfr_renamed_4 && !this.cfr_renamed_4.cfr_renamed_1039().equals(spryoa2.cfr_renamed_4.cfr_renamed_1039())) {
            return false;
        }
        return this.cfr_renamed_3.equals(spryoa2.cfr_renamed_3);
    }

    public spryoa cfr_renamed_1050() throws ArithmeticException {
        int n;
        spryoa spryoa2;
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        int n2 = this.cfr_renamed_4.cfr_renamed_813() - 1;
        spryoa spryoa3 = spryoa2 = new spryoa(this);
        spryoa3.cfr_renamed_3.cfr_renamed_973((int)((this.cfr_renamed_3 << 1) + 32));
        spryoa3.cfr_renamed_3.cfr_renamed_978();
        int n3 = 1;
        int n4 = n = sprzma.cfr_renamed_921(n2) - 1;
        while (n4 >= 0) {
            int n5;
            spryoa spryoa4 = new spryoa(spryoa2);
            int n6 = n5 = 1;
            while (n6 <= n3) {
                spryoa4.cfr_renamed_999();
                n6 = ++n5;
            }
            spryoa2.cfr_renamed_135(spryoa4);
            n3 <<= 1;
            if ((n2 & cfr_renamed_4[n]) != 0) {
                spryoa spryoa5 = spryoa2;
                ++n3;
                spryoa5.cfr_renamed_999();
                spryoa5.cfr_renamed_135(this);
            }
            n4 = --n;
        }
        spryoa spryoa6 = spryoa2;
        spryoa6.cfr_renamed_999();
        return spryoa6;
    }

    @Override
    public spri cfr_renamed_955(spri arg0) throws RuntimeException {
        spryoa spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_135(arg0);
        return spryoa2;
    }

    public void cfr_renamed_999() {
        spryoa spryoa2 = this;
        spryoa2.cfr_renamed_3.cfr_renamed_999();
        spryoa2.cfr_renamed_1036();
    }

    @Override
    public int cfr_renamed_1051() {
        int n;
        spryoa spryoa2 = new spryoa(this);
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_3) {
            spryoa spryoa3 = spryoa2;
            spryoa3.cfr_renamed_1040();
            spryoa3.cfr_renamed_951(this);
            n2 = ++n;
        }
        if (spryoa2.cfr_renamed_287()) {
            return 1;
        }
        return 0;
    }

    public void cfr_renamed_1010() {
        spryoa spryoa2 = this;
        spryoa2.cfr_renamed_3.cfr_renamed_1010();
        spryoa2.cfr_renamed_1036();
    }

    public spryoa cfr_renamed_1052(int arg0) {
        int n;
        spryoa spryoa2;
        if (arg0 == 1) {
            return new spryoa(this);
        }
        spryoa spryoa3 = spryoa.cfr_renamed_1022((sprcqa)this.cfr_renamed_4);
        if (arg0 == 0) {
            return spryoa3;
        }
        spryoa spryoa4 = spryoa2 = new spryoa(this);
        spryoa2.cfr_renamed_3.cfr_renamed_973((int)((spryoa4.cfr_renamed_3 << 1) + 32));
        spryoa4.cfr_renamed_3.cfr_renamed_978();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            if ((arg0 & 1 << n) != 0) {
                spryoa3.cfr_renamed_135(spryoa2);
            }
            spryoa2.cfr_renamed_1048();
            n2 = ++n;
        }
        return spryoa3;
    }

    public spryoa(sprcqa arg0, byte[] arg1) {
        spryoa spryoa2 = this;
        this.cfr_renamed_4 = (int[])arg0;
        this.cfr_renamed_3 = (sprhua)spryoa2.cfr_renamed_4.cfr_renamed_813();
        spryoa spryoa3 = this;
        this.cfr_renamed_3 = new sprhua((int)this.cfr_renamed_3, arg1);
        this.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_3);
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

    public spryoa(sprcqa arg0, int[] arg1) {
        spryoa spryoa2 = this;
        this.cfr_renamed_4 = (int[])arg0;
        this.cfr_renamed_3 = (sprhua)spryoa2.cfr_renamed_4.cfr_renamed_813();
        spryoa spryoa3 = this;
        this.cfr_renamed_3 = new sprhua((int)this.cfr_renamed_3, arg1);
        this.cfr_renamed_3.cfr_renamed_973((int)arg0.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_1053(int arg0) {
        int n;
        spryoa spryoa2 = this;
        reference var3_2 = spryoa2.cfr_renamed_3 - arg0;
        int n2 = n = spryoa2.cfr_renamed_3.cfr_renamed_806() - 1;
        while (n2 >= this.cfr_renamed_3) {
            if (this.cfr_renamed_3.cfr_renamed_1012(n)) {
                spryoa spryoa3 = this;
                spryoa3.cfr_renamed_3.cfr_renamed_967(n);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - var3_2);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - this.cfr_renamed_3);
            }
            n2 = --n;
        }
        spryoa spryoa4 = this;
        spryoa4.cfr_renamed_3.cfr_renamed_978();
        spryoa4.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_3);
    }

    @Override
    public BigInteger cfr_renamed_953() {
        return this.cfr_renamed_3.cfr_renamed_953();
    }

    private /* synthetic */ void cfr_renamed_1054(int[] arg0) {
        int n;
        spryoa spryoa2 = this;
        reference var3_2 = spryoa2.cfr_renamed_3 - arg0[2];
        reference var4_3 = spryoa2.cfr_renamed_3 - arg0[1];
        reference var5_4 = spryoa2.cfr_renamed_3 - arg0[0];
        int n2 = n = spryoa2.cfr_renamed_3.cfr_renamed_806() - 1;
        while (n2 >= this.cfr_renamed_3) {
            if (this.cfr_renamed_3.cfr_renamed_1012(n)) {
                spryoa spryoa3 = this;
                spryoa3.cfr_renamed_3.cfr_renamed_967(n);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - var3_2);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - var4_3);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - var5_4);
                spryoa3.cfr_renamed_3.cfr_renamed_967(n - this.cfr_renamed_3);
            }
            n2 = --n;
        }
        spryoa spryoa4 = this;
        spryoa4.cfr_renamed_3.cfr_renamed_978();
        spryoa4.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_951(spri arg0) throws RuntimeException {
        if (!(arg0 instanceof spryoa)) {
            throw new RuntimeException();
        }
        if (!this.cfr_renamed_4.equals(((spryoa)arg0).cfr_renamed_4)) {
            throw new RuntimeException();
        }
        this.cfr_renamed_3.cfr_renamed_972(((spryoa)arg0).cfr_renamed_3);
    }

    public spryoa cfr_renamed_1055() throws ArithmeticException {
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        sprhua sprhua2 = new sprhua((int)(this.cfr_renamed_3 + 32), sprrgda.cfr_renamed_9("\nE\u0000"));
        sprhua2.cfr_renamed_978();
        sprhua sprhua3 = new sprhua((int)(this.cfr_renamed_3 + 32));
        spryoa spryoa2 = this;
        sprhua3.cfr_renamed_978();
        sprhua sprhua4 = spryoa2.cfr_renamed_1038();
        sprhua sprhua5 = spryoa2.cfr_renamed_4.cfr_renamed_1039();
        sprhua sprhua6 = sprhua4;
        sprhua sprhua7 = sprhua6;
        sprhua6.cfr_renamed_978();
        while (!sprhua7.cfr_renamed_287()) {
            sprhua sprhua8 = sprhua4;
            sprhua8.cfr_renamed_978();
            sprhua5.cfr_renamed_978();
            int n = sprhua8.cfr_renamed_806() - sprhua5.cfr_renamed_806();
            if (n < 0) {
                sprhua sprhua9 = sprhua4;
                sprhua4 = sprhua5;
                sprhua5 = sprhua9;
                sprhua sprhua10 = sprhua2;
                sprhua2 = sprhua3;
                sprhua3 = sprhua10;
                n = -n;
                sprhua3.cfr_renamed_978();
            }
            sprhua7 = sprhua4;
            sprhua4.cfr_renamed_804(sprhua5, n);
            sprhua2.cfr_renamed_804(sprhua3, n);
        }
        sprhua2.cfr_renamed_978();
        return new spryoa((sprcqa)this.cfr_renamed_4, sprhua2);
    }

    @Override
    public void cfr_renamed_987() {
        this.cfr_renamed_3.cfr_renamed_987();
    }

    @Override
    public String cfr_renamed_957(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_957(arg0);
    }

    @Override
    public void cfr_renamed_986() {
        this.cfr_renamed_3.cfr_renamed_986();
    }

    @Override
    public byte[] cfr_renamed_954() {
        return this.cfr_renamed_3.cfr_renamed_954();
    }

    @Override
    public boolean cfr_renamed_805() {
        return this.cfr_renamed_3.cfr_renamed_805();
    }

    @Override
    public void cfr_renamed_984() {
        this.cfr_renamed_3.cfr_renamed_984();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1036() {
        if (this.cfr_renamed_3.cfr_renamed_806() > this.cfr_renamed_3) {
            int[] nArray;
            if (((sprcqa)this.cfr_renamed_4).cfr_renamed_1024()) {
                int n;
                try {
                    n = ((sprcqa)this.cfr_renamed_4).cfr_renamed_1018();
                }
                catch (RuntimeException runtimeException) {
                    throw new RuntimeException(spraada.cfr_renamed_9("z\u0005\u000f-m,Q:S,P*\\/x/X.X-ImO&Y6^&\u0007cI+Xc[*X/YcM,Q:S,P*\\/\u001d*NcS,Ic\\cI1T-R.T\"Q"));
                }
                if (this.cfr_renamed_3 - n > 32 && this.cfr_renamed_3.cfr_renamed_806() <= this.cfr_renamed_3 << 1) {
                    spryoa spryoa2 = this;
                    spryoa2.cfr_renamed_3.cfr_renamed_1004((int)spryoa2.cfr_renamed_3, n);
                    return;
                }
                this.cfr_renamed_1053(n);
                return;
            }
            if (!((sprcqa)this.cfr_renamed_4).cfr_renamed_1017()) {
                spryoa spryoa3 = this;
                this.cfr_renamed_3 = spryoa3.cfr_renamed_3.cfr_renamed_998(this.cfr_renamed_4.cfr_renamed_1039());
                spryoa3.cfr_renamed_3.cfr_renamed_973((int)this.cfr_renamed_3);
                return;
            }
            try {
                nArray = ((sprcqa)this.cfr_renamed_4).cfr_renamed_1033();
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException(sprrgda.cfr_renamed_9("\u0002Mwe\u0015d)r+d(b$g\u0000g f e1%7n!~&n\u007f+1c +#b g!+5d)r+d(b$geb6++d1+$+5n+\u007f$e*f,j)"));
            }
            if (this.cfr_renamed_3 - nArray[2] > 32 && this.cfr_renamed_3.cfr_renamed_806() <= this.cfr_renamed_3 << 1) {
                spryoa spryoa4 = this;
                spryoa4.cfr_renamed_3.cfr_renamed_1005((int)spryoa4.cfr_renamed_3, nArray);
                return;
            }
            this.cfr_renamed_1054(nArray);
            return;
        }
        if (this.cfr_renamed_3.cfr_renamed_806() < this.cfr_renamed_3) {
            spryoa spryoa5 = this;
            spryoa5.cfr_renamed_3.cfr_renamed_973((int)spryoa5.cfr_renamed_3);
        }
    }

    private /* synthetic */ sprhua cfr_renamed_1038() {
        return new sprhua(this.cfr_renamed_3);
    }
}

