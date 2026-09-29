/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprcfe;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfmr;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprkgba;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnae;
import com.spire.presentation.packages.sprohc;
import com.spire.presentation.packages.sprpie;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprsie;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprwkd;
import com.spire.presentation.packages.sprwmd;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public class sprjkc {
    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprab) {
            sprab sprab2 = (sprab)arg0;
            sprlpb sprlpb2 = sprab2.cfr_renamed_284();
            if (sprlpb2 == null) {
                sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            }
            return new spreed(sprab2.cfr_renamed_2112(), new sprqid(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_1145(), sprlpb2.cfr_renamed_1146(), sprlpb2.cfr_renamed_1153(), sprlpb2.cfr_renamed_2113()));
        }
        if (arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            sprlpb sprlpb3 = sprijc.cfr_renamed_2328(eCPrivateKey.getParams(), false);
            return new spreed(eCPrivateKey.getS(), new sprqid(sprlpb3.cfr_renamed_1769(), sprlpb3.cfr_renamed_1145(), sprlpb3.cfr_renamed_1146(), sprlpb3.cfr_renamed_1153(), sprlpb3.cfr_renamed_2113()));
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprfmr.cfr_renamed_9("W@\u0019JWLVKPA^\u000f_@K\u000f|l\u0019_KFONMJ\u0019D\\V"));
            }
            PrivateKey privateKey = sprbrb.cfr_renamed_1253(sprmke.cfr_renamed_23(byArray));
            if (privateKey instanceof ECPrivateKey) {
                return sprjkc.cfr_renamed_1220(privateKey);
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprkgba.cfr_renamed_9("u\rx\u0002y\u00186\u0005r\tx\u0018\u007f\noLS/6\u001cd\u0005`\rb\t6\u0007s\u0015,L")).append(exception.toString()).toString());
        }
        throw new InvalidKeyException(sprfmr.cfr_renamed_9("ZNW\bM\u000fPK\\AMF_V\u0019jz\u000fI]PYX[\\\u000fRJ@\u0001"));
    }

    public static int[] cfr_renamed_2472(int[] arg0) {
        int[] nArray = new int[3];
        if (arg0.length == 1) {
            nArray[0] = arg0[0];
            return nArray;
        }
        if (arg0.length != 3) {
            throw new IllegalArgumentException(sprkgba.cfr_renamed_9("Y\u0002z\u001568d\u0005x\u0003{\u0005w\u0000eLw\u0002rLf\tx\u0018w\u0002y\u0001\u007f\rz\u001f6\u001fc\u001cf\u0003d\u0018s\b"));
        }
        if (arg0[0] < arg0[1] && arg0[0] < arg0[2]) {
            nArray[0] = arg0[0];
            if (arg0[1] < arg0[2]) {
                int[] nArray2 = nArray;
                nArray2[1] = arg0[1];
                nArray[2] = arg0[2];
                return nArray2;
            }
            nArray[1] = arg0[2];
            nArray[2] = arg0[1];
            return nArray;
        }
        if (arg0[1] < arg0[2]) {
            nArray[0] = arg0[1];
            if (arg0[0] < arg0[2]) {
                int[] nArray3 = nArray;
                nArray3[1] = arg0[0];
                nArray[2] = arg0[2];
                return nArray3;
            }
            nArray[1] = arg0[2];
            nArray[2] = arg0[0];
            return nArray;
        }
        nArray[0] = arg0[2];
        if (arg0[0] < arg0[1]) {
            int[] nArray4 = nArray;
            nArray4[1] = arg0[0];
            nArray[2] = arg0[1];
            return nArray4;
        }
        nArray[1] = arg0[1];
        nArray[2] = arg0[0];
        return nArray;
    }

    public static sprtzd cfr_renamed_2326(String arg0) {
        sprtzd sprtzd2 = sprpie.cfr_renamed_2103(arg0);
        if (sprtzd2 == null) {
            sprtzd2 = sprsie.cfr_renamed_2103(arg0);
            if (sprtzd2 == null) {
                sprtzd2 = sprnae.cfr_renamed_2103(arg0);
            }
            if (sprtzd2 == null) {
                sprtzd2 = sprcfe.cfr_renamed_2103(arg0);
            }
            if (sprtzd2 == null) {
                sprtzd2 = sprste.cfr_renamed_2103(arg0);
            }
        }
        return sprtzd2;
    }

    public static sprfpd cfr_renamed_2318(sprtzd arg0) {
        sprfpd sprfpd2 = sprwkd.cfr_renamed_2102(arg0);
        if (sprfpd2 == null) {
            sprfpd2 = sprpie.cfr_renamed_2102(arg0);
            if (sprfpd2 == null) {
                sprfpd2 = sprsie.cfr_renamed_2102(arg0);
            }
            if (sprfpd2 == null) {
                sprfpd2 = sprnae.cfr_renamed_2102(arg0);
            }
            if (sprfpd2 == null) {
                sprfpd2 = sprcfe.cfr_renamed_2102(arg0);
            }
        }
        return sprfpd2;
    }

    public static String cfr_renamed_2319(sprtzd arg0) {
        String string = sprpie.cfr_renamed_2316(arg0);
        if (string == null) {
            string = sprsie.cfr_renamed_2316(arg0);
            if (string == null) {
                string = sprnae.cfr_renamed_2316(arg0);
            }
            if (string == null) {
                string = sprcfe.cfr_renamed_2316(arg0);
            }
            if (string == null) {
                string = sprste.cfr_renamed_2316(arg0);
            }
        }
        return string;
    }

    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprvb) {
            sprvb sprvb2 = (sprvb)arg0;
            sprlpb sprlpb2 = sprvb2.cfr_renamed_284();
            if (sprlpb2 == null) {
                sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
                return new sprwmd(((sprohc)sprvb2).cfr_renamed_2307(), new sprqid(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_1145(), sprlpb2.cfr_renamed_1146(), sprlpb2.cfr_renamed_1153(), sprlpb2.cfr_renamed_2113()));
            }
            return new sprwmd(sprvb2.cfr_renamed_1604(), new sprqid(sprlpb2.cfr_renamed_1769(), sprlpb2.cfr_renamed_1145(), sprlpb2.cfr_renamed_1146(), sprlpb2.cfr_renamed_1153(), sprlpb2.cfr_renamed_2113()));
        }
        if (arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            sprlpb sprlpb3 = sprijc.cfr_renamed_2328(eCPublicKey.getParams(), false);
            return new sprwmd(sprijc.cfr_renamed_2313(eCPublicKey.getParams(), eCPublicKey.getW(), false), new sprqid(sprlpb3.cfr_renamed_1769(), sprlpb3.cfr_renamed_1145(), sprlpb3.cfr_renamed_1146(), sprlpb3.cfr_renamed_1153(), sprlpb3.cfr_renamed_2113()));
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprfmr.cfr_renamed_9("AV\u000f\\AZ@]FWH\u0019IV]\u0019jz\u000fIZ[CPL\u0019D\\V"));
            }
            PublicKey publicKey = sprbrb.cfr_renamed_1255(sprdce.cfr_renamed_23(byArray));
            if (publicKey instanceof ECPublicKey) {
                return sprjkc.cfr_renamed_1216(publicKey);
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprkgba.cfr_renamed_9("\u000fw\u0002x\u0003bL\u007f\bs\u0002b\u0005p\u00156)ULf\u0019t\u0000\u007f\u000f6\u0007s\u0015,L")).append(exception.toString()).toString());
        }
        throw new InvalidKeyException(sprfmr.cfr_renamed_9("ZNWAV[\u0019F]JW[PI@\u000f|l\u0019_LMUFZ\u000fRJ@\u0001"));
    }
}

