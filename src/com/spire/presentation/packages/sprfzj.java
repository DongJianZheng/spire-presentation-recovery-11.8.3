/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprevy;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprfnh;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfm;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtwj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxwj;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.spryzg;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public class sprfzj
extends sprxwj {
    private final sprrr cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfzj(sprctg sprctg2, sprrr sprrr2) {
        super((sprctg)arg0);
        void arg0;
        this.cfr_renamed_4 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1521() {
        sprgxh sprgxh2;
        byte[] byArray;
        sprhfm sprhfm2;
        sprhfm sprhfm3;
        switch (((sprctg)((Object)this.cfr_renamed_4)).cfr_renamed_8227()) {
            case 0: {
                sprhfm2 = sprhfm3 = sprynm.cfr_renamed_7994(sprhr.cfr_renamed_1);
                break;
            }
            case 1: {
                sprhfm2 = sprhfm3 = sprlfm.cfr_renamed_7994(spris.cfr_renamed_96);
                break;
            }
            case 2: {
                sprhfm2 = sprhfm3 = sprlfm.cfr_renamed_7994(spris.cfr_renamed_93);
                break;
            }
            default: {
                throw new IllegalStateException(sprfbp.cfr_renamed_9("hqvqrhs?vzd?ifmz"));
            }
        }
        sprgxh sprgxh3 = sprhfm2.cfr_renamed_1769();
        if (!(((sprctg)((Object)this.cfr_renamed_4)).cfr_renamed_8367() instanceof sprqmh)) {
            throw new IllegalStateException(sprevy.cfr_renamed_9("X\u0018I\u0005S\u0013T\u000fS@I\u000f\u001d\u0010H\u0002Q\t^@K\u0005O\t[\t^\u0001I\tR\u000e\u001d\u000bX\u0019\u001d\u000eR\u0014\u001d\u0013H\u0010M\u000fO\u0014X\u0004"));
        }
        sprqmh sprqmh2 = (sprqmh)((sprctg)((Object)this.cfr_renamed_4)).cfr_renamed_8367();
        sprqmh sprqmh3 = sprqmh2;
        if (sprqmh2 instanceof sprgfh) {
            byArray = sprqmh3.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
        } else {
            if (!(sprqmh3 instanceof sprdlh)) {
                throw new IllegalStateException(sprfbp.cfr_renamed_9("hqvqrhs?vzd?ifmz"));
            }
            byArray = sprqmh2.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
        }
        spreuh spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511("EC");
            ECParameterSpec eCParameterSpec = sprtwj.cfr_renamed_9386(sprhfm3);
            ECPoint eCPoint = sprtwj.cfr_renamed_9053(spreuh2);
            return keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
    }

    public static sprctg cfr_renamed_9530(ECPublicKey arg0) {
        sprlem sprlem2 = sprlem.cfr_renamed_23(sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593().cfr_renamed_284());
        if (sprlem2.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            return new sprctg(0, sprgfh.cfr_renamed_8405(sprfnh.cfr_renamed_7843().cfr_renamed_8401(arg0.getW().getAffineX()).cfr_renamed_8402(arg0.getW().getAffineY()).cfr_renamed_8403()));
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return new sprctg(1, sprgfh.cfr_renamed_8405(sprfnh.cfr_renamed_7843().cfr_renamed_8401(arg0.getW().getAffineX()).cfr_renamed_8402(arg0.getW().getAffineY()).cfr_renamed_8403()));
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_93)) {
            return new sprctg(2, sprdlh.cfr_renamed_8394(spryzg.cfr_renamed_7843().cfr_renamed_8401(arg0.getW().getAffineX()).cfr_renamed_8402(arg0.getW().getAffineY()).cfr_renamed_9531()));
        }
        throw new IllegalArgumentException(sprevy.cfr_renamed_9("H\u000eV\u000eR\u0017S@^\u0015O\u0016X@T\u000e\u001d\u0010H\u0002Q\t^@X\u000e^\u0012D\u0010I\tR\u000e\u001d\u000bX\u0019"));
    }

    public sprfzj(PublicKey arg0, sprrr arg1) {
        super(sprfzj.cfr_renamed_9530((ECPublicKey)arg0));
        this.cfr_renamed_4 = arg1;
    }
}

