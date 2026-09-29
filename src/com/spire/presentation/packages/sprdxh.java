/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprpoh;
import com.spire.presentation.packages.sprsjo;
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

public class sprdxh {
    private static Map<URI, WeakReference<sprkl>> cfr_renamed_3 = Collections.synchronizedMap(new WeakHashMap());
    private static final int cfr_renamed_4 = 15000;

    public static synchronized sprkl cfr_renamed_7276(CertificateFactory arg0, Date arg1, URI arg2) throws IOException, CRLException {
        Object object;
        sprkl sprkl2 = null;
        WeakReference<sprkl> weakReference = cfr_renamed_3.get(arg2);
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
        Collection collection = arg2.getScheme().equals(sprsjo.cfr_renamed_9(" i-}")) ? sprdxh.cfr_renamed_7339(certificateFactory, arg2) : sprdxh.cfr_renamed_7338(certificateFactory, arg2);
        object = new sprpoh(new sprtul<CRL>(collection));
        cfr_renamed_3.put(arg2, new WeakReference<Object>(object));
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_7339(CertificateFactory arg0, URI arg1) throws IOException, CRLException {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put(sprfke.cfr_renamed_9("![=[eT*W\"T,\u0014-[(N$H2\u0014\"T\"N\"['"), "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put(sprsjo.cfr_renamed_9("&l:lbc-`%c+#<\u007f#{%i)\u007fbx>a"), arg1.toString());
        byte[] byArray = null;
        try {
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            byArray = (byte[])initialDirContext.getAttributes("").get(sprfke.cfr_renamed_9("Y.H?S-S([?_\u0019_=U([?S$T\u0007S8NpX\"T*H2")).get();
        }
        catch (NamingException namingException) {
            throw new CRLException(new StringBuilder().insert(0, sprsjo.cfr_renamed_9("d?~9hln#c\"h/y%c+-8bv-")).append(arg1.toString()).toString(), namingException);
        }
        if (byArray != null && byArray.length != 0) {
            return arg0.generateCRLs(new ByteArrayInputStream(byArray));
        }
        throw new CRLException(new StringBuilder().insert(0, sprfke.cfr_renamed_9("T$\u001a\bh\u0007\u001a9_?O9T.^k\\9U&\u0000k")).append(arg1).toString());
    }

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
}

