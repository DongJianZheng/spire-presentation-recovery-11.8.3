/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbao;
import com.spire.presentation.packages.sprgoa;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.sprq;
import com.spire.presentation.packages.spryqa;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class sprkbb
extends BufferedWriter {
    private char[] cfr_renamed_2 = new char[64];
    private final int cfr_renamed_3;
    private static final int cfr_renamed_4 = 64;

    public int cfr_renamed_478(sprpva arg0) {
        int n;
        int n2 = 2 * (arg0.cfr_renamed_324().length() + 10 + this.cfr_renamed_3) + 6 + 4;
        if (!arg0.cfr_renamed_479().isEmpty()) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_479().iterator();
            while (iterator2.hasNext()) {
                sprgoa sprgoa2 = (sprgoa)iterator.next();
                n2 += sprgoa2.cfr_renamed_313().length() + ": ".length() + sprgoa2.cfr_renamed_97().length() + this.cfr_renamed_3;
                iterator2 = iterator;
            }
            n2 += this.cfr_renamed_3;
        }
        int n3 = n = (arg0.cfr_renamed_480().length + 2) / 3 * 4;
        return n2 += n3 + (n3 + 64 - 1) / 64 * this.cfr_renamed_3;
    }

    public void cfr_renamed_481(sprq arg0) throws IOException {
        sprpva sprpva2;
        sprpva sprpva3 = sprpva2 = arg0.cfr_renamed_31();
        this.cfr_renamed_482(sprpva3.cfr_renamed_324());
        if (!sprpva3.cfr_renamed_479().isEmpty()) {
            Iterator iterator;
            Iterator iterator2 = iterator = sprpva2.cfr_renamed_479().iterator();
            while (iterator2.hasNext()) {
                sprgoa sprgoa2 = (sprgoa)iterator.next();
                iterator2 = iterator;
                sprkbb sprkbb2 = this;
                this.write(sprgoa2.cfr_renamed_313());
                sprkbb2.write(": ");
                sprkbb2.write(sprgoa2.cfr_renamed_97());
                sprkbb2.newLine();
            }
            this.newLine();
        }
        sprkbb sprkbb3 = this;
        sprpva sprpva4 = sprpva2;
        sprkbb3.cfr_renamed_483(sprpva4.cfr_renamed_480());
        sprkbb3.cfr_renamed_484(sprpva4.cfr_renamed_324());
    }

    /*
     * WARNING - void declaration
     */
    public sprkbb(Writer writer) {
        super((Writer)arg0);
        void arg0;
        String string = System.getProperty(sprbao.cfr_renamed_9("j\u0014h\u0018(\u000ec\rg\u000fg\ti\u000f"));
        if (string != null) {
            this.cfr_renamed_3 = string.length();
            return;
        }
        this.cfr_renamed_3 = 2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_482(String string) throws IOException {
        void arg0;
        sprkbb sprkbb2 = this;
        sprkbb2.write("-----BEGIN " + (String)arg0 + "-----");
        sprkbb2.newLine();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1 << 1;
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

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_484(String string) throws IOException {
        void arg0;
        sprkbb sprkbb2 = this;
        sprkbb2.write("-----END " + (String)arg0 + "-----");
        sprkbb2.newLine();
    }

    private /* synthetic */ void cfr_renamed_483(byte[] arg0) throws IOException {
        int n;
        arg0 = spryqa.cfr_renamed_485(arg0);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprkbb sprkbb2;
            int n3;
            block3: {
                int n4 = n3 = 0;
                while (n4 != this.cfr_renamed_2.length) {
                    if (n + n3 >= arg0.length) {
                        sprkbb2 = this;
                        break block3;
                    }
                    int n5 = n3++;
                    this.cfr_renamed_2[n5] = (char)arg0[n + n5];
                    n4 = n3;
                }
                sprkbb2 = this;
            }
            sprkbb2.write(this.cfr_renamed_2, 0, n3);
            this.newLine();
            n2 = n + this.cfr_renamed_2.length;
        }
    }
}

