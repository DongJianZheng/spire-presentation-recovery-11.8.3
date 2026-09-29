/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprato;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriyl;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprttl;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzne;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

public class sprrvl
extends sprttl {
    public sprzne cfr_renamed_9502(PublicKey arg0) {
        return super.cfr_renamed_10868(sprvhm.cfr_renamed_23(arg0.getEncoded()));
    }

    public static Collection cfr_renamed_367(X509Certificate arg0) throws CertificateParsingException {
        return sprrvl.cfr_renamed_368(arg0.getExtensionValue(sprrdm.cfr_renamed_137.cfr_renamed_19()));
    }

    public static sprxgf cfr_renamed_7291(byte[] arg0) throws IOException {
        return sprxgf.cfr_renamed_184(sproug.cfr_renamed_23(arg0).cfr_renamed_186());
    }

    public sprzne cfr_renamed_10927(PublicKey arg0, spraem arg1, BigInteger arg2) {
        return super.cfr_renamed_10872(sprvhm.cfr_renamed_23(arg0.getEncoded()), arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprzne cfr_renamed_9500(X509Certificate x509Certificate) throws CertificateEncodingException {
        void arg0;
        return super.cfr_renamed_10873(new sprowl((X509Certificate)arg0));
    }

    public sprrvl(sprjj arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_368(byte[] arg0) throws CertificateParsingException {
        if (arg0 == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            Enumeration enumeration;
            ArrayList arrayList = new ArrayList();
            Enumeration enumeration2 = enumeration = sprcen.cfr_renamed_23(sprrvl.cfr_renamed_7291(arg0)).cfr_renamed_329();
            block11: while (true) {
                ArrayList arrayList2;
                if (!enumeration2.hasMoreElements()) {
                    return Collections.unmodifiableCollection(arrayList);
                }
                sprigm sprigm2 = sprigm.cfr_renamed_23(enumeration.nextElement());
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                sprigm sprigm3 = sprigm2;
                arrayList3.add(spruaf.cfr_renamed_279(sprigm3.cfr_renamed_312()));
                switch (sprigm3.cfr_renamed_312()) {
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList3.add(sprigm2.cfr_renamed_91());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(sprnbm.cfr_renamed_9063(sprkdm.cfr_renamed_952, sprigm2.cfr_renamed_313()).toString());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList3.add(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 8: {
                        arrayList3.add(sprlem.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_19());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 7: {
                        String string;
                        byte[] byArray = sprfvg.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186();
                        try {
                            string = InetAddress.getByAddress(byArray).getHostAddress();
                        }
                        catch (UnknownHostException unknownHostException) {
                            enumeration2 = enumeration;
                            continue block11;
                        }
                        arrayList3.add(string);
                        arrayList2 = arrayList;
                        break;
                    }
                    default: {
                        throw new IOException(new StringBuilder().insert(0, sprato.cfr_renamed_9("X!~`n!}`t5w\"\u007f2 `")).append(sprigm2.cfr_renamed_312()).toString());
                    }
                }
                arrayList2.add(arrayList3);
                enumeration2 = enumeration;
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(exception.getMessage());
        }
    }

    public sprvim cfr_renamed_10928(PublicKey arg0) {
        return super.cfr_renamed_10871(sprvhm.cfr_renamed_23(arg0.getEncoded()));
    }

    public sprrvl() throws NoSuchAlgorithmException {
        super(new spriyl(MessageDigest.getInstance("SHA1")));
    }

    public sprvim cfr_renamed_9499(PublicKey arg0) {
        return super.cfr_renamed_10870(sprvhm.cfr_renamed_23(arg0.getEncoded()));
    }

    public static Collection cfr_renamed_369(X509Certificate arg0) throws CertificateParsingException {
        return sprrvl.cfr_renamed_368(arg0.getExtensionValue(sprrdm.cfr_renamed_3.cfr_renamed_19()));
    }

    public sprzne cfr_renamed_10929(PublicKey arg0, X500Principal arg1, BigInteger arg2) {
        return super.cfr_renamed_10872(sprvhm.cfr_renamed_23(arg0.getEncoded()), new spraem(new sprigm(sprnbm.cfr_renamed_23(arg1.getEncoded()))), arg2);
    }
}

