/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbib;
import com.spire.presentation.packages.sprbya;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprea;
import com.spire.presentation.packages.spreeb;
import com.spire.presentation.packages.sprgbb;
import com.spire.presentation.packages.sprgya;
import com.spire.presentation.packages.sprieb;
import com.spire.presentation.packages.sprixa;
import com.spire.presentation.packages.sprmeb;
import com.spire.presentation.packages.sprmxa;
import com.spire.presentation.packages.sprnab;
import com.spire.presentation.packages.sprpeb;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.sprucb;
import com.spire.presentation.packages.sprwcb;
import com.spire.presentation.packages.sprxfb;
import com.spire.presentation.packages.sprxza;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class sprgab
extends sprnab {
    private final Map cfr_renamed_4 = new HashMap();

    public Object cfr_renamed_24() throws IOException {
        sprpva sprpva2 = this.cfr_renamed_486();
        if (sprpva2 != null) {
            String string = sprpva2.cfr_renamed_324();
            if (this.cfr_renamed_4.containsKey(string)) {
                return ((sprea)this.cfr_renamed_4.get(string)).cfr_renamed_489(sprpva2);
            }
            throw new IOException(new StringBuilder().insert(0, sprccb.cfr_renamed_9("\"k%`4j0k>v2awj5o2f#?w")).append(string).toString());
        }
        return null;
    }

    public sprgab(Reader reader) {
        super(reader);
        this.cfr_renamed_4.put("CERTIFICATE REQUEST", new sprieb(this, null));
        this.cfr_renamed_4.put("NEW CERTIFICATE REQUEST", new sprieb(this, null));
        this.cfr_renamed_4.put("CERTIFICATE", new sprbya(this, null));
        this.cfr_renamed_4.put("TRUSTED CERTIFICATE", new sprbya(this, null));
        this.cfr_renamed_4.put("X509 CERTIFICATE", new sprbya(this, null));
        this.cfr_renamed_4.put("X509 CRL", new sprixa(this, null));
        this.cfr_renamed_4.put("PKCS7", new sprmxa(this, null));
        this.cfr_renamed_4.put("ATTRIBUTE CERTIFICATE", new sprgya(this, null));
        this.cfr_renamed_4.put("EC PARAMETERS", new sprpeb(this, null));
        this.cfr_renamed_4.put("PUBLIC KEY", new sprwcb(this));
        this.cfr_renamed_4.put("RSA PUBLIC KEY", new sprucb(this));
        sprgab sprgab2 = this;
        this.cfr_renamed_4.put("RSA PRIVATE KEY", new sprgbb(sprgab2, new sprxza(sprgab2, null)));
        sprgab sprgab3 = this;
        this.cfr_renamed_4.put("DSA PRIVATE KEY", new sprgbb(sprgab3, new spreeb(sprgab3, null)));
        sprgab sprgab4 = this;
        this.cfr_renamed_4.put("EC PRIVATE KEY", new sprgbb(sprgab4, new sprxfb(sprgab4, null)));
        this.cfr_renamed_4.put("ENCRYPTED PRIVATE KEY", new sprbib(this));
        this.cfr_renamed_4.put("PRIVATE KEY", new sprmeb(this));
    }
}

