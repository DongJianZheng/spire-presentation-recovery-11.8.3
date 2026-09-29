/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprrcd;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.util.Hashtable;

public class sprzvc
implements sprta {
    private final sprh cfr_renamed_0;
    private final sprlc cfr_renamed_1;
    private static final Hashtable cfr_renamed_2 = new Hashtable();
    private final sprije cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1329() throws sprvmd, sprjkd {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprhno.cfr_renamed_9("&\u00165\u0001\u001d\"\u00116\u0000\u0016\u001d\"\u001a \u0006e\u001a*\u0000e\u001d+\u001d1\u001d$\u0018,\u0007 \u0010e\u0012*\u0006e\u0007,\u0013+\u00151\u00017\u0011e\u0013 \u001a \u0006$\u0000,\u001b+Z"));
        }
        sprzvc sprzvc2 = this;
        byte[] byArray = new byte[sprzvc2.cfr_renamed_1.cfr_renamed_1218()];
        sprzvc2.cfr_renamed_1.cfr_renamed_1219(byArray, 0);
        try {
            sprzvc sprzvc3 = this;
            byte[] byArray2 = sprzvc3.cfr_renamed_2481(byArray);
            return sprzvc3.cfr_renamed_0.cfr_renamed_1337(byArray2, 0, byArray2.length);
        }
        catch (IOException iOException) {
            throw new sprvmd(new StringBuilder().insert(0, sprywe.cfr_renamed_9(",=8156y'6s<=:<=6y 0472-&+6cs")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_1.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprhno.cfr_renamed_9("6\u001d\"\u001a,\u001a\"T7\u00114\u0001,\u0006 \u0007e\u00047\u001d3\u00151\u0011e\u001f \r"));
        }
        if (arg0 == false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprywe.cfr_renamed_9("/6+:?::2-:6=y!<\",:+6*s)&;?00y8<*"));
        }
        sprzvc sprzvc2 = this;
        sprzvc2.cfr_renamed_41();
        sprzvc2.cfr_renamed_0.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_1.cfr_renamed_1315()).append(sprhno.cfr_renamed_9("\u0003,\u0000-&\u00165")).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        int n;
        byte[] byArray;
        byte[] byArray2;
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprywe.cfr_renamed_9("\u000b\u0000\u0018\u001704< -\u00000476+s7<-s0=0'025:*6=s?<+s/6+:?::2-:6="));
        }
        sprzvc sprzvc2 = this;
        byte[] byArray3 = new byte[sprzvc2.cfr_renamed_1.cfr_renamed_1218()];
        sprzvc2.cfr_renamed_1.cfr_renamed_1219(byArray3, 0);
        try {
            byArray2 = this.cfr_renamed_0.cfr_renamed_1337(arg0, 0, arg0.length);
            byArray = this.cfr_renamed_2481(byArray3);
        }
        catch (Exception exception) {
            return false;
        }
        if (byArray2.length == byArray.length) {
            return sprzra.cfr_renamed_559(byArray2, byArray);
        }
        if (byArray2.length != byArray.length - 2) {
            return false;
        }
        int n2 = byArray2.length - byArray3.length - 2;
        int n3 = byArray.length - byArray3.length - 2;
        byte[] byArray4 = byArray;
        byte[] byArray5 = byArray;
        byArray4[1] = (byte)(byArray4[1] - 2);
        byArray5[3] = (byte)(byArray5[3] - 2);
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < byArray3.length) {
            byte by = byArray2[n2 + n];
            byte by2 = byArray[n3 + n];
            n4 |= by ^ by2;
            n5 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            byte by = byArray2[n];
            byte by3 = byArray[n];
            n4 |= by ^ by3;
            n6 = ++n;
        }
        return n4 == 0;
    }

    private /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        return new sprnje(this.cfr_renamed_3, arg0).cfr_renamed_104("DER");
    }

    /*
     * WARNING - void declaration
     */
    public sprzvc(sprlc sprlc2, sprtzd sprtzd2) {
        void arg1;
        sprzvc sprzvc2 = this;
        sprzvc sprzvc3 = this;
        sprzvc2.cfr_renamed_0 = new sprpmd(new sprrcd());
        sprzvc2.cfr_renamed_1 = sprlc2;
        sprzvc2.cfr_renamed_3 = new sprije((sprtzd)arg1, sprume.cfr_renamed_3);
    }

    public sprzvc(sprlc arg0) {
        sprlc sprlc2 = arg0;
        this(sprlc2, (sprtzd)cfr_renamed_2.get(sprlc2.cfr_renamed_1315()));
    }

    static {
        cfr_renamed_2.put(sprhno.cfr_renamed_9("&\f$\u00009\u0001EwL"), spryk.cfr_renamed_126);
        cfr_renamed_2.put("RIPEMD160", spryk.cfr_renamed_91);
        cfr_renamed_2.put(sprywe.cfr_renamed_9("\u0001\u0010\u0003\u001c\u001e\u001dale"), spryk.cfr_renamed_3);
        cfr_renamed_2.put("SHA-1", sprs.cfr_renamed_722);
        cfr_renamed_2.put("SHA-224", sprdg.spr\ufe34);
        cfr_renamed_2.put("SHA-256", sprdg.cfr_renamed_119);
        cfr_renamed_2.put("SHA-384", sprdg.cfr_renamed_112);
        cfr_renamed_2.put("SHA-512", sprdg.cfr_renamed_107);
        cfr_renamed_2.put(sprhno.cfr_renamed_9("'\r5hAtFjFw@"), sprdg.cfr_renamed_951);
        cfr_renamed_2.put("SHA-512/256", sprdg.cfr_renamed_126);
        cfr_renamed_2.put(sprywe.cfr_renamed_9("\u001e\u001da"), sprm.cfr_renamed_1575);
        cfr_renamed_2.put(sprhno.cfr_renamed_9("9\u0001@"), sprm.cfr_renamed_1479);
        cfr_renamed_2.put("MD5", sprm.cfr_renamed_102);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_1.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

