/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbae;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.pdf.security.PdfSecurity;

public class spryke
extends sprkra {
    public sprtae cfr_renamed_2;
    public sprbae cfr_renamed_3;
    public spryee cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public String toString() {
        String string = System.getProperty(PdfSecurity.cfr_renamed_9("\u000b\u001e\t\u0012I\u0004\u0002\u0007\u0006\u0005\u0006\u0003\b\u0005"));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprwfq.cfr_renamed_9("\u0013F$[%F5Z#F8A\u0007@>A#\u0015wt"));
        stringBuffer.append(string);
        if (this.cfr_renamed_2 != null) {
            this.cfr_renamed_4507(stringBuffer, string, PdfSecurity.cfr_renamed_9("\u0013\u000e\u0004\u0013\u0005\u000e\u0015\u0012\u0003\u000e\u0018\t'\b\u001e\t\u0003"), this.cfr_renamed_2.toString());
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprwfq.cfr_renamed_9("]2N$@9\\"), this.cfr_renamed_3.toString());
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4507(stringBuffer, string, PdfSecurity.cfr_renamed_9("\u00145;.\u0004\u0014\u0002\u0002\u0005"), this.cfr_renamed_4.toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        stringBuffer.append(string);
        return stringBuffer2.toString();
    }

    public static spryke cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spryke) {
            return (spryke)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new spryke((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwfq.cfr_renamed_9("f9Y6C>Kwk>\\#]>M\"[>@9\u007f8F9[m\u000f")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public spryke(sprtae sprtae2, sprbae sprbae2, spryee spryee2) {
        void arg1;
        void arg0;
        spryke spryke2 = this;
        this.cfr_renamed_2 = arg0;
        spryke2.cfr_renamed_3 = arg1;
        spryke2.cfr_renamed_4 = spryee2;
    }

    public spryee cfr_renamed_2186() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_4507(StringBuffer arg0, String arg1, String arg2, String arg3) {
        String string = "    ";
        arg0.append(string);
        arg0.append(arg2);
        arg0.append(":");
        arg0.append(arg1);
        arg0.append(string);
        arg0.append(string);
        arg0.append(arg3);
        arg0.append(arg1);
    }

    public static spryke cfr_renamed_341(spryte arg0, boolean arg1) {
        return spryke.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprbae cfr_renamed_2204() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public spryke(sprbne sprbne2) {
        int n;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sprtae.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_3 = new sprbae(sprmra.cfr_renamed_341(spryte2, false));
                    break;
                }
                case 2: {
                    this.cfr_renamed_4 = spryee.cfr_renamed_341(spryte2, false);
                    break;
                }
            }
            n2 = ++n;
        }
        return;
    }

    public sprtae cfr_renamed_323() {
        return this.cfr_renamed_2;
    }
}

