/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprfjj;
import com.spire.presentation.packages.sprmuea;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtue;
import java.io.IOException;
import java.io.InputStream;

public class sprqoj {
    private final sprfjj[] cfr_renamed_4;

    private /* synthetic */ sprfjj cfr_renamed_9359(String arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            sprfjj sprfjj2 = this.cfr_renamed_4[n];
            if (sprfjj2.cfr_renamed_9360(arg0) || sprfjj2.cfr_renamed_9361(arg0)) {
                return sprfjj2;
            }
            n2 = ++n;
        }
        return null;
    }

    private /* synthetic */ String cfr_renamed_2279(InputStream arg0) throws IOException {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            InputStream inputStream = arg0;
            while ((n = inputStream.read()) != 13 && n != 10 && n >= 0) {
                inputStream = arg0;
                stringBuffer.append((char)n);
            }
        } while (n >= 0 && stringBuffer.length() == 0);
        if (n < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (n == 13) {
            InputStream inputStream = arg0;
            inputStream.mark(1);
            n = inputStream.read();
            if (n == 10) {
                arg0.mark(1);
            }
            if (n > 0) {
                arg0.reset();
            }
        }
        return stringBuffer.toString();
    }

    public sprszm cfr_renamed_9362(InputStream arg0, boolean arg1) throws IOException {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        sprfjj sprfjj2 = null;
        while (sprfjj2 == null && (string = this.cfr_renamed_2279(arg0)) != null) {
            sprfjj2 = this.cfr_renamed_9359(string);
            if (sprfjj2 == null || sprfjj2.cfr_renamed_9360(string)) continue;
            throw new IOException(sprarg.cfr_renamed_9("FGG@DTFCO\u0006{cf\u0006OG_G\u0011\u0006MI^HO\u0006MIDRNT\u000bQCCYC\u000bNNGOCY\u0006\\GX\u0006N^[CHRNB"));
        }
        if (sprfjj2 == null) {
            if (!arg1) {
                return null;
            }
            throw new IOException(sprmuea.cfr_renamed_9("\u000ew\u000fp\fd\u000es\u000763S.6\u0007w\u0017wY6\ryC~\u0006w\u0007s\u00116\u0005y\u0016x\u0007"));
        }
        sprfjj sprfjj3 = null;
        block3: while (true) {
            sprfjj sprfjj4 = sprfjj3;
            while (sprfjj4 == null && (string = this.cfr_renamed_2279(arg0)) != null) {
                sprfjj3 = this.cfr_renamed_9359(string);
                if (sprfjj3 != null) {
                    if (sprfjj2.cfr_renamed_9361(string)) continue block3;
                    throw new IOException(sprarg.cfr_renamed_9("FGG@DTFCO\u0006{cf\u0006OG_G\u0011\u0006CCJBNT\u0004@DI_CY\u0006FOXKJRHN"));
                }
                stringBuffer.append(string);
                sprfjj4 = sprfjj3;
            }
            break;
        }
        if (sprfjj3 == null) {
            throw new IOException(sprmuea.cfr_renamed_9("\u000ew\u000fp\fd\u000es\u000763S.6\u0007w\u0017wY6\ryCp\fy\u0017s\u00116\u0005y\u0016x\u0007"));
        }
        if (stringBuffer.length() != 0) {
            try {
                return sprszm.cfr_renamed_23(sprtue.cfr_renamed_488(stringBuffer.toString()));
            }
            catch (Exception exception) {
                throw new IOException(sprarg.cfr_renamed_9("FGG@DTFCO\u0006{cf\u0006OG_G\u000bCEEDSERNTNB"));
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqoj(String string) {
        void arg0;
        sprfjj[] sprfjjArray = new sprfjj[3];
        sprfjjArray[0] = new sprfjj((String)arg0, null);
        sprfjjArray[1] = new sprfjj(new StringBuilder().insert(0, sprmuea.cfr_renamed_9(";#S/C")).append((String)arg0).toString(), null);
        sprfjjArray[2] = new sprfjj("PKCS7", null);
        this.cfr_renamed_4 = sprfjjArray;
    }
}

