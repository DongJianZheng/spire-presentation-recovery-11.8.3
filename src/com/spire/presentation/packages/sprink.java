/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpefa;
import com.spire.presentation.packages.sprxcca;
import com.spire.presentation.packages.sprxjm;
import com.spire.presentation.packages.spryz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;

public class sprink
implements spryz {
    private final Set<String> cfr_renamed_3;
    private static Logger cfr_renamed_4 = Logger.getLogger(sprink.class.getName());

    public static boolean cfr_renamed_9723(String arg0, String arg1, Set<String> arg2) throws IOException {
        block9: {
            block10: {
                int n;
                block12: {
                    block11: {
                        if (!arg1.contains("*")) break block9;
                        n = arg1.indexOf(42);
                        if (n != arg1.lastIndexOf("*")) break block10;
                        if (arg1.contains(sprpefa.cfr_renamed_9("zI"))) break block11;
                        String string = arg1;
                        if (string.charAt(string.length() - 1) != '*') break block12;
                    }
                    return false;
                }
                int n2 = arg1.indexOf(46, n);
                if (arg2 != null && arg2.contains(sprkoe.cfr_renamed_425(arg1.substring(n2)))) {
                    throw new IOException(new StringBuilder().insert(0, sprxcca.cfr_renamed_9("~1E<J9[<\t8")).append(arg1).append(sprpefa.cfr_renamed_9("4G9\u0006 \u0004<\u0002'G?\t;\u0010:G$\u00126\u000b=\u0004t\u0014!\u00012\u000e,I")).toString());
                }
                String string = sprkoe.cfr_renamed_425(arg1.substring(n + 1));
                String string2 = sprkoe.cfr_renamed_425(arg0);
                if (string2.equals(string)) {
                    return false;
                }
                if (string.length() > string2.length()) {
                    return false;
                }
                if (n > 0) {
                    if (string2.startsWith(arg1.substring(0, n)) && string2.endsWith(string)) {
                        String string3 = string2;
                        return string3.substring(n, string3.length() - string.length()).indexOf(46) < 0;
                    }
                    return false;
                }
                if (string2.substring(0, string2.length() - string.length()).indexOf(46) > 0) {
                    return false;
                }
                return string2.endsWith(string);
            }
            return false;
        }
        return arg0.equalsIgnoreCase(arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_9724(String arg0, X509Certificate arg1) throws IOException {
        int n;
        int n2;
        sprxjm[] sprxjmArray;
        try {
            sprxjmArray = arg1.getSubjectAlternativeNames();
            if (sprxjmArray == null) {
                if (arg1.getSubjectX500Principal() == null) {
                    return false;
                }
            } else {
                block7: for (List<?> list : sprxjmArray) {
                    int n3 = ((Number)list.get(0)).intValue();
                    switch (n3) {
                        case 2: {
                            if (!sprink.cfr_renamed_9723(arg0, list.get(1).toString(), this.cfr_renamed_3)) continue block7;
                            return true;
                        }
                        case 7: {
                            if (!InetAddress.getByName(arg0).equals(InetAddress.getByName(list.get(1).toString()))) continue block7;
                            return true;
                        }
                    }
                    if (!cfr_renamed_4.isLoggable(Level.INFO)) continue;
                    List<?> list2 = list;
                    String string = list.get(1) instanceof byte[] ? sprfqe.cfr_renamed_503((byte[])list2.get(1)) : list2.get(1).toString();
                    cfr_renamed_4.log(Level.INFO, new StringBuilder().insert(0, sprxcca.cfr_renamed_9("@?G7[1G?\t,P(Lx")).append(n3).append(sprpefa.cfr_renamed_9("G\"\u00068\u00121GiG")).append(string).toString());
                }
                return false;
            }
            sprxjmArray = sprnbm.cfr_renamed_23(arg1.getSubjectX500Principal().getEncoded()).cfr_renamed_4544();
            n = n2 = sprxjmArray.length - 1;
        }
        catch (Exception exception) {
            throw new sprkfk(exception.getMessage(), exception);
        }
        while (n >= 0) {
            int n4;
            sprxjm sprxjm2 = sprxjmArray[n2];
            sprmem[] sprmemArray = sprxjm2.cfr_renamed_4540();
            int n5 = n4 = 0;
            while (n5 != sprmemArray.length) {
                sprmem sprmem2 = sprmemArray[n4];
                if (sprmem2.cfr_renamed_324().cfr_renamed_5078(sprebm.cfr_renamed_82)) {
                    return sprink.cfr_renamed_9723(arg0, sprmem2.cfr_renamed_97().toString(), this.cfr_renamed_3);
                }
                n5 = ++n4;
            }
            n = --n2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_9713(String arg0, SSLSession arg1) throws IOException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(sprxcca.cfr_renamed_9("qm\u0019a"));
            X509Certificate x509Certificate = (X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(arg1.getPeerCertificates()[0].getEncoded()));
            return this.cfr_renamed_9724(arg0, x509Certificate);
        }
        catch (Exception exception) {
            if (exception instanceof sprkfk) {
                throw (sprkfk)exception;
            }
            throw new sprkfk(exception.getMessage(), exception);
        }
    }

    public sprink(Set<String> set) {
        this.cfr_renamed_3 = set;
    }
}

