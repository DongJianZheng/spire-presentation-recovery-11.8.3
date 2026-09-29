/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.spretg;
import com.spire.presentation.packages.sprfsg;
import com.spire.presentation.packages.sprfwg;
import com.spire.presentation.packages.sprfyg;
import com.spire.presentation.packages.sprhkg;
import com.spire.presentation.packages.sprixg;
import com.spire.presentation.packages.sprkh;
import com.spire.presentation.packages.sprkvg;
import com.spire.presentation.packages.sprowg;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprsvg;
import com.spire.presentation.packages.sprswg;
import com.spire.presentation.packages.sprugg;
import com.spire.presentation.packages.spruwg;
import com.spire.presentation.packages.sprxah;
import com.spire.presentation.packages.sprxrg;
import com.spire.presentation.packages.sprxvg;
import com.spire.presentation.packages.sprzqg;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sprawg
extends sprqwg {
    public static final String cfr_renamed_96 = "DSA PRIVATE KEY";
    public static final String cfr_renamed_105 = "ATTRIBUTE CERTIFICATE";
    public static final String cfr_renamed_137 = "X509 CERTIFICATE";
    public static final String cfr_renamed_79 = "CERTIFICATE REQUEST";
    public static final String cfr_renamed_107 = "PRIVATE KEY";
    public static final String cfr_renamed_132 = "TRUSTED CERTIFICATE";
    public static final String cfr_renamed_102 = "EC PARAMETERS";
    public static final String cfr_renamed_93 = "ENCRYPTED PRIVATE KEY";
    public static final String cfr_renamed_86 = "NEW CERTIFICATE REQUEST";
    public static final String cfr_renamed_152 = "PKCS7";
    public static final String cfr_renamed_112 = "X509 CRL";
    public static final String cfr_renamed_119 = "CERTIFICATE";
    public static final String cfr_renamed_91 = "CMS";
    public static final String cfr_renamed_0 = "EC PRIVATE KEY";
    public static final String cfr_renamed_1 = "RSA PRIVATE KEY";
    public static final String cfr_renamed_2 = "RSA PUBLIC KEY";
    public final Map cfr_renamed_3 = new HashMap();
    public static final String cfr_renamed_4 = "PUBLIC KEY";

    public Object cfr_renamed_24() throws IOException {
        sprcle sprcle2 = this.cfr_renamed_486();
        if (sprcle2 != null) {
            String string = sprcle2.cfr_renamed_324();
            Object v = this.cfr_renamed_3.get(string);
            if (v != null) {
                return ((sprkh)v).cfr_renamed_5200(sprcle2);
            }
            throw new IOException(new StringBuilder().insert(0, sprugg.cfr_renamed_9("ikn`\u007fj{kuvya<j~oyfh?<")).append(string).toString());
        }
        return null;
    }

    public sprawg(Reader reader) {
        super(reader);
        this.cfr_renamed_3.put(cfr_renamed_79, new sprxah(null));
        this.cfr_renamed_3.put(cfr_renamed_86, new sprxah(null));
        this.cfr_renamed_3.put(cfr_renamed_119, new sprfsg(null));
        this.cfr_renamed_3.put(cfr_renamed_132, new sprhkg(null));
        this.cfr_renamed_3.put(cfr_renamed_137, new sprfsg(null));
        this.cfr_renamed_3.put(cfr_renamed_112, new sprsvg(null));
        this.cfr_renamed_3.put(cfr_renamed_152, new sprowg(null));
        this.cfr_renamed_3.put(cfr_renamed_91, new sprowg(null));
        this.cfr_renamed_3.put(cfr_renamed_105, new sprfwg(null));
        this.cfr_renamed_3.put(cfr_renamed_102, new sprxvg(null));
        this.cfr_renamed_3.put(cfr_renamed_4, new spruwg());
        this.cfr_renamed_3.put(cfr_renamed_2, new sprzqg());
        this.cfr_renamed_3.put(cfr_renamed_1, new sprfyg(new sprixg(null)));
        this.cfr_renamed_3.put(cfr_renamed_96, new sprfyg(new sprkvg(null)));
        this.cfr_renamed_3.put(cfr_renamed_0, new sprfyg(new sprxrg(null)));
        this.cfr_renamed_3.put(cfr_renamed_93, new sprswg());
        this.cfr_renamed_3.put(cfr_renamed_107, new spretg());
    }

    public Set<String> cfr_renamed_7498() {
        return Collections.unmodifiableSet(this.cfr_renamed_3.keySet());
    }
}

