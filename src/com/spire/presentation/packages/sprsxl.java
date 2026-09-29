/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprep;
import com.spire.presentation.packages.sprgal;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjhk;
import com.spire.presentation.packages.sprwil;
import java.security.SecureRandom;

public class sprsxl
implements sprep {
    private int cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsxl(int n, SecureRandom secureRandom) {
        void arg0;
        sprsxl sprsxl2 = this;
        sprsxl sprsxl3 = this;
        sprsxl3.cfr_renamed_3 = new sprwil();
        sprsxl2.cfr_renamed_2 = arg0;
        sprsxl2.cfr_renamed_4 = secureRandom;
    }

    @Override
    public byte[] cfr_renamed_3250(byte[] arg0) {
        int n;
        sprgal sprgal2;
        sprsxl sprsxl2 = this;
        byte[] byArray = new byte[sprsxl2.cfr_renamed_2];
        byte[] byArray2 = new byte[sprsxl2.cfr_renamed_3.cfr_renamed_1218()];
        byte[] byArray3 = new byte[sprsxl2.cfr_renamed_2 - this.cfr_renamed_3.cfr_renamed_1218()];
        if (sprsxl2.cfr_renamed_4 == null) {
            sprsxl sprsxl3 = this;
            sprsxl3.cfr_renamed_4 = new SecureRandom();
        }
        this.cfr_renamed_4.nextBytes(byArray2);
        sprgal sprgal3 = sprgal2 = new sprgal(this.cfr_renamed_3);
        sprgal3.cfr_renamed_5671(new sprjhk(byArray2));
        sprgal3.cfr_renamed_2341(byArray3, 0, byArray3.length);
        System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
        System.arraycopy(arg0, 0, byArray, byArray2.length, arg0.length);
        int n2 = n = byArray2.length + arg0.length + 1;
        while (n2 != byArray.length) {
            byArray[n++] = (byte)(1 + this.cfr_renamed_4.nextInt(255));
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 != byArray3.length) {
            int n4 = n + byArray2.length;
            byte by = (byte)(byArray[n4] ^ byArray3[n]);
            byArray[n4] = by;
            n3 = ++n;
        }
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_4362(byte[] arg0) {
        int n;
        int n2;
        byte[] byArray;
        block4: {
            int n3;
            sprgal sprgal2;
            sprsxl sprsxl2 = this;
            byArray = new byte[sprsxl2.cfr_renamed_3.cfr_renamed_1218()];
            byte[] byArray2 = new byte[sprsxl2.cfr_renamed_2 - this.cfr_renamed_3.cfr_renamed_1218()];
            System.arraycopy(arg0, 0, byArray, 0, byArray.length);
            sprgal sprgal3 = sprgal2 = new sprgal(this.cfr_renamed_3);
            sprgal sprgal4 = sprgal2;
            sprgal3.cfr_renamed_5671(new sprjhk(byArray));
            sprgal3.cfr_renamed_2341(byArray2, 0, byArray2.length);
            n2 = 0;
            int n4 = n2;
            while (n4 != byArray2.length) {
                int n5 = n2 + byArray.length;
                byte by = (byte)(arg0[n5] ^ byArray2[n2]);
                arg0[n5] = by;
                n4 = ++n2;
            }
            n2 = 0;
            int n6 = n3 = arg0.length - 1;
            while (n6 != byArray.length) {
                if (arg0[n3] == 0) {
                    n = n2 = n3;
                    break block4;
                }
                n6 = --n3;
            }
            n = n2;
        }
        if (n == 0) {
            throw new IllegalStateException(sprdyg.cfr_renamed_9("\u0010Q\u0016\u0010\u0002Q\u0016T\u001b^\u0015\u0010\u001b^RU\u001cS\u001dT\u001b^\u0015"));
        }
        byte[] byArray3 = new byte[n2 - byArray.length];
        System.arraycopy(arg0, byArray.length, byArray3, 0, byArray3.length);
        return byArray3;
    }

    public sprsxl(int arg0) {
        this(arg0, null);
    }
}

