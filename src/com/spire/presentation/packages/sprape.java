/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.spruwf;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class sprape {
    public static sprxgf cfr_renamed_36(byte[] arg0) throws IOException {
        return sprxgf.cfr_renamed_184(((sproug)sprxgf.cfr_renamed_184(arg0)).cfr_renamed_186());
    }

    public static Collection cfr_renamed_367(X509Certificate arg0) throws CertificateParsingException {
        return sprape.cfr_renamed_368(arg0.getExtensionValue(sprrdm.cfr_renamed_137.cfr_renamed_19()));
    }

    public static Collection cfr_renamed_369(X509Certificate arg0) throws CertificateParsingException {
        return sprape.cfr_renamed_368(arg0.getExtensionValue(sprrdm.cfr_renamed_3.cfr_renamed_19()));
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
            Enumeration enumeration2 = enumeration = sprcen.cfr_renamed_23(sprape.cfr_renamed_36(arg0)).cfr_renamed_329();
            while (true) {
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
                        arrayList3.add(sprigm2.cfr_renamed_313().cfr_renamed_119());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(sprnbm.cfr_renamed_23(sprigm2.cfr_renamed_313()).toString());
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
                        arrayList3.add(sprfvg.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186());
                        arrayList2 = arrayList;
                        break;
                    }
                    default: {
                        throw new IOException(new StringBuilder().insert(0, spruwf.cfr_renamed_9("m-Kl[-HlA9B.J>\u0015l")).append(sprigm2.cfr_renamed_312()).toString());
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
}

