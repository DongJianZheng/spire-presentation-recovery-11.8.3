/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprled;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.spron;
import com.spire.presentation.packages.sprver;
import java.security.SecureRandom;

public class sprgtd
implements spron {
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprlc cfr_renamed_4;

    public sprgtd(int arg0) {
        this(arg0, null);
    }

    @Override
    public byte[] cfr_renamed_3250(byte[] arg0) {
        int n;
        sprled sprled2;
        sprgtd sprgtd2 = this;
        byte[] byArray = new byte[sprgtd2.cfr_renamed_2];
        byte[] byArray2 = new byte[sprgtd2.cfr_renamed_4.cfr_renamed_1218()];
        byte[] byArray3 = new byte[sprgtd2.cfr_renamed_2 - this.cfr_renamed_4.cfr_renamed_1218()];
        if (sprgtd2.cfr_renamed_3 == null) {
            sprgtd sprgtd3 = this;
            sprgtd3.cfr_renamed_3 = new SecureRandom();
        }
        this.cfr_renamed_3.nextBytes(byArray2);
        sprled sprled3 = sprled2 = new sprled(this.cfr_renamed_4);
        sprled3.cfr_renamed_2342(new sprchd(byArray2));
        sprled3.cfr_renamed_2341(byArray3, 0, byArray3.length);
        System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
        System.arraycopy(arg0, 0, byArray, byArray2.length, arg0.length);
        int n2 = n = byArray2.length + arg0.length + 1;
        while (n2 != byArray.length) {
            byArray[n++] = (byte)(1 + this.cfr_renamed_3.nextInt(255));
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
            sprled sprled2;
            sprgtd sprgtd2 = this;
            byArray = new byte[sprgtd2.cfr_renamed_4.cfr_renamed_1218()];
            byte[] byArray2 = new byte[sprgtd2.cfr_renamed_2 - this.cfr_renamed_4.cfr_renamed_1218()];
            System.arraycopy(arg0, 0, byArray, 0, byArray.length);
            sprled sprled3 = sprled2 = new sprled(this.cfr_renamed_4);
            sprled sprled4 = sprled2;
            sprled3.cfr_renamed_2342(new sprchd(byArray));
            sprled3.cfr_renamed_2341(byArray2, 0, byArray2.length);
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
            throw new IllegalStateException(sprver.cfr_renamed_9("2E4\u0004 E4@9J7\u00049JpA>G?@9J7"));
        }
        byte[] byArray3 = new byte[n2 - byArray.length];
        System.arraycopy(arg0, byArray.length, byArray3, 0, byArray3.length);
        return byArray3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgtd(int n, SecureRandom secureRandom) {
        void arg0;
        sprgtd sprgtd2 = this;
        sprgtd sprgtd3 = this;
        sprgtd3.cfr_renamed_4 = new sprlid();
        sprgtd2.cfr_renamed_2 = arg0;
        sprgtd2.cfr_renamed_3 = secureRandom;
    }
}

