/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.sprfwe;
import com.spire.presentation.packages.sprgxha;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprpe;
import com.spire.presentation.packages.sprque;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;

public class sprfre
implements sprpe {
    private Provider cfr_renamed_3;
    private sprjth cfr_renamed_4;

    @Override
    public Object cfr_renamed_137() throws sprese {
        return this.cfr_renamed_4.cfr_renamed_139();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfre(Provider provider, sprjth sprjth2) {
        void arg0;
        sprfre sprfre2 = this;
        sprfre2.cfr_renamed_3 = arg0;
        sprfre2.cfr_renamed_4 = sprjth2;
    }

    private static /* synthetic */ sprfre cfr_renamed_5026(sprque arg0) {
        sprjth sprjth2 = (sprjth)arg0.cfr_renamed_143();
        return new sprfre(arg0.cfr_renamed_144(), sprjth2);
    }

    public void cfr_renamed_148(byte[] arg0) {
        this.cfr_renamed_4.cfr_renamed_138(new ByteArrayInputStream(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfre cfr_renamed_146(String arg0, Provider arg1) throws sprfwe {
        try {
            sprque sprque2 = spriue.cfr_renamed_115(sprgxha.cfr_renamed_9("$)L%/h\u000ey\u001dq,}\u000eo\u0019n"), arg0, arg1);
            return sprfre.cfr_renamed_5026(sprque2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprfwe(noSuchAlgorithmException.getMessage());
        }
    }

    public void cfr_renamed_149(InputStream arg0) {
        this.cfr_renamed_4.cfr_renamed_138(arg0);
    }

    public static sprfre cfr_renamed_147(String arg0, String arg1) throws sprfwe, NoSuchProviderException {
        return sprfre.cfr_renamed_146(arg0, spriue.cfr_renamed_121(arg1));
    }

    @Override
    public Collection cfr_renamed_145() throws sprese {
        return this.cfr_renamed_4.cfr_renamed_140();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfre cfr_renamed_141(String arg0) throws sprfwe {
        try {
            sprque sprque2 = spriue.cfr_renamed_117(sprhym.cfr_renamed_9("0lX`;-\u001a<\t488\u001a*\r+"), arg0);
            return sprfre.cfr_renamed_5026(sprque2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprfwe(noSuchAlgorithmException.getMessage());
        }
    }

    public Provider cfr_renamed_144() {
        return this.cfr_renamed_3;
    }
}

