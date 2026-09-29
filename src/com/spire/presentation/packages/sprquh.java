/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjbr;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprrbm;
import com.spire.presentation.packages.sprrzm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;

public class sprquh
extends CertStoreSpi {
    private static String cfr_renamed_91;
    private static final String cfr_renamed_0 = "com.sun.jndi.url";
    private sprrai cfr_renamed_1;
    private static String[] cfr_renamed_2;
    private static final String cfr_renamed_3 = "none";
    private static String cfr_renamed_4;

    private /* synthetic */ Set cfr_renamed_2124(X509CertSelector arg0) throws CertStoreException {
        String string;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_1.cfr_renamed_246();
        String[] stringArray2 = stringArray;
        sprquh sprquh2 = this;
        String string2 = sprquh2.cfr_renamed_1.cfr_renamed_248();
        Set set = sprquh2.cfr_renamed_2123(arg0, stringArray2, string2, string = sprquh2.cfr_renamed_1.cfr_renamed_249());
        if (set.isEmpty()) {
            set.addAll(this.cfr_renamed_2121(null, "*", stringArray2));
        }
        return set;
    }

    private /* synthetic */ Set cfr_renamed_2123(X509CertSelector arg0, String[] arg1, String arg2, String arg3) throws CertStoreException {
        HashSet hashSet = new HashSet();
        try {
            if (arg0.getSubjectAsBytes() != null || arg0.getSubjectAsString() != null || arg0.getCertificate() != null) {
                sprquh sprquh2;
                String string = null;
                String string2 = null;
                if (arg0.getCertificate() != null) {
                    X509CertSelector x509CertSelector = arg0;
                    string = x509CertSelector.getCertificate().getSubjectX500Principal().getName(sprqvn.cfr_renamed_9("GHV?\"9,"));
                    string2 = x509CertSelector.getCertificate().getSerialNumber().toString();
                    sprquh2 = this;
                } else if (arg0.getSubjectAsBytes() != null) {
                    string = new X500Principal(arg0.getSubjectAsBytes()).getName(sprjbr.cfr_renamed_9("xyi\u000e\u001d\b\u0013"));
                    sprquh2 = this;
                } else {
                    string = arg0.getSubjectAsString();
                    sprquh2 = this;
                }
                String string3 = sprquh2.cfr_renamed_209(string, arg3);
                hashSet.addAll(this.cfr_renamed_2121(arg2, "*" + string3 + "*", arg1));
                if (string2 != null && this.cfr_renamed_1.cfr_renamed_239() != null) {
                    string3 = string2;
                    arg2 = this.cfr_renamed_1.cfr_renamed_239();
                    hashSet.addAll(this.cfr_renamed_2121(arg2, new StringBuilder().insert(0, "*").append(string3).append("*").toString(), arg1));
                }
            } else {
                hashSet.addAll(this.cfr_renamed_2121(arg2, "*", arg1));
            }
        }
        catch (IOException iOException) {
            throw new CertStoreException(new StringBuilder().insert(0, sprqvn.cfr_renamed_9("pvvkez|a{.e|zmp}fg{i5}pbpmaag45")).append(iOException).toString());
        }
        return hashSet;
    }

    public Collection engineGetCRLs(CRLSelector arg0) throws CertStoreException {
        Object object;
        Object object2;
        Iterator<Object> iterator;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_1.cfr_renamed_251();
        String[] stringArray2 = stringArray;
        if (!(arg0 instanceof X509CRLSelector)) {
            throw new CertStoreException(sprjbr.cfr_renamed_9("YZFZIKEM\nVY\u001fDP^\u001fK\u001fr\n\u001a\u0006imflOSO\\^PX"));
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector)arg0;
        HashSet<Object> hashSet = new HashSet<Object>();
        String string = this.cfr_renamed_1.cfr_renamed_252();
        HashSet hashSet2 = new HashSet();
        if (x509CRLSelector.getIssuerNames() != null) {
            iterator = x509CRLSelector.getIssuerNames().iterator();
            Iterator<Object> iterator2 = iterator;
            while (iterator2.hasNext()) {
                HashSet hashSet3;
                String string2;
                object2 = iterator.next();
                object = null;
                if (object2 instanceof String) {
                    sprquh sprquh2 = this;
                    string2 = sprquh2.cfr_renamed_1.cfr_renamed_253();
                    object = sprquh2.cfr_renamed_209((String)object2, string2);
                    hashSet3 = hashSet2;
                } else {
                    sprquh sprquh3 = this;
                    string2 = sprquh3.cfr_renamed_1.cfr_renamed_253();
                    sprquh sprquh4 = this;
                    object = sprquh3.cfr_renamed_209(new X500Principal((byte[])object2).getName(sprqvn.cfr_renamed_9("GHV?\"9,")), string2);
                    hashSet3 = hashSet2;
                }
                hashSet3.addAll(this.cfr_renamed_2121(string, new StringBuilder().insert(0, "*").append((String)object).append("*").toString(), stringArray2));
                iterator2 = iterator;
            }
        } else {
            hashSet2.addAll(this.cfr_renamed_2121(string, "*", stringArray2));
        }
        hashSet2.addAll(this.cfr_renamed_2121(null, "*", stringArray2));
        iterator = hashSet2.iterator();
        try {
            object2 = CertificateFactory.getInstance(sprjbr.cfr_renamed_9("r\u0011\u001f\u000f\u0013"), "BC");
            while (iterator.hasNext()) {
                object = ((CertificateFactory)object2).generateCRL(new ByteArrayInputStream((byte[])iterator.next()));
                if (!x509CRLSelector.match((CRL)object)) continue;
                hashSet.add(object);
            }
        }
        catch (Exception exception) {
            throw new CertStoreException(new StringBuilder().insert(0, sprqvn.cfr_renamed_9("V\\Y.vo{`zz5lp.va{}a|`makq.s|zc5BQOE.gkf{yz5")).append(exception).toString());
        }
        return hashSet;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Collection engineGetCertificates(CertSelector arg0) throws CertStoreException {
        if (!(arg0 instanceof X509CertSelector)) {
            throw new CertStoreException(sprjbr.cfr_renamed_9("LOSO\\^PX\u001fCL\nQEK\n^\ng\u001f\u000f\u0013|OM^lOSO\\^PX"));
        }
        var2_2 = (X509CertSelector)arg0;
        var3_3 = new HashSet<Certificate>();
        var4_4 = this.cfr_renamed_2125(var2_2);
        var4_4.addAll(this.cfr_renamed_2122(var2_2));
        var4_4.addAll(this.cfr_renamed_2124(var2_2));
        var5_5 = var4_4.iterator();
        try {
            var6_6 = CertificateFactory.getInstance(sprqvn.cfr_renamed_9("M  >,"), "BC");
            block7: while (true) {
                block15: {
                    block14: {
                        v0 = var5_5;
                        while (v0.hasNext() != false) {
                            var7_8 = (byte[])var5_5.next();
                            if (var7_8 == null) continue block7;
                            if (var7_8.length == 0) {
                                v0 = var5_5;
                                continue;
                            }
                            break block14;
                        }
                        return var3_3;
                    }
                    var8_9 = new ArrayList<byte[]>();
                    var8_9.add(var7_8);
                    try {
                        var9_10 = sprrbm.cfr_renamed_23(new sprrzm(var7_8).cfr_renamed_24());
                        var8_9.clear();
                        if (var9_10.cfr_renamed_177() != null) {
                            var8_9.add(var9_10.cfr_renamed_177().cfr_renamed_91());
                        }
                        if (var9_10.cfr_renamed_178() != null) {
                            var8_9.add(var9_10.cfr_renamed_178().cfr_renamed_91());
                        }
                    }
                    catch (IOException var9_11) {
                        v1 = var8_9;
                        break block15;
                    }
                    catch (IllegalArgumentException var9_12) {
                        // empty catch block
                    }
                    v1 = var8_9;
                }
                var9_10 = v1.iterator();
                while (true) {
                    if (var9_10.hasNext()) ** break;
                    continue block7;
                    var10_13 = new ByteArrayInputStream((byte[])var9_10.next());
                    try {
                        var11_14 = var6_6.generateCertificate(var10_13);
                        if (!var2_2.match(var11_14)) continue;
                        var3_3.add(var11_14);
                    }
                    catch (Exception var11_15) {}
                }
                break;
            }
        }
        catch (Exception var6_7) {
            throw new CertStoreException(new StringBuilder().insert(0, sprjbr.cfr_renamed_9("\\OM^VLVI^^Z\n\\KQDP^\u001fHZ\n\\EQYKXJIKO[\nYXPG\u001ff{ko\nMOL_S^\u0005\n")).append(var6_7).toString());
        }
    }

    static {
        char c;
        cfr_renamed_2 = new String[93];
        char c2 = c = '\u0000';
        while (c2 < cfr_renamed_2.length) {
            char c3 = c;
            sprquh.cfr_renamed_2[c3] = String.valueOf(c3);
            c2 = (char)(c + '\u0001');
        }
        sprquh.cfr_renamed_2[42] = sprqvn.cfr_renamed_9("I<t");
        sprquh.cfr_renamed_2[40] = sprjbr.cfr_renamed_9("v\r\u0012");
        sprquh.cfr_renamed_2[41] = sprqvn.cfr_renamed_9("I<,");
        sprquh.cfr_renamed_2[92] = sprjbr.cfr_renamed_9("v\nI");
        sprquh.cfr_renamed_2[0] = sprqvn.cfr_renamed_9("I>%");
        cfr_renamed_4 = "com.sun.jndi.ldap.LdapCtxFactory";
        cfr_renamed_91 = "ignore";
    }

    private /* synthetic */ String cfr_renamed_9059(String arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(arg0.length() * 2);
        int n2 = arg0.length();
        int n3 = n = 0;
        while (n3 < n2) {
            char c = arg0.charAt(n);
            if (c < cfr_renamed_2.length) {
                stringBuilder.append(cfr_renamed_2[c]);
            } else {
                stringBuilder.append(c);
            }
            n3 = ++n;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ Set cfr_renamed_2122(X509CertSelector arg0) throws CertStoreException {
        String string;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_1.cfr_renamed_212();
        String[] stringArray2 = stringArray;
        sprquh sprquh2 = this;
        String string2 = sprquh2.cfr_renamed_1.cfr_renamed_214();
        Set set = sprquh2.cfr_renamed_2123(arg0, stringArray2, string2, string = sprquh2.cfr_renamed_1.cfr_renamed_215());
        if (set.isEmpty()) {
            set.addAll(this.cfr_renamed_2121(null, "*", stringArray2));
        }
        return set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_2121(String arg0, String arg1, String[] arg2) throws CertStoreException {
        String string = new StringBuilder().insert(0, arg0).append("=").append(arg1).toString();
        if (arg0 == null) {
            string = null;
        }
        DirContext dirContext = null;
        HashSet hashSet = new HashSet();
        try {
            SearchControls searchControls;
            dirContext = this.cfr_renamed_224();
            SearchControls searchControls2 = searchControls = new SearchControls();
            searchControls2.setSearchScope(2);
            searchControls2.setCountLimit(0L);
            for (int i = 0; i < arg2.length; ++i) {
                String[] stringArray = new String[]{arg2[i]};
                searchControls.setReturningAttributes(stringArray);
                String string2 = new StringBuilder().insert(0, sprjbr.cfr_renamed_9("\u0002\u0019\u0002")).append(string).append(sprqvn.cfr_renamed_9("'=")).append(stringArray[0]).append(sprjbr.cfr_renamed_9("\u0002\u0000\u0016\u0003")).toString();
                if (string == null) {
                    string2 = new StringBuilder().insert(0, "(").append(stringArray[0]).append(sprqvn.cfr_renamed_9("($<")).toString();
                }
                NamingEnumeration<SearchResult> namingEnumeration = dirContext.search(this.cfr_renamed_1.cfr_renamed_225(), string2, searchControls);
                while (namingEnumeration.hasMoreElements()) {
                    NamingEnumeration<?> namingEnumeration2 = namingEnumeration.next().getAttributes().getAll().next().getAll();
                    while (namingEnumeration2.hasMore()) {
                        NamingEnumeration<?> namingEnumeration3;
                        NamingEnumeration<?> namingEnumeration4 = namingEnumeration3;
                        namingEnumeration2 = namingEnumeration4;
                        Object obj = namingEnumeration4.next();
                        hashSet.add(obj);
                    }
                }
            }
        }
        catch (Exception exception) {
            try {
                throw new CertStoreException(new StringBuilder().insert(0, sprjbr.cfr_renamed_9("zXMEM\nXOK^VDX\nMOL_S^L\nYXPG\u001ff{ko\n[CMO\\^PXF\n")).append(exception).toString());
            }
            catch (Throwable throwable) {
                try {
                    if (null == dirContext) throw throwable;
                    dirContext.close();
                    throw throwable;
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                throw throwable;
            }
        }
        try {
            if (null == dirContext) return hashSet;
            dirContext.close();
            return hashSet;
        }
        catch (Exception exception) {
            return hashSet;
        }
    }

    private /* synthetic */ String cfr_renamed_209(String arg0, String arg1) {
        String string = arg0;
        int n = string.toLowerCase().indexOf(arg1.toLowerCase());
        int n2 = (string = string.substring(n + arg1.length())).indexOf(44);
        if (n2 == -1) {
            n2 = string.length();
        }
        block0: while (true) {
            String string2 = string;
            while (string2.charAt(n2 - 1) == '\\') {
                if ((n2 = string.indexOf(44, n2 + 1)) != -1) continue block0;
                String string3 = string;
                string2 = string3;
                n2 = string3.length();
            }
            break;
        }
        string = string.substring(0, n2);
        n = string.indexOf(61);
        if ((string = string.substring(n + 1)).charAt(0) == ' ') {
            string = string.substring(1);
        }
        if (string.startsWith(sprqvn.cfr_renamed_9("7"))) {
            string = string.substring(1);
        }
        if (string.endsWith(sprjbr.cfr_renamed_9("\b"))) {
            String string4 = string;
            string = string4.substring(0, string4.length() - 1);
        }
        return this.cfr_renamed_9059(string);
    }

    public sprquh(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof sprrai)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprquh.class.getName()).append(sprqvn.cfr_renamed_9("45~t|tcpzp|5c`}a.wk5o5")).append(sprrai.class.getName()).append(sprjbr.cfr_renamed_9("\u001fE]@ZIK ")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_1 = (sprrai)arg0;
    }

    private /* synthetic */ DirContext cfr_renamed_224() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty(sprqvn.cfr_renamed_9("\u007foco;`tc|`r sovzz|l |`|z|oy"), cfr_renamed_4);
        properties.setProperty(sprjbr.cfr_renamed_9("@^\\^\u0004QKRCQM\u0011H^^\\BLCEO"), "0");
        properties.setProperty(sprqvn.cfr_renamed_9("dtxt {oxg{i;~gacgqkg `|y"), this.cfr_renamed_1.cfr_renamed_232());
        properties.setProperty(sprjbr.cfr_renamed_9("UKIK\u0011D^GVDX\u0004YK\\^PXF\u0004JXS\u0004OAXY"), cfr_renamed_0);
        properties.setProperty(sprqvn.cfr_renamed_9("dtxt {oxg{i;|php|goy"), cfr_renamed_91);
        properties.setProperty(sprjbr.cfr_renamed_9("@^\\^\u0004QKRCQM\u0011YZIJXV^F\u0004^_KBZDKC\\KKCPD"), cfr_renamed_3);
        return new InitialDirContext(properties);
    }

    private /* synthetic */ Set cfr_renamed_2125(X509CertSelector arg0) throws CertStoreException {
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_1.cfr_renamed_228();
        String[] stringArray2 = stringArray;
        sprquh sprquh2 = this;
        String string = sprquh2.cfr_renamed_1.cfr_renamed_229();
        String string2 = sprquh2.cfr_renamed_1.cfr_renamed_230();
        return sprquh2.cfr_renamed_2123(arg0, stringArray2, string, string2);
    }
}

