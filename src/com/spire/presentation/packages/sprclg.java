/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakg;
import com.spire.presentation.packages.sprbao;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprmh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprclg {
    private sprcom cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprclg(byte[] arg0) {
        this(sprcom.cfr_renamed_23(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprakg cfr_renamed_7357(sprmh arg0) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = arg0.cfr_renamed_1442(byteArrayOutputStream);
            outputStream.write(this.cfr_renamed_4.cfr_renamed_91());
            outputStream.close();
            return new sprakg(new sprllm(arg0.cfr_renamed_615(), byteArrayOutputStream.toByteArray()));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprbao.cfr_renamed_9("e\u001ch\u0013i\t&\u0018h\u001ei\u0019c]v\u000fo\u000bg\tc6c\u0004O\u0013`\u0012"));
        }
    }

    public sprclg(sprcom sprcom2) {
        this.cfr_renamed_4 = sprcom2;
    }
}

