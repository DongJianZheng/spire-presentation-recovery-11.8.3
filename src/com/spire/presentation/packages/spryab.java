/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhzz;
import com.spire.presentation.packages.sprjab;
import com.spire.presentation.packages.sprjaz;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnhb;
import com.spire.presentation.packages.sprodb;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprreb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxoa;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzna;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class spryab
extends KeyFactorySpi {
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.2";

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_1242(KeySpec arg0) throws InvalidKeySpecException {
        sprmke sprmke2;
        if (arg0 instanceof sprxoa) {
            return new sprreb((sprxoa)arg0);
        }
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhzz.cfr_renamed_9("iqOjLoSmHzX?WzE?OoY|UyU|]kUpR%\u001c")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            sprmke2 = sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhzz.cfr_renamed_9("JR~^sY?Hp\u001c{Y|S{Y?lT\u007fL\u0004ZR|S{Y{wzELLz_%\u001c")).append(iOException).toString());
        }
        {
            int n;
            sprvva sprvva2 = sprmke2.cfr_renamed_1229().cfr_renamed_119();
            sprbne sprbne2 = (sprbne)sprvva2;
            String string = ((sprtzd)sprbne2.cfr_renamed_85(0)).toString();
            int n2 = ((sprooe)sprbne2.cfr_renamed_85(1)).cfr_renamed_97().intValue();
            int n3 = ((sprooe)sprbne2.cfr_renamed_85(2)).cfr_renamed_97().intValue();
            byte[] byArray2 = ((sprxue)sprbne2.cfr_renamed_85(3)).cfr_renamed_186();
            byte[] byArray3 = ((sprxue)sprbne2.cfr_renamed_85(4)).cfr_renamed_186();
            byte[] byArray4 = ((sprxue)sprbne2.cfr_renamed_85(5)).cfr_renamed_186();
            byte[] byArray5 = ((sprxue)sprbne2.cfr_renamed_85(6)).cfr_renamed_186();
            sprbne sprbne3 = (sprbne)sprbne2.cfr_renamed_85(7);
            byte[][] byArrayArray = new byte[sprbne3.cfr_renamed_84()][];
            int n4 = n = 0;
            while (n4 < sprbne3.cfr_renamed_84()) {
                int n5 = n++;
                byArrayArray[n5] = ((sprxue)sprbne3.cfr_renamed_85(n5)).cfr_renamed_186();
                n4 = n;
            }
            return new sprreb(new sprxoa(cfr_renamed_4, n2, n3, byArray2, byArray3, byArray4, byArray5, byArrayArray));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1226(sprdce arg0) throws InvalidKeySpecException {
        try {
            sprvva sprvva2 = arg0.cfr_renamed_1227();
            sprnhb sprnhb2 = sprnhb.cfr_renamed_23((sprbne)sprvva2);
            return new sprodb(sprnhb2.cfr_renamed_113().cfr_renamed_19(), sprnhb2.cfr_renamed_1146(), sprnhb2.cfr_renamed_1144(), sprnhb2.cfr_renamed_1145());
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprjaz.cfr_renamed_9("\u001aV.Z#]oL \u0018+],W+]o`z\bv}![ \\*\\\u0004]6k?],"));
        }
    }

    public Key cfr_renamed_1241(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprreb || arg0 instanceof sprodb) {
            return arg0;
        }
        throw new InvalidKeyException(sprhzz.cfr_renamed_9("iqOjLoSmHzX?WzE?HfLz\u0012"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws InvalidKeySpecException {
        try {
            sprvva sprvva2 = arg0.cfr_renamed_1229().cfr_renamed_119();
            sprjab sprjab2 = sprjab.cfr_renamed_23(sprvva2);
            return new sprreb(sprjab2.cfr_renamed_113().cfr_renamed_19(), sprjab2.cfr_renamed_1146(), sprjab2.cfr_renamed_1150(), sprjab2.cfr_renamed_845(), sprjab2.cfr_renamed_1147(), sprjab2.cfr_renamed_1155(), sprjab2.cfr_renamed_1153(), sprjab2.cfr_renamed_1148());
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprjaz.cfr_renamed_9("m!Y-T*\u0018;Wo\\*[ \\*\u0018\u001fs\fkw}![ \\*\\\u0004]6k?],"));
        }
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1239(KeySpec arg0) throws InvalidKeySpecException {
        sprdce sprdce2;
        if (arg0 instanceof sprzna) {
            return new sprodb((sprzna)arg0);
        }
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprjaz.cfr_renamed_9("\u001aV<M?H J;]+\u0018$]6\u0018<H*[&^&[.L&W!\u0002o")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(iOException.toString());
        }
        {
            sprvva sprvva2 = sprdce2.cfr_renamed_1227();
            sprbne sprbne2 = (sprbne)sprvva2;
            String string = ((sprtzd)sprbne2.cfr_renamed_85(0)).toString();
            int n = ((sprooe)sprbne2.cfr_renamed_85(1)).cfr_renamed_97().intValue();
            int n2 = ((sprooe)sprbne2.cfr_renamed_85(2)).cfr_renamed_97().intValue();
            byte[] byArray2 = ((sprxue)sprbne2.cfr_renamed_85(3)).cfr_renamed_186();
            return new sprodb(new sprzna(cfr_renamed_4, n, n2, byArray2));
        }
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        return null;
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        return null;
    }

    public KeySpec cfr_renamed_1240(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprreb) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
            if (sprxoa.class.isAssignableFrom(arg1)) {
                sprreb sprreb2 = (sprreb)arg0;
                return new sprxoa(cfr_renamed_4, sprreb2.cfr_renamed_1146(), sprreb2.cfr_renamed_1150(), sprreb2.cfr_renamed_845(), sprreb2.cfr_renamed_1147(), sprreb2.cfr_renamed_1155(), sprreb2.cfr_renamed_1153(), sprreb2.cfr_renamed_1148());
            }
        } else if (arg0 instanceof sprodb) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
            if (sprzna.class.isAssignableFrom(arg1)) {
                sprodb sprodb2 = (sprodb)arg0;
                return new sprzna(cfr_renamed_4, sprodb2.cfr_renamed_1146(), sprodb2.cfr_renamed_1144(), sprodb2.cfr_renamed_1145());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhzz.cfr_renamed_9("JRlIoLpNkY{\u001ctYf\u001ckEoY%\u001c")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprjaz.cfr_renamed_9("\u001aV$V O!\u0018$]6\u0018<H*[&^&[.L&W!\u0002o")).append(arg1).append(".").toString());
    }
}

