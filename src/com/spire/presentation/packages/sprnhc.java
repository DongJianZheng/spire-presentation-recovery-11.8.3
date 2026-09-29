/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprdaka;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfcs;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprsb;
import com.spire.presentation.packages.sprxtb;
import com.spire.presentation.packages.sprzkd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprnhc
implements sprsb,
DHPublicKey {
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = 8712728417091216948L;
    private transient spraob cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprnhc sprnhc2 = this;
        sprnhc2.cfr_renamed_4 = new spraob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(sprxtb sprxtb2) {
        void arg0;
        this.cfr_renamed_2 = sprxtb2.spr\u3181();
        sprnhc sprnhc2 = this;
        this.cfr_renamed_4 = new spraob(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        arg0.defaultWriteObject();
        v0.writeObject(this.cfr_renamed_4.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_4.cfr_renamed_1145());
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_2;
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        return this.getY().equals(dHPublicKey.getY()) && this.getParams().getG().equals(dHPublicKey.getParams().getG()) && this.getParams().getP().equals(dHPublicKey.getParams().getP()) && this.getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnhc(sprdce sprdce2) {
        sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprdce2.cfr_renamed_593().cfr_renamed_284());
        sprooe sprooe2 = null;
        try {
            void arg0;
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprdaka.cfr_renamed_9("_p@\u007fZwR>_pPq\u0016mBlC}BkD{\u0016wX>rMw>FkTr_}\u0016uSg"));
        }
        this.cfr_renamed_2 = sprooe2.cfr_renamed_97();
        sprnhc sprnhc2 = this;
        sprnhc2.cfr_renamed_4 = new spraob(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKeySpec.getY();
        sprnhc sprnhc2 = this;
        this.cfr_renamed_4 = new spraob(arg0.getP(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(sprsb sprsb2) {
        void arg0;
        sprnhc sprnhc2 = this;
        sprnhc2.cfr_renamed_2 = arg0.getY();
        sprnhc2.cfr_renamed_4 = sprsb2.cfr_renamed_284();
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(BigInteger bigInteger, spraob spraob2) {
        void arg0;
        sprnhc sprnhc2 = this;
        sprnhc2.cfr_renamed_2 = arg0;
        sprnhc2.cfr_renamed_4 = spraob2;
    }

    @Override
    public spraob cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getAlgorithm() {
        return sprfcs.cfr_renamed_9("%\b'\u0005\r\u0005\f");
    }

    @Override
    public String getFormat() {
        return sprdaka.cfr_renamed_9("F\u0018+\u0006'");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprdce sprdce2 = new sprdce(new sprije(sprdh.cfr_renamed_91, new sprmfe(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145())), new sprooe(this.cfr_renamed_2));
            return sprdce2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(DHPublicKey dHPublicKey) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKey.getY();
        sprnhc sprnhc2 = this;
        this.cfr_renamed_4 = new spraob(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprnhc(sprzkd sprzkd2) {
        void arg0;
        this.cfr_renamed_2 = sprzkd2.spr\u3181();
        sprnhc sprnhc2 = this;
        this.cfr_renamed_4 = new spraob(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }
}

