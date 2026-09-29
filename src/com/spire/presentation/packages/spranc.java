/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprejb;
import com.spire.presentation.packages.sprflc;
import com.spire.presentation.packages.sprhkc;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrgq;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class spranc
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_119;
    public sprdld cfr_renamed_91;
    public int cfr_renamed_0;
    public String cfr_renamed_1;
    public boolean cfr_renamed_2;
    public Object cfr_renamed_3;
    public sprmdd cfr_renamed_4;

    public spranc() {
        spranc spranc2 = this;
        spranc spranc3 = this;
        super("ECGOST3410");
        this.cfr_renamed_3 = null;
        spranc spranc4 = this;
        this.cfr_renamed_4 = new sprmdd();
        spranc3.cfr_renamed_1 = "ECGOST3410";
        spranc3.cfr_renamed_0 = 239;
        spranc2.cfr_renamed_119 = null;
        spranc2.cfr_renamed_2 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprrgq.cfr_renamed_9("\fxip,Bik(R;\u001b\u000e^'^;Z=T;\u001b'T=\u001b U O Z%R:^-"));
        }
        sprwnd sprwnd2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprwmd sprwmd2 = (sprwmd)sprwnd2.cfr_renamed_1224();
        spreed spreed2 = (spreed)sprwnd2.cfr_renamed_1225();
        if (this.cfr_renamed_3 instanceof sprlpb) {
            sprlpb sprlpb2 = (sprlpb)this.cfr_renamed_3;
            sprhkc sprhkc2 = new sprhkc(this.cfr_renamed_1, sprwmd2, sprlpb2);
            return new KeyPair(sprhkc2, new sprflc(this.cfr_renamed_1, spreed2, sprhkc2, sprlpb2));
        }
        if (this.cfr_renamed_3 == null) {
            return new KeyPair(new sprhkc(this.cfr_renamed_1, sprwmd2), new sprflc(this.cfr_renamed_1, spreed2));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_3;
        sprhkc sprhkc3 = new sprhkc(this.cfr_renamed_1, sprwmd2, eCParameterSpec);
        return new KeyPair(sprhkc3, new sprflc(this.cfr_renamed_1, spreed2, sprhkc3, eCParameterSpec));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_119 = secureRandom;
        if (this.cfr_renamed_3 == null) {
            throw new InvalidParameterException(sprrgq.cfr_renamed_9("<U\"U&L'\u001b\"^0\u001b:R3^g"));
        }
        try {
            void arg1;
            spranc spranc2 = this;
            spranc2.initialize((ECGenParameterSpec)spranc2.cfr_renamed_3, (SecureRandom)arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprdhea.cfr_renamed_9("\u0017U\u0005\u0010\u000fY\u0006U\\^\u0013D\\S\u0013^\u001aY\u001bE\u000eQ\u001e\\\u0019\u001e"));
        }
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprlpb) {
            sprlpb sprlpb2 = (sprlpb)arg0;
            this.cfr_renamed_3 = arg0;
            spranc spranc2 = this;
            this.cfr_renamed_91 = new sprdld(new sprqid(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_1145(), sprlpb2.cfr_renamed_1146()), arg1);
            this.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
            return;
        }
        if (arg0 instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec)arg0;
            this.cfr_renamed_3 = arg0;
            sprpib sprpib2 = sprijc.cfr_renamed_2323(eCParameterSpec.getCurve());
            sprrlb sprrlb2 = sprijc.cfr_renamed_2324(sprpib2, eCParameterSpec.getGenerator(), false);
            this.cfr_renamed_91 = new sprdld(new sprqid(sprpib2, sprrlb2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
            return;
        }
        if (arg0 instanceof ECGenParameterSpec || arg0 instanceof sprejb) {
            String string;
            AlgorithmParameterSpec algorithmParameterSpec = arg0;
            sprqid sprqid2 = sprste.cfr_renamed_1837(arg0 instanceof ECGenParameterSpec ? (string = ((ECGenParameterSpec)algorithmParameterSpec).getName()) : (string = ((sprejb)algorithmParameterSpec).cfr_renamed_313()));
            if (sprqid2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdhea.cfr_renamed_9("\t^\u0017^\u0013G\u0012\u0010\u001fE\u000eF\u0019\u0010\u0012Q\u0011UF\u0010")).append(string).toString());
            }
            this.cfr_renamed_3 = new sprmjb(string, sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_1145(), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153(), sprqid2.cfr_renamed_2113());
            ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_3;
            sprpib sprpib3 = sprijc.cfr_renamed_2323(eCParameterSpec.getCurve());
            sprrlb sprrlb3 = sprijc.cfr_renamed_2324(sprpib3, eCParameterSpec.getGenerator(), false);
            this.cfr_renamed_91 = new sprdld(new sprqid(sprpib3, sprrlb3, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
            return;
        }
        if (arg0 == null && sprbrb.cfr_renamed_86.cfr_renamed_2312() != null) {
            sprlpb sprlpb3 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            this.cfr_renamed_3 = arg0;
            this.cfr_renamed_91 = new sprdld(new sprqid(sprlpb3.cfr_renamed_1769(), sprlpb3.cfr_renamed_1145(), sprlpb3.cfr_renamed_1146()), arg1);
            this.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
            return;
        }
        if (arg0 == null && sprbrb.cfr_renamed_86.cfr_renamed_2312() == null) {
            throw new InvalidAlgorithmParameterException(sprrgq.cfr_renamed_9("'N%WiK(I(V,O,IiK(H:^-\u001b+N=\u001b'TiR$K%R*R=x\b\u001b:^="));
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdhea.cfr_renamed_9("\fQ\u000eQ\u0011U\bU\u000e\u0010\u0013R\u0016U\u001fD\\^\u0013D\\Q\\u?`\u001dB\u001d]\u0019D\u0019B/@\u0019SF\u0010")).append(arg0.getClass().getName()).toString());
    }
}

