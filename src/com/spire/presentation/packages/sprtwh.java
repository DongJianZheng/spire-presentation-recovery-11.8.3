/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprejy;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhxh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnth;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprvsh;
import com.spire.presentation.packages.sprwph;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtwh
extends spriwh {
    public static final BigInteger cfr_renamed_1 = sprwph.cfr_renamed_119;
    private static final sprlsh[] cfr_renamed_2;
    public sprvsh cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

    @Override
    public sprgxh cfr_renamed_2001() {
        return new sprtwh();
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_9001(arg0, nArray);
        return new sprwph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_9000(arg0, nArray);
        return new sprwph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprwph(arg0);
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprwph(sprck.cfr_renamed_4);
        cfr_renamed_2 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprvsh(this, arg0, arg1, arg2);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 17 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprvih.cfr_renamed_8564(17, ((sprwph)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, nArray, n2);
            sprvih.cfr_renamed_8564(17, ((sprwph)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, nArray, n2 += 17);
            n3 = ++n;
            n2 += 17;
        }
        return new sprhxh(this, arg2, nArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 2: {
                return true;
            }
        }
        return false;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_1.bitLength();
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_1;
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    public sprtwh() {
        sprtwh sprtwh2 = this;
        sprtwh sprtwh3 = this;
        super(cfr_renamed_1);
        sprtwh3.cfr_renamed_3 = new sprvsh(this, null, null);
        sprtwh3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprboo.cfr_renamed_9("^i(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001b"))));
        sprtwh3.cfr_renamed_93 = sprtwh3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprejy.cfr_renamed_9("YG\\FPBZ2+N_FQ2X4P6X1PEP6[F(G+AQB]G,2(E-6^E\\5PN+DXB/D+O+CQNPFQ2/FYN,F\\AXNZN\\F,4^2PD^5XA\\E*G+3Z5+F+1Y@ZB^D-1QOZ3[4ZC/F,1]BX1-C_5\\GZ1YG"))));
        sprtwh3.cfr_renamed_4 = (int)new BigInteger(1, sprfqe.cfr_renamed_5217(sprboo.cfr_renamed_9("^i(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u001e(\u0019[iVnVoVk,\u001e\\\u001eWnX\u001aY\u001e-\u001b^iZ`(o^a/m*h]\u001a,m-a,`VaW\u001bZo/\u001d,\u001aX\u001e,o_\u001dWi]`Xl^a")));
        sprtwh2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprtwh2.cfr_renamed_152 = 2;
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprvsh(this, arg0, arg1);
    }
}

