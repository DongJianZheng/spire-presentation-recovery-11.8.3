/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjvj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfm;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprrah;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtwj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxmh;
import com.spire.presentation.packages.sprxyy;
import com.spire.presentation.packages.spryjh;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.sprywg;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public class sprrvj
extends sprjvj {
    private final sprrr cfr_renamed_4;

    public static sprywg cfr_renamed_9520(PublicKey arg0) {
        if (!(arg0 instanceof ECPublicKey)) {
            throw new IllegalArgumentException(sprxyy.cfr_renamed_9("NEPD\u0003RF\u0010fssEA\\JShUZ\u0010J^PDB^@U"));
        }
        ECPublicKey eCPublicKey = (ECPublicKey)arg0;
        sprlem sprlem2 = sprlem.cfr_renamed_23(sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593().cfr_renamed_284());
        if (sprlem2.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            return new sprywg(sprrah.cfr_renamed_4, new spryjh().cfr_renamed_9521(0).cfr_renamed_9522(sprgfh.cfr_renamed_8400(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).cfr_renamed_9523());
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return new sprywg(sprrah.cfr_renamed_4, new spryjh().cfr_renamed_9521(1).cfr_renamed_9522(sprgfh.cfr_renamed_8400(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).cfr_renamed_9523());
        }
        throw new IllegalArgumentException(sprhfd.cfr_renamed_9("Y\u0006G\u0006C\u001fBHO\u001d^\u001eIHE\u0006\f\u0018Y\n@\u0001OHI\u0006O\u001aU\u0018X\u0001C\u0006\f\u0003I\u0011"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1521() {
        sprgxh sprgxh2;
        byte[] byArray;
        sprrvj sprrvj2;
        sprhfm sprhfm2;
        sprxmh sprxmh2 = ((sprywg)((Object)this.cfr_renamed_4)).cfr_renamed_1157();
        switch (sprxmh2.cfr_renamed_8227()) {
            case 0: {
                sprhfm2 = sprynm.cfr_renamed_7994(sprhr.cfr_renamed_1);
                sprrvj2 = this;
                break;
            }
            case 1: {
                sprhfm2 = sprlfm.cfr_renamed_7994(spris.cfr_renamed_96);
                sprrvj2 = this;
                break;
            }
            default: {
                throw new IllegalStateException(sprxyy.cfr_renamed_9("V^H^LGM\u0010HUZ\u0010WISU"));
            }
        }
        if (!(((sprywg)((Object)sprrvj2.cfr_renamed_4)).cfr_renamed_1157().cfr_renamed_8423() instanceof sprqmh)) {
            throw new IllegalStateException(sprhfd.cfr_renamed_9("I\u0010X\rB\u001bE\u0007BHX\u0007\f\u0018Y\n@\u0001OHZ\r^\u0001J\u0001O\tX\u0001C\u0006\f\u0003I\u0011\f\u0006C\u001c\f\u001bY\u0018\\\u0007^\u001cI\f"));
        }
        sprqmh sprqmh2 = (sprqmh)sprxmh2.cfr_renamed_8423();
        sprgxh sprgxh3 = sprhfm2.cfr_renamed_1769();
        sprqmh sprqmh3 = sprqmh2;
        if (sprqmh2 instanceof sprgfh) {
            byArray = sprqmh3.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
        } else {
            if (!(sprqmh3 instanceof sprdlh)) {
                throw new IllegalStateException(sprxyy.cfr_renamed_9("V^H^LGM\u0010HUZ\u0010WISU"));
            }
            byArray = sprqmh2.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
        }
        spreuh spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511("EC");
            ECParameterSpec eCParameterSpec = sprtwj.cfr_renamed_9386(sprhfm2);
            ECPoint eCPoint = sprtwj.cfr_renamed_9053(spreuh2);
            return keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrvj(sprywg sprywg2, sprrr sprrr2) {
        super((sprywg)arg0);
        void arg0;
        this.cfr_renamed_4 = sprrr2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrvj(PublicKey publicKey, sprrr sprrr2) {
        super(sprrvj.cfr_renamed_9520((PublicKey)arg0));
        void arg0;
        this.cfr_renamed_4 = sprrr2;
    }
}

