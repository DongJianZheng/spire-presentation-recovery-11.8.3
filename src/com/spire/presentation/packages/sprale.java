/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprboc;
import com.spire.presentation.packages.sprcqe;
import com.spire.presentation.packages.sprcse;
import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.sprfoh;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprivh;
import com.spire.presentation.packages.sprkxh;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprrbm;
import com.spire.presentation.packages.sprrme;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.spryue;
import com.spire.presentation.packages.spryvh;
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

public class sprale {
    private static String cfr_renamed_112 = "com.sun.jndi.ldap.LdapCtxFactory";
    private sprrai cfr_renamed_119;
    private static String cfr_renamed_91 = "ignore";
    private static final String cfr_renamed_0 = "none";
    private static long cfr_renamed_1;
    private static int cfr_renamed_2;
    private static final String cfr_renamed_3 = "com.sun.jndi.url";
    private Map cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_5042(sprhve arg0) {
        try {
            byte[] byArray = arg0.getSubjectAsBytes();
            if (byArray == null) return null;
            return new X500Principal(byArray).getName(sprajp.cfr_renamed_9("P\u0000Aw5q;"));
        }
        catch (IOException iOException) {
            throw new sprine(new StringBuilder().insert(0, sprboc.cfr_renamed_9("YB__LNUUR\u001aLHSYYIOSR]\u001cT]WY\u0000\u001c")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public Collection cfr_renamed_5043(sprrme arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_251());
        List list = sprale2.cfr_renamed_5044(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_252()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_253()));
        Set set = sprale2.cfr_renamed_5045(list, arg0);
        if (set.size() == 0) {
            sprrme sprrme2 = new sprrme();
            list = this.cfr_renamed_5044(sprrme2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5045(list, arg0));
        }
        return set;
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
        if (string.startsWith(sprajp.cfr_renamed_9(" "))) {
            string = string.substring(1);
        }
        if (string.endsWith(sprboc.cfr_renamed_9("\u001e"))) {
            String string4 = string;
            string = string4.substring(0, string4.length() - 1);
        }
        return string;
    }

    private /* synthetic */ String[] cfr_renamed_211(String arg0) {
        return arg0.split(sprajp.cfr_renamed_9("^5)"));
    }

    public Collection cfr_renamed_5046(spryue arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_264());
        List list = sprale2.cfr_renamed_5047(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_265()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_266()));
        Set set = sprale2.cfr_renamed_5048(list, arg0);
        if (set.size() == 0) {
            spryue spryue2 = new spryue();
            list = this.cfr_renamed_5047(spryue2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5048(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_5049(sprrme arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_268());
        List list = sprale2.cfr_renamed_5044(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_269()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_270()));
        Set set = sprale2.cfr_renamed_5045(list, arg0);
        if (set.size() == 0) {
            sprrme sprrme2 = new sprrme();
            list = this.cfr_renamed_5044(sprrme2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5045(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_5050(spryue arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_256());
        List list = sprale2.cfr_renamed_5047(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_257()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_258()));
        Set set = sprale2.cfr_renamed_5048(list, arg0);
        if (set.size() == 0) {
            spryue spryue2 = new spryue();
            list = this.cfr_renamed_5047(spryue2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5048(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_5051(sprhve arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_228());
        List list = sprale2.cfr_renamed_5052(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_229()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_230()));
        Set set = sprale2.cfr_renamed_5053(list, arg0);
        if (set.size() == 0) {
            sprhve sprhve2 = new sprhve();
            list = this.cfr_renamed_5052(sprhve2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5053(list, arg0));
        }
        return set;
    }

    private /* synthetic */ List cfr_renamed_5052(sprhve arg0, String[] arg1, String[] arg2, String[] arg3) throws sprine {
        ArrayList arrayList = new ArrayList();
        String string = null;
        String string2 = null;
        string = this.cfr_renamed_5042(arg0);
        if (arg0.getSerialNumber() != null) {
            string2 = arg0.getSerialNumber().toString();
        }
        if (arg0.getCertificate() != null) {
            sprhve sprhve2 = arg0;
            string = sprhve2.getCertificate().getSubjectX500Principal().getName(sprboc.cfr_renamed_9("n|\u007f\u000b\u000b\r\u0005"));
            string2 = sprhve2.getCertificate().getSerialNumber().toString();
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
        if (string2 != null && this.cfr_renamed_119.cfr_renamed_239() != null) {
            string3 = string2;
            sprale sprale2 = this;
            arrayList.addAll(sprale2.cfr_renamed_222(sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_239()), string3, arg1));
        }
        if (string2 == null && string == null) {
            arrayList.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return arrayList;
    }

    private synchronized /* synthetic */ void cfr_renamed_226(String arg0, List arg1) {
        Date date = new Date(System.currentTimeMillis());
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(date);
        arrayList.add(arg1);
        if (this.cfr_renamed_4.containsKey(arg0)) {
            this.cfr_renamed_4.put(arg0, arrayList);
            return;
        }
        if (this.cfr_renamed_4.size() >= cfr_renamed_2) {
            Iterator iterator = this.cfr_renamed_4.entrySet().iterator();
            long l = date.getTime();
            Object var8_7 = null;
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                long l2 = ((Date)((List)entry.getValue()).get(0)).getTime();
                if (l2 >= l) continue;
                l = l2;
                var8_7 = entry.getKey();
            }
            this.cfr_renamed_4.remove(var8_7);
        }
        this.cfr_renamed_4.put(arg0, arrayList);
    }

    private /* synthetic */ List cfr_renamed_5044(sprrme arg0, String[] arg1, String[] arg2, String[] arg3) throws sprine {
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
            string = ((X500Principal)principalArray.next()).getName(sprajp.cfr_renamed_9("P\u0000Aw5q;"));
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

    public Collection cfr_renamed_5054(sprrme arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_260());
        List list = sprale2.cfr_renamed_5044(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_261()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_262()));
        Set set = sprale2.cfr_renamed_5045(list, arg0);
        if (set.size() == 0) {
            sprrme sprrme2 = new sprrme();
            list = this.cfr_renamed_5044(sprrme2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5045(list, arg0));
        }
        return set;
    }

    public Collection cfr_renamed_5055(sprcqe arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_246());
        List list = sprale2.cfr_renamed_5056(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_248()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_249()));
        Set set = sprale2.cfr_renamed_5057(list, arg0);
        if (set.size() == 0) {
            sprcqe sprcqe2;
            sprhve sprhve2 = new sprhve();
            sprcqe sprcqe3 = sprcqe2 = new sprcqe();
            sprcqe3.cfr_renamed_5035(sprhve2);
            sprcqe3.cfr_renamed_5034(sprhve2);
            list = this.cfr_renamed_5056(sprcqe3, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5057(list, arg0));
        }
        return set;
    }

    private /* synthetic */ List cfr_renamed_5056(sprcqe arg0, String[] arg1, String[] arg2, String[] arg3) throws sprine {
        ArrayList arrayList = new ArrayList();
        String string = null;
        if (arg0.cfr_renamed_179() != null) {
            string = this.cfr_renamed_5042(arg0.cfr_renamed_179());
        }
        if (arg0.cfr_renamed_181() != null && arg0.cfr_renamed_181().cfr_renamed_177() != null) {
            string = arg0.cfr_renamed_181().cfr_renamed_177().getSubjectX500Principal().getName(sprboc.cfr_renamed_9("n|\u007f\u000b\u000b\r\u0005"));
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

    public Collection cfr_renamed_5058(sprrme arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_218());
        List list = sprale2.cfr_renamed_5044(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_220()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_221()));
        Set set = sprale2.cfr_renamed_5045(list, arg0);
        if (set.size() == 0) {
            sprrme sprrme2 = new sprrme();
            list = this.cfr_renamed_5044(sprrme2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5045(list, arg0));
        }
        return set;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ List cfr_renamed_5047(spryue arg0, String[] arg1, String[] arg2, String[] arg3) throws sprine {
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
            var6_6 = ((X500Principal)var9_9[0]).getName(sprajp.cfr_renamed_9("P\u0000Aw5q;"));
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
        if (var8_8.size() > 0 && this.cfr_renamed_119.cfr_renamed_239() != null) {
            v3 = var11_12 = var8_8.iterator();
            while (v3.hasNext()) {
                var7_7 = (String)var11_12.next();
                v3 = var11_12;
                v4 = this;
                var5_5.addAll(v4.cfr_renamed_222(v4.cfr_renamed_211(v4.cfr_renamed_119.cfr_renamed_239()), var7_7, arg1));
            }
        }
        if (var8_8.size() == 0 && var6_6 == null) {
            var5_5.addAll(this.cfr_renamed_222(arg2, "*", arg1));
        }
        return var5_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_5048(List arg0, spryue arg1) throws sprine {
        HashSet<sprbd> hashSet = new HashSet<sprbd>();
        Iterator iterator = arg0.iterator();
        spryvh spryvh2 = new spryvh();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    spryvh2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    sprbd sprbd2 = (sprbd)spryvh2.cfr_renamed_139();
                    if (!arg1.cfr_renamed_132(sprbd2)) continue block2;
                    hashSet.add(sprbd2);
                    continue block2;
                }
                catch (sprese sprese2) {
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
    private /* synthetic */ Set cfr_renamed_5057(List arg0, sprcqe arg1) throws sprine {
        int n;
        HashSet<sprcse> hashSet = new HashSet<sprcse>();
        int n2 = n = 0;
        while (n2 < arg0.size()) {
            try {
                sprcqe sprcqe2;
                sprcse sprcse2;
                try {
                    sprkxh sprkxh2 = new sprkxh();
                    sprkxh2.cfr_renamed_138(new ByteArrayInputStream((byte[])arg0.get(n)));
                    sprcse2 = (sprcse)sprkxh2.cfr_renamed_139();
                    sprcqe2 = arg1;
                }
                catch (sprese sprese2) {
                    byte[] byArray = (byte[])arg0.get(n);
                    byte[] byArray2 = (byte[])arg0.get(n + 1);
                    ++n;
                    sprcse2 = new sprcse(new sprrbm(sprndm.cfr_renamed_23(new sprrzm(byArray).cfr_renamed_24()), sprndm.cfr_renamed_23(new sprrzm(byArray2).cfr_renamed_24())));
                    sprcqe2 = arg1;
                }
                if (sprcqe2.cfr_renamed_132(sprcse2)) {
                    hashSet.add(sprcse2);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_5053(List arg0, sprhve arg1) throws sprine {
        HashSet<X509Certificate> hashSet = new HashSet<X509Certificate>();
        Iterator iterator = arg0.iterator();
        sprfoh sprfoh2 = new sprfoh();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    sprfoh2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    X509Certificate x509Certificate = (X509Certificate)sprfoh2.cfr_renamed_139();
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

    public Collection cfr_renamed_5059(spryue arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_242());
        List list = sprale2.cfr_renamed_5047(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_243()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_244()));
        Set set = sprale2.cfr_renamed_5048(list, arg0);
        if (set.size() == 0) {
            spryue spryue2 = new spryue();
            list = this.cfr_renamed_5047(spryue2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5048(list, arg0));
        }
        return set;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ List cfr_renamed_222(String[] arg0, String arg1, String[] arg2) throws sprine {
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
            string = new StringBuilder().insert(0, sprboc.cfr_renamed_9("\u0012@")).append(string).append(")").toString();
        }
        String string2 = "";
        int n4 = n = 0;
        while (n4 < arg2.length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string2).append("(").append(arg2[n]);
            string2 = stringBuilder.append(sprajp.cfr_renamed_9("?l+")).toString();
            n4 = ++n;
        }
        string2 = new StringBuilder().insert(0, sprboc.cfr_renamed_9("\u0012@")).append(string2).append(")").toString();
        String string3 = new StringBuilder().insert(0, sprajp.cfr_renamed_9("n$")).append(string).append("").append(string2).append(")").toString();
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
        NamingEnumeration<SearchResult> namingEnumeration = dirContext.search(this.cfr_renamed_119.cfr_renamed_225(), string3, searchControls);
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

    static {
        cfr_renamed_2 = 32;
        cfr_renamed_1 = 60000L;
    }

    private /* synthetic */ X500Principal cfr_renamed_231(X509Certificate arg0) {
        return arg0.getIssuerX500Principal();
    }

    private /* synthetic */ List cfr_renamed_223(String arg0) {
        List list = (List)this.cfr_renamed_4.get(arg0);
        long l = System.currentTimeMillis();
        if (list != null) {
            if (((Date)list.get(0)).getTime() < l - cfr_renamed_1) {
                return null;
            }
            return (List)list.get(1);
        }
        return null;
    }

    public Collection cfr_renamed_5060(sprrme arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_234());
        List list = sprale2.cfr_renamed_5044(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_235()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_236()));
        Set set = sprale2.cfr_renamed_5045(list, arg0);
        if (set.size() == 0) {
            sprrme sprrme2 = new sprrme();
            list = this.cfr_renamed_5044(sprrme2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5045(list, arg0));
        }
        return set;
    }

    private /* synthetic */ DirContext cfr_renamed_224() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty(sprboc.cfr_renamed_9("V[J[\u0012T]WUT[\u0014Z[_NSHE\u0014UTUNU[P"), cfr_renamed_112);
        properties.setProperty(sprajp.cfr_renamed_9("h't',(c+k(eh`'v%j5k<g"), "0");
        properties.setProperty(sprboc.cfr_renamed_9("P]L]\u0014R[QSR]\u0012JNUJSX_N\u0014IHP"), this.cfr_renamed_119.cfr_renamed_232());
        properties.setProperty(sprajp.cfr_renamed_9(",c0chl'o/l!, c%v)p?,3p*,6i!q"), cfr_renamed_3);
        properties.setProperty(sprboc.cfr_renamed_9("P]L]\u0014R[QSR]\u0012HY\\YHN[P"), cfr_renamed_91);
        properties.setProperty(sprajp.cfr_renamed_9("h't',(c+k(ehq#a3p/v?,'w2j#l2k%c2k)l"), cfr_renamed_0);
        return new InitialDirContext(properties);
    }

    public sprale(sprrai sprrai2) {
        sprale sprale2 = this;
        this.cfr_renamed_4 = new HashMap(cfr_renamed_2);
        this.cfr_renamed_119 = sprrai2;
    }

    public Collection cfr_renamed_5061(sprhve arg0) throws sprine {
        String[] stringArray;
        String[] stringArray2;
        sprale sprale2 = this;
        String[] stringArray3 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_212());
        List list = sprale2.cfr_renamed_5052(arg0, stringArray3, stringArray2 = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_214()), stringArray = sprale2.cfr_renamed_211(sprale2.cfr_renamed_119.cfr_renamed_215()));
        Set set = sprale2.cfr_renamed_5053(list, arg0);
        if (set.size() == 0) {
            sprhve sprhve2 = new sprhve();
            list = this.cfr_renamed_5052(sprhve2, stringArray3, stringArray2, stringArray);
            set.addAll(this.cfr_renamed_5053(list, arg0));
        }
        return set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set cfr_renamed_5045(List arg0, sprrme arg1) throws sprine {
        HashSet<X509CRL> hashSet = new HashSet<X509CRL>();
        sprivh sprivh2 = new sprivh();
        Iterator iterator = arg0.iterator();
        block2: while (true) {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return hashSet;
                }
                try {
                    sprivh2.cfr_renamed_138(new ByteArrayInputStream((byte[])iterator.next()));
                    X509CRL x509CRL = (X509CRL)sprivh2.cfr_renamed_139();
                    if (!arg1.cfr_renamed_132(x509CRL)) continue block2;
                    hashSet.add(x509CRL);
                    continue block2;
                }
                catch (sprese sprese2) {
                    iterator2 = iterator;
                    continue;
                }
                break;
            }
        }
    }
}

