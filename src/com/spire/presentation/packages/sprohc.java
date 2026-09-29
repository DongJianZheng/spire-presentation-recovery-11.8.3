/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhud;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsyo;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxb;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class sprohc
implements ECPublicKey,
sprvb,
sprxb {
    private transient sprwc cfr_renamed_91;
    private transient sprrlb cfr_renamed_0;
    private boolean cfr_renamed_1;
    private transient ECParameterSpec cfr_renamed_2;
    private String cfr_renamed_3;
    public static final long cfr_renamed_4 = 2422789860422731812L;

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            sprohc sprohc2 = this;
            return sprijc.cfr_renamed_2328(sprohc2.cfr_renamed_2, sprohc2.cfr_renamed_1);
        }
        return this.cfr_renamed_91.cfr_renamed_2312();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2310(sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        this.cfr_renamed_91 = sprbrb.cfr_renamed_86;
    }

    @Override
    public byte[] getEncoded() {
        sprhud sprhud2;
        sprkra sprkra2;
        sprohc sprohc2;
        spruxd spruxd2;
        Object object;
        if (this.cfr_renamed_2 instanceof sprmjb) {
            object = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
            if (object == null) {
                object = new sprtzd(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
            }
            spruxd2 = new spruxd((sprtzd)object);
            sprohc2 = this;
        } else if (this.cfr_renamed_2 == null) {
            spruxd2 = new spruxd(sprume.cfr_renamed_3);
            sprohc2 = this;
        } else {
            sprohc sprohc3 = this;
            sprohc2 = sprohc3;
            Object object2 = object = sprijc.cfr_renamed_2323(sprohc3.cfr_renamed_2.getCurve());
            sprkra2 = new sprfpd((sprpib)object2, sprijc.cfr_renamed_2324((sprpib)object2, this.cfr_renamed_2.getGenerator(), this.cfr_renamed_1), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
            spruxd2 = new spruxd((sprfpd)sprkra2);
        }
        object = sprohc2.cfr_renamed_2307().cfr_renamed_1769();
        if (this.cfr_renamed_2 == null) {
            sprhud2 = new sprhud(((sprpib)object).cfr_renamed_1991(this.cfr_renamed_1604().cfr_renamed_1832().cfr_renamed_1779(), this.cfr_renamed_1604().cfr_renamed_1831().cfr_renamed_1779(), this.cfr_renamed_1));
            sprkra2 = (sprxue)sprhud2.cfr_renamed_119();
        } else {
            sprhud2 = new sprhud(((sprpib)object).cfr_renamed_1991(this.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779(), this.cfr_renamed_1));
            sprkra2 = (sprxue)sprhud2.cfr_renamed_119();
        }
        return sprdqc.cfr_renamed_1188(new sprdce(new sprije(sprtk.cfr_renamed_137, spruxd2), ((sprxue)sprkra2).cfr_renamed_186()));
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprohc)) {
            return false;
        }
        sprohc sprohc2 = (sprohc)arg0;
        return this.cfr_renamed_2307().cfr_renamed_1962(sprohc2.cfr_renamed_2307()) && this.cfr_renamed_2308().equals(sprohc2.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, sprwmd sprwmd2, sprwc sprwc2) {
        void arg1;
        void arg0;
        sprohc sprohc2 = this;
        sprohc sprohc3 = this;
        this.cfr_renamed_3 = "EC";
        sprohc3.cfr_renamed_3 = arg0;
        sprohc3.cfr_renamed_0 = arg1.cfr_renamed_1604();
        sprohc2.cfr_renamed_2 = null;
        sprohc2.cfr_renamed_91 = sprwc2;
    }

    private /* synthetic */ void cfr_renamed_2310(sprdce arg0) {
        int n;
        sprdce sprdce2;
        sprpib sprpib2;
        Object object;
        sprkra sprkra2;
        spruxd spruxd2 = new spruxd((sprvva)arg0.cfr_renamed_593().cfr_renamed_284());
        if (spruxd2.cfr_renamed_2317()) {
            sprkra2 = (sprtzd)spruxd2.cfr_renamed_284();
            object = sprjkc.cfr_renamed_2318((sprtzd)sprkra2);
            sprpib2 = ((sprfpd)object).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, ((sprfpd)object).cfr_renamed_2113());
            sprdce2 = arg0;
            sprohc sprohc2 = this;
            sprohc2.cfr_renamed_2 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)sprkra2), ellipticCurve, new ECPoint(((sprfpd)object).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)object).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)object).cfr_renamed_1146(), ((sprfpd)object).cfr_renamed_1153());
        } else if (spruxd2.cfr_renamed_2320()) {
            this.cfr_renamed_2 = null;
            sprpib2 = this.cfr_renamed_91.cfr_renamed_2312().cfr_renamed_1769();
            sprdce2 = arg0;
        } else {
            sprkra2 = sprfpd.cfr_renamed_23(spruxd2.cfr_renamed_284());
            sprpib2 = ((sprfpd)sprkra2).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, ((sprfpd)sprkra2).cfr_renamed_2113());
            sprdce2 = arg0;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(((sprfpd)sprkra2).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)sprkra2).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)sprkra2).cfr_renamed_1146(), ((sprfpd)sprkra2).cfr_renamed_1153().intValue());
        }
        sprkra2 = sprdce2.cfr_renamed_2314();
        object = ((sprmra)sprkra2).cfr_renamed_81();
        sprxue sprxue2 = new sprlqe((byte[])object);
        if (object[0] == 4 && object[1] == ((Object)object).length - 2 && (object[2] == 2 || object[2] == 3) && (n = new sprizd().cfr_renamed_2321(sprpib2)) >= ((Object)object).length - 3) {
            try {
                sprxue2 = (sprxue)sprvva.cfr_renamed_184((byte[])object);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprpcka.cfr_renamed_9("DOSRS\u001dSXBRWXSTOZ\u0001MT_MTB\u001dJXX"));
            }
        }
        sprhud sprhud2 = new sprhud(sprpib2, sprxue2);
        this.cfr_renamed_0 = sprhud2.cfr_renamed_2322();
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_2309(EllipticCurve arg0, sprqid arg1) {
        return new ECParameterSpec(arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, ECPublicKeySpec eCPublicKeySpec, sprwc sprwc2) {
        void arg1;
        void arg0;
        sprohc sprohc2 = this;
        this.cfr_renamed_3 = "EC";
        sprohc2.cfr_renamed_3 = arg0;
        sprohc2.cfr_renamed_2 = arg1.getParams();
        this.cfr_renamed_0 = sprijc.cfr_renamed_2313(this.cfr_renamed_2, arg1.getW(), false);
        this.cfr_renamed_91 = sprwc2;
    }

    public sprohc(ECPublicKey arg0, sprwc arg1) {
        sprohc sprohc2 = this;
        this.cfr_renamed_3 = "EC";
        this.cfr_renamed_3 = arg0.getAlgorithm();
        sprohc2.cfr_renamed_2 = arg0.getParams();
        sprohc2.cfr_renamed_0 = sprijc.cfr_renamed_2313(this.cfr_renamed_2, arg0.getW(), false);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprsyo.cfr_renamed_9("A.C\"\u00034H7L5L3B5"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprpcka.cfr_renamed_9("d~\u0001mT_MTB\u001djXX")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprsyo.cfr_renamed_9("g\rg\rg\rg\rg\rg\r\u001f\u0017g")).append(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer3.append(sprpcka.cfr_renamed_9("\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001dx\u0007\u0001")).append(this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, sprwmd sprwmd2, ECParameterSpec eCParameterSpec, sprwc sprwc2) {
        void arg3;
        sprohc sprohc2;
        void arg2;
        void arg1;
        void arg0;
        sprohc sprohc3 = this;
        sprohc3.cfr_renamed_3 = "EC";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprohc3.cfr_renamed_3 = arg0;
        sprohc3.cfr_renamed_0 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprohc sprohc4 = this;
            sprohc2 = sprohc4;
            sprohc4.cfr_renamed_2 = sprohc4.cfr_renamed_2309(ellipticCurve, sprqid2);
        } else {
            sprohc2 = this;
            this.cfr_renamed_2 = arg2;
        }
        sprohc2.cfr_renamed_91 = arg3;
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprohc sprohc2 = this;
        return sprijc.cfr_renamed_2328(sprohc2.cfr_renamed_2, sprohc2.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, sprohc sprohc2) {
        void arg0;
        void arg1;
        sprohc sprohc3 = this;
        void v1 = arg1;
        sprohc sprohc4 = this;
        this.cfr_renamed_3 = "EC";
        sprohc4.cfr_renamed_3 = arg0;
        sprohc4.cfr_renamed_0 = arg1.cfr_renamed_0;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprohc3.cfr_renamed_1 = v1.cfr_renamed_1;
        sprohc3.cfr_renamed_91 = sprohc2.cfr_renamed_91;
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
    public String getFormat() {
        return sprsyo.cfr_renamed_9("\u001f\u0003r\u001d~");
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
    public String getAlgorithm() {
        return this.cfr_renamed_3;
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
    }

    public sprrlb cfr_renamed_2307() {
        return this.cfr_renamed_0;
    }

    @Override
    public ECPoint getW() {
        return new ECPoint(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779());
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, sprwmd sprwmd2, sprlpb sprlpb2, sprwc sprwc2) {
        void arg3;
        void arg1;
        sprohc sprohc2;
        void arg2;
        void arg0;
        sprohc sprohc3 = this;
        sprohc3.cfr_renamed_3 = "EC";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprohc3.cfr_renamed_3 = arg0;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprohc sprohc4 = this;
            sprohc2 = sprohc4;
            sprohc4.cfr_renamed_2 = sprohc4.cfr_renamed_2309(ellipticCurve, sprqid2);
        } else {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
            sprohc2 = this;
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, (sprlpb)arg2);
        }
        sprohc2.cfr_renamed_0 = sprijc.cfr_renamed_2323(this.cfr_renamed_2.getCurve()).cfr_renamed_1996(arg1.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779());
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1604() {
        if (this.cfr_renamed_2 == null) {
            return this.cfr_renamed_0.cfr_renamed_1976();
        }
        return this.cfr_renamed_0;
    }

    public sprohc(String arg0, sprkkb arg1, sprwc arg2) {
        sprohc sprohc2;
        sprkkb sprkkb2 = arg1;
        sprohc sprohc3 = this;
        sprohc3.cfr_renamed_3 = "EC";
        sprohc3.cfr_renamed_3 = arg0;
        this.cfr_renamed_0 = sprkkb2.cfr_renamed_1604();
        if (sprkkb2.cfr_renamed_2110() != null) {
            sprpib sprpib2 = arg1.cfr_renamed_2110().cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, arg1.cfr_renamed_2110().cfr_renamed_2113());
            sprohc2 = this;
            this.cfr_renamed_0 = sprijc.cfr_renamed_2323(ellipticCurve).cfr_renamed_1996(arg1.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779());
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, arg1.cfr_renamed_2110());
        } else {
            if (this.cfr_renamed_0.cfr_renamed_1769() == null) {
                sprlpb sprlpb2 = arg2.cfr_renamed_2312();
                this.cfr_renamed_0 = sprlpb2.cfr_renamed_1769().cfr_renamed_1991(this.cfr_renamed_0.cfr_renamed_1832().cfr_renamed_1779(), this.cfr_renamed_0.cfr_renamed_1831().cfr_renamed_1779(), false);
            }
            sprohc2 = this;
            this.cfr_renamed_2 = null;
        }
        sprohc2.cfr_renamed_91 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprohc(String string, sprdce sprdce2, sprwc sprwc2) {
        void arg2;
        void arg0;
        sprohc sprohc2 = this;
        sprohc2.cfr_renamed_3 = "EC";
        sprohc2.cfr_renamed_3 = arg0;
        this.cfr_renamed_91 = arg2;
        this.cfr_renamed_2310(sprdce2);
    }

    public int hashCode() {
        return this.cfr_renamed_2307().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_1 = !sprpcka.cfr_renamed_9("ho~npqodnrxe").equalsIgnoreCase(arg0);
    }
}

