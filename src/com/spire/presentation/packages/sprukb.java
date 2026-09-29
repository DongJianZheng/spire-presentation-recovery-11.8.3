/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprrae;
import com.spire.presentation.packages.sprver;
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

public class sprukb
extends CertStoreSpi {
    private static String cfr_renamed_0;
    private static String cfr_renamed_1;
    private sprblb cfr_renamed_2;
    private static final String cfr_renamed_3 = "com.sun.jndi.url";
    private static final String cfr_renamed_4 = "none";

    public Collection engineGetCRLs(CRLSelector arg0) throws CertStoreException {
        Object object;
        Object object2;
        Iterator<Object> iterator;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_2.cfr_renamed_251();
        String[] stringArray2 = stringArray;
        if (!(arg0 instanceof X509CRLSelector)) {
            throw new CertStoreException(sprgtb.cfr_renamed_9("p\u001fo\u001f`\u000el\b#\u0013pZm\u0015wZbZ[O3C@(O)f\u0016f\u0019w\u0015q"));
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector)arg0;
        HashSet<Object> hashSet = new HashSet<Object>();
        String string = this.cfr_renamed_2.cfr_renamed_252();
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
                    sprukb sprukb2 = this;
                    string2 = sprukb2.cfr_renamed_2.cfr_renamed_253();
                    object = sprukb2.cfr_renamed_209((String)object2, string2);
                    hashSet3 = hashSet2;
                } else {
                    sprukb sprukb3 = this;
                    string2 = sprukb3.cfr_renamed_2.cfr_renamed_253();
                    sprukb sprukb4 = this;
                    object = sprukb3.cfr_renamed_209(new X500Principal((byte[])object2).getName(sprver.cfr_renamed_9("\u0002b\u0013\u0015g\u0013i")), string2);
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
            object2 = CertificateFactory.getInstance(sprgtb.cfr_renamed_9("[T6J:"), "BC");
            while (iterator.hasNext()) {
                object = ((CertificateFactory)object2).generateCRL(new ByteArrayInputStream((byte[])iterator.next()));
                if (!x509CRLSelector.match((CRL)object)) continue;
                hashSet.add(object);
            }
        }
        catch (Exception exception) {
            throw new CertStoreException(new StringBuilder().insert(0, sprver.cfr_renamed_9("\u0013v\u001c\u00043E>J?PpF5\u00043K>W$V%G$A4\u00046V?Iph\u0014e\u0000\u0004\"A#Q<Pp")).append(exception).toString());
        }
        return hashSet;
    }

    public sprukb(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof sprblb)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprukb.class.getName()).append(sprgtb.cfr_renamed_9("@#\nb\bb\u0017f\u000ef\b#\u0017v\twZa\u001f#\u001b#")).append(sprblb.class.getName()).append(sprver.cfr_renamed_9("\u0004?F:A3PZ")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_2 = (sprblb)arg0;
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
        if (string.startsWith(sprgtb.cfr_renamed_9("!"))) {
            string = string.substring(1);
        }
        if (string.endsWith(sprver.cfr_renamed_9("r"))) {
            String string4 = string;
            string = string4.substring(0, string4.length() - 1);
        }
        return string;
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
                String string2 = new StringBuilder().insert(0, sprgtb.cfr_renamed_9("+\\+")).append(string).append(sprver.cfr_renamed_9("\rx")).append(stringArray[0]).append(sprgtb.cfr_renamed_9("G)S*")).toString();
                if (string == null) {
                    string2 = new StringBuilder().insert(0, "(").append(stringArray[0]).append(sprver.cfr_renamed_9("m\u000ey")).toString();
                }
                NamingEnumeration<SearchResult> namingEnumeration = dirContext.search(this.cfr_renamed_2.cfr_renamed_225(), string2, searchControls);
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
                throw new CertStoreException(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("?q\bl\b#\u001df\u000ew\u0013m\u001d#\bf\tv\u0016w\t#\u001cq\u0015nZO>B*#\u001ej\bf\u0019w\u0015q\u0003#")).append(exception).toString());
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

    private /* synthetic */ Set cfr_renamed_2122(X509CertSelector arg0) throws CertStoreException {
        String string;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_2.cfr_renamed_212();
        String[] stringArray2 = stringArray;
        sprukb sprukb2 = this;
        String string2 = sprukb2.cfr_renamed_2.cfr_renamed_214();
        Set set = sprukb2.cfr_renamed_2123(arg0, stringArray2, string2, string = sprukb2.cfr_renamed_2.cfr_renamed_215());
        if (set.isEmpty()) {
            set.addAll(this.cfr_renamed_2121(null, "*", stringArray2));
        }
        return set;
    }

    private /* synthetic */ Set cfr_renamed_2124(X509CertSelector arg0) throws CertStoreException {
        String string;
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_2.cfr_renamed_246();
        String[] stringArray2 = stringArray;
        sprukb sprukb2 = this;
        String string2 = sprukb2.cfr_renamed_2.cfr_renamed_248();
        Set set = sprukb2.cfr_renamed_2123(arg0, stringArray2, string2, string = sprukb2.cfr_renamed_2.cfr_renamed_249());
        if (set.isEmpty()) {
            set.addAll(this.cfr_renamed_2121(null, "*", stringArray2));
        }
        return set;
    }

    static {
        cfr_renamed_1 = "com.sun.jndi.ldap.LdapCtxFactory";
        cfr_renamed_0 = "ignore";
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
            throw new CertStoreException(sprver.cfr_renamed_9("W5H5G$K\"\u00049WpJ?PpEp|e\u0014ig5V$w5H5G$K\""));
        }
        var2_2 = (X509CertSelector)arg0;
        var3_3 = new HashSet<Certificate>();
        var4_4 = this.cfr_renamed_2125(var2_2);
        var4_4.addAll(this.cfr_renamed_2122(var2_2));
        var4_4.addAll(this.cfr_renamed_2124(var2_2));
        var5_5 = var4_4.iterator();
        try {
            var6_6 = CertificateFactory.getInstance(sprgtb.cfr_renamed_9("[T6J:"), "BC");
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
                        var9_10 = sprrae.cfr_renamed_23(new sprgle(var7_8).cfr_renamed_24());
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
            throw new CertStoreException(new StringBuilder().insert(0, sprver.cfr_renamed_9("G5V$M6M3E$ApG1J>K$\u00042ApG?J#P\"Q3P5@pB\"K=\u0004\u001c`\u0011tpV5W%H$\u001ep")).append(var6_7).toString());
        }
    }

    private /* synthetic */ Set cfr_renamed_2125(X509CertSelector arg0) throws CertStoreException {
        String[] stringArray = new String[1];
        stringArray[0] = this.cfr_renamed_2.cfr_renamed_228();
        String[] stringArray2 = stringArray;
        sprukb sprukb2 = this;
        String string = sprukb2.cfr_renamed_2.cfr_renamed_229();
        String string2 = sprukb2.cfr_renamed_2.cfr_renamed_230();
        return sprukb2.cfr_renamed_2123(arg0, stringArray2, string, string2);
    }

    private /* synthetic */ Set cfr_renamed_2123(X509CertSelector arg0, String[] arg1, String arg2, String arg3) throws CertStoreException {
        HashSet hashSet = new HashSet();
        try {
            if (arg0.getSubjectAsBytes() != null || arg0.getSubjectAsString() != null || arg0.getCertificate() != null) {
                sprukb sprukb2;
                String string = null;
                String string2 = null;
                if (arg0.getCertificate() != null) {
                    X509CertSelector x509CertSelector = arg0;
                    string = x509CertSelector.getCertificate().getSubjectX500Principal().getName(sprgtb.cfr_renamed_9("Q<@K4M:"));
                    string2 = x509CertSelector.getCertificate().getSerialNumber().toString();
                    sprukb2 = this;
                } else if (arg0.getSubjectAsBytes() != null) {
                    string = new X500Principal(arg0.getSubjectAsBytes()).getName(sprver.cfr_renamed_9("\u0002b\u0013\u0015g\u0013i"));
                    sprukb2 = this;
                } else {
                    string = arg0.getSubjectAsString();
                    sprukb2 = this;
                }
                String string3 = sprukb2.cfr_renamed_209(string, arg3);
                hashSet.addAll(this.cfr_renamed_2121(arg2, "*" + string3 + "*", arg1));
                if (string2 != null && this.cfr_renamed_2.cfr_renamed_239() != null) {
                    string3 = string2;
                    arg2 = this.cfr_renamed_2.cfr_renamed_239();
                    hashSet.addAll(this.cfr_renamed_2121(arg2, new StringBuilder().insert(0, "*").append(string3).append("*").toString(), arg1));
                }
            } else {
                hashSet.addAll(this.cfr_renamed_2121(arg2, "*", arg1));
            }
        }
        catch (IOException iOException) {
            throw new CertStoreException(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("f\u0002`\u001fs\u000ej\u0015mZs\bl\u0019f\tp\u0013m\u001d#\tf\u0016f\u0019w\u0015q@#")).append(iOException).toString());
        }
        return hashSet;
    }

    private /* synthetic */ DirContext cfr_renamed_224() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty(sprver.cfr_renamed_9(":E&E~J1I9J7\n6E3P?V)\n9J9P9E<"), cfr_renamed_1);
        properties.setProperty(sprgtb.cfr_renamed_9("i\u001bu\u001b-\u0014b\u0017j\u0014dTa\u001bw\u0019k\tj\u0000f"), "0");
        properties.setProperty(sprver.cfr_renamed_9("N1R1\n>E=M>C~T\"K&M4A\"\n%V<"), this.cfr_renamed_2.cfr_renamed_232());
        properties.setProperty(sprgtb.cfr_renamed_9("\u0010b\fbTm\u001bn\u0013m\u001d-\u001cb\u0019w\u0015q\u0003-\u000fq\u0016-\nh\u001dp"), cfr_renamed_3);
        properties.setProperty(sprver.cfr_renamed_9("N1R1\n>E=M>C~V5B5V\"E<"), cfr_renamed_0);
        properties.setProperty(sprgtb.cfr_renamed_9("i\u001bu\u001b-\u0014b\u0017j\u0014dTp\u001f`\u000fq\u0013w\u0003-\u001bv\u000ek\u001fm\u000ej\u0019b\u000ej\u0015m"), cfr_renamed_4);
        return new InitialDirContext(properties);
    }
}

