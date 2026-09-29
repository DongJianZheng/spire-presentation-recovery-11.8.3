/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisb;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvva;
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

public class sprhkc
implements ECPublicKey,
sprvb,
sprxb {
    private transient ECParameterSpec cfr_renamed_91;
    private boolean cfr_renamed_0;
    private transient sprsme cfr_renamed_1;
    public static final long cfr_renamed_2 = 7026240464295649314L;
    private String cfr_renamed_3;
    private transient sprrlb cfr_renamed_4;

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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2310(sprdce arg0) {
        int n;
        sprxue sprxue2;
        sprmra sprmra2 = arg0.cfr_renamed_2314();
        this.cfr_renamed_3 = "ECGOST3410";
        try {
            sprxue2 = (sprxue)sprvva.cfr_renamed_184(sprmra2.cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprnkp.cfr_renamed_9("\u0001\u001e\u0016\u0003\u0016L\u0016\t\u0007\u0003\u0012\t\u0016\u0005\n\u000bD\u001c\u0011\u000e\b\u0005\u0007L\u000f\t\u001d"));
        }
        byte[] byArray = sprxue2.cfr_renamed_186();
        byte[] byArray2 = new byte[32];
        byte[] byArray3 = new byte[32];
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n++;
            byArray2[n3] = byArray[31 - n3];
            n2 = n;
        }
        int n4 = n = 0;
        while (true) {
            if (n4 == byArray3.length) {
                this.cfr_renamed_1 = sprsme.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
                sprlsb sprlsb2 = sprisb.cfr_renamed_2315(sprste.cfr_renamed_2316(this.cfr_renamed_1.cfr_renamed_2106()));
                sprpib sprpib2 = sprlsb2.cfr_renamed_1769();
                EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, sprlsb2.cfr_renamed_2113());
                this.cfr_renamed_4 = sprpib2.cfr_renamed_1996(new BigInteger(1, byArray2), new BigInteger(1, byArray3));
                this.cfr_renamed_91 = new sprmjb(sprste.cfr_renamed_2316(this.cfr_renamed_1.cfr_renamed_2106()), ellipticCurve, new ECPoint(sprlsb2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprlsb2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprlsb2.cfr_renamed_1146(), sprlsb2.cfr_renamed_1153());
                return;
            }
            int n5 = n++;
            byArray3[n5] = byArray[63 - n5];
            n4 = n;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprahe.cfr_renamed_9("331?q):*>(>.0("));
        StringBuffer stringBuffer2 = stringBuffer.append(sprnkp.cfr_renamed_9("!/D<\u0011\u000e\b\u0005\u0007L/\t\u001d")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprahe.cfr_renamed_9("z\u007fz\u007fz\u007fz\u007fz\u007fz\u007f\u0002ez")).append(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer3.append(sprnkp.cfr_renamed_9("DLDLDLDLDLDL=VD")).append(this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    public sprsme cfr_renamed_2495() {
        return this.cfr_renamed_1;
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_91 != null) {
            sprhkc sprhkc2 = this;
            return sprijc.cfr_renamed_2328(sprhkc2.cfr_renamed_91, sprhkc2.cfr_renamed_0);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    public sprrlb cfr_renamed_2307() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_0 = !sprahe.cfr_renamed_9("\n\u0014\u001c\u0015\u0012\n\r\u001f\f\t\u001a\u001e").equalsIgnoreCase(arg0);
    }

    @Override
    public String getFormat() {
        return sprnkp.cfr_renamed_9("<BQ\\]");
    }

    /*
     * WARNING - void declaration
     */
    public sprhkc(String string, sprwmd sprwmd2) {
        void arg1;
        void arg0;
        sprhkc sprhkc2 = this;
        sprhkc sprhkc3 = this;
        sprhkc3.cfr_renamed_3 = "ECGOST3410";
        sprhkc3.cfr_renamed_3 = arg0;
        sprhkc2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        sprhkc2.cfr_renamed_91 = null;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprhkc)) {
            return false;
        }
        sprhkc sprhkc2 = (sprhkc)arg0;
        return this.cfr_renamed_2307().cfr_renamed_1962(sprhkc2.cfr_renamed_2307()) && this.cfr_renamed_2308().equals(sprhkc2.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprhkc(String string, sprwmd sprwmd2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        sprhkc sprhkc2 = this;
        sprhkc2.cfr_renamed_3 = "ECGOST3410";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprhkc2.cfr_renamed_3 = arg0;
        sprhkc2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_91 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        this.cfr_renamed_91 = arg2;
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_91;
    }

    @Override
    public ECPoint getW() {
        return new ECPoint(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779());
    }

    @Override
    public byte[] getEncoded() {
        sprdce sprdce2;
        Object object;
        Object object2;
        sprkra sprkra2;
        sprhkc sprhkc2;
        if (this.cfr_renamed_1 != null) {
            sprhkc sprhkc3 = this;
            sprhkc2 = sprhkc3;
            sprkra2 = sprhkc3.cfr_renamed_1;
        } else if (this.cfr_renamed_91 instanceof sprmjb) {
            sprkra2 = new sprsme(sprste.cfr_renamed_2103(((sprmjb)this.cfr_renamed_91).cfr_renamed_313()), sprji.cfr_renamed_105);
            sprhkc2 = this;
        } else {
            sprhkc sprhkc4 = this;
            sprhkc2 = sprhkc4;
            Object object3 = object2 = sprijc.cfr_renamed_2323(sprhkc4.cfr_renamed_91.getCurve());
            object = new sprfpd((sprpib)object3, sprijc.cfr_renamed_2324((sprpib)object3, this.cfr_renamed_91.getGenerator(), this.cfr_renamed_0), this.cfr_renamed_91.getOrder(), BigInteger.valueOf(this.cfr_renamed_91.getCofactor()), this.cfr_renamed_91.getCurve().getSeed());
            sprkra2 = new spruxd((sprfpd)object);
        }
        object2 = sprhkc2.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779();
        sprhkc sprhkc5 = this;
        object = sprhkc5.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779();
        byte[] byArray = new byte[64];
        sprhkc5.cfr_renamed_2325(byArray, 0, (BigInteger)object2);
        sprhkc5.cfr_renamed_2325(byArray, 32, (BigInteger)object);
        try {
            sprdce2 = new sprdce(new sprije(sprji.cfr_renamed_4, sprkra2), new sprlqe(byArray));
        }
        catch (IOException iOException) {
            return null;
        }
        return sprdqc.cfr_renamed_1188(sprdce2);
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

    public sprhkc(ECPublicKey arg0) {
        sprhkc sprhkc2 = this;
        this.cfr_renamed_3 = "ECGOST3410";
        this.cfr_renamed_3 = arg0.getAlgorithm();
        sprhkc2.cfr_renamed_91 = arg0.getParams();
        sprhkc2.cfr_renamed_4 = sprijc.cfr_renamed_2313(this.cfr_renamed_91, arg0.getW(), false);
    }

    /*
     * WARNING - void declaration
     */
    public sprhkc(String string, sprwmd sprwmd2, sprlpb sprlpb2) {
        void arg2;
        void arg1;
        void arg0;
        sprhkc sprhkc2 = this;
        sprhkc2.cfr_renamed_3 = "ECGOST3410";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprhkc2.cfr_renamed_3 = arg0;
        sprhkc2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_91 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_91 = sprijc.cfr_renamed_2311(ellipticCurve, (sprlpb)arg2);
    }

    @Override
    public sprrlb cfr_renamed_1604() {
        if (this.cfr_renamed_91 == null) {
            return this.cfr_renamed_4.cfr_renamed_1976();
        }
        return this.cfr_renamed_4;
    }

    public sprhkc(ECPublicKeySpec arg0) {
        sprhkc sprhkc2 = this;
        this.cfr_renamed_3 = "ECGOST3410";
        sprhkc2.cfr_renamed_91 = arg0.getParams();
        sprhkc2.cfr_renamed_4 = sprijc.cfr_renamed_2313(this.cfr_renamed_91, arg0.getW(), false);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2310(sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
    }

    public sprhkc(sprdce sprdce2) {
        this.cfr_renamed_3 = "ECGOST3410";
        this.cfr_renamed_2310(sprdce2);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_2307().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprhkc(sprkkb arg0) {
        sprkkb sprkkb2 = arg0;
        this.cfr_renamed_3 = "ECGOST3410";
        this.cfr_renamed_4 = sprkkb2.cfr_renamed_1604();
        if (sprkkb2.cfr_renamed_2110() != null) {
            sprpib sprpib2 = arg0.cfr_renamed_2110().cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_91 = sprijc.cfr_renamed_2311(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        if (this.cfr_renamed_4.cfr_renamed_1769() == null) {
            sprlpb sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            this.cfr_renamed_4 = sprlpb2.cfr_renamed_1769().cfr_renamed_1996(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779());
        }
        this.cfr_renamed_91 = null;
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        sprhkc sprhkc2 = this;
        return sprijc.cfr_renamed_2328(sprhkc2.cfr_renamed_91, sprhkc2.cfr_renamed_0);
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_2309(EllipticCurve arg0, sprqid arg1) {
        return new ECParameterSpec(arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    /*
     * WARNING - void declaration
     */
    public sprhkc(sprhkc sprhkc2) {
        void arg0;
        sprhkc sprhkc3 = this;
        void v1 = arg0;
        sprhkc sprhkc4 = this;
        sprhkc4.cfr_renamed_3 = "ECGOST3410";
        sprhkc4.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_91 = v1.cfr_renamed_91;
        sprhkc3.cfr_renamed_0 = v1.cfr_renamed_0;
        sprhkc3.cfr_renamed_1 = sprhkc2.cfr_renamed_1;
    }
}

