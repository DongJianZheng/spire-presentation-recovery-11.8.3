/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprglm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.spriu;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlom;
import com.spire.presentation.packages.sprlyh;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpsm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpm;
import com.spire.presentation.packages.sprvqm;
import com.spire.presentation.packages.sprwrm;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprxra;
import com.spire.presentation.packages.sprxsm;
import com.spire.presentation.packages.sprzmm;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import sun.security.x509.Extension;

public class sprkrh {
    private static final int cfr_renamed_2 = 15000;
    private static Map<URI, WeakReference<Map<sprssm, sprmom>>> cfr_renamed_3 = Collections.synchronizedMap(new WeakHashMap());
    private static final int cfr_renamed_4 = 32768;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprmom cfr_renamed_9107(sprssm arg0, sprwzj arg1, URI arg2, X509Certificate arg3, List<Extension> arg4, sprrr arg5) throws CertPathValidatorException {
        byte[] byArray;
        int n;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        HashMap<sprssm, sprmom> hashMap = null;
        WeakReference<Map<sprssm, sprmom>> weakReference = cfr_renamed_3.get(arg2);
        if (weakReference != null) {
            hashMap = (HashMap<sprssm, sprmom>)weakReference.get();
        }
        if (hashMap != null && (object5 = (sprmom)hashMap.get(arg0)) != null) {
            int n2;
            object4 = sprzmm.cfr_renamed_23(sproug.cfr_renamed_23(((sprmom)object5).cfr_renamed_4285().cfr_renamed_3262()).cfr_renamed_186());
            object3 = sprxsm.cfr_renamed_23(((sprzmm)object4).cfr_renamed_4315());
            object2 = ((sprxsm)object3).cfr_renamed_4280();
            int n3 = n2 = 0;
            while (n3 != ((sprszm)object2).cfr_renamed_84()) {
                sprvqm sprvqm2 = sprvqm.cfr_renamed_23(((sprszm)object2).cfr_renamed_85(n2));
                if (arg0.equals(sprvqm2.cfr_renamed_4270())) {
                    object = sprvqm2.cfr_renamed_2133();
                    try {
                        if (object != null && arg1.cfr_renamed_9110().after(((sprjfn)object).cfr_renamed_110())) {
                            hashMap.remove(arg0);
                            object5 = null;
                        }
                    }
                    catch (ParseException parseException) {
                        hashMap.remove(arg0);
                        object5 = null;
                    }
                }
                n3 = ++n2;
            }
            if (object5 != null) {
                return object5;
            }
        }
        try {
            object5 = arg2.toURL();
        }
        catch (MalformedURLException malformedURLException) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprjzo.cfr_renamed_9("Z\u0004W\rP\fL\u0019X\u001fP\u0004WK\\\u0019K\u0004KQ\u0019")).append(malformedURLException.getMessage()).toString(), (Throwable)malformedURLException, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
        }
        object4 = new sprrvm();
        ((sprrvm)object4).cfr_renamed_5004(new sprpsm(arg0, null));
        object3 = arg4;
        object2 = new sprrvm();
        byte[] byArray2 = null;
        int n4 = n = 0;
        while (n4 != object3.size()) {
            object = (Extension)object3.get(n);
            byArray = ((Extension)object).getExtensionValue();
            if (spriu.cfr_renamed_4.cfr_renamed_19().equals(((Extension)object).getExtensionId())) {
                byArray2 = byArray;
            }
            ((sprrvm)object2).cfr_renamed_5004(new sprrdm(new sprlem(((Extension)object).getExtensionId().toString()), ((Extension)object).isCritical(), byArray));
            n4 = ++n;
        }
        sprtpm sprtpm2 = new sprtpm(null, (sprszm)new sprcen((sprrvm)object4), sprhgm.cfr_renamed_23(new sprcen((sprrvm)object2)));
        object = null;
        try {
            sprmom sprmom2;
            HttpURLConnection httpURLConnection;
            byArray = new sprwrm(sprtpm2, (sprglm)object).cfr_renamed_91();
            HttpURLConnection httpURLConnection2 = httpURLConnection = (HttpURLConnection)((URL)object5).openConnection();
            HttpURLConnection httpURLConnection3 = httpURLConnection;
            HttpURLConnection httpURLConnection4 = httpURLConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection4.setReadTimeout(15000);
            httpURLConnection4.setDoOutput(true);
            httpURLConnection3.setDoInput(true);
            httpURLConnection3.setRequestMethod(sprxra.cfr_renamed_9("R7Q,"));
            httpURLConnection2.setRequestProperty(sprjzo.cfr_renamed_9("(V\u0005M\u000eW\u001f\u0014\u001f@\u001b\\"), sprxra.cfr_renamed_9("c\br\u0014k\u001bc\fk\u0017lWm\u001bq\b/\ng\tw\u001dq\f"));
            httpURLConnection2.setRequestProperty(sprjzo.cfr_renamed_9("(V\u0005M\u000eW\u001f\u0014\u0007\\\u0005^\u001fQ"), String.valueOf(byArray.length));
            HttpURLConnection httpURLConnection5 = httpURLConnection;
            OutputStream outputStream = httpURLConnection5.getOutputStream();
            outputStream.write(byArray);
            outputStream.flush();
            InputStream inputStream = httpURLConnection5.getInputStream();
            int n5 = httpURLConnection5.getContentLength();
            if (n5 < 0) {
                n5 = 32768;
            }
            if (0 != (sprmom2 = sprmom.cfr_renamed_23(sprkqe.cfr_renamed_474(inputStream, n5))).cfr_renamed_4115().cfr_renamed_9108()) {
                throw new CertPathValidatorException(new StringBuilder().insert(0, sprjzo.cfr_renamed_9("v(j;\u0019\u0019\\\u0018I\u0004W\u000f\\\u0019\u0019\rX\u0002U\u000e]Q\u0019")).append(sprmom2.cfr_renamed_4115().cfr_renamed_97()).toString(), null, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
            }
            boolean bl = false;
            sprlom sprlom2 = sprlom.cfr_renamed_23(sprmom2.cfr_renamed_4285());
            if (sprlom2.cfr_renamed_4286().cfr_renamed_5078(spriu.cfr_renamed_112)) {
                bl = sprlyh.cfr_renamed_9109(sprzmm.cfr_renamed_23(sprlom2.cfr_renamed_3262().cfr_renamed_186()), arg1, byArray2, arg3, arg5);
            }
            if (!bl) {
                throw new CertPathValidatorException(sprxra.cfr_renamed_9("M;Q(\"\ng\u000br\u0017l\u000bgXd\u0019k\u0014g\u001c\"\fmXt\u0019n\u0011f\u0019v\u001d"), null, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
            }
            weakReference = cfr_renamed_3.get(arg2);
            if (weakReference != null) {
                hashMap = (Map)weakReference.get();
                sprmom sprmom3 = sprmom2;
                hashMap.put(arg0, sprmom3);
                return sprmom3;
            }
            hashMap = new HashMap<sprssm, sprmom>();
            hashMap.put(arg0, sprmom2);
            cfr_renamed_3.put(arg2, new WeakReference(hashMap));
            return sprmom2;
        }
        catch (IOException iOException) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprxra.cfr_renamed_9("\u001bm\u0016d\u0011e\rp\u0019v\u0011m\u0016\"\u001dp\nm\n8X")).append(iOException.getMessage()).toString(), (Throwable)iOException, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
        }
    }
}

