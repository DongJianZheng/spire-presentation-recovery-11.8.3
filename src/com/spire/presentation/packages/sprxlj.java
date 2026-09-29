/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
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
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpaz;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqpj;
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

public class sprxlj
implements ECPublicKey,
sprxz,
sprjq {
    public static final long cfr_renamed_91 = 7026240464295649314L;
    private transient sprnzk cfr_renamed_0;
    private transient sprco cfr_renamed_1;
    private String cfr_renamed_2;
    private boolean cfr_renamed_3;
    private transient ECParameterSpec cfr_renamed_4;

    public sprco cfr_renamed_2495() {
        if (this.cfr_renamed_1 == null && this.cfr_renamed_4 instanceof sprxvh) {
            sprxlj sprxlj2 = this;
            this.cfr_renamed_1 = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprqo.cfr_renamed_133);
        }
        return this.cfr_renamed_1;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_4);
    }

    @Override
    public ECPoint getW() {
        return sprnlj.cfr_renamed_9053(this.cfr_renamed_0.cfr_renamed_1604());
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(String string, sprnzk sprnzk2) {
        void arg1;
        void arg0;
        sprxlj sprxlj2 = this;
        sprxlj sprxlj3 = this;
        sprxlj3.cfr_renamed_2 = "ECGOST3410";
        sprxlj3.cfr_renamed_2 = arg0;
        sprxlj2.cfr_renamed_0 = arg1;
        sprxlj2.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(ECPublicKeySpec eCPublicKeySpec) {
        void arg0;
        sprxlj sprxlj2 = this;
        sprxlj2.cfr_renamed_2 = "ECGOST3410";
        sprxlj2.cfr_renamed_4 = eCPublicKeySpec.getParams();
        sprxlj sprxlj3 = this;
        sprxlj2.cfr_renamed_0 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_4, arg0.getW()), sprnlj.cfr_renamed_9383(null, arg0.getParams()));
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprxlj)) {
            return false;
        }
        sprxlj sprxlj2 = (sprxlj)arg0;
        return this.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_8927(sprxlj2.cfr_renamed_0.cfr_renamed_1604()) && this.cfr_renamed_2308().equals(sprxlj2.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(sprxlj sprxlj2) {
        void arg0;
        sprxlj sprxlj3 = this;
        void v1 = arg0;
        sprxlj sprxlj4 = this;
        sprxlj4.cfr_renamed_2 = "ECGOST3410";
        sprxlj4.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprxlj3.cfr_renamed_3 = v1.cfr_renamed_3;
        sprxlj3.cfr_renamed_1 = sprxlj2.cfr_renamed_1;
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9151(EllipticCurve arg0, sprqxk arg1) {
        return new ECParameterSpec(arg0, sprnlj.cfr_renamed_9053(arg1.cfr_renamed_1145()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    public String toString() {
        sprxlj sprxlj2 = this;
        return sprqpj.cfr_renamed_9376(sprxlj2.cfr_renamed_2, sprxlj2.cfr_renamed_0.cfr_renamed_1604(), this.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(String string, sprnzk sprnzk2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        Object object;
        this.cfr_renamed_2 = "ECGOST3410";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        if (sprqxk2 instanceof sprbuk) {
            object = (sprbuk)sprqxk2;
            sprxlj sprxlj2 = this;
            sprxlj2.cfr_renamed_1 = new sprxum(((sprbuk)object).cfr_renamed_2106(), ((sprbuk)object).cfr_renamed_2107(), ((sprbuk)object).cfr_renamed_2105());
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_0 = arg1;
        if (arg2 == null) {
            object = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_4 = this.cfr_renamed_9151((EllipticCurve)object, sprqxk2);
            return;
        }
        this.cfr_renamed_4 = arg2;
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_2;
    }

    public sprnzk cfr_renamed_9389() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_2325(byte[] arg0, int arg1, BigInteger arg2) {
        int n;
        byte[] byArray = arg2.toByteArray();
        if (byArray.length < 32) {
            byte[] byArray2 = new byte[32];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != 32) {
            int n3 = arg1 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(ECPublicKey eCPublicKey) {
        void arg0;
        sprxlj sprxlj2 = this;
        this.cfr_renamed_2 = "ECGOST3410";
        sprxlj2.cfr_renamed_2 = arg0.getAlgorithm();
        sprxlj2.cfr_renamed_4 = eCPublicKey.getParams();
        sprxlj sprxlj3 = this;
        sprxlj2.cfr_renamed_0 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_4, arg0.getW()), sprnlj.cfr_renamed_9383(null, arg0.getParams()));
    }

    @Override
    public spreuh cfr_renamed_1604() {
        if (this.cfr_renamed_4 == null) {
            return this.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1976();
        }
        return this.cfr_renamed_0.cfr_renamed_1604();
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        var1_1 = this.cfr_renamed_2495();
        if (var1_1 != null) ** GOTO lbl13
        if (this.cfr_renamed_4 instanceof sprxvh) {
            var1_1 = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_4).cfr_renamed_313()), sprqo.cfr_renamed_133);
            v0 = this;
        } else {
            v1 = var3_2 = sprnlj.cfr_renamed_2323(this.cfr_renamed_4.getCurve());
            v2 = var3_2;
            var4_3 = new sprhfm((sprgxh)v2, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)v2, this.cfr_renamed_4.getGenerator()), this.cfr_renamed_3), this.cfr_renamed_4.getOrder(), BigInteger.valueOf(this.cfr_renamed_4.getCofactor()), this.cfr_renamed_4.getCurve().getSeed());
            var1_1 = new sprcgm((sprhfm)var4_3);
lbl13:
            // 2 sources

            v0 = this;
        }
        var3_2 = v0.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779();
        v3 = this;
        var4_3 = v3.cfr_renamed_0.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779();
        var5_4 = new byte[64];
        v3.cfr_renamed_2325(var5_4, 0, (BigInteger)var3_2);
        v3.cfr_renamed_2325(var5_4, 32, (BigInteger)var4_3);
        try {
            var2_5 = new sprvhm(new sprddm(sprqo.cfr_renamed_93, var1_1), new sprfvg(var5_4));
            return sprjij.cfr_renamed_5675(var2_5);
        }
        catch (IOException var6_6) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(sprnsh sprnsh2, sprqw sprqw2) {
        void arg1;
        void arg0;
        this.cfr_renamed_2 = "ECGOST3410";
        if (sprnsh2.cfr_renamed_2110() != null) {
            sprgxh sprgxh2 = arg0.cfr_renamed_2110().cfr_renamed_1769();
            sprxlj sprxlj2 = this;
            sprxlj sprxlj3 = this;
            sprxlj2.cfr_renamed_0 = new sprnzk(arg0.cfr_renamed_1604(), sprqpj.cfr_renamed_9378((sprqw)arg1, arg0.cfr_renamed_2110()));
            sprxlj2.cfr_renamed_4 = sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprgxh2, arg0.cfr_renamed_2110().cfr_renamed_2113()), arg0.cfr_renamed_2110());
            return;
        }
        sprrxh sprrxh2 = arg1.cfr_renamed_2312();
        this.cfr_renamed_0 = new sprnzk(sprrxh2.cfr_renamed_1769().cfr_renamed_1996(arg0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779()), sprnlj.cfr_renamed_9383((sprqw)arg1, null));
        this.cfr_renamed_4 = null;
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_4 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_4);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    public sprxlj(sprvhm sprvhm2) {
        this.cfr_renamed_2 = "ECGOST3410";
        this.cfr_renamed_9152(sprvhm2);
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_3 = !spronq.cfr_renamed_9("N{XzVeIpHf^q").equalsIgnoreCase(arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_0.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        Object object;
        sprco sprco2;
        sprlem sprlem2;
        int n;
        sproug sproug2;
        sprgbf sprgbf2 = arg0.cfr_renamed_2314();
        this.cfr_renamed_2 = "ECGOST3410";
        try {
            sproug2 = (sproug)sprxgf.cfr_renamed_184(sprgbf2.cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprpaz.cfr_renamed_9("A3V.VaV$G.R$V(J&\u00041Q#H(GaO$]"));
        }
        byte[] byArray = sproug2.cfr_renamed_186();
        byte[] byArray2 = new byte[65];
        byArray2[0] = 4;
        int n2 = n = 1;
        while (n2 <= 32) {
            int n3 = n;
            byArray2[n3] = byArray[32 - n3];
            int n4 = n + 32;
            byte by = byArray[64 - n];
            byArray2[n4] = by;
            n2 = ++n;
        }
        sprvhm sprvhm2 = arg0;
        if (arg0.cfr_renamed_593().cfr_renamed_284() instanceof sprlem) {
            this.cfr_renamed_1 = sprlem2 = sprlem.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
            sprco2 = this.cfr_renamed_1;
        } else {
            object = sprxum.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
            this.cfr_renamed_1 = object;
            sprco2 = sprlem2 = ((sprxum)this.cfr_renamed_1).cfr_renamed_2106();
        }
        object = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(sprco2));
        sprgxh sprgxh2 = ((sprrxh)object).cfr_renamed_1769();
        EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, ((sprrxh)object).cfr_renamed_2113());
        sprxlj sprxlj2 = this;
        sprxlj2.cfr_renamed_0 = new sprnzk(sprgxh2.cfr_renamed_2002(byArray2), sprqpj.cfr_renamed_9378(null, (sprrxh)object));
        sprxlj2.cfr_renamed_4 = new sprxvh(spralm.cfr_renamed_7555(sprlem2), ellipticCurve, sprnlj.cfr_renamed_9053(((sprrxh)object).cfr_renamed_1145()), ((sprrxh)object).cfr_renamed_1146(), ((sprrxh)object).cfr_renamed_1153());
    }

    @Override
    public String getFormat() {
        return spronq.cfr_renamed_9("m5\u0000+\f");
    }

    /*
     * WARNING - void declaration
     */
    public sprxlj(String string, sprnzk sprnzk2, sprrxh sprrxh2) {
        void arg2;
        void arg1;
        void arg0;
        sprxlj sprxlj2 = this;
        sprxlj2.cfr_renamed_2 = "ECGOST3410";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprxlj2.cfr_renamed_2 = arg0;
        sprxlj2.cfr_renamed_0 = arg1;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_4 = this.cfr_renamed_9151(ellipticCurve, sprqxk2);
            return;
        }
        EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_4 = sprnlj.cfr_renamed_9153(ellipticCurve, (sprrxh)arg2);
    }
}

