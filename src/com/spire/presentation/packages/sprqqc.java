/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprato;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprccd;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprejb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprunfa;
import com.spire.presentation.packages.sprwdd;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprwvc;
import com.spire.presentation.packages.sprxie;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class sprqqc
extends KeyPairGenerator {
    public boolean cfr_renamed_91;
    public sprdld cfr_renamed_0;
    public SecureRandom cfr_renamed_1;
    public sprmdd cfr_renamed_2;
    public String cfr_renamed_3;
    public Object cfr_renamed_4;

    public sprqqc() {
        sprqqc sprqqc2 = this;
        sprqqc sprqqc3 = this;
        super("DSTU4145");
        sprqqc3.cfr_renamed_4 = null;
        sprqqc sprqqc4 = this;
        sprqqc3.cfr_renamed_2 = new sprwdd();
        sprqqc3.cfr_renamed_3 = "DSTU4145";
        sprqqc2.cfr_renamed_1 = null;
        sprqqc2.cfr_renamed_91 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprlpb) {
            sprlpb sprlpb2 = (sprlpb)arg0;
            this.cfr_renamed_4 = arg0;
            sprqqc sprqqc2 = this;
            this.cfr_renamed_0 = new sprdld(new sprqid(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_1145(), sprlpb2.cfr_renamed_1146()), arg1);
            this.cfr_renamed_2.cfr_renamed_1222(this.cfr_renamed_0);
            this.cfr_renamed_91 = true;
            return;
        }
        if (arg0 instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec)arg0;
            this.cfr_renamed_4 = arg0;
            sprpib sprpib2 = sprijc.cfr_renamed_2323(eCParameterSpec.getCurve());
            sprrlb sprrlb2 = sprijc.cfr_renamed_2324(sprpib2, eCParameterSpec.getGenerator(), false);
            this.cfr_renamed_0 = new sprdld(new sprqid(sprpib2, sprrlb2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_2.cfr_renamed_1222(this.cfr_renamed_0);
            this.cfr_renamed_91 = true;
            return;
        }
        if (arg0 instanceof ECGenParameterSpec || arg0 instanceof sprejb) {
            AlgorithmParameterSpec algorithmParameterSpec = arg0;
            String string = arg0 instanceof ECGenParameterSpec ? ((ECGenParameterSpec)algorithmParameterSpec).getName() : ((sprejb)algorithmParameterSpec).cfr_renamed_313();
            sprqid sprqid2 = sprxie.cfr_renamed_2102(new sprtzd(string));
            if (sprqid2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprato.cfr_renamed_9("o.q.u7t`y5h6\u007f`t!w% `")).append(string).toString());
            }
            this.cfr_renamed_4 = new sprmjb(string, sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_1145(), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153(), sprqid2.cfr_renamed_2113());
            ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_4;
            sprpib sprpib3 = sprijc.cfr_renamed_2323(eCParameterSpec.getCurve());
            sprrlb sprrlb3 = sprijc.cfr_renamed_2324(sprpib3, eCParameterSpec.getGenerator(), false);
            this.cfr_renamed_0 = new sprdld(new sprqid(sprpib3, sprrlb3, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_2.cfr_renamed_1222(this.cfr_renamed_0);
            this.cfr_renamed_91 = true;
            return;
        }
        if (arg0 == null && sprbrb.cfr_renamed_86.cfr_renamed_2312() != null) {
            sprlpb sprlpb3 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            this.cfr_renamed_4 = arg0;
            this.cfr_renamed_0 = new sprdld(new sprqid(sprlpb3.cfr_renamed_1769(), sprlpb3.cfr_renamed_1145(), sprlpb3.cfr_renamed_1146()), arg1);
            this.cfr_renamed_2.cfr_renamed_1222(this.cfr_renamed_0);
            this.cfr_renamed_91 = true;
            return;
        }
        if (arg0 == null && sprbrb.cfr_renamed_86.cfr_renamed_2312() == null) {
            throw new InvalidAlgorithmParameterException(sprunfa.cfr_renamed_9("\nA\bXDD\u0005F\u0005Y\u0001@\u0001FDD\u0005G\u0017Q\u0000\u0014\u0006A\u0010\u0014\n[D]\tD\b]\u0007]\u0010w%\u0014\u0017Q\u0010"));
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprato.cfr_renamed_9("j!h!w%n%h`u\"p%y4:.u4:!:\u0005Y\u0010{2{-\u007f4\u007f2I0\u007f# `")).append(arg0.getClass().getName()).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        this.cfr_renamed_1 = arg1;
        if (this.cfr_renamed_4 == null) {
            throw new InvalidParameterException(sprato.cfr_renamed_9("5t+t/m.:+\u007f9:3s:\u007fn"));
        }
        try {
            sprqqc sprqqc2 = this;
            sprqqc2.initialize((ECGenParameterSpec)sprqqc2.cfr_renamed_4, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprunfa.cfr_renamed_9("_\u0001MDG\rN\u0001\u0014\n[\u0010\u0014\u0007[\nR\rS\u0011F\u0005V\bQJ"));
        }
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(sprunfa.cfr_renamed_9(" g0aD\u007f\u0001MDd\u0005]\u0016\u0014#Q\nQ\u0016U\u0010[\u0016\u0014\n[\u0010\u0014\rZ\r@\rU\b]\u0017Q\u0000"));
        }
        sprwnd sprwnd2 = this.cfr_renamed_2.cfr_renamed_1223();
        sprwmd sprwmd2 = (sprwmd)sprwnd2.cfr_renamed_1224();
        spreed spreed2 = (spreed)sprwnd2.cfr_renamed_1225();
        if (this.cfr_renamed_4 instanceof sprlpb) {
            sprlpb sprlpb2 = (sprlpb)this.cfr_renamed_4;
            sprccd sprccd2 = new sprccd(this.cfr_renamed_3, sprwmd2, sprlpb2);
            return new KeyPair(sprccd2, new sprwvc(this.cfr_renamed_3, spreed2, sprccd2, sprlpb2));
        }
        if (this.cfr_renamed_4 == null) {
            return new KeyPair(new sprccd(this.cfr_renamed_3, sprwmd2), new sprwvc(this.cfr_renamed_3, spreed2));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_4;
        sprccd sprccd3 = new sprccd(this.cfr_renamed_3, sprwmd2, eCParameterSpec);
        return new KeyPair(sprccd3, new sprwvc(this.cfr_renamed_3, spreed2, sprccd3, eCParameterSpec));
    }
}

