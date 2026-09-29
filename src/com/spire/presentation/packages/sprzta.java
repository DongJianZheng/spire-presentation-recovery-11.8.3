/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprtoba;
import com.spire.presentation.packages.sprula;
import com.spire.presentation.packages.sprytp;

public class sprzta
extends sprula {
    private int[] cfr_renamed_3;
    private sprmpa cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzta(sprmpa sprmpa2, int[] nArray) {
        void arg1;
        int n;
        void arg0;
        sprzta sprzta2 = this;
        sprzta2.cfr_renamed_4 = arg0;
        sprzta2.cfr_renamed_4 = (sprmpa)nArray.length;
        int n2 = n = ((void)arg1).length - 1;
        while (n2 >= 0) {
            if (!arg0.cfr_renamed_839((int)arg1[n])) {
                throw new ArithmeticException(sprytp.cfr_renamed_9("8\\\u0018]\u0018^\t\u0010\u001cB\u000fQ\u0004\u0010\u0014C]^\u0012D]C\rU\u001eY\u001bY\u0018T]_\u000bU\u000f\u0010\tX\u0018\u0010\u001aY\u000bU\u0013\u0010\u001bY\u0013Y\tU]V\u0014U\u0011TS"));
            }
            n2 = --n;
        }
        this.cfr_renamed_3 = sprhva.cfr_renamed_535((int[])arg1);
    }

    @Override
    public int hashCode() {
        int n = this.cfr_renamed_4.hashCode();
        n = n * 31 + this.cfr_renamed_3.hashCode();
        return n;
    }

    @Override
    public sprula cfr_renamed_807(sprkqa arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (this.cfr_renamed_4 != nArray.length) {
            throw new ArithmeticException(sprtoba.cfr_renamed_9("$j&b!{5{=`:/'f.jtn:kty1l `&/'f.jtb=|9n l<"));
        }
        int[] nArray2 = new int[this.cfr_renamed_4];
        int n2 = n = 0;
        while (n2 < nArray.length) {
            int n3 = n++;
            nArray2[n3] = this.cfr_renamed_3[nArray[n3]];
            n2 = n;
        }
        return new sprzta(this.cfr_renamed_4, nArray2);
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzta)) {
            return false;
        }
        sprzta sprzta2 = (sprzta)arg0;
        if (!this.cfr_renamed_4.equals(sprzta2.cfr_renamed_4)) {
            return false;
        }
        return sprhva.cfr_renamed_874(this.cfr_renamed_3, sprzta2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprzta(sprmpa sprmpa2, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        sprmpa sprmpa3 = sprmpa2;
        sprzta sprzta2 = this;
        sprzta2.cfr_renamed_4 = new sprmpa((sprmpa)arg0);
        int n2 = 8;
        int n3 = 1;
        while (sprmpa3.cfr_renamed_813() > n2) {
            n2 += 8;
            sprmpa3 = arg0;
            ++n3;
        }
        if (((void)arg1).length % n3 != 0) {
            throw new IllegalArgumentException(sprytp.cfr_renamed_9("r\u0004D\u0018\u0010\u001cB\u000fQ\u0004\u0010\u0014C]^\u0012D]Q\u0013\u0010\u0018^\u001e_\u0019U\u0019\u0010\u000bU\u001eD\u0012B]_\u000bU\u000f\u0010\tX\u0018\u0010\u001aY\u000bU\u0013\u0010\u001bY\u0013Y\tU]V\u0014U\u0011TS"));
        }
        this.cfr_renamed_4 = (sprmpa)(((void)arg1).length / n3);
        this.cfr_renamed_3 = new int[this.cfr_renamed_4];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n;
                int n8 = arg1[n3] & 0xFF;
                ++n3;
                int n9 = this.cfr_renamed_3[n7] | n8 << n5;
                this.cfr_renamed_3[n7] = n9;
                n6 = n5 += 8;
            }
            if (!arg0.cfr_renamed_839(this.cfr_renamed_3[n])) {
                throw new IllegalArgumentException(sprtoba.cfr_renamed_9("M-{1/5}&n-/=|ta;{tn:/1a7`0j0/\"j7{;}t`\"j&/ g1/3f\"j:/2f:f jti=j8kz"));
            }
            n4 = ++n;
        }
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = this.cfr_renamed_3.length - 1;
        while (n2 >= 0) {
            if (this.cfr_renamed_3[n] != 0) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        sprzta sprzta2 = this;
        while (sprzta2.cfr_renamed_4.cfr_renamed_813() > n2) {
            n2 += 8;
            sprzta2 = this;
            ++n3;
        }
        byte[] byArray = new byte[this.cfr_renamed_3.length * n3];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n3++;
                byte by = (byte)(this.cfr_renamed_3[n] >>> n5);
                byArray[n7] = by;
                n6 = n5 += 8;
            }
            n4 = ++n;
        }
        return byArray;
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_4;
    }

    @Override
    public String toString() {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_4.cfr_renamed_813()) {
                int n5 = n3 & 0x1F;
                int n6 = 1 << n5;
                if ((this.cfr_renamed_3[n] & n6) != 0) {
                    stringBuffer.append('1');
                } else {
                    stringBuffer.append('0');
                }
                n4 = ++n3;
            }
            stringBuffer.append(' ');
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public int[] cfr_renamed_846() {
        return sprhva.cfr_renamed_535(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprzta(sprzta sprzta2) {
        void arg0;
        sprzta sprzta3 = this;
        sprzta sprzta4 = this;
        sprzta4.cfr_renamed_4 = new sprmpa(arg0.cfr_renamed_4);
        sprzta3.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprzta3.cfr_renamed_3 = sprhva.cfr_renamed_535(sprzta2.cfr_renamed_3);
    }

    @Override
    public sprula cfr_renamed_804(sprula arg0) {
        throw new RuntimeException(sprytp.cfr_renamed_9("\u0013_\t\u0010\u0014]\r\\\u0018]\u0018^\tU\u0019"));
    }
}

