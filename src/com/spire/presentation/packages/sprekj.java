/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.spretc;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.sprzfi;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class sprekj
implements ECPublicKey,
sprxz,
sprjq {
    private transient sprxum cfr_renamed_91;
    private transient sprnzk cfr_renamed_0;
    private String cfr_renamed_1;
    private boolean cfr_renamed_2;
    public static final long cfr_renamed_3 = 7026240464295649314L;
    private transient ECParameterSpec cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprekj(String string, sprnzk sprnzk2, sprrxh sprrxh2) {
        void arg2;
        void arg1;
        void arg0;
        sprekj sprekj2 = this;
        sprekj2.cfr_renamed_1 = "ECGOST3410-2012";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprekj2.cfr_renamed_1 = arg0;
        sprekj2.cfr_renamed_0 = arg1;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_4 = this.cfr_renamed_9151(ellipticCurve, sprqxk2);
            return;
        }
        EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_4 = sprnlj.cfr_renamed_9153(ellipticCurve, (sprrxh)arg2);
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_4 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_4);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    private /* synthetic */ void cfr_renamed_9436(byte[] arg0, int arg1, int arg2, BigInteger arg3) {
        int n;
        byte[] byArray = arg3.toByteArray();
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != arg1) {
            int n3 = arg2 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprekj)) {
            return false;
        }
        sprekj sprekj2 = (sprekj)arg0;
        return this.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_8927(sprekj2.cfr_renamed_0.cfr_renamed_1604()) && this.cfr_renamed_2308().equals(sprekj2.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(String string, sprnzk sprnzk2) {
        void arg1;
        void arg0;
        sprekj sprekj2 = this;
        sprekj sprekj3 = this;
        sprekj3.cfr_renamed_1 = "ECGOST3410-2012";
        sprekj3.cfr_renamed_1 = arg0;
        sprekj2.cfr_renamed_0 = arg1;
        sprekj2.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(ECPublicKeySpec eCPublicKeySpec) {
        void arg0;
        sprekj sprekj2 = this;
        sprekj2.cfr_renamed_1 = "ECGOST3410-2012";
        sprekj2.cfr_renamed_4 = eCPublicKeySpec.getParams();
        sprekj sprekj3 = this;
        sprekj2.cfr_renamed_0 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_4, arg0.getW()), sprnlj.cfr_renamed_9383(null, arg0.getParams()));
    }

    public String toString() {
        sprekj sprekj2 = this;
        return sprqpj.cfr_renamed_9376(sprekj2.cfr_renamed_1, sprekj2.cfr_renamed_0.cfr_renamed_1604(), this.cfr_renamed_2308());
    }

    @Override
    public spreuh cfr_renamed_1604() {
        if (this.cfr_renamed_4 == null) {
            return this.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1976();
        }
        return this.cfr_renamed_0.cfr_renamed_1604();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public byte[] getEncoded() {
        v0 = this;
        var3_1 = v0.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779();
        var4_2 = v0.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779();
        var5_3 = var3_1.bitLength() > 256;
        var1_4 /* !! */  = this.cfr_renamed_2495();
        if (var1_4 /* !! */  != null) ** GOTO lbl21
        if (this.cfr_renamed_4 instanceof sprxvh) {
            if (var5_3) {
                var1_4 /* !! */  = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprdt.cfr_renamed_3);
                v1 = var5_3;
            } else {
                var1_4 /* !! */  = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprdt.cfr_renamed_4);
                v1 = var5_3;
            }
        } else {
            v2 = var6_5 = sprnlj.cfr_renamed_2323(this.cfr_renamed_4.getCurve());
            v3 = var6_5;
            var7_7 = new sprhfm(v3, new sprfim(sprnlj.cfr_renamed_9154(v3, this.cfr_renamed_4.getGenerator()), this.cfr_renamed_2), this.cfr_renamed_4.getOrder(), BigInteger.valueOf(this.cfr_renamed_4.getCofactor()), this.cfr_renamed_4.getCurve().getSeed());
            var1_4 /* !! */  = new sprcgm(var7_7);
lbl21:
            // 2 sources

            v1 = var5_3;
        }
        if (v1) {
            var6_6 = 128;
            var7_8 = 64;
            var8_9 = sprdt.cfr_renamed_91;
            v4 = var6_6;
        } else {
            var6_6 = 64;
            var7_8 = 32;
            var8_9 = sprdt.cfr_renamed_96;
            v4 = var6_6;
        }
        var9_10 = new byte[v4];
        v5 = this;
        v5.cfr_renamed_9436(var9_10, var6_6 / 2, 0, var3_1);
        v5.cfr_renamed_9436(var9_10, var6_6 / 2, var7_8, var4_2);
        try {
            var2_11 = new sprvhm(new sprddm(var8_9, var1_4 /* !! */ ), new sprfvg(var9_10));
        }
        catch (IOException var10_12) {
            return null;
        }
        return sprjij.cfr_renamed_5675(var2_11);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9151(EllipticCurve arg0, sprqxk arg1) {
        return new ECParameterSpec(arg0, sprnlj.cfr_renamed_9053(arg1.cfr_renamed_1145()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_4);
    }

    @Override
    public String getFormat() {
        return sprqvn.cfr_renamed_9("M  >,");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
    }

    public int hashCode() {
        return this.cfr_renamed_0.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(sprnsh sprnsh2, sprqw sprqw2) {
        void arg1;
        void arg0;
        this.cfr_renamed_1 = "ECGOST3410-2012";
        if (sprnsh2.cfr_renamed_2110() != null) {
            sprgxh sprgxh2 = arg0.cfr_renamed_2110().cfr_renamed_1769();
            sprekj sprekj2 = this;
            sprekj sprekj3 = this;
            sprekj2.cfr_renamed_0 = new sprnzk(arg0.cfr_renamed_1604(), sprqpj.cfr_renamed_9378((sprqw)arg1, arg0.cfr_renamed_2110()));
            sprekj2.cfr_renamed_4 = sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprgxh2, arg0.cfr_renamed_2110().cfr_renamed_2113()), arg0.cfr_renamed_2110());
            return;
        }
        sprrxh sprrxh2 = arg1.cfr_renamed_2312();
        this.cfr_renamed_0 = new sprnzk(sprrxh2.cfr_renamed_1769().cfr_renamed_1996(arg0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779()), sprnlj.cfr_renamed_9383((sprqw)arg1, null));
        this.cfr_renamed_4 = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprxum cfr_renamed_2495() {
        sprekj sprekj2;
        if (this.cfr_renamed_91 == null && this.cfr_renamed_4 instanceof sprxvh) {
            boolean bl;
            boolean bl2 = bl = this.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779().bitLength() > 256;
            if (bl) {
                sprekj sprekj3 = this;
                this.cfr_renamed_91 = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprdt.cfr_renamed_3);
                sprekj2 = this;
                return sprekj2.cfr_renamed_91;
            }
            this.cfr_renamed_91 = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprdt.cfr_renamed_4);
        }
        sprekj2 = this;
        return sprekj2.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(ECPublicKey eCPublicKey) {
        void arg0;
        sprekj sprekj2 = this;
        this.cfr_renamed_1 = "ECGOST3410-2012";
        sprekj2.cfr_renamed_1 = arg0.getAlgorithm();
        sprekj2.cfr_renamed_4 = eCPublicKey.getParams();
        sprekj sprekj3 = this;
        sprekj2.cfr_renamed_0 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_4, arg0.getW()), sprnlj.cfr_renamed_9383(null, arg0.getParams()));
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(String string, sprnzk sprnzk2, ECParameterSpec eCParameterSpec) {
        void arg2;
        Object object;
        void arg1;
        void arg0;
        sprekj sprekj2 = this;
        sprekj2.cfr_renamed_1 = "ECGOST3410-2012";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprekj2.cfr_renamed_1 = arg0;
        sprekj2.cfr_renamed_0 = arg1;
        if (sprqxk2 instanceof sprbuk) {
            object = (sprbuk)sprqxk2;
            sprekj sprekj3 = this;
            sprekj3.cfr_renamed_91 = new sprxum(((sprbuk)object).cfr_renamed_2106(), ((sprbuk)object).cfr_renamed_2107(), ((sprbuk)object).cfr_renamed_2105());
        }
        if (arg2 == null) {
            object = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_4 = this.cfr_renamed_9151((EllipticCurve)object, sprqxk2);
            return;
        }
        this.cfr_renamed_4 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprekj(sprekj sprekj2) {
        void arg0;
        sprekj sprekj3 = this;
        void v1 = arg0;
        sprekj sprekj4 = this;
        sprekj4.cfr_renamed_1 = "ECGOST3410-2012";
        sprekj4.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprekj3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprekj3.cfr_renamed_91 = sprekj2.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        int n;
        sproug sproug2;
        sprvhm sprvhm2 = arg0;
        sprlem sprlem2 = sprvhm2.cfr_renamed_593().cfr_renamed_593();
        sprgbf sprgbf2 = sprvhm2.cfr_renamed_2314();
        this.cfr_renamed_1 = "ECGOST3410-2012";
        try {
            sproug2 = (sproug)sprxgf.cfr_renamed_184(sprgbf2.cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(spretc.cfr_renamed_9("\u0006k\u0011v\u00119\u0011|\u0000v\u0015|\u0011p\r~Ci\u0016{\u000fp\u00009\b|\u001a"));
        }
        byte[] byArray = sproug2.cfr_renamed_186();
        int n2 = 32;
        if (sprlem2.cfr_renamed_5078(sprdt.cfr_renamed_91)) {
            n2 = 64;
        }
        int n3 = 2 * n2;
        byte[] byArray2 = new byte[1 + n3];
        byArray2[0] = 4;
        int n4 = n = 1;
        while (true) {
            if (n4 > n2) {
                this.cfr_renamed_91 = sprxum.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
                spreph spreph2 = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(this.cfr_renamed_91.cfr_renamed_2106()));
                sprgxh sprgxh2 = spreph2.cfr_renamed_1769();
                EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, spreph2.cfr_renamed_2113());
                sprekj sprekj2 = this;
                sprekj2.cfr_renamed_0 = new sprnzk(sprgxh2.cfr_renamed_2002(byArray2), sprqpj.cfr_renamed_9378(null, spreph2));
                this.cfr_renamed_4 = new sprxvh(spralm.cfr_renamed_7555(this.cfr_renamed_91.cfr_renamed_2106()), ellipticCurve, sprnlj.cfr_renamed_9053(spreph2.cfr_renamed_1145()), spreph2.cfr_renamed_1146(), spreph2.cfr_renamed_1153());
                return;
            }
            int n5 = n;
            byArray2[n5] = byArray[n2 - n5];
            int n6 = n + n2;
            byte by = byArray[n3 - n];
            byArray2[n6] = by;
            n4 = ++n;
        }
    }

    public sprekj(sprvhm sprvhm2) {
        this.cfr_renamed_1 = "ECGOST3410-2012";
        this.cfr_renamed_9152(sprvhm2);
    }

    public sprnzk cfr_renamed_9389() {
        return this.cfr_renamed_0;
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_2 = !sprqvn.cfr_renamed_9("[[MZCE\\P]FKQ").equalsIgnoreCase(arg0);
    }

    @Override
    public ECPoint getW() {
        return sprnlj.cfr_renamed_9053(this.cfr_renamed_0.cfr_renamed_1604());
    }
}

