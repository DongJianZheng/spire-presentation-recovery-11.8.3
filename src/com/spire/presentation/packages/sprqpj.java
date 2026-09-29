/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrqj;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprscf;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprttl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;

public class sprqpj {
    public static sprqxk cfr_renamed_9375(sprqw arg0, sprcgm arg1) {
        if (arg1.cfr_renamed_2317()) {
            sprlem sprlem2 = sprlem.cfr_renamed_23(arg1.cfr_renamed_284());
            sprhfm sprhfm2 = sprqpj.cfr_renamed_9156(sprlem2);
            if (sprhfm2 == null) {
                sprhfm2 = (sprhfm)arg0.cfr_renamed_9167().get(sprlem2);
            }
            sprxrk sprxrk2 = new sprxrk(sprlem2, sprhfm2);
            return sprxrk2;
        }
        if (arg1.cfr_renamed_2320()) {
            sprrxh sprrxh2 = arg0.cfr_renamed_2312();
            sprqxk sprqxk2 = new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113());
            return sprqxk2;
        }
        sprhfm sprhfm3 = sprhfm.cfr_renamed_23(arg1.cfr_renamed_284());
        sprqxk sprqxk3 = new sprqxk(sprhfm3.cfr_renamed_1769(), sprhfm3.cfr_renamed_1145(), sprhfm3.cfr_renamed_1146(), sprhfm3.cfr_renamed_1153(), sprhfm3.cfr_renamed_2113());
        return sprqxk3;
    }

    public static String cfr_renamed_9376(String arg0, spreuh arg1, sprrxh arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprttl.cfr_renamed_9("'Crqkzd3Lv~3\\")).append(sprqpj.cfr_renamed_9377(arg1, arg2)).append("]").append(string);
        stringBuffer3.append(sprlfo.cfr_renamed_9("u2u2u2u2u2u2\r(u")).append(arg1.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer.append(sprttl.cfr_renamed_9("'3'3'3'3'3'3^)'")).append(arg1.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    public static sprqxk cfr_renamed_9378(sprqw arg0, sprrxh arg1) {
        if (arg1 instanceof spreph) {
            spreph spreph2 = (spreph)arg1;
            sprlem sprlem2 = sprqpj.cfr_renamed_2326(spreph2.cfr_renamed_313());
            sprxrk sprxrk2 = new sprxrk(sprlem2, spreph2.cfr_renamed_1769(), spreph2.cfr_renamed_1145(), spreph2.cfr_renamed_1146(), spreph2.cfr_renamed_1153(), spreph2.cfr_renamed_2113());
            return sprxrk2;
        }
        if (arg1 == null) {
            sprrxh sprrxh2 = arg0.cfr_renamed_2312();
            sprqxk sprqxk2 = new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113());
            return sprqxk2;
        }
        sprqxk sprqxk3 = new sprqxk(arg1.cfr_renamed_1769(), arg1.cfr_renamed_1145(), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153(), arg1.cfr_renamed_2113());
        return sprqxk3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprlem cfr_renamed_2103(String arg0) {
        char c = arg0.charAt(0);
        if (c >= '0' && c <= '2') {
            try {
                return new sprlem(arg0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprxo) {
            sprxo sprxo2 = (sprxo)arg0;
            sprrxh sprrxh2 = sprxo2.cfr_renamed_284();
            if (sprrxh2 == null) {
                sprrxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            }
            if (sprxo2.cfr_renamed_284() instanceof spreph) {
                String string = ((spreph)sprxo2.cfr_renamed_284()).cfr_renamed_313();
                return new sprzuk(sprxo2.cfr_renamed_2112(), (sprqxk)new sprxrk(sprnhm.cfr_renamed_2103(string), sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113()));
            }
            return new sprzuk(sprxo2.cfr_renamed_2112(), new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113()));
        }
        if (arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            sprrxh sprrxh3 = sprnlj.cfr_renamed_9150(eCPrivateKey.getParams());
            return new sprzuk(eCPrivateKey.getS(), new sprqxk(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_1145(), sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153(), sprrxh3.cfr_renamed_2113()));
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprlfo.cfr_renamed_9("|:20|6}1{;uut:`uW\u00162%`<d4f02>w,"));
            }
            PrivateKey privateKey = sprsci.cfr_renamed_5729(sprcom.cfr_renamed_23(byArray));
            if (privateKey instanceof ECPrivateKey) {
                return sprqpj.cfr_renamed_1220(privateKey);
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprttl.cfr_renamed_9("pf}i|s3nwb}szaj'VD3wanefgb3lv~)'")).append(exception.toString()).toString());
        }
        throw new InvalidKeyException(sprlfo.cfr_renamed_9("q4|rfu{1w;f<t,2\u0010Qub'{#s!wuy0k{"));
    }

    public static sprlem cfr_renamed_2326(String arg0) {
        sprlem sprlem2;
        if (null == arg0 || arg0.length() < 1) {
            return null;
        }
        int n = arg0.indexOf(32);
        if (n > 0) {
            arg0 = arg0.substring(n + 1);
        }
        if (null != (sprlem2 = sprqpj.cfr_renamed_2103(arg0))) {
            return sprlem2;
        }
        return sprnhm.cfr_renamed_2103(arg0);
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprxz) {
            sprxz sprxz2 = (sprxz)arg0;
            sprrxh sprrxh2 = sprxz2.cfr_renamed_284();
            return new sprnzk(sprxz2.cfr_renamed_1604(), new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113()));
        }
        if (arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            sprrxh sprrxh3 = sprnlj.cfr_renamed_9150(eCPublicKey.getParams());
            return new sprnzk(sprnlj.cfr_renamed_9155(eCPublicKey.getParams(), eCPublicKey.getW()), new sprqxk(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_1145(), sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153(), sprrxh3.cfr_renamed_2113()));
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprttl.cfr_renamed_9("i|'viphwn}`3a|u3BP'crqkzd3lv~"));
            }
            PublicKey publicKey = sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(byArray));
            if (publicKey instanceof ECPublicKey) {
                return sprqpj.cfr_renamed_1216(publicKey);
            }
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprlfo.cfr_renamed_9("6s;|:fu{1w;f<t,2\u0010Qub p9{62>w,(u")).append(exception.toString()).toString());
        }
        throw new InvalidKeyException(sprttl.cfr_renamed_9("pf}i|s3nwb}szaj'VD3wfe\u007fnp'xbj)"));
    }

    public static sprhfm cfr_renamed_9156(sprlem arg0) {
        sprhfm sprhfm2 = sprchl.cfr_renamed_7994(arg0);
        if (sprhfm2 == null) {
            sprhfm2 = sprnhm.cfr_renamed_7994(arg0);
        }
        return sprhfm2;
    }

    public static String cfr_renamed_5672(AlgorithmParameterSpec arg0) {
        return (String)AccessController.doPrivileged(new sprrqj(arg0));
    }

    public static String cfr_renamed_9377(spreuh arg0, sprrxh arg1) {
        sprrxh sprrxh2 = arg1;
        sprgxh sprgxh2 = sprrxh2.cfr_renamed_1769();
        spreuh spreuh2 = sprrxh2.cfr_renamed_1145();
        if (sprgxh2 != null) {
            return new sprscf(sproze.cfr_renamed_526(arg0.cfr_renamed_1972(false), sprgxh2.cfr_renamed_1778().cfr_renamed_91(), sprgxh2.cfr_renamed_1997().cfr_renamed_91(), spreuh2.cfr_renamed_1972(false))).toString();
        }
        return new sprscf(arg0.cfr_renamed_1972(false)).toString();
    }

    public static int cfr_renamed_9160(sprqw arg0, BigInteger arg1, BigInteger arg2) {
        if (arg1 == null) {
            if (arg0 == null) {
                return arg2.bitLength();
            }
            sprrxh sprrxh2 = arg0.cfr_renamed_2312();
            if (sprrxh2 == null) {
                return arg2.bitLength();
            }
            return sprrxh2.cfr_renamed_1146().bitLength();
        }
        return arg1.bitLength();
    }

    public static String cfr_renamed_7554(sprlem arg0) {
        return sprnhm.cfr_renamed_7555(arg0);
    }

    public static sprhfm cfr_renamed_9379(String arg0) {
        sprhfm sprhfm2 = sprchl.cfr_renamed_1837(arg0);
        if (sprhfm2 == null) {
            sprhfm2 = sprnhm.cfr_renamed_1837(arg0);
        }
        return sprhfm2;
    }

    public static String cfr_renamed_9380(String arg0, BigInteger arg1, sprrxh arg2) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        spreuh spreuh2 = new sprzph().cfr_renamed_8926(arg2.cfr_renamed_1145(), arg1).cfr_renamed_1775();
        StringBuffer stringBuffer2 = stringBuffer.append(arg0);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprlfo.cfr_renamed_9("2\u0005`<d4f02\u001ew,2\u000e")).append(sprqpj.cfr_renamed_9377(spreuh2, arg2)).append("]").append(string);
        stringBuffer3.append(sprttl.cfr_renamed_9("'3'3'3'3'3'3_)'")).append(spreuh2.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer.append(sprlfo.cfr_renamed_9("u2u2u2u2u2u2\f(u")).append(spreuh2.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    public static int[] cfr_renamed_2472(int[] arg0) {
        int[] nArray = new int[3];
        if (arg0.length == 1) {
            nArray[0] = arg0[0];
            return nArray;
        }
        if (arg0.length != 3) {
            throw new IllegalArgumentException(sprttl.cfr_renamed_9("\\i\u007f~3San}h~nrk`'riw'cb}sri|jzf\u007ft3tfwchasvc"));
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

    public static sprlem cfr_renamed_9381(sprrxh arg0) {
        Enumeration enumeration = sprnhm.cfr_renamed_289();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            sprhfm sprhfm2 = sprnhm.cfr_renamed_1837(string);
            if (!sprhfm2.cfr_renamed_1146().equals(arg0.cfr_renamed_1146()) || !sprhfm2.cfr_renamed_1153().equals(arg0.cfr_renamed_1153()) || !sprhfm2.cfr_renamed_1769().cfr_renamed_8896(arg0.cfr_renamed_1769()) || !sprhfm2.cfr_renamed_1145().cfr_renamed_8927(arg0.cfr_renamed_1145())) continue;
            return sprnhm.cfr_renamed_2103(string);
        }
        return null;
    }
}

