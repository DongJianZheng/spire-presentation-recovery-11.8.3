/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprkb;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprrhf;
import com.spire.presentation.packages.sprsb;
import com.spire.presentation.packages.sprzkd;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprzqc {
    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsb) {
            sprsb sprsb2 = (sprsb)arg0;
            return new sprzkd(sprsb2.getY(), new sprpgd(sprsb2.cfr_renamed_284().cfr_renamed_1155(), sprsb2.cfr_renamed_284().cfr_renamed_1145()));
        }
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprzkd(dHPublicKey.getY(), new sprpgd(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprrhf.cfr_renamed_9("05=s't:06:'=5-s$&6?=0t81*t5;!t\u00168s\u00132928}"));
    }

    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprkb) {
            sprkb sprkb2 = (sprkb)arg0;
            return new sprimd(sprkb2.getX(), new sprpgd(sprkb2.cfr_renamed_284().cfr_renamed_1155(), sprkb2.cfr_renamed_284().cfr_renamed_1145()));
        }
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprimd(dHPrivateKey.getX(), new sprpgd(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprqje.cfr_renamed_9("r|\u007f:e=xytsetwd1mctg|ex1vtd1{~o1X}=V|||}3"));
    }
}

