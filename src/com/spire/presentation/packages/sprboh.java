/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprqjm;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqqe;
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

public class sprboh
implements ECPublicKey,
sprxz,
sprjq {
    private spreuh cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprxum cfr_renamed_2;
    private ECParameterSpec cfr_renamed_3;
    private String cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_2307().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_3 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_3);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprboh)) {
            return false;
        }
        sprboh sprboh2 = (sprboh)arg0;
        return this.cfr_renamed_2307().cfr_renamed_8927(sprboh2.cfr_renamed_2307()) && this.cfr_renamed_2308().equals(sprboh2.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprboh(String string, sprnzk sprnzk2) {
        void arg1;
        void arg0;
        sprboh sprboh2 = this;
        sprboh sprboh3 = this;
        sprboh3.cfr_renamed_4 = "EC";
        sprboh3.cfr_renamed_4 = arg0;
        sprboh2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        sprboh2.cfr_renamed_3 = null;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_3);
    }

    @Override
    public String getFormat() {
        return sprqgo.cfr_renamed_9(":6W([");
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9151(EllipticCurve arg0, sprqxk arg1) {
        return new ECParameterSpec(arg0, sprnlj.cfr_renamed_9053(arg1.cfr_renamed_1145()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    /*
     * WARNING - void declaration
     */
    public sprboh(String string, sprnzk sprnzk2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        sprboh sprboh2 = this;
        sprboh2.cfr_renamed_4 = "EC";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprboh2.cfr_renamed_4 = arg0;
        sprboh2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_3 = this.cfr_renamed_9151(ellipticCurve, sprqxk2);
            return;
        }
        this.cfr_renamed_3 = arg2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(sprnvc.cfr_renamed_9("\u001ba~r+@2K=\u0002\u0015G'")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprqgo.cfr_renamed_9("B8B8B8B8B8B8:\"B")).append(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer3.append(sprnvc.cfr_renamed_9("~\u0002~\u0002~\u0002~\u0002~\u0002~\u0002\u0007\u0018~")).append(this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        byte[] byArray = (byte[])arg0.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        this.cfr_renamed_4 = (String)arg0.readObject();
        this.cfr_renamed_1 = arg0.readBoolean();
    }

    public sprboh(String arg0, sprnsh arg1) {
        sprnsh sprnsh2 = arg1;
        sprboh sprboh2 = this;
        sprboh2.cfr_renamed_4 = "EC";
        sprboh2.cfr_renamed_4 = arg0;
        this.cfr_renamed_0 = sprnsh2.cfr_renamed_1604();
        if (sprnsh2.cfr_renamed_2110() != null) {
            sprgxh sprgxh2 = arg1.cfr_renamed_2110().cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, arg1.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_3 = sprnlj.cfr_renamed_9153(ellipticCurve, arg1.cfr_renamed_2110());
            return;
        }
        if (this.cfr_renamed_0.cfr_renamed_1769() == null) {
            sprrxh sprrxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            this.cfr_renamed_0 = sprrxh2.cfr_renamed_1769().cfr_renamed_1996(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779());
        }
        this.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprboh(String string, sprboh sprboh2) {
        void arg0;
        void arg1;
        sprboh sprboh3 = this;
        void v1 = arg1;
        sprboh sprboh4 = this;
        this.cfr_renamed_4 = "EC";
        sprboh4.cfr_renamed_4 = arg0;
        sprboh4.cfr_renamed_0 = arg1.cfr_renamed_0;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprboh3.cfr_renamed_1 = v1.cfr_renamed_1;
        sprboh3.cfr_renamed_2 = sprboh2.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprboh(String string, sprnzk sprnzk2, sprrxh sprrxh2) {
        void arg2;
        void arg1;
        void arg0;
        sprboh sprboh2 = this;
        sprboh2.cfr_renamed_4 = "EC";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprboh2.cfr_renamed_4 = arg0;
        sprboh2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            this.cfr_renamed_3 = this.cfr_renamed_9151(ellipticCurve, sprqxk2);
            return;
        }
        EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_3 = sprnlj.cfr_renamed_9153(ellipticCurve, (sprrxh)arg2);
    }

    public sprboh(sprvhm sprvhm2) {
        this.cfr_renamed_4 = "EC";
        this.cfr_renamed_9152(sprvhm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprboh sprboh2 = this;
        arg0.writeObject(sprboh2.getEncoded());
        v0.writeObject(sprboh2.cfr_renamed_4);
        v0.writeBoolean(this.cfr_renamed_1);
    }

    @Override
    public byte[] getEncoded() {
        sprvhm sprvhm2;
        if (this.cfr_renamed_4.equals("ECGOST3410")) {
            Object object;
            Object object2;
            sprqqe sprqqe2;
            sprboh sprboh2;
            if (this.cfr_renamed_2 != null) {
                sprboh sprboh3 = this;
                sprboh2 = sprboh3;
                sprqqe2 = sprboh3.cfr_renamed_2;
            } else if (this.cfr_renamed_3 instanceof sprxvh) {
                sprqqe2 = new sprxum(spralm.cfr_renamed_2103(((sprxvh)this.cfr_renamed_3).cfr_renamed_313()), sprqo.cfr_renamed_133);
                sprboh2 = this;
            } else {
                sprboh sprboh4 = this;
                sprboh2 = sprboh4;
                Object object3 = object2 = sprnlj.cfr_renamed_2323(sprboh4.cfr_renamed_3.getCurve());
                Object object4 = object2;
                object = new sprhfm((sprgxh)object4, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)object4, this.cfr_renamed_3.getGenerator()), this.cfr_renamed_1), this.cfr_renamed_3.getOrder(), BigInteger.valueOf(this.cfr_renamed_3.getCofactor()), this.cfr_renamed_3.getCurve().getSeed());
                sprqqe2 = new sprcgm((sprhfm)object);
            }
            object2 = sprboh2.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779();
            sprboh sprboh5 = this;
            object = sprboh5.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779();
            byte[] byArray = new byte[64];
            sprboh5.cfr_renamed_2325(byArray, 0, (BigInteger)object2);
            sprboh5.cfr_renamed_2325(byArray, 32, (BigInteger)object);
            try {
                sprvhm2 = new sprvhm(new sprddm(sprqo.cfr_renamed_93, sprqqe2), new sprfvg(byArray));
            }
            catch (IOException iOException) {
                return null;
            }
        } else {
            sprboh sprboh6;
            sprcgm sprcgm2;
            Object object;
            if (this.cfr_renamed_3 instanceof sprxvh) {
                object = sprqpj.cfr_renamed_2326(((sprxvh)this.cfr_renamed_3).cfr_renamed_313());
                if (object == null) {
                    object = new sprlem(((sprxvh)this.cfr_renamed_3).cfr_renamed_313());
                }
                sprcgm2 = new sprcgm((sprlem)object);
                sprboh6 = this;
            } else if (this.cfr_renamed_3 == null) {
                sprcgm2 = new sprcgm(sprpen.cfr_renamed_4);
                sprboh6 = this;
            } else {
                sprboh sprboh7 = this;
                sprboh6 = sprboh7;
                Object object5 = object = sprnlj.cfr_renamed_2323(sprboh7.cfr_renamed_3.getCurve());
                sprhfm sprhfm2 = new sprhfm((sprgxh)object5, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)object5, this.cfr_renamed_3.getGenerator()), this.cfr_renamed_1), this.cfr_renamed_3.getOrder(), BigInteger.valueOf(this.cfr_renamed_3.getCofactor()), this.cfr_renamed_3.getCurve().getSeed());
                sprcgm2 = new sprcgm(sprhfm2);
            }
            object = sprboh6.cfr_renamed_1604().cfr_renamed_1972(this.cfr_renamed_1);
            sprvhm2 = new sprvhm(new sprddm(sprbr.cfr_renamed_135, sprcgm2), (byte[])object);
        }
        return sprjij.cfr_renamed_5675(sprvhm2);
    }

    public sprboh(ECPublicKey arg0) {
        sprboh sprboh2 = this;
        this.cfr_renamed_4 = "EC";
        this.cfr_renamed_4 = arg0.getAlgorithm();
        sprboh2.cfr_renamed_3 = arg0.getParams();
        sprboh2.cfr_renamed_0 = sprnlj.cfr_renamed_9155(this.cfr_renamed_3, arg0.getW());
    }

    public spreuh cfr_renamed_2307() {
        return this.cfr_renamed_0;
    }

    @Override
    public ECPoint getW() {
        return sprnlj.cfr_renamed_9053(this.cfr_renamed_0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        int n;
        sprvhm sprvhm2;
        sprgxh sprgxh2;
        Object object;
        sprqqe sprqqe2;
        sprcgm sprcgm2;
        sprddm sprddm2 = arg0.cfr_renamed_593();
        if (sprddm2.cfr_renamed_593().cfr_renamed_5078(sprqo.cfr_renamed_93)) {
            int n2;
            sproug sproug2;
            sprgbf sprgbf2 = arg0.cfr_renamed_2314();
            this.cfr_renamed_4 = "ECGOST3410";
            try {
                sproug2 = (sproug)sprxgf.cfr_renamed_184(sprgbf2.cfr_renamed_81());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprqgo.cfr_renamed_9("\u0007j\u0010w\u00108\u0010}\u0001w\u0014}\u0010q\f\u007fBh\u0017z\u000eq\u00018\t}\u001b"));
            }
            byte[] byArray = sproug2.cfr_renamed_186();
            byte[] byArray2 = new byte[65];
            byArray2[0] = 4;
            int n3 = n2 = 1;
            while (true) {
                if (n3 > 32) {
                    this.cfr_renamed_2 = sprxum.cfr_renamed_23(sprddm2.cfr_renamed_284());
                    spreph spreph2 = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(this.cfr_renamed_2.cfr_renamed_2106()));
                    sprgxh sprgxh3 = spreph2.cfr_renamed_1769();
                    EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh3, spreph2.cfr_renamed_2113());
                    this.cfr_renamed_0 = sprgxh3.cfr_renamed_2002(byArray2);
                    sprboh sprboh2 = this;
                    this.cfr_renamed_3 = new sprxvh(spralm.cfr_renamed_7555(this.cfr_renamed_2.cfr_renamed_2106()), ellipticCurve, sprnlj.cfr_renamed_9053(spreph2.cfr_renamed_1145()), spreph2.cfr_renamed_1146(), spreph2.cfr_renamed_1153());
                    return;
                }
                int n4 = n2;
                byArray2[n4] = byArray[32 - n4];
                int n5 = n2 + 32;
                byte by = byArray[64 - n2];
                byArray2[n5] = by;
                n3 = ++n2;
            }
        }
        sprcgm sprcgm3 = sprcgm2 = sprcgm.cfr_renamed_23(sprddm2.cfr_renamed_284());
        if (sprcgm2.cfr_renamed_2317()) {
            sprqqe2 = (sprlem)sprcgm3.cfr_renamed_284();
            object = sprqpj.cfr_renamed_9156((sprlem)sprqqe2);
            sprgxh2 = ((sprhfm)object).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, ((sprhfm)object).cfr_renamed_2113());
            sprvhm2 = arg0;
            this.cfr_renamed_3 = new sprxvh(sprqpj.cfr_renamed_7554((sprlem)sprqqe2), ellipticCurve, sprnlj.cfr_renamed_9053(((sprhfm)object).cfr_renamed_1145()), ((sprhfm)object).cfr_renamed_1146(), ((sprhfm)object).cfr_renamed_1153());
        } else if (sprcgm3.cfr_renamed_2320()) {
            this.cfr_renamed_3 = null;
            sprgxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1769();
            sprvhm2 = arg0;
        } else {
            sprqqe2 = sprhfm.cfr_renamed_23(sprcgm2.cfr_renamed_284());
            sprgxh2 = ((sprhfm)sprqqe2).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, ((sprhfm)sprqqe2).cfr_renamed_2113());
            sprvhm2 = arg0;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(((sprhfm)sprqqe2).cfr_renamed_1145()), ((sprhfm)sprqqe2).cfr_renamed_1146(), ((sprhfm)sprqqe2).cfr_renamed_1153().intValue());
        }
        sprqqe2 = sprvhm2.cfr_renamed_2314();
        object = ((sprgbf)sprqqe2).cfr_renamed_81();
        sproug sproug3 = new sprfvg((byte[])object);
        if (object[0] == 4 && object[1] == ((Object)object).length - 2 && (object[2] == 2 || object[2] == 3) && (n = new sprqjm().cfr_renamed_9157(sprgxh2)) >= ((Object)object).length - 3) {
            try {
                sproug3 = (sproug)sprxgf.cfr_renamed_184((byte[])object);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprnvc.cfr_renamed_9(";P,M,\u0002,G=M(G,K0E~R+@2K=\u00025G'"));
            }
        }
        sprfim sprfim2 = new sprfim(sprgxh2, sproug3);
        this.cfr_renamed_0 = sprfim2.cfr_renamed_2322();
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

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_1 = !sprqgo.cfr_renamed_9("M,[-U2J'K1]&").equalsIgnoreCase(arg0);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_3;
    }

    public sprboh(String arg0, ECPublicKeySpec arg1) {
        sprboh sprboh2 = this;
        this.cfr_renamed_4 = "EC";
        this.cfr_renamed_4 = arg0;
        sprboh2.cfr_renamed_3 = arg1.getParams();
        sprboh2.cfr_renamed_0 = sprnlj.cfr_renamed_9155(this.cfr_renamed_3, arg1.getW());
    }

    @Override
    public spreuh cfr_renamed_1604() {
        if (this.cfr_renamed_3 == null) {
            return this.cfr_renamed_0.cfr_renamed_1976();
        }
        return this.cfr_renamed_0;
    }
}

