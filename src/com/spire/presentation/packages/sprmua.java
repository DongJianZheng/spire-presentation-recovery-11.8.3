/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprava;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcwa;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprjtb;
import com.spire.presentation.packages.sprkna;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprrae;
import com.spire.presentation.packages.sprrjb;
import com.spire.presentation.packages.sprtkb;
import com.spire.presentation.packages.sprvlb;
import com.spire.presentation.packages.sprxvc;
import com.spire.presentation.packages.sprz;
import com.spire.presentation.packages.sprzwa;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;

public class sprmua {
    private static final String cfr_renamed_112 = "none";
    private static String cfr_renamed_119 = "com.sun.jndi.ldap.LdapCtxFactory";
    private sprblb cfr_renamed_91;
    private static String cfr_renamed_0 = "ignore";
    private static final String cfr_renamed_1 = "com.sun.jndi.url";
    private static long cfr_renamed_2;
    private Map cfr_renamed_3;
    private static int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_207(List arg0, sprgva arg1) throws sprzwa {
        HashSet<X509CRL> hashSet = new HashSet<X509CRL>();
        sprvlb sprvlb2 = new sprvlb();
        Iterator iterator = arg0.iterator();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    sprvlb2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    X509CRL x509CRL = (X509CRL)sprvlb2.cfr_renamed_139();
                    if (!arg1.cfr_renamed_132(x509CRL)) continue block2;
                    hashSet.add(x509CRL);
                    continue block2;
                }
                catch (sprpna sprpna2) {
                    iterator2 = iterator;
                    continue;
                }
                break;
            }
        }
    }

    public sprmua(sprblb sprblb2) {
        sprmua sprmua2 = this;
        this.cfr_renamed_3 = new HashMap(cfr_renamed_4);
        this.cfr_renamed_91 = sprblb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_208(List arg0, sprkna arg1) throws sprzwa {
        HashSet<sprz> hashSet = new HashSet<sprz>();
        Iterator iterator = arg0.iterator();
        sprtkb sprtkb2 = new sprtkb();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    sprtkb2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    sprz sprz2 = (sprz)sprtkb2.cfr_renamed_139();
                    if (!arg1.cfr_renamed_132(sprz2)) continue block2;
                    hashSet.add(sprz2);
                    continue block2;
                }
                catch (sprpna sprpna2) {
                    iterator2 = iterator;
                    continue;
                }
                break;
            }
        }
    }

    private /* synthetic */ String cfr_renamed_209(String arg0, String arg1) {
        String string = arg0;
        int n = string.toLowerCase().indexOf(new StringBuilder().insert(0, arg1.toLowerCase()).append("=").toString());
        if (n == -1) {
            return "";
        }
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
        if (string.startsWith(sprgyz.cfr_renamed_9("R"))) {
            string = string.substring(1);
        }
        if (string.endsWith(sprxvc.cfr_renamed_9("="))) {
            String string4 = string;
            string = string4.substring(0, string4.length() - 1);
        }
        return string;
    }

    public Collection cfr_renamed_210(sprgma arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_212());
        List list = sprmua2.cfr_renamed_213(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_214()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_215()));
        Set set = sprmua2.cfr_renamed_216(list, arg0);
        if (set.size() == 0) {
            sprgma sprgma2 = new sprgma();
            list = this.cfr_renamed_213(sprgma2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_216(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_217(sprgva arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_218());
        List list = sprmua2.cfr_renamed_219(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_220()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_221()));
        Set set = sprmua2.cfr_renamed_207(list, arg0);
        if (set.size() == 0) {
            sprgva sprgva2 = new sprgva();
            list = this.cfr_renamed_219(sprgva2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_207(list, arg0));
        }
        return set;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ List cfr_renamed_222(String[] arg0, String arg1, String[] arg2) throws sprzwa {
        SearchControls searchControls;
        ArrayList arrayList;
        int n;
        String string = null;
        if (arg0 == null) {
            string = null;
        } else {
            int n2;
            string = "";
            if (arg1.equals("**")) {
                arg1 = "*";
            }
            int n3 = n2 = 0;
            while (n3 < arg0.length) {
                StringBuilder stringBuilder = new StringBuilder().insert(0, string).append("(").append(arg0[n2]).append("=").append(arg1);
                string = stringBuilder.append(")").toString();
                n3 = ++n2;
            }
            string = new StringBuilder().insert(0, sprgyz.cfr_renamed_9("7\f")).append(string).append(")").toString();
        }
        String string2 = "";
        int n4 = n = 0;
        while (n4 < arg2.length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string2).append("(").append(arg2[n]);
            string2 = stringBuilder.append(sprxvc.cfr_renamed_9("\"{6")).toString();
            n4 = ++n;
        }
        string2 = new StringBuilder().insert(0, sprgyz.cfr_renamed_9("7\f")).append(string2).append(")").toString();
        String string3 = new StringBuilder().insert(0, sprxvc.cfr_renamed_9("y9")).append(string).append("").append(string2).append(")").toString();
        if (string == null) {
            string3 = string2;
        }
        if ((arrayList = this.cfr_renamed_223(string3)) != null) {
            return arrayList;
        }
        DirContext dirContext = null;
        arrayList = new ArrayList();
        dirContext = this.cfr_renamed_224();
        SearchControls searchControls2 = searchControls = new SearchControls();
        searchControls.setSearchScope(2);
        searchControls2.setCountLimit(0L);
        searchControls2.setReturningAttributes(arg2);
        NamingEnumeration<SearchResult> namingEnumeration = dirContext.search(this.cfr_renamed_91.cfr_renamed_225(), string3, searchControls);
        while (namingEnumeration.hasMoreElements()) {
            NamingEnumeration<?> namingEnumeration2 = namingEnumeration.next().getAttributes().getAll().next().getAll();
            while (namingEnumeration2.hasMore()) {
                NamingEnumeration<?> namingEnumeration3;
                NamingEnumeration<?> namingEnumeration4 = namingEnumeration3;
                namingEnumeration2 = namingEnumeration4;
                arrayList.add(namingEnumeration4.next());
            }
        }
        this.cfr_renamed_226(string3, arrayList);
        try {
            if (null == dirContext) return arrayList;
            dirContext.close();
            return arrayList;
        }
        catch (Exception exception) {
            return arrayList;
        }
        catch (NamingException namingException) {
            try {
                if (null == dirContext) return arrayList;
                dirContext.close();
                return arrayList;
            }
            catch (Exception exception) {
                return arrayList;
            }
            catch (Throwable throwable) {
                try {
                    if (null == dirContext) throw throwable;
                    dirContext.close();
                    throw throwable;
                }
                catch (Exception exception) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    private /* synthetic */ List cfr_renamed_223(String arg0) {
        List list = (List)this.cfr_renamed_3.get(arg0);
        long l = System.currentTimeMillis();
        if (list != null) {
            if (((Date)list.get(0)).getTime() < l - cfr_renamed_2) {
                return null;
            }
            return (List)list.get(1);
        }
        return null;
    }

    private synchronized /* synthetic */ void cfr_renamed_226(String arg0, List arg1) {
        Date date = new Date(System.currentTimeMillis());
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(date);
        arrayList.add(arg1);
        if (this.cfr_renamed_3.containsKey(arg0)) {
            this.cfr_renamed_3.put(arg0, arrayList);
            return;
        }
        if (this.cfr_renamed_3.size() >= cfr_renamed_4) {
            Iterator iterator = this.cfr_renamed_3.entrySet().iterator();
            long l = date.getTime();
            Object var8_7 = null;
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                long l2 = ((Date)((List)entry.getValue()).get(0)).getTime();
                if (l2 >= l) continue;
                l = l2;
                var8_7 = entry.getKey();
            }
            this.cfr_renamed_3.remove(var8_7);
        }
        this.cfr_renamed_3.put(arg0, arrayList);
    }

    public Collection cfr_renamed_227(sprgma arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_228());
        List list = sprmua2.cfr_renamed_213(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_229()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_230()));
        Set set = sprmua2.cfr_renamed_216(list, arg0);
        if (set.size() == 0) {
            sprgma sprgma2 = new sprgma();
            list = this.cfr_renamed_213(sprgma2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_216(list, arg0));
        }
        return set;
    }

    private /* synthetic */ X500Principal cfr_renamed_231(X509Certificate arg0) {
        return arg0.getIssuerX500Principal();
    }

    private /* synthetic */ DirContext cfr_renamed_224() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty(sprgyz.cfr_renamed_9("\u001a~\u0006~^q\u0011r\u0019q\u00171\u0016~\u0013k\u001fm\t1\u0019q\u0019k\u0019~\u001c"), cfr_renamed_119);
        properties.setProperty(sprxvc.cfr_renamed_9("u0i01?~<v?x\u007f}0k2w\"v+z"), "0");
        properties.setProperty(sprgyz.cfr_renamed_9("u\u0011i\u00111\u001e~\u001dv\u001ex^o\u0002p\u0006v\u0014z\u00021\u0005m\u001c"), this.cfr_renamed_91.cfr_renamed_232());
        properties.setProperty(sprxvc.cfr_renamed_9(";~'~\u007fq0r8q617~2k>m(1$m=1!t6l"), cfr_renamed_1);
        properties.setProperty(sprgyz.cfr_renamed_9("u\u0011i\u00111\u001e~\u001dv\u001ex^m\u0015y\u0015m\u0002~\u001c"), cfr_renamed_0);
        properties.setProperty(sprxvc.cfr_renamed_9("u0i01?~<v?x\u007fl4|$m8k(10j%w4q%v2~%v>q"), cfr_renamed_112);
        return new InitialDirContext(properties);
    }

    public Collection cfr_renamed_233(sprgva arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_234());
        List list = sprmua2.cfr_renamed_219(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_235()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_236()));
        Set set = sprmua2.cfr_renamed_207(list, arg0);
        if (set.size() == 0) {
            sprgva sprgva2 = new sprgva();
            list = this.cfr_renamed_219(sprgva2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_207(list, arg0));
        }
        return set;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ List cfr_renamed_237(sprkna arg0, String[] arg1, String[] arg2, String[] arg3) throws sprzwa {
        var5_5 = new ArrayList<E>();
        var6_6 = null;
        var7_7 = null;
        var8_8 = new HashSet<String>();
        var9_9 = null;
        if (arg0.cfr_renamed_93() != null) {
            if (arg0.cfr_renamed_93().cfr_renamed_114() != null) {
                var8_8.add(arg0.cfr_renamed_93().cfr_renamed_114().toString());
            }
            if (arg0.cfr_renamed_93().cfr_renamed_238() != null) {
                var9_9 = arg0.cfr_renamed_93().cfr_renamed_238();
            }
        }
        if (arg0.cfr_renamed_201() != null) {
            if (arg0.cfr_renamed_201().cfr_renamed_93().cfr_renamed_238() != null) {
                var9_9 = arg0.cfr_renamed_201().cfr_renamed_93().cfr_renamed_238();
            }
            var8_8.add(arg0.cfr_renamed_201().cfr_renamed_114().toString());
        }
        if (var9_9 == null) ** GOTO lbl23
        if (var9_9[0] instanceof X500Principal) {
            var6_6 = ((X500Principal)var9_9[0]).getName(sprgyz.cfr_renamed_9("\"Y3.G(I"));
            v0 = arg0;
        } else {
            var6_6 = var9_9[0].getName();
lbl23:
            // 2 sources

            v0 = arg0;
        }
        if (v0.cfr_renamed_114() != null) {
            var8_8.add(arg0.cfr_renamed_114().toString());
        }
        var10_10 = null;
        if (var6_6 != null) {
            v1 = var11_11 = 0;
            while (v1 < arg3.length) {
                var10_10 = this.cfr_renamed_209(var6_6, arg3[var11_11]);
                v2 = arg2;
                var5_5.addAll(this.cfr_renamed_222(arg2, "*" + var10_10 + "*", arg1));
                v1 = ++var11_11;
            }
        }
        if (var8_8.size() > 0 && this.cfr_renamed_91.cfr_renamed_239() != null) {
            v3 = var11_12 = var8_8.iterator();
            while (v3.hasNext()) {
                var7_7 = (String)var11_12.next();
                v3 = var11_12;
                v4 = this;
                var5_5.addAll(v4.cfr_renamed_222(v4.cfr_renamed_211(v4.cfr_renamed_91.cfr_renamed_239()), var7_7, arg1));
            }
        }
        if (var8_8.size() == 0 && var6_6 == null) {
            var5_5.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return var5_5;
    }

    private /* synthetic */ String[] cfr_renamed_211(String arg0) {
        return arg0.split(sprxvc.cfr_renamed_9("C\"4"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_216(List arg0, sprgma arg1) throws sprzwa {
        HashSet<X509Certificate> hashSet = new HashSet<X509Certificate>();
        Iterator iterator = arg0.iterator();
        sprjtb sprjtb2 = new sprjtb();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    sprjtb2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    X509Certificate x509Certificate = (X509Certificate)sprjtb2.cfr_renamed_139();
                    if (!arg1.cfr_renamed_132(x509Certificate)) continue block2;
                    hashSet.add(x509Certificate);
                    continue block2;
                }
                catch (Exception exception) {
                    iterator2 = iterator;
                    continue;
                }
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_240(List arg0, sprcwa arg1) throws sprzwa {
        int n;
        HashSet<sprava> hashSet = new HashSet<sprava>();
        int n2 = n = 0;
        while (n2 < arg0.size()) {
            try {
                sprcwa sprcwa2;
                sprava sprava2;
                try {
                    sprrjb sprrjb2 = new sprrjb();
                    sprrjb2.cfr_renamed_138(new ByteArrayInputStream((byte[])arg0.get(n)));
                    sprava2 = (sprava)sprrjb2.cfr_renamed_139();
                    sprcwa2 = arg1;
                }
                catch (sprpna sprpna2) {
                    byte[] byArray = (byte[])arg0.get(n);
                    byte[] byArray2 = (byte[])arg0.get(n + 1);
                    ++n;
                    sprava2 = new sprava(new sprrae(sprcge.cfr_renamed_23(new sprgle(byArray).cfr_renamed_24()), sprcge.cfr_renamed_23(new sprgle(byArray2).cfr_renamed_24())));
                    sprcwa2 = arg1;
                }
                if (sprcwa2.cfr_renamed_132(sprava2)) {
                    hashSet.add(sprava2);
                }
            }
            catch (CertificateParsingException certificateParsingException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            n2 = ++n;
        }
        return hashSet;
    }

    public Collection cfr_renamed_241(sprkna arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_242());
        List list = sprmua2.cfr_renamed_237(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_243()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_244()));
        Set set = sprmua2.cfr_renamed_208(list, arg0);
        if (set.size() == 0) {
            sprkna sprkna2 = new sprkna();
            list = this.cfr_renamed_237(sprkna2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_208(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_245(sprcwa arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_246());
        List list = sprmua2.cfr_renamed_247(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_248()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_249()));
        Set set = sprmua2.cfr_renamed_240(list, arg0);
        if (set.size() == 0) {
            sprcwa sprcwa2;
            sprgma sprgma2 = new sprgma();
            sprcwa sprcwa3 = sprcwa2 = new sprcwa();
            sprcwa3.cfr_renamed_175(sprgma2);
            sprcwa3.cfr_renamed_176(sprgma2);
            list = this.cfr_renamed_247(sprcwa3, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_240(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_250(sprgva arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_251());
        List list = sprmua2.cfr_renamed_219(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_252()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_253()));
        Set set = sprmua2.cfr_renamed_207(list, arg0);
        if (set.size() == 0) {
            sprgva sprgva2 = new sprgva();
            list = this.cfr_renamed_219(sprgva2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_207(list, arg0));
        }
        return set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_254(sprgma arg0) {
        try {
            byte[] byArray = arg0.getSubjectAsBytes();
            if (byArray == null) return null;
            return new X500Principal(byArray).getName(sprgyz.cfr_renamed_9("\"Y3.G(I"));
        }
        catch (IOException iOException) {
            throw new sprzwa(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("z)|4o%v>qqo#p2z\"l8q6??~<zk?")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public Collection cfr_renamed_255(sprkna arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_256());
        List list = sprmua2.cfr_renamed_237(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_257()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_258()));
        Set set = sprmua2.cfr_renamed_208(list, arg0);
        if (set.size() == 0) {
            sprkna sprkna2 = new sprkna();
            list = this.cfr_renamed_237(sprkna2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_208(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_259(sprgva arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_260());
        List list = sprmua2.cfr_renamed_219(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_261()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_262()));
        Set set = sprmua2.cfr_renamed_207(list, arg0);
        if (set.size() == 0) {
            sprgva sprgva2 = new sprgva();
            list = this.cfr_renamed_219(sprgva2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_207(list, arg0));
        }
        return set;
    }

    static {
        cfr_renamed_4 = 32;
        cfr_renamed_2 = 60000L;
    }

    public Collection cfr_renamed_263(sprkna arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_264());
        List list = sprmua2.cfr_renamed_237(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_265()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_266()));
        Set set = sprmua2.cfr_renamed_208(list, arg0);
        if (set.size() == 0) {
            sprkna sprkna2 = new sprkna();
            list = this.cfr_renamed_237(sprkna2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_208(list, arg0));
        }
        return set;
    }

    private /* synthetic */ List cfr_renamed_247(sprcwa arg0, String[] arg1, String[] arg2, String[] arg3) throws sprzwa {
        ArrayList arrayList = new ArrayList();
        String string = null;
        if (arg0.cfr_renamed_179() != null) {
            string = this.cfr_renamed_254(arg0.cfr_renamed_179());
        }
        if (arg0.cfr_renamed_181() != null && arg0.cfr_renamed_181().cfr_renamed_177() != null) {
            string = arg0.cfr_renamed_181().cfr_renamed_177().getSubjectX500Principal().getName(sprgyz.cfr_renamed_9("\"Y3.G(I"));
        }
        String string2 = null;
        if (string != null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg3.length) {
                string2 = this.cfr_renamed_209(string, arg3[n]);
                String[] stringArray = arg2;
                arrayList.addAll(this.cfr_renamed_222(arg2, "*" + string2 + "*", arg1));
                n2 = ++n;
            }
        }
        if (string == null) {
            arrayList.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return arrayList;
    }

    private /* synthetic */ List cfr_renamed_213(sprgma arg0, String[] arg1, String[] arg2, String[] arg3) throws sprzwa {
        ArrayList arrayList = new ArrayList();
        String string = null;
        String string2 = null;
        string = this.cfr_renamed_254(arg0);
        if (arg0.getSerialNumber() != null) {
            string2 = arg0.getSerialNumber().toString();
        }
        if (arg0.getCertificate() != null) {
            sprgma sprgma2 = arg0;
            string = sprgma2.getCertificate().getSubjectX500Principal().getName(sprxvc.cfr_renamed_9("M\u0017\\`(f&"));
            string2 = sprgma2.getCertificate().getSerialNumber().toString();
        }
        String string3 = null;
        if (string != null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg3.length) {
                string3 = this.cfr_renamed_209(string, arg3[n]);
                String[] stringArray = arg2;
                arrayList.addAll(this.cfr_renamed_222(arg2, "*" + string3 + "*", arg1));
                n2 = ++n;
            }
        }
        if (string2 != null && this.cfr_renamed_91.cfr_renamed_239() != null) {
            string3 = string2;
            sprmua sprmua2 = this;
            arrayList.addAll(sprmua2.cfr_renamed_222(sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_239()), string3, arg1));
        }
        if (string2 == null && string == null) {
            arrayList.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return arrayList;
    }

    public Collection cfr_renamed_267(sprgva arg0) throws sprzwa {
        String[] stringArray;
        String[] stringArray2;
        sprmua sprmua2 = this;
        String[] stringArray3 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_268());
        List list = sprmua2.cfr_renamed_219(arg0, stringArray3, stringArray2 = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_269()), stringArray = sprmua2.cfr_renamed_211(sprmua2.cfr_renamed_91.cfr_renamed_270()));
        Set set = sprmua2.cfr_renamed_207(list, arg0);
        if (set.size() == 0) {
            sprgva sprgva2 = new sprgva();
            list = this.cfr_renamed_219(sprgva2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_207(list, arg0));
        }
        return set;
    }

    private /* synthetic */ List cfr_renamed_219(sprgva arg0, String[] arg1, String[] arg2, String[] arg3) throws sprzwa {
        Principal[] principalArray;
        ArrayList arrayList = new ArrayList();
        String string = null;
        HashSet<Principal> hashSet = new HashSet<Principal>();
        if (arg0.getIssuers() != null) {
            hashSet.addAll(arg0.getIssuers());
        }
        if (arg0.getCertificateChecking() != null) {
            hashSet.add(this.cfr_renamed_231(arg0.getCertificateChecking()));
        }
        if (arg0.cfr_renamed_163() != null) {
            int n;
            principalArray = arg0.cfr_renamed_163().cfr_renamed_102().cfr_renamed_271();
            int n2 = n = 0;
            while (n2 < principalArray.length) {
                if (principalArray[n] instanceof X500Principal) {
                    hashSet.add(principalArray[n]);
                }
                n2 = ++n;
            }
        }
        principalArray = hashSet.iterator();
        while (principalArray.hasNext()) {
            int n;
            string = ((X500Principal)principalArray.next()).getName(sprgyz.cfr_renamed_9("\"Y3.G(I"));
            String string2 = null;
            int n3 = n = 0;
            while (n3 < arg3.length) {
                string2 = this.cfr_renamed_209(string, arg3[n]);
                String[] stringArray = arg2;
                arrayList.addAll(this.cfr_renamed_222(arg2, "*" + string2 + "*", arg1));
                n3 = ++n;
            }
        }
        if (string == null) {
            arrayList.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return arrayList;
    }
}

