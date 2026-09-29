/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbl;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcaz;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgkl;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprkaz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.util.Hashtable;

public class sprfkk
implements sprvm {
    private final sprgf cfr_renamed_0;
    private final sprddm cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final Hashtable cfr_renamed_3 = new Hashtable();
    private final sprwn cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_0.cfr_renamed_41();
    }

    static {
        cfr_renamed_3.put(sprcaz.cfr_renamed_9("3R1^,_P)Y"), spris.cfr_renamed_91);
        cfr_renamed_3.put("RIPEMD160", spris.cfr_renamed_272);
        cfr_renamed_3.put(sprkaz.cfr_renamed_9("\u0006\u001a\u0004\u0016\u0019\u0017ffb"), spris.cfr_renamed_102);
        cfr_renamed_3.put("SHA-1", sprhl.cfr_renamed_2422);
        cfr_renamed_3.put("SHA-224", sprwr.cfr_renamed_957);
        cfr_renamed_3.put("SHA-256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA-384", sprwr.cfr_renamed_112);
        cfr_renamed_3.put("SHA-512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put(sprcaz.cfr_renamed_9("2S 6T*S4S)U"), sprwr.cfr_renamed_96);
        cfr_renamed_3.put("SHA-512/256", sprwr.cfr_renamed_499);
        cfr_renamed_3.put(sprkaz.cfr_renamed_9("\u0000\u001c\u0012g~fa`"), sprwr.cfr_renamed_93);
        cfr_renamed_3.put("SHA3-256", sprwr.cfr_renamed_129);
        cfr_renamed_3.put(sprcaz.cfr_renamed_9("H)ZR6R#U"), sprwr.cfr_renamed_131);
        cfr_renamed_3.put(sprkaz.cfr_renamed_9("\u0000\u001c\u0012g~abf"), sprwr.cfr_renamed_128);
        cfr_renamed_3.put(sprcaz.cfr_renamed_9(",_S"), sprdl.cfr_renamed_956);
        cfr_renamed_3.put(sprkaz.cfr_renamed_9("\u0019\u0017`"), sprdl.cfr_renamed_2094);
        cfr_renamed_3.put("MD5", sprdl.cfr_renamed_1540);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        void v0;
        spryye spryye2;
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprbj2 instanceof sprbgk) {
            spryye2 = (spryye)((sprbgk)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            spryye2 = (spryye)arg1;
            v0 = arg0;
        }
        if (v0 != false && !spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprcaz.cfr_renamed_9("h\b|\u000fr\u000f|Ai\u0004j\u0014r\u0013~\u0012;\u0011i\bm\u0000o\u0004;\n~\u0018"));
        }
        if (arg0 == false && spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprkaz.cfr_renamed_9("%1!=5=05'=<:s&6%&=!1 t#!18:7s?6-"));
        }
        sprfkk sprfkk2 = this;
        sprfkk2.cfr_renamed_41();
        sprfkk2.cfr_renamed_4.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
    }

    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprcaz.cfr_renamed_9("\u0016r\u0015s3H ")).toString();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_0.cfr_renamed_1221(arg0);
    }

    public sprfkk(sprgf arg0) {
        sprgf sprgf2 = arg0;
        this(sprgf2, (sprlem)cfr_renamed_3.get(sprgf2.cfr_renamed_1315()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1329() throws sprmml, sprddl {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprkaz.cfr_renamed_9("\u0006 5\u0017=41  \u0000=4:6&s:< s==='=28:'60s2<&s':3=5'!!1s36:6&2 :;=z"));
        }
        sprfkk sprfkk2 = this;
        byte[] byArray = new byte[sprfkk2.cfr_renamed_0.cfr_renamed_1218()];
        sprfkk2.cfr_renamed_0.cfr_renamed_1219(byArray, 0);
        try {
            sprfkk sprfkk3 = this;
            byte[] byArray2 = sprfkk3.cfr_renamed_2481(byArray);
            return sprfkk3.cfr_renamed_4.cfr_renamed_1337(byArray2, 0, byArray2.length);
        }
        catch (IOException iOException) {
            throw new sprmml(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("n\u000fz\u0003w\u0004;\u0015tA~\u000fx\u000e\u007f\u0004;\u0012r\u0006u\u0000o\u0014i\u0004!A")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
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
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprkaz.cfr_renamed_9("\u0001'2\u0010:36''\u0007:3=1!t=;'t::: :5?= 17t5;!t%1!=5=05'=<:"));
        }
        sprfkk sprfkk2 = this;
        byte[] byArray3 = new byte[sprfkk2.cfr_renamed_0.cfr_renamed_1218()];
        sprfkk2.cfr_renamed_0.cfr_renamed_1219(byArray3, 0);
        try {
            byArray2 = this.cfr_renamed_4.cfr_renamed_1337(arg0, 0, arg0.length);
            byArray = this.cfr_renamed_2481(byArray3);
        }
        catch (Exception exception) {
            return false;
        }
        if (byArray2.length == byArray.length) {
            return sproze.cfr_renamed_559(byArray2, byArray);
        }
        if (byArray2.length != byArray.length - 2) {
            sproze.cfr_renamed_559(byArray, byArray);
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

    /*
     * WARNING - void declaration
     */
    public sprfkk(sprgf sprgf2, sprlem sprlem2) {
        void arg0;
        sprfkk sprfkk2 = this;
        this.cfr_renamed_4 = new sprgkl(new sprbbl());
        this.cfr_renamed_0 = arg0;
        if (sprlem2 != null) {
            void arg1;
            this.cfr_renamed_1 = new sprddm((sprlem)arg1, sprpen.cfr_renamed_4);
            return;
        }
        this.cfr_renamed_1 = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        if (this.cfr_renamed_1 != null) {
            sprdim sprdim2 = new sprdim(this.cfr_renamed_1, arg0);
            return sprdim2.cfr_renamed_104("DER");
        }
        try {
            sprdim.cfr_renamed_23(arg0);
            return arg0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\fz\r}\u000ei\f~\u0005;%r\u0006~\u0012o(u\u0007tA}\u000eiAU.U$l\bo\tI2ZAs\u0000h\t!A")).append(illegalArgumentException.getMessage()).toString());
        }
    }
}

