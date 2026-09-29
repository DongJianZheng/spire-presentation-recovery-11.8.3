/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class sprtua {
    public static Collection cfr_renamed_367(X509Certificate arg0) throws CertificateParsingException {
        return sprtua.cfr_renamed_368(arg0.getExtensionValue(sprfje.cfr_renamed_86.cfr_renamed_19()));
    }

    public static Collection cfr_renamed_369(X509Certificate arg0) throws CertificateParsingException {
        return sprtua.cfr_renamed_368(arg0.getExtensionValue(sprfje.cfr_renamed_3.cfr_renamed_19()));
    }

    public static sprvva cfr_renamed_36(byte[] arg0) throws IOException {
        return sprvva.cfr_renamed_184(((sprxue)sprvva.cfr_renamed_184(arg0)).cfr_renamed_186());
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
            Enumeration enumeration2 = enumeration = sprpse.cfr_renamed_23(sprtua.cfr_renamed_36(arg0)).cfr_renamed_329();
            while (true) {
                ArrayList arrayList2;
                if (!enumeration2.hasMoreElements()) {
                    return Collections.unmodifiableCollection(arrayList);
                }
                sprmee sprmee2 = sprmee.cfr_renamed_23(enumeration.nextElement());
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                sprmee sprmee3 = sprmee2;
                arrayList3.add(spriwa.cfr_renamed_279(sprmee3.cfr_renamed_312()));
                switch (sprmee3.cfr_renamed_312()) {
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList3.add(sprmee2.cfr_renamed_313().cfr_renamed_119());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(spruhe.cfr_renamed_23(sprmee2.cfr_renamed_313()).toString());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList3.add(((sprx)((Object)sprmee2.cfr_renamed_313())).cfr_renamed_314());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 8: {
                        arrayList3.add(sprtzd.cfr_renamed_23(sprmee2.cfr_renamed_313()).cfr_renamed_19());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 7: {
                        arrayList3.add(sprlqe.cfr_renamed_23(sprmee2.cfr_renamed_313()).cfr_renamed_186());
                        arrayList2 = arrayList;
                        break;
                    }
                    default: {
                        throw new IOException(new StringBuilder().insert(0, sprchk.cfr_renamed_9("$}\u0002<\u0012}\u0001<\bi\u000b~\u0003n\\<")).append(sprmee2.cfr_renamed_312()).toString());
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = 5 << 4 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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
}

