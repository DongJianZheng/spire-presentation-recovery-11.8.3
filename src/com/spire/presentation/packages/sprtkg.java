/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcng;
import com.spire.presentation.packages.sprito;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprtul;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

public class sprtkg {
    private static final int cfr_renamed_3 = 15000;
    private static Map<URI, WeakReference<sprkl>> cfr_renamed_4 = Collections.synchronizedMap(new WeakHashMap());

    private static /* synthetic */ Collection cfr_renamed_7338(CertificateFactory arg0, URI arg1) throws IOException, CRLException {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = httpURLConnection = (HttpURLConnection)arg1.toURL().openConnection();
        httpURLConnection2.setConnectTimeout(15000);
        httpURLConnection2.setReadTimeout(15000);
        InputStream inputStream = httpURLConnection2.getInputStream();
        Collection<? extends CRL> collection = arg0.generateCRLs(inputStream);
        inputStream.close();
        return collection;
    }

    public static synchronized sprkl cfr_renamed_7276(CertificateFactory arg0, Date arg1, URI arg2) throws IOException, CRLException {
        Object object;
        sprkl sprkl2 = null;
        WeakReference<sprkl> weakReference = cfr_renamed_4.get(arg2);
        if (weakReference != null) {
            sprkl2 = (sprkl)weakReference.get();
        }
        if (sprkl2 != null) {
            boolean bl;
            block4: {
                boolean bl2 = false;
                object = sprkl2.cfr_renamed_3216(null).iterator();
                while (object.hasNext()) {
                    Date date = ((X509CRL)object.next()).getNextUpdate();
                    if (date == null || !date.before(arg1)) continue;
                    bl = bl2 = true;
                    break block4;
                }
                bl = bl2;
            }
            if (!bl) {
                return sprkl2;
            }
        }
        CertificateFactory certificateFactory = arg0;
        Collection collection = arg2.getScheme().equals(sprito.cfr_renamed_9("7f:r")) ? sprtkg.cfr_renamed_7339(certificateFactory, arg2) : sprtkg.cfr_renamed_7338(certificateFactory, arg2);
        object = new sprcng(new sprtul<CRL>(collection));
        cfr_renamed_4.put(arg2, new WeakReference<Object>(object));
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_7339(CertificateFactory arg0, URI arg1) throws IOException, CRLException {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put(sprqzo.cfr_renamed_9("!1=1e>*=\">,~-1($$\"2~\">\"$\"1'"), "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put(sprito.cfr_renamed_9("1c-cul:o2l<,+p4t2f>puw)n"), arg1.toString());
        byte[] byArray = null;
        try {
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            byArray = (byte[])initialDirContext.getAttributes("").get(sprqzo.cfr_renamed_9("3.\"?9-9(1?5\u00195=?(1?9$>\u000798$p2\">*\"2")).get();
        }
        catch (NamingException namingException) {
            throw new CRLException(new StringBuilder().insert(0, sprito.cfr_renamed_9("k(q.g{a4l5g8v2l<\"/ma\"")).append(arg1.toString()).toString(), namingException);
        }
        if (byArray != null && byArray.length != 0) {
            return arg0.generateCRLs(new ByteArrayInputStream(byArray));
        }
        throw new CRLException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9(">$p\b\u0002\u0007p95?%9>.4k69?&jk")).append(arg1).toString());
    }
}

