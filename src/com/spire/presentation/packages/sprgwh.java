/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdgm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzxk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprgwh
implements DHPublicKey {
    public static final long cfr_renamed_1 = -216691575254424324L;
    private sprvhm cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private DHParameterSpec cfr_renamed_4;

    @Override
    public String getFormat() {
        return spreyl.cfr_renamed_9("@\u0013-\r!");
    }

    private /* synthetic */ boolean cfr_renamed_9161(sprszm arg0) {
        if (arg0.cfr_renamed_84() == 2) {
            return true;
        }
        if (arg0.cfr_renamed_84() > 3) {
            return false;
        }
        sprszm sprszm2 = arg0;
        sprktm sprktm2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
        sprktm sprktm3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        return sprktm2.cfr_renamed_97().compareTo(BigInteger.valueOf(sprktm3.cfr_renamed_97().bitLength())) <= 0;
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_2 != null) {
            return sprjij.cfr_renamed_5675(this.cfr_renamed_2);
        }
        return sprjij.cfr_renamed_5679(new sprddm(sprdl.cfr_renamed_1214, new sproom(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getG(), this.cfr_renamed_4.getL())), new sprktm(this.cfr_renamed_3));
    }

    /*
     * WARNING - void declaration
     */
    public sprgwh(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_3 = dHPublicKeySpec.getY();
        sprgwh sprgwh2 = this;
        this.cfr_renamed_4 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprgwh(DHPublicKey dHPublicKey) {
        void arg0;
        sprgwh sprgwh2 = this;
        sprgwh2.cfr_renamed_3 = arg0.getY();
        sprgwh2.cfr_renamed_4 = dHPublicKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprgwh(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        void arg0;
        sprgwh sprgwh2 = this;
        sprgwh2.cfr_renamed_3 = arg0;
        sprgwh2.cfr_renamed_4 = dHParameterSpec;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_3 = (BigInteger)arg0.readObject();
        sprgwh sprgwh2 = this;
        sprgwh2.cfr_renamed_4 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgwh(sprvhm sprvhm2) {
        sprktm sprktm2;
        void arg0;
        this.cfr_renamed_2 = sprvhm2;
        try {
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprzxk.cfr_renamed_9("B[]TG\\O\u0015B[MZ\u000bF_G^V_@YP\u000b\\E\u0015o}\u000bE^WG\\H\u0015@PR"));
        }
        this.cfr_renamed_3 = sprktm2.cfr_renamed_97();
        void v0 = arg0;
        sprszm sprszm2 = sprszm.cfr_renamed_23(v0.cfr_renamed_593().cfr_renamed_284());
        sprlem sprlem2 = v0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214) || this.cfr_renamed_9161(sprszm2)) {
            sproom sproom2 = sproom.cfr_renamed_23(sprszm2);
            if (sproom2.cfr_renamed_2331() != null) {
                sprgwh sprgwh2 = this;
                sprgwh2.cfr_renamed_4 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), sproom2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_4 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145());
            return;
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            sprdgm sprdgm2 = sprdgm.cfr_renamed_23(sprszm2);
            this.cfr_renamed_4 = new DHParameterSpec(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1145());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spreyl.cfr_renamed_9("HvVvRoS8\\tZwOqIpP8IaM}\u00078")).append(sprlem2).toString());
    }

    @Override
    public String getAlgorithm() {
        return sprzxk.cfr_renamed_9("qc");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprgwh sprgwh2 = this;
        arg0.writeObject(this.getY());
        arg0.writeObject(sprgwh2.cfr_renamed_4.getP());
        v0.writeObject(sprgwh2.cfr_renamed_4.getG());
        v0.writeInt(this.cfr_renamed_4.getL());
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgwh(sprryk sprryk2) {
        void arg0;
        this.cfr_renamed_3 = sprryk2.spr\u3181();
        sprgwh sprgwh2 = this;
        this.cfr_renamed_4 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }
}

