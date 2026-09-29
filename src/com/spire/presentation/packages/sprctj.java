/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprcr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgny;
import com.spire.presentation.packages.sprgoh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwim;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.sprxzl;
import com.spire.presentation.packages.spryfm;
import com.spire.presentation.packages.sprzgm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class sprctj
implements ECPublicKey,
sprxz,
sprjq {
    private transient sprxzl cfr_renamed_91;
    private String cfr_renamed_0;
    private boolean cfr_renamed_1;
    private transient ECParameterSpec cfr_renamed_2;
    public static final long cfr_renamed_3 = 7026240464295649314L;
    private transient sprnzk cfr_renamed_4;

    public String toString() {
        sprctj sprctj2 = this;
        return sprqpj.cfr_renamed_9376(sprctj2.cfr_renamed_0, sprctj2.cfr_renamed_4.cfr_renamed_1604(), this.cfr_renamed_2308());
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprctj)) {
            return false;
        }
        sprctj sprctj2 = (sprctj)arg0;
        return this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_8927(sprctj2.cfr_renamed_4.cfr_renamed_1604()) && this.cfr_renamed_2308().equals(sprctj2.cfr_renamed_2308());
    }

    public sprnzk cfr_renamed_9389() {
        return this.cfr_renamed_4;
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

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_2);
    }

    @Override
    public String getFormat() {
        return sprrxj.cfr_renamed_9("M\u001f \u0001,");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_1 = !sprgny.cfr_renamed_9("Y!O A?^*_<I+").equalsIgnoreCase(arg0);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
    }

    @Override
    public ECPoint getW() {
        return sprnlj.cfr_renamed_9053(this.cfr_renamed_4.cfr_renamed_1604());
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(String string, sprnzk sprnzk2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        sprctj sprctj2 = this;
        sprctj2.cfr_renamed_0 = "DSTU4145";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprctj2.cfr_renamed_0 = arg0;
        sprctj2.cfr_renamed_4 = arg1;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_2 = this.cfr_renamed_9151(ellipticCurve, sprqxk2);
            return;
        }
        this.cfr_renamed_2 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(sprctj sprctj2) {
        void arg0;
        sprctj sprctj3 = this;
        void v1 = arg0;
        sprctj sprctj4 = this;
        sprctj4.cfr_renamed_0 = "DSTU4145";
        sprctj4.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprctj3.cfr_renamed_1 = v1.cfr_renamed_1;
        sprctj3.cfr_renamed_91 = sprctj2.cfr_renamed_91;
    }

    public sprctj(sprvhm sprvhm2) {
        this.cfr_renamed_0 = "DSTU4145";
        this.cfr_renamed_9152(sprvhm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(ECPublicKeySpec eCPublicKeySpec) {
        void arg0;
        sprctj sprctj2 = this;
        sprctj2.cfr_renamed_0 = "DSTU4145";
        sprctj2.cfr_renamed_2 = eCPublicKeySpec.getParams();
        sprctj sprctj3 = this;
        sprctj2.cfr_renamed_4 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_2, arg0.getW()), sprnlj.cfr_renamed_9383(null, this.cfr_renamed_2));
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(String string, sprnzk sprnzk2, sprrxh sprrxh2) {
        void arg1;
        sprctj sprctj2;
        void arg2;
        void arg0;
        sprctj sprctj3 = this;
        sprctj3.cfr_renamed_0 = "DSTU4145";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprctj3.cfr_renamed_0 = arg0;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprctj sprctj4 = this;
            sprctj2 = sprctj4;
            sprctj4.cfr_renamed_2 = sprctj4.cfr_renamed_9151(ellipticCurve, sprqxk2);
        } else {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
            sprctj2 = this;
            this.cfr_renamed_2 = sprnlj.cfr_renamed_9153(ellipticCurve, (sprrxh)arg2);
        }
        sprctj2.cfr_renamed_4 = arg1;
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9151(EllipticCurve arg0, sprqxk arg1) {
        return new ECParameterSpec(arg0, sprnlj.cfr_renamed_9053(arg1.cfr_renamed_1145()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_2);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    @Override
    public spreuh cfr_renamed_1604() {
        sprctj sprctj2 = this;
        spreuh spreuh2 = sprctj2.cfr_renamed_4.cfr_renamed_1604();
        if (sprctj2.cfr_renamed_2 == null) {
            return spreuh2.cfr_renamed_1976();
        }
        return spreuh2;
    }

    private /* synthetic */ void cfr_renamed_2505(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length / 2) {
            byte by = arg0[n];
            byte[] byArray = arg0;
            byArray[n] = arg0[byArray.length - 1 - n];
            int n3 = arg0.length - 1 - n;
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public byte[] getEncoded() {
        sprvhm sprvhm2;
        Object object;
        sprqqe sprqqe2;
        sprctj sprctj2;
        if (this.cfr_renamed_91 != null) {
            sprctj sprctj3 = this;
            sprctj2 = sprctj3;
            sprqqe2 = sprctj3.cfr_renamed_91;
        } else if (this.cfr_renamed_2 instanceof sprxvh) {
            sprqqe2 = new sprxzl(new sprlem(((sprxvh)this.cfr_renamed_2).cfr_renamed_313()));
            sprctj2 = this;
        } else {
            sprctj sprctj4 = this;
            sprctj2 = sprctj4;
            Object object2 = object = (Object)sprnlj.cfr_renamed_2323(sprctj4.cfr_renamed_2.getCurve());
            sprhfm sprhfm2 = new sprhfm((sprgxh)object, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)object, this.cfr_renamed_2.getGenerator()), this.cfr_renamed_1), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
            sprqqe2 = new sprcgm(sprhfm2);
        }
        object = spruhm.cfr_renamed_9445(sprctj2.cfr_renamed_4.cfr_renamed_1604());
        try {
            sprvhm2 = new sprvhm(new sprddm(sprcr.cfr_renamed_951, sprqqe2), new sprfvg((byte[])object));
        }
        catch (IOException iOException) {
            return null;
        }
        return sprjij.cfr_renamed_5675(sprvhm2);
    }

    public byte[] cfr_renamed_2387() {
        if (null != this.cfr_renamed_91) {
            return this.cfr_renamed_91.cfr_renamed_2510();
        }
        return sprxzl.cfr_renamed_2511();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        sprrxh sprrxh2;
        sproug sproug2;
        sprgbf sprgbf2 = arg0.cfr_renamed_2314();
        this.cfr_renamed_0 = "DSTU4145";
        try {
            sproug2 = (sproug)sprxgf.cfr_renamed_184(sprgbf2.cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprrxj.cfr_renamed_9("pCg^g\u0011gTv^cTgX{V5A`SyXv\u0011~Tl"));
        }
        byte[] byArray = sproug2.cfr_renamed_186();
        if (arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5078(sprcr.cfr_renamed_126)) {
            this.cfr_renamed_2505(byArray);
        }
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
        sprrxh sprrxh3 = null;
        sprhfm sprhfm2 = null;
        if (sprszm2.cfr_renamed_85(0) instanceof sprktm) {
            sprhfm2 = sprhfm.cfr_renamed_23(sprszm2);
            sprrxh2 = sprrxh3 = new sprrxh(sprhfm2.cfr_renamed_1769(), sprhfm2.cfr_renamed_1145(), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153(), sprhfm2.cfr_renamed_2113());
        } else {
            this.cfr_renamed_91 = sprxzl.cfr_renamed_23(sprszm2);
            sprctj sprctj2 = this;
            if (this.cfr_renamed_91.cfr_renamed_2317()) {
                object4 = sprctj2.cfr_renamed_91.cfr_renamed_2507();
                object3 = sprwim.cfr_renamed_7994((sprlem)object4);
                sprrxh2 = sprrxh3 = new spreph(((sprlem)object4).cfr_renamed_19(), ((sprqxk)object3).cfr_renamed_1769(), ((sprqxk)object3).cfr_renamed_1145(), ((sprqxk)object3).cfr_renamed_1146(), ((sprqxk)object3).cfr_renamed_1153(), ((sprqxk)object3).cfr_renamed_2113());
            } else {
                object4 = sprctj2.cfr_renamed_91.cfr_renamed_2508();
                object3 = ((spryfm)object4).cfr_renamed_1997();
                if (arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5078(sprcr.cfr_renamed_126)) {
                    this.cfr_renamed_2505((byte[])object3);
                }
                Object object5 = object4;
                object2 = ((spryfm)object5).cfr_renamed_845();
                object = new sprgoh(((sprzgm)object2).cfr_renamed_1186(), ((sprzgm)object2).cfr_renamed_2115(), ((sprzgm)object2).cfr_renamed_2117(), ((sprzgm)object2).cfr_renamed_2116(), ((spryfm)object4).cfr_renamed_1778(), new BigInteger(1, (byte[])object3), null, null);
                byte[] byArray2 = ((spryfm)object5).cfr_renamed_1145();
                if (arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5078(sprcr.cfr_renamed_126)) {
                    this.cfr_renamed_2505(byArray2);
                }
                Object object6 = object;
                sprrxh2 = sprrxh3 = new sprrxh((sprgxh)object6, spruhm.cfr_renamed_9446((sprgxh)object6, byArray2), ((spryfm)object4).cfr_renamed_1146());
            }
        }
        object4 = sprrxh2.cfr_renamed_1769();
        object3 = sprnlj.cfr_renamed_9052((sprgxh)object4, sprrxh3.cfr_renamed_2113());
        if (this.cfr_renamed_91 != null) {
            object2 = sprnlj.cfr_renamed_9053(sprrxh3.cfr_renamed_1145());
            if (this.cfr_renamed_91.cfr_renamed_2317()) {
                object = this.cfr_renamed_91.cfr_renamed_2507().cfr_renamed_19();
                sprctj sprctj3 = this;
                sprctj3.cfr_renamed_2 = new sprxvh((String)object, (EllipticCurve)object3, (ECPoint)object2, sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153());
            } else {
                this.cfr_renamed_2 = new ECParameterSpec((EllipticCurve)object3, (ECPoint)object2, sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153().intValue());
            }
        } else {
            this.cfr_renamed_2 = sprnlj.cfr_renamed_9386(sprhfm2);
        }
        this.cfr_renamed_4 = new sprnzk(spruhm.cfr_renamed_9446((sprgxh)object4, byArray), sprnlj.cfr_renamed_9383(null, this.cfr_renamed_2));
    }

    public int hashCode() {
        return this.cfr_renamed_4.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(sprnsh sprnsh2, sprqw sprqw2) {
        void arg1;
        void arg0;
        this.cfr_renamed_0 = "DSTU4145";
        if (sprnsh2.cfr_renamed_2110() != null) {
            sprgxh sprgxh2 = arg0.cfr_renamed_2110().cfr_renamed_1769();
            sprctj sprctj2 = this;
            sprctj sprctj3 = this;
            sprctj2.cfr_renamed_4 = new sprnzk(arg0.cfr_renamed_1604(), sprqpj.cfr_renamed_9378((sprqw)arg1, arg0.cfr_renamed_2110()));
            sprctj2.cfr_renamed_2 = sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprgxh2, arg0.cfr_renamed_2110().cfr_renamed_2113()), arg0.cfr_renamed_2110());
            return;
        }
        sprrxh sprrxh2 = arg1.cfr_renamed_2312();
        this.cfr_renamed_4 = new sprnzk(sprrxh2.cfr_renamed_1769().cfr_renamed_1996(arg0.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779()), sprnlj.cfr_renamed_9383((sprqw)arg1, null));
        this.cfr_renamed_2 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprctj(String string, sprnzk sprnzk2) {
        void arg1;
        void arg0;
        sprctj sprctj2 = this;
        sprctj sprctj3 = this;
        sprctj3.cfr_renamed_0 = "DSTU4145";
        sprctj3.cfr_renamed_0 = arg0;
        sprctj2.cfr_renamed_4 = arg1;
        sprctj2.cfr_renamed_2 = null;
    }
}

