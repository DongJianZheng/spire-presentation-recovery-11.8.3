/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgnk;
import com.spire.presentation.packages.sprgw;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprkll;
import com.spire.presentation.packages.sprkmk;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprxlk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprys;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprhpk
implements sprvm,
sprck {
    private sprqxk cfr_renamed_119;
    private spreuh cfr_renamed_91;
    private final sprgw cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private final sprys cfr_renamed_2;
    private sprmuk cfr_renamed_3;
    private final sprgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhpk(sprys sprys2, sprgf sprgf2) {
        void arg0;
        sprhpk sprhpk2 = this;
        sprhpk sprhpk3 = this;
        sprhpk3.cfr_renamed_0 = new sprxlk();
        sprhpk2.cfr_renamed_2 = arg0;
        sprhpk2.cfr_renamed_4 = sprgf2;
    }

    private /* synthetic */ byte[] cfr_renamed_9924() {
        sprhpk sprhpk2 = this;
        byte[] byArray = new byte[sprhpk2.cfr_renamed_4.cfr_renamed_1218()];
        sprhpk2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        this.cfr_renamed_41();
        return byArray;
    }

    public BigInteger cfr_renamed_3285(BigInteger arg0, byte[] arg1) {
        return new BigInteger(1, arg1);
    }

    private /* synthetic */ boolean cfr_renamed_9925(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = this.cfr_renamed_119.cfr_renamed_1146();
        if (arg0.compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || arg0.compareTo(bigInteger) >= 0) {
            return false;
        }
        if (arg1.compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || arg1.compareTo(bigInteger) >= 0) {
            return false;
        }
        sprhpk sprhpk2 = this;
        byte[] byArray = sprhpk2.cfr_renamed_9924();
        BigInteger bigInteger2 = sprhpk2.cfr_renamed_3285(bigInteger, byArray);
        BigInteger bigInteger3 = arg0.add(arg1).mod(bigInteger);
        if (bigInteger3.equals(cfr_renamed_0)) {
            return false;
        }
        spreuh spreuh2 = ((sprnzk)this.cfr_renamed_3).cfr_renamed_1604();
        spreuh spreuh3 = sprmvh.cfr_renamed_8958(this.cfr_renamed_119.cfr_renamed_1145(), arg1, spreuh2, bigInteger3).cfr_renamed_1775();
        if (spreuh3.cfr_renamed_1952()) {
            return false;
        }
        return bigInteger2.add(spreuh3.cfr_renamed_1969().cfr_renamed_1779()).mod(bigInteger).equals(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        sprhpk sprhpk2 = this;
        sprhpk2.cfr_renamed_4.cfr_renamed_41();
        if (sprhpk2.cfr_renamed_1 != null) {
            sprhpk sprhpk3 = this;
            sprhpk3.cfr_renamed_4.cfr_renamed_1197(sprhpk3.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        }
    }

    public sprhpk() {
        this(sprkmk.cfr_renamed_4, new sprkll());
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    public sprhpk(sprys sprys2) {
        sprhpk sprhpk2 = this;
        sprhpk sprhpk3 = this;
        sprhpk2.cfr_renamed_0 = new sprxlk();
        sprhpk2.cfr_renamed_2 = sprys2;
        sprhpk2.cfr_renamed_4 = new sprkll();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        try {
            sprhpk sprhpk2 = this;
            BigInteger[] bigIntegerArray = sprhpk2.cfr_renamed_2.cfr_renamed_9387(sprhpk2.cfr_renamed_119.cfr_renamed_1146(), arg0);
            return sprhpk2.cfr_renamed_9925(bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            return false;
        }
    }

    private /* synthetic */ void cfr_renamed_9926(sprgf arg0, sprlsh arg1) {
        byte[] byArray = arg1.cfr_renamed_91();
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1329() throws sprmml {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        sprhpk sprhpk2 = this;
        byte[] byArray = sprhpk2.cfr_renamed_9924();
        BigInteger bigInteger3 = sprhpk2.cfr_renamed_119.cfr_renamed_1146();
        BigInteger bigInteger4 = sprhpk2.cfr_renamed_3285(bigInteger3, byArray);
        BigInteger bigInteger5 = ((sprzuk)sprhpk2.cfr_renamed_3).cfr_renamed_2112();
        sprfe sprfe2 = this.cfr_renamed_3284();
        while (true) {
            BigInteger bigInteger6 = this.cfr_renamed_0.cfr_renamed_3208();
            Object object = sprfe2.cfr_renamed_8926(this.cfr_renamed_119.cfr_renamed_1145(), bigInteger6).cfr_renamed_1775();
            bigInteger2 = bigInteger4.add(((spreuh)object).cfr_renamed_1969().cfr_renamed_1779()).mod(bigInteger3);
            if (bigInteger2.equals(cfr_renamed_0) || bigInteger2.add(bigInteger6).equals(bigInteger3)) continue;
            object = sprhdf.cfr_renamed_5234(bigInteger3, bigInteger5.add((BigInteger)((Object)cfr_renamed_4)));
            bigInteger = bigInteger6.subtract(bigInteger2.multiply(bigInteger5)).mod(bigInteger3);
            if (!(bigInteger = ((BigInteger)object).multiply(bigInteger).mod(bigInteger3)).equals(cfr_renamed_0)) break;
        }
        try {
            sprhpk sprhpk3 = this;
            return sprhpk3.cfr_renamed_2.cfr_renamed_9388(sprhpk3.cfr_renamed_119.cfr_renamed_1146(), bigInteger2, bigInteger);
        }
        catch (Exception exception) {
            throw new sprmml(new StringBuilder().insert(0, sprjxl.cfr_renamed_9("\u0014m\u0000a\rfAw\u000e#\u0004m\u0002l\u0005fAp\bd\u000fb\u0015v\u0013f[#")).append(exception.getMessage()).toString(), exception);
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        byte[] byArray;
        sprbj sprbj2;
        if (arg1 instanceof sprgnk) {
            sprbj2 = ((sprgnk)arg1).cfr_renamed_284();
            byArray = ((sprgnk)arg1).cfr_renamed_6005();
            if (byArray.length >= 8192) {
                throw new IllegalArgumentException(sprraz.cfr_renamed_9("<o]\u0002\u001aQ\nPOk+\u0002\u0002W\u001cVO@\n\u0002\u0003G\u001cQOV\u0007C\u0001\u0002]|^\u0011O@\u0006V\u001c\u0002\u0003M\u0001E"));
            }
        } else {
            sprbj2 = arg1;
            byArray = sprfqe.cfr_renamed_5217(sprjxl.cfr_renamed_9("R2R1R0R7R6R5R4R;R2R1R0R7R6R5R4R;"));
        }
        if (arg0) {
            sprhpk sprhpk2;
            Object object;
            if (sprbj2 instanceof sprbgk) {
                object = (sprbgk)sprbj2;
                this.cfr_renamed_3 = (sprmuk)((sprbgk)object).cfr_renamed_284();
                sprhpk sprhpk3 = this;
                sprhpk2 = sprhpk3;
                sprhpk3.cfr_renamed_119 = sprhpk3.cfr_renamed_3.cfr_renamed_284();
                sprhpk3.cfr_renamed_0.cfr_renamed_3214(this.cfr_renamed_119.cfr_renamed_1146(), ((sprbgk)object).cfr_renamed_1295());
            } else {
                this.cfr_renamed_3 = (sprmuk)sprbj2;
                sprhpk sprhpk4 = this;
                sprhpk2 = sprhpk4;
                sprhpk4.cfr_renamed_119 = sprhpk4.cfr_renamed_3.cfr_renamed_284();
                sprhpk4.cfr_renamed_0.cfr_renamed_3214(this.cfr_renamed_119.cfr_renamed_1146(), sprybl.cfr_renamed_2794());
            }
            object = ((sprzuk)sprhpk2.cfr_renamed_3).cfr_renamed_2112();
            BigInteger bigInteger = this.cfr_renamed_119.cfr_renamed_1146().subtract(sprhdf.cfr_renamed_2);
            if (((BigInteger)object).compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || ((BigInteger)object).compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException(sprraz.cfr_renamed_9("<o]\u0002\u001fP\u0006T\u000eV\n\u0002\u0004G\u0016\u0002\u0000W\u001b\u0002\u0000DOP\u000eL\bG"));
            }
            this.cfr_renamed_91 = this.cfr_renamed_3284().cfr_renamed_8926(this.cfr_renamed_119.cfr_renamed_1145(), (BigInteger)object).cfr_renamed_1775();
        } else {
            this.cfr_renamed_3 = (sprmuk)sprbj2;
            sprhpk sprhpk5 = this;
            sprhpk5.cfr_renamed_119 = sprhpk5.cfr_renamed_3.cfr_renamed_284();
            sprhpk5.cfr_renamed_91 = ((sprnzk)sprhpk5.cfr_renamed_3).cfr_renamed_1604();
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9916(sprjxl.cfr_renamed_9("$@/Q"), this.cfr_renamed_3, arg0));
        sprhpk sprhpk6 = this;
        sprhpk6.cfr_renamed_1 = sprhpk6.cfr_renamed_9927(byArray);
        sprhpk6.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
    }

    private /* synthetic */ void cfr_renamed_9928(sprgf arg0, byte[] arg1) {
        int n = arg1.length * 8;
        sprgf sprgf2 = arg0;
        int n2 = n;
        arg0.cfr_renamed_1221((byte)(n2 >> 8 & 0xFF));
        sprgf2.cfr_renamed_1221((byte)(n2 & 0xFF));
        sprgf2.cfr_renamed_1197(arg1, 0, arg1.length);
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    private /* synthetic */ byte[] cfr_renamed_9927(byte[] arg0) {
        sprhpk sprhpk2 = this;
        sprhpk2.cfr_renamed_4.cfr_renamed_41();
        sprhpk2.cfr_renamed_9928(sprhpk2.cfr_renamed_4, arg0);
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_119.cfr_renamed_1769().cfr_renamed_1778());
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_119.cfr_renamed_1769().cfr_renamed_1997());
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_119.cfr_renamed_1145().cfr_renamed_1969());
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_119.cfr_renamed_1145().cfr_renamed_1973());
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_91.cfr_renamed_1969());
        sprhpk2.cfr_renamed_9926(sprhpk2.cfr_renamed_4, this.cfr_renamed_91.cfr_renamed_1973());
        byte[] byArray = new byte[sprhpk2.cfr_renamed_4.cfr_renamed_1218()];
        sprhpk2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public sprhpk(sprgf arg0) {
        this(sprkmk.cfr_renamed_4, arg0);
    }
}

