/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkbz;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprygk;
import java.math.BigInteger;

public class sprhnk
implements sprvm {
    private sprkik cfr_renamed_79;
    public static final int cfr_renamed_107 = 13516;
    public static final int cfr_renamed_132 = 14540;
    private sprwn cfr_renamed_102;
    private int cfr_renamed_93;
    public static final int cfr_renamed_86 = 14028;
    public static final int cfr_renamed_152 = 14284;
    private byte[] cfr_renamed_112;
    public static final int cfr_renamed_119 = 188;
    public static final int cfr_renamed_91 = 13004;
    private sprgf cfr_renamed_0;
    public static final int cfr_renamed_1 = 12748;
    private int cfr_renamed_2;
    public static final int cfr_renamed_3 = 13260;
    public static final int cfr_renamed_4 = 13772;

    public sprhnk(sprwn arg0, sprgf arg1) {
        this(arg0, arg1, false);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_0.cfr_renamed_41();
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_79 = (sprkik)arg1;
        sprhnk sprhnk2 = this;
        sprhnk sprhnk3 = this;
        sprhnk2.cfr_renamed_102.cfr_renamed_5535(arg0, sprhnk3.cfr_renamed_79);
        sprhnk2.cfr_renamed_2 = sprhnk3.cfr_renamed_79.cfr_renamed_2295().bitLength();
        sprhnk2.cfr_renamed_112 = new byte[(sprhnk2.cfr_renamed_2 + 7) / 8];
        sprhnk2.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        sprhnk sprhnk2;
        BigInteger bigInteger;
        try {
            this.cfr_renamed_112 = this.cfr_renamed_102.cfr_renamed_1337(arg0, 0, arg0.length);
        }
        catch (Exception exception) {
            return false;
        }
        BigInteger bigInteger2 = new BigInteger(1, this.cfr_renamed_112);
        if ((bigInteger2.intValue() & 0xF) == 12) {
            bigInteger = bigInteger2;
            sprhnk2 = this;
        } else {
            bigInteger2 = this.cfr_renamed_79.cfr_renamed_2295().subtract(bigInteger2);
            if ((bigInteger2.intValue() & 0xF) != 12) {
                return false;
            }
            bigInteger = bigInteger2;
            sprhnk2 = this;
        }
        sprhnk2.cfr_renamed_9912(this.cfr_renamed_93);
        byte[] byArray = sprhdf.cfr_renamed_512(this.cfr_renamed_112.length, bigInteger);
        sprhnk sprhnk3 = this;
        boolean bl = sproze.cfr_renamed_559(sprhnk3.cfr_renamed_112, byArray);
        if (sprhnk3.cfr_renamed_93 == 15052 && !bl) {
            sprhnk sprhnk4 = this;
            sprhnk4.cfr_renamed_112[sprhnk4.cfr_renamed_112.length - 2] = 64;
            bl = sproze.cfr_renamed_559(this.cfr_renamed_112, byArray);
        }
        sprhnk sprhnk5 = this;
        sprhnk5.cfr_renamed_3277(sprhnk5.cfr_renamed_112);
        this.cfr_renamed_3277(byArray);
        return bl;
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprmml {
        sprhnk sprhnk2 = this;
        sprhnk2.cfr_renamed_9912(sprhnk2.cfr_renamed_93);
        sprhnk sprhnk3 = this;
        BigInteger bigInteger = new BigInteger(1, sprhnk3.cfr_renamed_102.cfr_renamed_1337(sprhnk3.cfr_renamed_112, 0, this.cfr_renamed_112.length));
        sprhnk sprhnk4 = this;
        sprhnk4.cfr_renamed_3277(this.cfr_renamed_112);
        bigInteger = bigInteger.min(sprhnk4.cfr_renamed_79.cfr_renamed_2295().subtract(bigInteger));
        return sprhdf.cfr_renamed_512(sprhdf.cfr_renamed_5229(sprhnk4.cfr_renamed_79.cfr_renamed_2295()), bigInteger);
    }

    private /* synthetic */ void cfr_renamed_9912(int arg0) {
        int n;
        sprhnk sprhnk2;
        int n2;
        int n3 = this.cfr_renamed_0.cfr_renamed_1218();
        if (arg0 == 188) {
            n2 = this.cfr_renamed_112.length - n3 - 1;
            sprhnk sprhnk3 = this;
            this.cfr_renamed_0.cfr_renamed_1219(sprhnk3.cfr_renamed_112, n2);
            sprhnk3.cfr_renamed_112[this.cfr_renamed_112.length - 1] = -68;
            sprhnk2 = this;
        } else {
            n2 = this.cfr_renamed_112.length - n3 - 2;
            sprhnk sprhnk4 = this;
            this.cfr_renamed_0.cfr_renamed_1219(sprhnk4.cfr_renamed_112, n2);
            sprhnk4.cfr_renamed_112[this.cfr_renamed_112.length - 2] = (byte)(arg0 >>> 8);
            sprhnk sprhnk5 = this;
            sprhnk5.cfr_renamed_112[sprhnk5.cfr_renamed_112.length - 1] = (byte)arg0;
            sprhnk2 = this;
        }
        sprhnk2.cfr_renamed_112[0] = 107;
        int n4 = n = n2 - 2;
        while (n4 != 0) {
            this.cfr_renamed_112[n--] = -69;
            n4 = n;
        }
        this.cfr_renamed_112[n2 - 1] = -70;
    }

    /*
     * WARNING - void declaration
     */
    public sprhnk(sprwn sprwn2, sprgf sprgf2, boolean bl) {
        void arg1;
        void arg0;
        sprhnk sprhnk2 = this;
        sprhnk2.cfr_renamed_102 = arg0;
        sprhnk2.cfr_renamed_0 = arg1;
        if (bl) {
            this.cfr_renamed_93 = 188;
            return;
        }
        Integer n = sprygk.cfr_renamed_9913((sprgf)arg1);
        if (n != null) {
            this.cfr_renamed_93 = n;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkbz.cfr_renamed_9("mN#WbMjE#Uq@jMfS#GlS#EjFfRw\u001b#")).append(arg1.cfr_renamed_1315()).toString());
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_0.cfr_renamed_1221(arg0);
    }
}

