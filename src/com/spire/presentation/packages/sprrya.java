/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcdb;
import com.spire.presentation.packages.sprdbb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhdb;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxgb;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzoa;
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

public class sprrya
extends KeyFactorySpi {
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.1";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1239(KeySpec arg0) throws InvalidKeySpecException {
        sprdce sprdce2;
        if (arg0 instanceof sprzoa) {
            return new sprdbb((sprzoa)arg0);
        }
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("rkTpWuHwS`C%L`^%TuBfNcNfFqNjI?\u0007")).append(arg0.getClass()).append(".").toString());
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
            return new sprdbb(new sprzoa(cfr_renamed_4, n2, n, byArray2));
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
            sprcdb sprcdb2 = sprcdb.cfr_renamed_23(sprvva2);
            return new sprdbb(sprcdb2.cfr_renamed_113().cfr_renamed_19(), sprcdb2.cfr_renamed_1146(), sprcdb2.cfr_renamed_1144(), sprcdb2.cfr_renamed_1145());
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprlwy.cfr_renamed_9("0X\u0004T\tSEB\n\u0016\u0001S\u0006Y\u0001SEnP\u0006\\s\u000bU\nR\u0000R.S\u001ce\u0015S\u0006"));
        }
    }

    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        return null;
    }

    public KeySpec cfr_renamed_1240(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg0 instanceof sprhdb) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new PKCS8EncodedKeySpec(arg0.getEncoded());
            }
            if (spruna.class.isAssignableFrom(arg1)) {
                sprhdb sprhdb2 = (sprhdb)arg0;
                return new spruna(cfr_renamed_4, sprhdb2.cfr_renamed_1146(), sprhdb2.cfr_renamed_1150(), sprhdb2.cfr_renamed_845(), sprhdb2.cfr_renamed_1147(), sprhdb2.cfr_renamed_1149(), sprhdb2.cfr_renamed_1152(), sprhdb2.cfr_renamed_1151(), sprhdb2.cfr_renamed_1153(), sprhdb2.cfr_renamed_1148());
            }
        } else if (arg0 instanceof sprdbb) {
            if (X509EncodedKeySpec.class.isAssignableFrom(arg1)) {
                return new X509EncodedKeySpec(arg0.getEncoded());
            }
            if (sprzoa.class.isAssignableFrom(arg1)) {
                sprdbb sprdbb2 = (sprdbb)arg0;
                return new sprzoa(cfr_renamed_4, sprdbb2.cfr_renamed_1146(), sprdbb2.cfr_renamed_1144(), sprdbb2.cfr_renamed_1145());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("PIvRuWjUqBa\u0007nB|\u0007q^uB?\u0007")).append(arg0.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("0X\u000eX\nA\u000b\u0016\u000eS\u001c\u0016\u0016F\u0000U\fP\fU\u0004B\fY\u000b\fE")).append(arg1).append(".").toString());
    }

    public Key cfr_renamed_1241(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof sprhdb || arg0 instanceof sprdbb) {
            return arg0;
        }
        throw new InvalidKeyException(sprhql.cfr_renamed_9("rkTpWuHwS`C%L`^%S|W`\t"));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        return null;
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        return null;
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws InvalidKeySpecException {
        try {
            sprvva sprvva2 = arg0.cfr_renamed_1229().cfr_renamed_119();
            sprxgb sprxgb2 = sprxgb.cfr_renamed_23(sprvva2);
            return new sprhdb(sprxgb2.cfr_renamed_113().cfr_renamed_19(), sprxgb2.cfr_renamed_1146(), sprxgb2.cfr_renamed_1150(), sprxgb2.cfr_renamed_845(), sprxgb2.cfr_renamed_1147(), sprxgb2.cfr_renamed_1149(), sprxgb2.cfr_renamed_1152(), sprxgb2.cfr_renamed_1151(), sprxgb2.cfr_renamed_1153(), sprxgb2.cfr_renamed_1148());
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(sprlwy.cfr_renamed_9("c\u000bW\u0007Z\u0000\u0016\u0011YER\u0000U\nR\u0000\u00165}&e]s\u000bU\nR\u0000R.S\u001ce\u0015S\u0006"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_1242(KeySpec arg0) throws InvalidKeySpecException {
        sprmke sprmke2;
        if (arg0 instanceof spruna) {
            return new sprhdb((spruna)arg0);
        }
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("rkTpWuHwS`C%L`^%TuBfNcNfFqNjI?\u0007")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            sprmke2 = sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("PIdEiB%Sj\u0007aBfHaB%wNdV\u001f@IfHaBal`^VW`D?\u0007")).append(iOException).toString());
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
            byte[] byArray6 = ((sprxue)sprbne2.cfr_renamed_85(7)).cfr_renamed_186();
            byte[] byArray7 = ((sprxue)sprbne2.cfr_renamed_85(8)).cfr_renamed_186();
            sprbne sprbne3 = (sprbne)sprbne2.cfr_renamed_85(9);
            byte[][] byArrayArray = new byte[sprbne3.cfr_renamed_84()][];
            int n4 = n = 0;
            while (n4 < sprbne3.cfr_renamed_84()) {
                int n5 = n++;
                byArrayArray[n5] = ((sprxue)sprbne3.cfr_renamed_85(n5)).cfr_renamed_186();
                n4 = n;
            }
            return new sprhdb(new spruna(cfr_renamed_4, n2, n3, byArray2, byArray3, byArray4, byArray5, byArray6, byArray7, byArrayArray));
        }
    }
}

