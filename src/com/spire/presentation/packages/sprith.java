/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsh;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprcoa;
import com.spire.presentation.packages.sprcqh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriuh;
import com.spire.presentation.packages.spriwh;
import com.spire.presentation.packages.sprlrl;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprvyh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprith
extends spriwh {
    private static final int cfr_renamed_0 = 2;
    private static final sprlsh[] cfr_renamed_1;
    public spriuh cfr_renamed_2;
    public static final BigInteger cfr_renamed_3;

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
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
    public sprgxh cfr_renamed_2001() {
        return new sprith();
    }

    static {
        cfr_renamed_3 = sprvyh.cfr_renamed_119;
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprvyh(sprck.cfr_renamed_4);
        cfr_renamed_1 = sprlshArray;
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new spriuh(this, arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprlsh cfr_renamed_8942(SecureRandom arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_9001(arg0, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2 * 12 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprvih.cfr_renamed_8564(12, ((sprvyh)spreuh2.cfr_renamed_1953()).cfr_renamed_112, 0, nArray, n2);
            sprvih.cfr_renamed_8564(12, ((sprvyh)spreuh2.cfr_renamed_1954()).cfr_renamed_112, 0, nArray, n2 += 12);
            n3 = ++n;
            n2 += 12;
        }
        return new sprcqh(this, arg2, nArray);
    }

    public sprith() {
        sprith sprith2 = this;
        sprith sprith3 = this;
        super(cfr_renamed_3);
        sprith3.cfr_renamed_2 = new spriuh(this, null, null);
        sprith3.cfr_renamed_79 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprlrl.cfr_renamed_9("g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g8g;g;g;g;\u0011M\u0011M\u0011M\u0011M\u0011M\u0011M\u0011M\u0011Mg;g;g;g>"))));
        sprith3.cfr_renamed_93 = sprith3.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprcoa.cfr_renamed_9("?ONMO:<K8NN98K8HDDE9MIK>8O;DO8LELDL8D?K9;9EMIMLNMOLHMDE:HLLOEKH=>JHJNEE8E=O99MD8O=EI>D889O8?O=8:"))));
        sprith3.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprlrl.cfr_renamed_9("g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;g;bJ\u0017N\u00159\u0019LgI\u0012J\u00139e;\u0014E\u0010<\u00119cO\u0015EcM`J\u0016<d>d>\u0010D\u0017<b>bH\u0013D\u0016N")));
        sprith2.cfr_renamed_107 = BigInteger.valueOf(1L);
        sprith2.cfr_renamed_152 = 2;
    }

    @Override
    public sprlsh cfr_renamed_8924(SecureRandom arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_9000(arg0, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprvyh(arg0);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new spriuh(this, arg0, arg1);
    }

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_1;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }
}

