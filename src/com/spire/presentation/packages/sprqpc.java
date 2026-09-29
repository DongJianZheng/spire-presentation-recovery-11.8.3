/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhao;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.spryqa;
import java.io.IOException;
import java.io.InputStream;

public class sprqpc {
    private final String cfr_renamed_1;
    private final String cfr_renamed_2;
    private final String cfr_renamed_3;
    private final String cfr_renamed_4;

    public sprbne cfr_renamed_2129(InputStream arg0) throws IOException {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        block7: {
            sprqpc sprqpc2;
            String string;
            block6: {
                stringBuffer2 = new StringBuffer();
                while ((string = this.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_2)) {
                    if (!string.startsWith(this.cfr_renamed_4)) continue;
                    sprqpc2 = this;
                    break block6;
                }
                sprqpc2 = this;
            }
            while ((string = sprqpc2.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_1)) {
                if (string.startsWith(this.cfr_renamed_3)) {
                    stringBuffer = stringBuffer2;
                    break block7;
                }
                stringBuffer2.append(string);
                sprqpc2 = this;
            }
            stringBuffer = stringBuffer2;
        }
        if (stringBuffer.length() != 0) {
            try {
                return sprbne.cfr_renamed_23(spryqa.cfr_renamed_488(stringBuffer2.toString()));
            }
            catch (Exception exception) {
                throw new IOException(sprhao.cfr_renamed_9("xhyoz{xlq)ELX)qhah5l{jz|{}p{pm"));
            }
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
            return null;
        }
        return stringBuffer.toString();
    }

    public sprqpc(String arg0) {
        sprqpc sprqpc2 = this;
        this.cfr_renamed_2 = "-----BEGIN " + arg0 + "-----";
        sprqpc2.cfr_renamed_4 = new StringBuilder().insert(0, sprsvh.cfr_renamed_9("XKXKX$0!<(U>@VLF")).append(arg0).append("-----").toString();
        this.cfr_renamed_1 = new StringBuilder().insert(0, "-----END ").append(arg0).append("-----").toString();
        this.cfr_renamed_3 = new StringBuilder().insert(0, sprhao.cfr_renamed_9("8$8$8L[M5Q 9,)")).append(arg0).append("-----").toString();
    }
}

